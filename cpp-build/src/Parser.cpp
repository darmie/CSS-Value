#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_Parser
#include <Parser.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif

Void Parser_obj::__construct(::String str)
{
HX_STACK_FRAME("Parser","new",0x4fce9d71,"Parser.new","Parser.hx",7,0x8a1d9b1f)
HX_STACK_THIS(this)
HX_STACK_ARG(str,"str")
{
	HX_STACK_LINE(11)
	this->holder = cpp::ArrayBase_obj::__new();
	HX_STACK_LINE(15)
	this->str = str;
}
;
	return null();
}

//Parser_obj::~Parser_obj() { }

Dynamic Parser_obj::__CreateEmpty() { return  new Parser_obj; }
hx::ObjectPtr< Parser_obj > Parser_obj::__new(::String str)
{  hx::ObjectPtr< Parser_obj > _result_ = new Parser_obj();
	_result_->__construct(str);
	return _result_;}

Dynamic Parser_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< Parser_obj > _result_ = new Parser_obj();
	_result_->__construct(inArgs[0]);
	return _result_;}

Void Parser_obj::skip( ::EReg m){
{
		HX_STACK_FRAME("Parser","skip",0x884db84e,"Parser.skip","Parser.hx",20,0x8a1d9b1f)
		HX_STACK_THIS(this)
		HX_STACK_ARG(m,"m")
		HX_STACK_LINE(22)
		::String tmp = this->str;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(22)
		::String tmp1 = m->matched((int)0);		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(22)
		int tmp2 = tmp1.length;		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(22)
		::String tmp3 = tmp.substr(tmp2,null());		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(22)
		this->str = tmp3;
	}
return null();
}


HX_DEFINE_DYNAMIC_FUNC1(Parser_obj,skip,(void))

