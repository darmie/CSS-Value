package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CSSValue extends haxe.lang.HxObject
{
	public CSSValue(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CSSValue()
	{
		//line 8 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\CSSValue.hx"
		haxe.root.CSSValue.__hx_ctor__CSSValue(this);
	}
	
	
	public static void __hx_ctor__CSSValue(haxe.root.CSSValue __temp_me3)
	{
	}
	
	
	public static haxe.root.Array<java.lang.Object> parse(java.lang.String str)
	{
		//line 13 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\CSSValue.hx"
		return new haxe.root.Parser(haxe.lang.Runtime.toString(str)).parse();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\CSSValue.hx"
		return new haxe.root.CSSValue(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\CSSValue.hx"
		return new haxe.root.CSSValue();
	}
	
	
}


