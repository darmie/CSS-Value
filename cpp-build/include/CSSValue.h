#ifndef INCLUDED_CSSValue
#define INCLUDED_CSSValue

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(CSSValue)


class HXCPP_CLASS_ATTRIBUTES  CSSValue_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef CSSValue_obj OBJ_;
		CSSValue_obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="CSSValue")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< CSSValue_obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~CSSValue_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("CSSValue","\xce","\x40","\x2e","\x68"); }

		static cpp::ArrayBase parse( ::String str);
		static Dynamic parse_dyn();

};


#endif /* INCLUDED_CSSValue */ 