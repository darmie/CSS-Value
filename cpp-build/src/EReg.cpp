#include <hxcpp.h>

#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif

Void EReg_obj::__construct(::String r,::String opt)
{
HX_STACK_FRAME("EReg","new",0x8b859e81,"EReg.new","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",28,0xa4513ee9)
HX_STACK_THIS(this)
HX_STACK_ARG(r,"r")
HX_STACK_ARG(opt,"opt")
{
	HX_STACK_LINE(29)
	Array< ::String > a = opt.split(HX_HCSTRING("g","\x67","\x00","\x00","\x00"));		HX_STACK_VAR(a,"a");
	HX_STACK_LINE(30)
	bool tmp = (a->length > (int)1);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(30)
	this->global = tmp;
	HX_STACK_LINE(31)
	bool tmp1 = this->global;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(31)
	if ((tmp1)){
		HX_STACK_LINE(32)
		::String tmp2 = a->join(HX_HCSTRING("","\x00","\x00","\x00","\x00"));		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(32)
		opt = tmp2;
	}
	HX_STACK_LINE(33)
	::String tmp2 = r;		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(33)
	::String tmp3 = opt;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(33)
	Dynamic tmp4 = ::EReg_obj::regexp_new_options(tmp2,tmp3);		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(33)
	this->r = tmp4;
}
;
	return null();
}

//EReg_obj::~EReg_obj() { }

Dynamic EReg_obj::__CreateEmpty() { return  new EReg_obj; }
hx::ObjectPtr< EReg_obj > EReg_obj::__new(::String r,::String opt)
{  hx::ObjectPtr< EReg_obj > _result_ = new EReg_obj();
	_result_->__construct(r,opt);
	return _result_;}

Dynamic EReg_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< EReg_obj > _result_ = new EReg_obj();
	_result_->__construct(inArgs[0],inArgs[1]);
	return _result_;}

bool EReg_obj::match( ::String s){
	HX_STACK_FRAME("EReg","match",0x18fda1a6,"EReg.match","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",36,0xa4513ee9)
	HX_STACK_THIS(this)
	HX_STACK_ARG(s,"s")
	HX_STACK_LINE(37)
	Dynamic tmp = this->r;		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(37)
	::String tmp1 = s;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(37)
	int tmp2 = s.length;		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(37)
	Dynamic tmp3 = ::EReg_obj::regexp_match(tmp,tmp1,(int)0,tmp2);		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(37)
	bool p = tmp3;		HX_STACK_VAR(p,"p");
	HX_STACK_LINE(38)
	bool tmp4 = p;		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(38)
	if ((tmp4)){
		HX_STACK_LINE(39)
		this->last = s;
	}
	else{
		HX_STACK_LINE(41)
		this->last = null();
	}
	HX_STACK_LINE(42)
	bool tmp5 = p;		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(42)
	return tmp5;
}


HX_DEFINE_DYNAMIC_FUNC1(EReg_obj,match,return )

::String EReg_obj::matched( int n){
	HX_STACK_FRAME("EReg","matched",0x8ce62f85,"EReg.matched","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",45,0xa4513ee9)
	HX_STACK_THIS(this)
	HX_STACK_ARG(n,"n")
	HX_STACK_LINE(46)
	Dynamic tmp = this->r;		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(46)
	int tmp1 = n;		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(46)
	Dynamic tmp2 = ::EReg_obj::regexp_matched(tmp,tmp1);		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(46)
	::String m = tmp2;		HX_STACK_VAR(m,"m");
	HX_STACK_LINE(47)
	::String tmp3 = m;		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(47)
	return tmp3;
}


HX_DEFINE_DYNAMIC_FUNC1(EReg_obj,matched,return )

Dynamic EReg_obj::regexp_new_options;

Dynamic EReg_obj::regexp_match;

Dynamic EReg_obj::regexp_matched;


EReg_obj::EReg_obj()
{
}

void EReg_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(EReg);
	HX_MARK_MEMBER_NAME(r,"r");
	HX_MARK_MEMBER_NAME(last,"last");
	HX_MARK_MEMBER_NAME(global,"global");
	HX_MARK_END_CLASS();
}

void EReg_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(r,"r");
	HX_VISIT_MEMBER_NAME(last,"last");
	HX_VISIT_MEMBER_NAME(global,"global");
}

Dynamic EReg_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"r") ) { return r; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"last") ) { return last; }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"match") ) { return match_dyn(); }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"global") ) { return global; }
		break;
	case 7:
		if (HX_FIELD_EQ(inName,"matched") ) { return matched_dyn(); }
	}
	return super::__Field(inName,inCallProp);
}

bool EReg_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 12:
		if (HX_FIELD_EQ(inName,"regexp_match") ) { outValue = regexp_match; return true;  }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"regexp_matched") ) { outValue = regexp_matched; return true;  }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"regexp_new_options") ) { outValue = regexp_new_options; return true;  }
	}
	return false;
}

