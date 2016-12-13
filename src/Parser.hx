package;

/**
 * ...
 * @author Damilare Akinlaja
 */
class Parser
{
	private var str:String;

	private var holder:Array<CSSValueType> = [];

	public function new(str:String)
	{
		this.str = str;

	}

	public function skip(m:EReg)
	{

		this.str = this.str.substr(m.matched(0).length);

	}

	public function comma():CSSValueType
	{

		var m:EReg = ~/^, */;
		var ret = null;
		if (!m.match(this.str))
		{
			ret = null;
		}
		else{
			this.skip(m);
			ret = { type: 'comma', string: ',' };
			holder.push(ret);
		}

		return ret;
	}

	public function ident():CSSValueType
	{

		var m:EReg = ~/^([\w-]+) */;
		var isMatch = m.match(this.str);
		var ret = null;
		if (!isMatch)
		{
			ret = null;
		}
		else{
			this.skip(m);
			ret = {
				type: 'ident',
				string: m.matched(1)
			}
			holder.push(ret);
		}
		
		return ret;
	}

	public function int():CSSValueType
	{

		var m:EReg = ~/^(([-\+]?\d+)(\S+)?) */;
		var isMatch = m.match(this.str);
		var ret = null;
		if (!isMatch)
		{
			ret = null;
		}
		else{
			this.skip(m);
			var n:Dynamic = ~~Std.parseInt(m.matched(2));
			
			var u = m.matched(3);
			
			ret = {
				type: 'number',
				string: m.matched(1),
				unit: u != null ? u : '',
				value: n
			}
			holder.push(ret);
			
		}
		
		return ret;
	}

	public function float():CSSValueType
	{

		var m:EReg = ~/^(((?:[-\+]?\d+)?\.\d+)(\S+)?) */;
		var ret = null;
		if (!m.match(this.str))
		{
			ret  = null;
		}
		else{
			this.skip(m);
			var n:Dynamic = Std.parseFloat(m.matched(2));

			var u:String = m.matched(3);
			ret = {
				type: 'number',
				string: m.matched(1),
				unit: u != null ? u : '',
				value: n
			};
			holder.push(ret);
			
		}
		
		return ret;
	}

	public function number():CSSValueType
	{
		var int = this.int();
		var float = this.float();
		var ret = null;

		if ( int != null)
		{
			ret = int;
		}
		else if (float != null)
		{
			ret = float;
		}

		return ret;

	}

	public function double():CSSValueType
	{

		var m:EReg = ~/^"([^"]*)" */;
		var ret = null;
		if(m.match(this.str)){
			this.skip(m);
			ret = {
				type: 'string',
				quote: '"',
				string: '"' + m.matched(1) + '"',
				value: m.matched(1)
			}
			holder.push(ret);
			
		}else{
			ret = null;
		}
		
		return ret;

	}

	public function single():CSSValueType
	{

		var m:EReg = ~/^'([^']*)' */;
		var ret = null;
		if(m.match(this.str)){
			this.skip(m);
			ret = {
				type: 'string',
				quote: "'",
				string: "'" + m.matched(1) + "'",
				value: m.matched(1)
			}
			holder.push(ret);
			
		}else{
			ret = null;
		}
		
		return ret;

	}

	public function string():CSSValueType
	{
		var single = this.single();
		var double = this.double();

		var ret = null;

		if(single != null)
		{
			ret = single;
		}else if(double != null){
			ret =  double;
		}

		return ret;
	}

	public function value():CSSValueType
	{
		
		var number = this.number();
		var ident = this.ident();
		var string = this.string();
		var comma = this.comma();

		var ret = null;
		if(number != null)
		{
			ret = number;
		}else if(ident != null)
			{

			ret = ident;
		}else if(string != null){

			ret = string;
		}else if(comma != null){

			ret = comma;
		}

		
	
		return ret;

	}

	public function parse():Array<CSSValueType>
	{

		while (this.str.length > holder.length + 1) {
			
			var obj = this.value();
			
			if (obj == null){
				
				throw 'failed to parse near `' +this.str.substr(0, 10) + '...`';
		
			}

		}
	
		return holder;
	}

}