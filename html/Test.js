(function (console) { "use strict";
function $extend(from, fields) {
	function Inherit() {} Inherit.prototype = from; var proto = new Inherit();
	for (var name in fields) proto[name] = fields[name];
	if( fields.toString !== Object.prototype.toString ) proto.toString = fields.toString;
	return proto;
}
var CSSValue = function() { };
CSSValue.parse = function(str) {
	return new Parser(str).parse();
};
var EReg = function(r,opt) {
	opt = opt.split("u").join("");
	this.r = new RegExp(r,opt);
};
EReg.prototype = {
	match: function(s) {
		if(this.r.global) this.r.lastIndex = 0;
		this.r.m = this.r.exec(s);
		this.r.s = s;
		return this.r.m != null;
	}
	,matched: function(n) {
		if(this.r.m != null && n >= 0 && n < this.r.m.length) return this.r.m[n]; else throw new js__$Boot_HaxeError("EReg::matched");
	}
};
var HxOverrides = function() { };
HxOverrides.cca = function(s,index) {
	var x = s.charCodeAt(index);
	if(x != x) return undefined;
	return x;
};
HxOverrides.substr = function(s,pos,len) {
	if(len == null) len = s.length; else if(len < 0) {
		if(pos == 0) len = s.length + len; else return "";
	}
	return s.substr(pos,len);
};
var Parser = function(str) {
	this.holder = [];
	this.str = str;
};
Parser.prototype = {
	skip: function(m) {
		var pos = m.matched(0).length;
		this.str = HxOverrides.substr(this.str,pos,null);
	}
	,comma: function() {
		var m = new EReg("^, *","");
		var ret = null;
		if(!m.match(this.str)) ret = null; else {
			this.skip(m);
			ret = { type : "comma", string : ","};
			this.holder.push(ret);
		}
		return ret;
	}
	,ident: function() {
		var m = new EReg("^([\\w-]+) *","");
		var isMatch = m.match(this.str);
		var ret = null;
		if(!isMatch) ret = null; else {
			this.skip(m);
			ret = { type : "ident", string : m.matched(1)};
			this.holder.push(ret);
		}
		return ret;
	}
	,'int': function() {
		var m = new EReg("^(([-\\+]?\\d+)(\\S+)?) *","");
		var isMatch = m.match(this.str);
		var ret = null;
		if(!isMatch) ret = null; else {
			this.skip(m);
			var n = ~(~Std.parseInt(m.matched(2)));
			var u = m.matched(3);
			ret = { type : "number", string : m.matched(1), unit : u != null?u:"", value : n};
			this.holder.push(ret);
		}
		return ret;
	}
	,'float': function() {
		var m = new EReg("^(((?:[-\\+]?\\d+)?\\.\\d+)(\\S+)?) *","");
		var ret = null;
		if(!m.match(this.str)) ret = null; else {
			this.skip(m);
			var n = Std.parseFloat(m.matched(2));
			var u = m.matched(3);
			ret = { type : "number", string : m.matched(1), unit : u != null?u:"", value : n};
			this.holder.push(ret);
		}
		return ret;
	}
	,number: function() {
		var $int = this["int"]();
		var $float = this["float"]();
		var ret = null;
		if($int != null) ret = $int; else if($float != null) ret = $float;
		return ret;
	}
	,'double': function() {
		var m = new EReg("^\"([^\"]*)\" *","");
		var ret = null;
		if(m.match(this.str)) {
			this.skip(m);
			ret = { type : "string", quote : "\"", string : "\"" + m.matched(1) + "\"", value : m.matched(1)};
			this.holder.push(ret);
		} else ret = null;
		return ret;
	}
	,single: function() {
		var m = new EReg("^'([^']*)' *","");
		var ret = null;
		if(m.match(this.str)) {
			this.skip(m);
			ret = { type : "string", quote : "'", string : "'" + m.matched(1) + "'", value : m.matched(1)};
			this.holder.push(ret);
		} else ret = null;
		return ret;
	}
	,string: function() {
		var single = this.single();
		var $double = this["double"]();
		var ret = null;
		if(single != null) ret = single; else if($double != null) ret = $double;
		return ret;
	}
	,value: function() {
		var number = this.number();
		var ident = this.ident();
		var string = this.string();
		var comma = this.comma();
		var ret = null;
		if(number != null) ret = number; else if(ident != null) ret = ident; else if(string != null) ret = string; else if(comma != null) ret = comma;
		return ret;
	}
	,parse: function() {
		while(this.str.length > this.holder.length + 1) {
			var obj = this.value();
			if(obj == null) throw new js__$Boot_HaxeError("failed to parse near `" + HxOverrides.substr(this.str,0,10) + "...`");
		}
		return this.holder;
	}
};
var Std = function() { };
Std.parseInt = function(x) {
	var v = parseInt(x,10);
	if(v == 0 && (HxOverrides.cca(x,1) == 120 || HxOverrides.cca(x,1) == 88)) v = parseInt(x);
	if(isNaN(v)) return null;
	return v;
};
Std.parseFloat = function(x) {
	return parseFloat(x);
};
var Test = function() { };
Test.main = function() {
	var str = "14px 1.5 'proxima-nova', 'Helvetica Neue', Arial, Helvetica, sans-serif";
	console.log(CSSValue.parse(str));
};
var js__$Boot_HaxeError = function(val) {
	Error.call(this);
	this.val = val;
	this.message = String(val);
	if(Error.captureStackTrace) Error.captureStackTrace(this,js__$Boot_HaxeError);
};
js__$Boot_HaxeError.__super__ = Error;
js__$Boot_HaxeError.prototype = $extend(Error.prototype,{
});
Test.main();
})(typeof console != "undefined" ? console : {log:function(){}});
