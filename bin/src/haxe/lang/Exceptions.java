package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Exceptions extends haxe.lang.HxObject
{
	static
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.exception = new java.lang.ThreadLocal<java.lang.Throwable>();
	}
	
	public Exceptions(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Exceptions()
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.__hx_ctor_haxe_lang_Exceptions(this);
	}
	
	
	public static void __hx_ctor_haxe_lang_Exceptions(haxe.lang.Exceptions __temp_me13)
	{
	}
	
	
	public static java.lang.ThreadLocal<java.lang.Throwable> exception;
	
	public static void setException(java.lang.Throwable exc)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.exception.set(((java.lang.Throwable) (exc) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return new haxe.lang.Exceptions(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return new haxe.lang.Exceptions();
	}
	
	
}


