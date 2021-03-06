package _Array;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class ArrayIterator<T> extends haxe.lang.HxObject
{
	public ArrayIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayIterator(haxe.root.Array<T> a)
	{
		//line 472 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		_Array.ArrayIterator.__hx_ctor__Array_ArrayIterator(this, a);
	}
	
	
	public static <T_c> void __hx_ctor__Array_ArrayIterator(_Array.ArrayIterator<T_c> __temp_me2, haxe.root.Array<T_c> a)
	{
		//line 474 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		__temp_me2.arr = a;
		//line 475 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		__temp_me2.len = a.length;
		//line 476 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		__temp_me2.i = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return new _Array.ArrayIterator<java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return new _Array.ArrayIterator<java.lang.Object>(((haxe.root.Array<java.lang.Object>) (arr.__get(0)) ));
	}
	
	
	public haxe.root.Array<T> arr;
	
	public int len;
	
	public int i;
	
	public final boolean hasNext()
	{
		//line 479 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ( this.i < this.len );
	}
	
	
	public final T next()
	{
		//line 480 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return this.arr.__get(this.i++);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 105:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("i")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.i = ((int) (value) );
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("len")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.len = ((int) (value) );
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 105:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("i")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.i = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 96865:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("arr")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.arr = ((haxe.root.Array<T>) (value) );
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("len")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("next")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 96865:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("arr")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.arr;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("hasNext")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("len")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.len;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 105:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("i")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.i;
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 105:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("i")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((double) (this.i) );
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("len")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((double) (this.len) );
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("next")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.next();
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("hasNext")) 
					{
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.hasNext();
					}
					
					//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		baseArr.push("i");
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		baseArr.push("len");
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		baseArr.push("arr");
		//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 466 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


