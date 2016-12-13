#include <hxcpp.h>

#ifndef INCLUDED_CSSValue
#include <CSSValue.h>
#endif
#ifndef INCLUDED_Test
#include <Test.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif

Void Test_obj::__construct()
{
	return null();
}

//Test_obj::~Test_obj() { }

Dynamic Test_obj::__CreateEmpty() { return  new Test_obj; }
hx::ObjectPtr< Test_obj > Test_obj::__new()
{  hx::ObjectPtr< Test_obj > _result_ = new Test_obj();
	_result_->__construct();
	return _result_;}

Dynamic Test_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< Test_obj > _result_ = new Test_obj();
	_result_->__construct();
	return _result_;}

Void Test_obj::main( ){
{
		HX_STACK_FRAME("Test","main",0x9c6c95b5,"Test.main","Test.hx",13,0x8afb218c)
		HX_STACK_LINE(14)
		::String str = HX_HCSTRING("14px 1.5 'proxima-nova', 'Helvetica Neue', Arial, Helvetica, sans-serif","\x19","\xf7","\x48","\x3b");		HX_STACK_VAR(str,"str");
		HX_STACK_LINE(16)
		::String tmp = str;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(16)
		Dynamic tmp1 = hx::SourceInfo(HX_HCSTRING("Test.hx","\x8c","\x21","\xfb","\x8a"),16,HX_HCSTRING("Test","\x72","\xf4","\xd2","\x37"),HX_HCSTRING("main","\x39","\x38","\x56","\x48"));		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(16)
		::haxe::Log_obj::trace(::CSSValue_obj::parse(tmp),tmp1);
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Test_obj,main,(void))


Test_obj::Test_obj()
{
}

bool Test_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"main") ) { outValue = main_dyn(); return true;  }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Test_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Test_obj::__mClass,"__mClass");
};

#endif

hx::Class Test_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null()) };

void Test_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Test","\x72","\xf4","\xd2","\x37");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Test_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Test_obj >;
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

