#ifndef INCLUDED_Parser
#define INCLUDED_Parser

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(EReg)
HX_DECLARE_CLASS0(Parser)


class HXCPP_CLASS_ATTRIBUTES  Parser_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef Parser_obj OBJ_;
		Parser_obj();
		Void __construct(::String str);

	public:
		inline void *operator new( size_t inSize, bool inContainer=true,const char *inName="Parser")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Parser_obj > __new(::String str);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Parser_obj();

		HX_DO_RTTI_ALL;
		Dynamic __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		Dynamic __SetField(const ::String &inString,const Dynamic &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("Parser","\xff","\x10","\x1d","\x22"); }

		::String str;
		cpp::ArrayBase holder;
		virtual Void skip( ::EReg m);
		Dynamic skip_dyn();

		virtual Dynamic comma( );
		Dynamic comma_dyn();

		virtual Dynamic ident( );
		Dynamic ident_dyn();

		virtual Dynamic _int( );
		Dynamic _int_dyn();

		virtual Dynamic _float( );
		Dynamic _float_dyn();

		virtual Dynamic number( );
		Dynamic number_dyn();

		virtual Dynamic _double( );
		Dynamic _double_dyn();

		virtual Dynamic single( );
		Dynamic single_dyn();

		virtual Dynamic string( );
		Dynamic string_dyn();

		virtual Dynamic value( );
		Dynamic value_dyn();

		virtual cpp::ArrayBase parse( );
		Dynamic parse_dyn();

};


#endif /* INCLUDED_Parser */ 