Dynamic EReg_obj::__SetField(const ::String &inName,const Dynamic &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 1:
		if (HX_FIELD_EQ(inName,"r") ) { r=inValue.Cast< Dynamic >(); return inValue; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"last") ) { last=inValue.Cast< ::String >(); return inValue; }
		break;
	case 6:
		if (HX_FIELD_EQ(inName,"global") ) { global=inValue.Cast< bool >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

bool EReg_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 12:
		if (HX_FIELD_EQ(inName,"regexp_match") ) { regexp_match=ioValue.Cast< Dynamic >(); return true; }
		break;
	case 14:
		if (HX_FIELD_EQ(inName,"regexp_matched") ) { regexp_matched=ioValue.Cast< Dynamic >(); return true; }
		break;
	case 18:
		if (HX_FIELD_EQ(inName,"regexp_new_options") ) { regexp_new_options=ioValue.Cast< Dynamic >(); return true; }
	}
	return false;
}

void EReg_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("r","\x72","\x00","\x00","\x00"));
	outFields->push(HX_HCSTRING("last","\x56","\x0a","\xad","\x47"));
	outFields->push(HX_HCSTRING("global","\x63","\x31","\xb2","\xa7"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(EReg_obj,r),HX_HCSTRING("r","\x72","\x00","\x00","\x00")},
	{hx::fsString,(int)offsetof(EReg_obj,last),HX_HCSTRING("last","\x56","\x0a","\xad","\x47")},
	{hx::fsBool,(int)offsetof(EReg_obj,global),HX_HCSTRING("global","\x63","\x31","\xb2","\xa7")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo sStaticStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(void *) &EReg_obj::regexp_new_options,HX_HCSTRING("regexp_new_options","\x89","\x34","\xba","\x56")},
	{hx::fsObject /*Dynamic*/ ,(void *) &EReg_obj::regexp_match,HX_HCSTRING("regexp_match","\x0f","\xcd","\x47","\xb6")},
	{hx::fsObject /*Dynamic*/ ,(void *) &EReg_obj::regexp_matched,HX_HCSTRING("regexp_matched","\x2e","\xc7","\xa0","\xb1")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static ::String sMemberFields[] = {
	HX_HCSTRING("r","\x72","\x00","\x00","\x00"),
	HX_HCSTRING("last","\x56","\x0a","\xad","\x47"),
	HX_HCSTRING("global","\x63","\x31","\xb2","\xa7"),
	HX_HCSTRING("match","\x45","\x49","\x23","\x03"),
	HX_HCSTRING("matched","\xe4","\x3c","\x7c","\x89"),
	::String(null()) };

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(EReg_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(EReg_obj::regexp_new_options,"regexp_new_options");
	HX_MARK_MEMBER_NAME(EReg_obj::regexp_match,"regexp_match");
	HX_MARK_MEMBER_NAME(EReg_obj::regexp_matched,"regexp_matched");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(EReg_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(EReg_obj::regexp_new_options,"regexp_new_options");
	HX_VISIT_MEMBER_NAME(EReg_obj::regexp_match,"regexp_match");
	HX_VISIT_MEMBER_NAME(EReg_obj::regexp_matched,"regexp_matched");
};

#endif

hx::Class EReg_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("regexp_new_options","\x89","\x34","\xba","\x56"),
	HX_HCSTRING("regexp_match","\x0f","\xcd","\x47","\xb6"),
	HX_HCSTRING("regexp_matched","\x2e","\xc7","\xa0","\xb1"),
	::String(null()) };

void EReg_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("EReg","\x0f","\x4a","\xda","\x2d");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &EReg_obj::__GetStatic;
	__mClass->mSetStaticField = &EReg_obj::__SetStatic;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(sMemberFields);
	__mClass->mCanCast = hx::TCanCast< EReg_obj >;
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

void EReg_obj::__boot()
{
struct _Function_0_1{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",174,0xa4513ee9)
		{
			HX_STACK_LINE(174)
			Dynamic tmp = ::cpp::Lib_obj::load(HX_HCSTRING("regexp","\xc9","\xbf","\x89","\x00"),HX_HCSTRING("regexp_new_options","\x89","\x34","\xba","\x56"),(int)2);		HX_STACK_VAR(tmp,"tmp");
			HX_STACK_LINE(174)
			return tmp;
		}
		return null();
	}
};
	regexp_new_options= _Function_0_1::Block();
struct _Function_0_2{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",175,0xa4513ee9)
		{
			HX_STACK_LINE(175)
			Dynamic tmp = ::cpp::Lib_obj::load(HX_HCSTRING("regexp","\xc9","\xbf","\x89","\x00"),HX_HCSTRING("regexp_match","\x0f","\xcd","\x47","\xb6"),(int)4);		HX_STACK_VAR(tmp,"tmp");
			HX_STACK_LINE(175)
			return tmp;
		}
		return null();
	}
};
	regexp_match= _Function_0_2::Block();
struct _Function_0_3{
	inline static Dynamic Block( ){
		HX_STACK_FRAME("*","closure",0x5bdab937,"*.closure","C:\\HaxeToolkit\\haxe\\std/cpp/_std/EReg.hx",176,0xa4513ee9)
		{
			HX_STACK_LINE(176)
			Dynamic tmp = ::cpp::Lib_obj::load(HX_HCSTRING("regexp","\xc9","\xbf","\x89","\x00"),HX_HCSTRING("regexp_matched","\x2e","\xc7","\xa0","\xb1"),(int)2);		HX_STACK_VAR(tmp,"tmp");
			HX_STACK_LINE(176)
			return tmp;
		}
		return null();
	}
};
	regexp_matched= _Function_0_3::Block();
}

