#include <hxcpp.h>

#ifndef INCLUDED_CSSValue
#include <CSSValue.h>
#endif
#ifndef INCLUDED_Parser
#include <Parser.h>
#endif

Void CSSValue_obj::__construct()
{
	return null();
}

//CSSValue_obj::~CSSValue_obj() { }

Dynamic CSSValue_obj::__CreateEmpty() { return  new CSSValue_obj; }
hx::ObjectPtr< CSSValue_obj > CSSValue_obj::__new()
{  hx::ObjectPtr< CSSValue_obj > _result_ = new CSSValue_obj();
	_result_->__construct();
	return _result_;}

Dynamic CSSValue_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< CSSValue_obj > _result_ = new CSSValue_obj();
	_result_->__construct();
	return _result_;}

cpp::ArrayBase CSSValue_obj::parse( ::String str){
	HX_STACK_FRAME("CSSValue","parse",0xb463f893,"CSSValue.parse","CSSValue.hx",12,0x3e86f6b0)
	HX_STACK_ARG(str,"str")
	HX_STACK_LINE(13)
	::Parser tmp = ::Parser_obj::__new(str);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(13)
	return tmp->parse();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(CSSValue_obj,parse,return )


CSSValue_obj::CSSValue_obj()
{
}

bool CSSValue_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"parse") ) { outValue = parse_dyn(); return true;  }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(CSSValue_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(CSSValue_obj::__mClass,"__mClass");
};

#endif

hx::Class CSSValue_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("parse","\x33","\x90","\x55","\xbd"),
	::String(null()) };

void CSSValue_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("CSSValue","\xce","\x40","\x2e","\x68");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &CSSValue_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< CSSValue_obj >;
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

