package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ParamEnum extends haxe.lang.Enum
{
	public ParamEnum(int index, java.lang.Object[] params)
	{
		//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index);
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.params = params;
	}
	
	
	public final java.lang.Object[] params;
	
	@Override public haxe.root.Array<java.lang.Object> getParams()
	{
		//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( this.params == null )) 
		{
			//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		}
		else
		{
			//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return ((haxe.root.Array<java.lang.Object>) (haxe.ds._Vector.Vector_Impl_.toArray(this.params)) );
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( ( this.params == null ) || ( ((java.lang.Object[]) (this.params) ).length == 0 ) )) 
		{
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.getTag();
		}
		
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		ret.add(this.getTag());
		//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		ret.add("(");
		//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		boolean first = true;
		//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		{
			//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				java.lang.Object p = ((java.lang.Object) (((java.lang.Object[]) (_g1) )[_g]) );
				//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				 ++ _g;
				//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				if (first) 
				{
					//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					first = false;
				}
				else
				{
					//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					ret.add(",");
				}
				
				//line 123 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				ret.add(p);
			}
			
		}
		
		//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		ret.add(")");
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return ret.toString();
	}
	
	
	@Override public boolean equals(java.lang.Object obj)
	{
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (haxe.lang.Runtime.eq(obj, this)) 
		{
			//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.lang.ParamEnum obj1 = null;
		//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( obj instanceof haxe.lang.ParamEnum )) 
		{
			//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			obj1 = ((haxe.lang.ParamEnum) (obj) );
		}
		else
		{
			//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			obj1 = null;
		}
		
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		boolean ret = ( ( ( obj1 != null ) && haxe.root.Std.is(obj1, haxe.root.Type.getEnum(((java.lang.Object) (this) ))) ) && ( obj1.index == this.index ) );
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if ( ! (ret) ) 
		{
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return false;
		}
		
		//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( obj1.params == this.params )) 
		{
			//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int len = 0;
		//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( ( ( obj1.params == null ) || ( this.params == null ) ) || ( (len = ((java.lang.Object[]) (this.params) ).length) != ((java.lang.Object[]) (obj1.params) ).length ) )) 
		{
			//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return false;
		}
		
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		{
			//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g < len ))
			{
				//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				int i = _g++;
				//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				if ( ! (haxe.lang.Runtime.toBool(haxe.root.Type.enumEq(((java.lang.Object) (((java.lang.Object[]) (obj1.params) )[i]) ), ((java.lang.Object) (((java.lang.Object[]) (this.params) )[i]) )))) ) 
				{
					//line 145 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					return false;
				}
				
			}
			
		}
		
		//line 147 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return true;
	}
	
	
	@Override public int hashCode()
	{
		//line 152 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int h = 19;
		//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( this.params != null )) 
		{
			//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				java.lang.Object p = ((java.lang.Object) (((java.lang.Object[]) (_g1) )[_g]) );
				//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				 ++ _g;
				//line 155 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				h = ( h * 31 );
				//line 156 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				if (( ! (( p == null )) )) 
				{
					//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					h = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (haxe.lang.Runtime.plus(h, p.hashCode())) ))) );
				}
				
			}
			
		}
		
		//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		h += this.index;
		//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return h;
	}
	
	
}


