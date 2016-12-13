#ifndef INCLUDED_Test
#define INCLUDED_Test

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(Test)


class HXCPP_CLASS_ATTRIBUTES  Test_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef Test_obj OBJ_;
		Test_obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="Test")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Test_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Test_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("Test","\x72","\xf4","\xd2","\x37"); }

		static Void main( );
		static Dynamic main_dyn();

};


#endif /* INCLUDED_Test */ 