Dynamic Parser_obj::comma( ){
	HX_STACK_FRAME("Parser","comma",0x87f22526,"Parser.comma","Parser.hx",27,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(29)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^, *","\x98","\x8d","\x43","\x3e"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(29)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(30)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(31)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(31)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(31)
	bool tmp3 = !(tmp2);		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(31)
	if ((tmp3)){
		HX_STACK_LINE(33)
		ret = null();
	}
	else{
		HX_STACK_LINE(36)
		::EReg tmp4 = m;		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(36)
		this->skip(tmp4);
		struct _Function_2_1{
			inline static Dynamic Block( ){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",37,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("comma","\xd5","\x31","\x5d","\x4a"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , HX_HCSTRING(",","\x2c","\x00","\x00","\x00"),false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(37)
		Dynamic tmp5 = _Function_2_1::Block();		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(37)
		ret = tmp5;
		HX_STACK_LINE(38)
		Dynamic tmp6 = ret;		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(38)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp6);
	}
	HX_STACK_LINE(41)
	Dynamic tmp4 = ret;		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(41)
	return tmp4;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,comma,return )

Dynamic Parser_obj::ident( ){
	HX_STACK_FRAME("Parser","ident",0xf50e3641,"Parser.ident","Parser.hx",45,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(47)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^([\\w-]+) *","\xa4","\x3b","\x98","\xe2"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(47)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(48)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(48)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(48)
	bool isMatch = tmp2;		HX_STACK_VAR(isMatch,"isMatch");
	HX_STACK_LINE(49)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(50)
	bool tmp3 = isMatch;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(50)
	bool tmp4 = !(tmp3);		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(50)
	if ((tmp4)){
		HX_STACK_LINE(52)
		ret = null();
	}
	else{
		HX_STACK_LINE(55)
		::EReg tmp5 = m;		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(55)
		this->skip(tmp5);
		HX_STACK_LINE(58)
		::String tmp6 = m->matched((int)1);		HX_STACK_VAR(tmp6,"tmp6");
		struct _Function_2_1{
			inline static Dynamic Block( ::String &tmp6){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",56,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("ident","\xf0","\x42","\x79","\xb7"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , tmp6,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(56)
		Dynamic tmp7 = _Function_2_1::Block(tmp6);		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(56)
		ret = tmp7;
		HX_STACK_LINE(60)
		Dynamic tmp8 = ret;		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(60)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp8);
	}
	HX_STACK_LINE(63)
	Dynamic tmp5 = ret;		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(63)
	return tmp5;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,ident,return )

Dynamic Parser_obj::_int( ){
	HX_STACK_FRAME("Parser","int",0x4fcada00,"Parser.int","Parser.hx",67,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(69)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^(([-\\+]?\\d+)(\\S+)?) *","\x6a","\x2f","\x55","\x92"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(69)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(70)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(70)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(70)
	bool isMatch = tmp2;		HX_STACK_VAR(isMatch,"isMatch");
	HX_STACK_LINE(71)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(72)
	bool tmp3 = isMatch;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(72)
	bool tmp4 = !(tmp3);		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(72)
	if ((tmp4)){
		HX_STACK_LINE(74)
		ret = null();
	}
	else{
		HX_STACK_LINE(77)
		::EReg tmp5 = m;		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(77)
		this->skip(tmp5);
		HX_STACK_LINE(78)
		::String tmp6 = m->matched((int)2);		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(78)
		Dynamic tmp7 = ::Std_obj::parseInt(tmp6);		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(78)
		int tmp8 = ~(int)(tmp7);		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(78)
		int tmp9 = ~(int)(tmp8);		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(78)
		Dynamic n = tmp9;		HX_STACK_VAR(n,"n");
		HX_STACK_LINE(80)
		::String tmp10 = m->matched((int)3);		HX_STACK_VAR(tmp10,"tmp10");
		HX_STACK_LINE(80)
		::String u = tmp10;		HX_STACK_VAR(u,"u");
		HX_STACK_LINE(84)
		::String tmp11 = m->matched((int)1);		HX_STACK_VAR(tmp11,"tmp11");
		HX_STACK_LINE(85)
		bool tmp12 = (u != null());		HX_STACK_VAR(tmp12,"tmp12");
		HX_STACK_LINE(85)
		::String tmp13;		HX_STACK_VAR(tmp13,"tmp13");
		HX_STACK_LINE(85)
		if ((tmp12)){
			HX_STACK_LINE(85)
			tmp13 = u;
		}
		else{
			HX_STACK_LINE(85)
			tmp13 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
		}
		HX_STACK_LINE(86)
		Dynamic tmp14 = n;		HX_STACK_VAR(tmp14,"tmp14");
		struct _Function_2_1{
			inline static Dynamic Block( ::String &tmp13,::String &tmp11,Dynamic &tmp14){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",82,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("number","\xc9","\x86","\x7a","\xa1"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , tmp11,false);
					__result->Add(HX_HCSTRING("unit","\x84","\xca","\xa9","\x4d") , tmp13,false);
					__result->Add(HX_HCSTRING("value","\x71","\x7f","\xb8","\x31") , tmp14,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(82)
		Dynamic tmp15 = _Function_2_1::Block(tmp13,tmp11,tmp14);		HX_STACK_VAR(tmp15,"tmp15");
		HX_STACK_LINE(82)
		ret = tmp15;
		HX_STACK_LINE(88)
		Dynamic tmp16 = ret;		HX_STACK_VAR(tmp16,"tmp16");
		HX_STACK_LINE(88)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp16);
	}
	HX_STACK_LINE(92)
	Dynamic tmp5 = ret;		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(92)
	return tmp5;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,_int,return )

Dynamic Parser_obj::_float( ){
	HX_STACK_FRAME("Parser","float",0x402bb8ed,"Parser.float","Parser.hx",96,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(98)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^(((?:[-\\+]?\\d+)?\\.\\d+)(\\S+)?) *","\x08","\x47","\x31","\xfd"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(98)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(99)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(100)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(100)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(100)
	bool tmp3 = !(tmp2);		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(100)
	if ((tmp3)){
		HX_STACK_LINE(102)
		ret = null();
	}
	else{
		HX_STACK_LINE(105)
		::EReg tmp4 = m;		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(105)
		this->skip(tmp4);
		HX_STACK_LINE(106)
		::String tmp5 = m->matched((int)2);		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(106)
		Float tmp6 = ::Std_obj::parseFloat(tmp5);		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(106)
		Dynamic n = tmp6;		HX_STACK_VAR(n,"n");
		HX_STACK_LINE(108)
		::String tmp7 = m->matched((int)3);		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(108)
		::String u = tmp7;		HX_STACK_VAR(u,"u");
		HX_STACK_LINE(111)
		::String tmp8 = m->matched((int)1);		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(112)
		bool tmp9 = (u != null());		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(112)
		::String tmp10;		HX_STACK_VAR(tmp10,"tmp10");
		HX_STACK_LINE(112)
		if ((tmp9)){
			HX_STACK_LINE(112)
			tmp10 = u;
		}
		else{
			HX_STACK_LINE(112)
			tmp10 = HX_HCSTRING("","\x00","\x00","\x00","\x00");
		}
		HX_STACK_LINE(113)
		Dynamic tmp11 = n;		HX_STACK_VAR(tmp11,"tmp11");
		struct _Function_2_1{
			inline static Dynamic Block( Dynamic &tmp11,::String &tmp10,::String &tmp8){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",109,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("number","\xc9","\x86","\x7a","\xa1"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , tmp8,false);
					__result->Add(HX_HCSTRING("unit","\x84","\xca","\xa9","\x4d") , tmp10,false);
					__result->Add(HX_HCSTRING("value","\x71","\x7f","\xb8","\x31") , tmp11,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(109)
		Dynamic tmp12 = _Function_2_1::Block(tmp11,tmp10,tmp8);		HX_STACK_VAR(tmp12,"tmp12");
		HX_STACK_LINE(109)
		ret = tmp12;
		HX_STACK_LINE(115)
		Dynamic tmp13 = ret;		HX_STACK_VAR(tmp13,"tmp13");
		HX_STACK_LINE(115)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp13);
	}
	HX_STACK_LINE(119)
	Dynamic tmp4 = ret;		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(119)
	return tmp4;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,_float,return )

Dynamic Parser_obj::number( ){
	HX_STACK_FRAME("Parser","number",0x463a7a58,"Parser.number","Parser.hx",123,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(124)
	Dynamic tmp = this->_int();		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(124)
	Dynamic _int = tmp;		HX_STACK_VAR(_int,"int");
	HX_STACK_LINE(125)
	Dynamic tmp1 = this->_float();		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(125)
	Dynamic _float = tmp1;		HX_STACK_VAR(_float,"float");
	HX_STACK_LINE(126)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(128)
	bool tmp2 = (_int != null());		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(128)
	if ((tmp2)){
		HX_STACK_LINE(130)
		ret = _int;
	}
	else{
		HX_STACK_LINE(132)
		bool tmp3 = (_float != null());		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(132)
		if ((tmp3)){
			HX_STACK_LINE(134)
			ret = _float;
		}
	}
	HX_STACK_LINE(137)
	Dynamic tmp3 = ret;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(137)
	return tmp3;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,number,return )

Dynamic Parser_obj::_double( ){
	HX_STACK_FRAME("Parser","double",0xd78b1ea0,"Parser.double","Parser.hx",142,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(144)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^\"([^\"]*)\" *","\x0b","\xce","\xdf","\x48"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(144)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(145)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(146)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(146)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(146)
	if ((tmp2)){
		HX_STACK_LINE(147)
		::EReg tmp3 = m;		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(147)
		this->skip(tmp3);
		HX_STACK_LINE(151)
		::String tmp4 = m->matched((int)1);		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(151)
		::String tmp5 = (HX_HCSTRING("\"","\x22","\x00","\x00","\x00") + tmp4);		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(151)
		::String tmp6 = (tmp5 + HX_HCSTRING("\"","\x22","\x00","\x00","\x00"));		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(152)
		::String tmp7 = m->matched((int)1);		HX_STACK_VAR(tmp7,"tmp7");
		struct _Function_2_1{
			inline static Dynamic Block( ::String &tmp6,::String &tmp7){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",148,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("string","\xd1","\x28","\x30","\x11"),false);
					__result->Add(HX_HCSTRING("quote","\x3c","\x23","\xf2","\x5d") , HX_HCSTRING("\"","\x22","\x00","\x00","\x00"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , tmp6,false);
					__result->Add(HX_HCSTRING("value","\x71","\x7f","\xb8","\x31") , tmp7,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(148)
		Dynamic tmp8 = _Function_2_1::Block(tmp6,tmp7);		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(148)
		ret = tmp8;
		HX_STACK_LINE(154)
		Dynamic tmp9 = ret;		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(154)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp9);
	}
	else{
		HX_STACK_LINE(157)
		ret = null();
	}
	HX_STACK_LINE(160)
	Dynamic tmp3 = ret;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(160)
	return tmp3;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,_double,return )

Dynamic Parser_obj::single( ){
	HX_STACK_FRAME("Parser","single",0x5de15a17,"Parser.single","Parser.hx",165,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(167)
	::EReg tmp = ::EReg_obj::__new(HX_HCSTRING("^'([^']*)' *","\x5a","\x03","\x27","\x9d"),HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(167)
	::EReg m = tmp;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(168)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(169)
	::String tmp1 = this->str;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(169)
	bool tmp2 = m->match(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(169)
	if ((tmp2)){
		HX_STACK_LINE(170)
		::EReg tmp3 = m;		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(170)
		this->skip(tmp3);
		HX_STACK_LINE(174)
		::String tmp4 = m->matched((int)1);		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(174)
		::String tmp5 = (HX_HCSTRING("'","\x27","\x00","\x00","\x00") + tmp4);		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(174)
		::String tmp6 = (tmp5 + HX_HCSTRING("'","\x27","\x00","\x00","\x00"));		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(175)
		::String tmp7 = m->matched((int)1);		HX_STACK_VAR(tmp7,"tmp7");
		struct _Function_2_1{
			inline static Dynamic Block( ::String &tmp6,::String &tmp7){
				HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","Parser.hx",171,0x8a1d9b1f)
				{
					hx::Anon __result = hx::Anon_obj::Create();
					__result->Add(HX_HCSTRING("type","\xba","\xf2","\x08","\x4d") , HX_HCSTRING("string","\xd1","\x28","\x30","\x11"),false);
					__result->Add(HX_HCSTRING("quote","\x3c","\x23","\xf2","\x5d") , HX_HCSTRING("'","\x27","\x00","\x00","\x00"),false);
					__result->Add(HX_HCSTRING("string","\xd1","\x28","\x30","\x11") , tmp6,false);
					__result->Add(HX_HCSTRING("value","\x71","\x7f","\xb8","\x31") , tmp7,false);
					return __result;
				}
				return null();
			}
		};
		HX_STACK_LINE(171)
		Dynamic tmp8 = _Function_2_1::Block(tmp6,tmp7);		HX_STACK_VAR(tmp8,"tmp8");
		HX_STACK_LINE(171)
		ret = tmp8;
		HX_STACK_LINE(177)
		Dynamic tmp9 = ret;		HX_STACK_VAR(tmp9,"tmp9");
		HX_STACK_LINE(177)
		this->holder->__Field(HX_HCSTRING("push","\xda","\x11","\x61","\x4a"), hx::paccDynamic )(tmp9);
	}
	else{
		HX_STACK_LINE(180)
		ret = null();
	}
	HX_STACK_LINE(183)
	Dynamic tmp3 = ret;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(183)
	return tmp3;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,single,return )

Dynamic Parser_obj::string( ){
	HX_STACK_FRAME("Parser","string",0xb5f01c60,"Parser.string","Parser.hx",188,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(189)
	Dynamic tmp = this->single();		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(189)
	Dynamic single = tmp;		HX_STACK_VAR(single,"single");
	HX_STACK_LINE(190)
	Dynamic tmp1 = this->_double();		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(190)
	Dynamic _double = tmp1;		HX_STACK_VAR(_double,"double");
	HX_STACK_LINE(192)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(194)
	bool tmp2 = (single != null());		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(194)
	if ((tmp2)){
		HX_STACK_LINE(196)
		ret = single;
	}
	else{
		HX_STACK_LINE(197)
		bool tmp3 = (_double != null());		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(197)
		if ((tmp3)){
			HX_STACK_LINE(198)
			ret = _double;
		}
	}
	HX_STACK_LINE(201)
	Dynamic tmp3 = ret;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(201)
	return tmp3;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,string,return )

Dynamic Parser_obj::value( ){
	HX_STACK_FRAME("Parser","value",0x6f4d72c2,"Parser.value","Parser.hx",205,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(207)
	Dynamic tmp = this->number();		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(207)
	Dynamic number = tmp;		HX_STACK_VAR(number,"number");
	HX_STACK_LINE(208)
	Dynamic tmp1 = this->ident();		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(208)
	Dynamic ident = tmp1;		HX_STACK_VAR(ident,"ident");
	HX_STACK_LINE(209)
	Dynamic tmp2 = this->string();		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(209)
	Dynamic string = tmp2;		HX_STACK_VAR(string,"string");
	HX_STACK_LINE(210)
	Dynamic tmp3 = this->comma();		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(210)
	Dynamic comma = tmp3;		HX_STACK_VAR(comma,"comma");
	HX_STACK_LINE(212)
	Dynamic ret = null();		HX_STACK_VAR(ret,"ret");
	HX_STACK_LINE(213)
	bool tmp4 = (number != null());		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(213)
	if ((tmp4)){
		HX_STACK_LINE(215)
		ret = number;
	}
	else{
		HX_STACK_LINE(216)
		bool tmp5 = (ident != null());		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(216)
		if ((tmp5)){
			HX_STACK_LINE(219)
			ret = ident;
		}
		else{
			HX_STACK_LINE(220)
			bool tmp6 = (string != null());		HX_STACK_VAR(tmp6,"tmp6");
			HX_STACK_LINE(220)
			if ((tmp6)){
				HX_STACK_LINE(222)
				ret = string;
			}
			else{
				HX_STACK_LINE(223)
				bool tmp7 = (comma != null());		HX_STACK_VAR(tmp7,"tmp7");
				HX_STACK_LINE(223)
				if ((tmp7)){
					HX_STACK_LINE(225)
					ret = comma;
				}
			}
		}
	}
	HX_STACK_LINE(230)
	Dynamic tmp5 = ret;		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(230)
	return tmp5;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,value,return )

cpp::ArrayBase Parser_obj::parse( ){
	HX_STACK_FRAME("Parser","parse",0xfaea8384,"Parser.parse","Parser.hx",235,0x8a1d9b1f)
	HX_STACK_THIS(this)
	HX_STACK_LINE(237)
	while((true)){
		HX_STACK_LINE(237)
		::String tmp = this->str;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(237)
		int tmp1 = tmp.length;		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(237)
		int tmp2 = this->holder->__Field(HX_HCSTRING("length","\xe6","\x94","\x07","\x9f"), hx::paccDynamic );		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(237)
		int tmp3 = (tmp2 + (int)1);		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(237)
		bool tmp4 = (tmp1 > tmp3);		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(237)
		bool tmp5 = !(tmp4);		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(237)
		if ((tmp5)){
			HX_STACK_LINE(237)
			break;
		}
		HX_STACK_LINE(239)
		Dynamic tmp6 = this->value();		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(239)
		Dynamic obj = tmp6;		HX_STACK_VAR(obj,"obj");
		HX_STACK_LINE(241)
		bool tmp7 = (obj == null());		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(241)
		if ((tmp7)){
			HX_STACK_LINE(243)
			::String tmp8 = this->str;		HX_STACK_VAR(tmp8,"tmp8");
			HX_STACK_LINE(243)
			::String tmp9 = tmp8.substr((int)0,(int)10);		HX_STACK_VAR(tmp9,"tmp9");
			HX_STACK_LINE(243)
			::String tmp10 = (HX_HCSTRING("failed to parse near `","\xd7","\xc8","\x41","\x3e") + tmp9);		HX_STACK_VAR(tmp10,"tmp10");
			HX_STACK_LINE(243)
			::String tmp11 = (tmp10 + HX_HCSTRING("...`","\xb2","\xe0","\x8a","\x1e"));		HX_STACK_VAR(tmp11,"tmp11");
			HX_STACK_LINE(243)
			HX_STACK_DO_THROW(tmp11);
		}
	}
	HX_STACK_LINE(249)
	return this->holder;
}


HX_DEFINE_DYNAMIC_FUNC0(Parser_obj,parse,return )


Parser_obj::Parser_obj()
{
}

void Parser_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Parser);
	HX_MARK_MEMBER_NAME(str,"str");
	HX_MARK_MEMBER_NAME(holder,"holder");
	HX_MARK_END_CLASS();
}

void Parser_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(str,"str");
	HX_VISIT_MEMBER_NAME(holder,"holder");
}

Dynamic Parser_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"str") ) { return str; }
		if (HX_FIELD_EQ(inName,"int") ) { return _int_dyn(); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"skip") ) { return skip_dyn(); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"comma") ) { return comma_dyn(); }
		if (HX_FIELD_EQ(inName,"ident") ) { return ident_dyn(); }
		if (HX_FIELD_EQ(inName,"float") ) { return _float_dyn(); }
		if (HX_FIELD_EQ(inName,"value") ) { return value_dyn(); }
		if (HX_FIELD_EQ(inName,"parse") ) { return parse_dyn(); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"holder") ) { return holder; }
		if (HX_FIELD_EQ(inName,"number") ) { return number_dyn(); }
		if (HX_FIELD_EQ(inName,"double") ) { return _double_dyn(); }
		if (HX_FIELD_EQ(inName,"single") ) { return single_dyn(); }
		if (HX_FIELD_EQ(inName,"string") ) { return string_dyn(); }
	}
	return super::__Field(inName,inCallProp);
}

Dynamic Parser_obj::__SetField(const ::String &inName,const Dynamic &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"str") ) { str=inValue.Cast< ::String >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"holder") ) { holder=inValue.Cast< cpp::ArrayBase >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Parser_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("str","\xb1","\xa8","\x57","\x00"));
	outFields->push(HX_HCSTRING("holder","\x6c","\x2f","\x47","\xc6"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo sMemberStorageInfo[] = {
	{hx::fsString,(int)offsetof(Parser_obj,str),HX_HCSTRING("str","\xb1","\xa8","\x57","\x00")},
	{hx::fsObject /*cpp::ArrayBase*/ ,(int)offsetof(Parser_obj,holder),HX_HCSTRING("holder","\x6c","\x2f","\x47","\xc6")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static ::String sMemberFields[] = {
	HX_HCSTRING("str","\xb1","\xa8","\x57","\x00"),
	HX_HCSTRING("holder","\x6c","\x2f","\x47","\xc6"),
	HX_HCSTRING("skip","\x7f","\x16","\x55","\x4c"),
	HX_HCSTRING("comma","\xd5","\x31","\x5d","\x4a"),
	HX_HCSTRING("ident","\xf0","\x42","\x79","\xb7"),
	HX_HCSTRING("int","\xef","\x0c","\x50","\x00"),
	HX_HCSTRING("float","\x9c","\xc5","\x96","\x02"),
	HX_HCSTRING("number","\xc9","\x86","\x7a","\xa1"),
	HX_HCSTRING("double","\x11","\x2b","\xcb","\x32"),
	HX_HCSTRING("single","\x88","\x66","\x21","\xb9"),
	HX_HCSTRING("string","\xd1","\x28","\x30","\x11"),
	HX_HCSTRING("value","\x71","\x7f","\xb8","\x31"),
	HX_HCSTRING("parse","\x33","\x90","\x55","\xbd"),
	::String(null()) };

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Parser_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Parser_obj::__mClass,"__mClass");
};

#endif

hx::Class Parser_obj::__mClass;

void Parser_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Parser","\xff","\x10","\x1d","\x22");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Parser_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

