package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Parser extends haxe.lang.HxObject
{
	public Parser(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Parser(java.lang.String str)
	{
		//line 13 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.Parser.__hx_ctor__Parser(this, str);
	}
	
	
	public static void __hx_ctor__Parser(haxe.root.Parser __temp_me5, java.lang.String str)
	{
		//line 11 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		__temp_me5.holder = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 15 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		__temp_me5.str = str;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return new haxe.root.Parser(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return new haxe.root.Parser(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String str;
	
	public haxe.root.Array<java.lang.Object> holder;
	
	public void skip(haxe.root.EReg m)
	{
		//line 22 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		this.str = haxe.lang.StringExt.substr(this.str, m.matched(0).length(), null);
	}
	
	
	public java.lang.Object comma()
	{
		//line 29 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^, *", "");
		//line 30 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 31 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if ( ! (m.match(this.str)) ) 
		{
			//line 33 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		else
		{
			//line 36 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 37 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = new haxe.lang.DynamicObject(new java.lang.String[]{"string", "type"}, new java.lang.Object[]{",", "comma"}, new java.lang.String[]{}, new double[]{});
			//line 38 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		
		//line 41 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object ident()
	{
		//line 47 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^([\\w-]+) *", "");
		//line 48 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		boolean isMatch = m.match(this.str);
		//line 49 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 50 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if ( ! (isMatch) ) 
		{
			//line 52 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		else
		{
			//line 55 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 56 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			{
				//line 58 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl1 = m.matched(1);
				//line 56 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = new haxe.lang.DynamicObject(new java.lang.String[]{"string", "type"}, new java.lang.Object[]{__temp_odecl1, "ident"}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 60 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		
		//line 63 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object _int()
	{
		//line 69 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^(([-\\+]?\\d+)(\\S+)?) *", "");
		//line 70 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		boolean isMatch = m.match(this.str);
		//line 71 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 72 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if ( ! (isMatch) ) 
		{
			//line 74 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		else
		{
			//line 77 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 78 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			java.lang.Object n =  ~ ((( ~ (((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(m.matched(2)))) )) ))) ;
			//line 80 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			java.lang.String u = m.matched(3);
			//line 82 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			{
				//line 84 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl1 = m.matched(1);
				//line 82 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = new haxe.lang.DynamicObject(new java.lang.String[]{"string", "type", "unit", "value"}, new java.lang.Object[]{__temp_odecl1, "number", ( (( u != null )) ? (u) : ("") ), n}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 88 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		
		//line 92 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object _float()
	{
		//line 98 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^(((?:[-\\+]?\\d+)?\\.\\d+)(\\S+)?) *", "");
		//line 99 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 100 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if ( ! (m.match(this.str)) ) 
		{
			//line 102 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		else
		{
			//line 105 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 106 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			java.lang.Object n = haxe.root.Std.parseFloat(m.matched(2));
			//line 108 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			java.lang.String u = m.matched(3);
			//line 109 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			{
				//line 111 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl1 = m.matched(1);
				//line 109 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = new haxe.lang.DynamicObject(new java.lang.String[]{"string", "type", "unit", "value"}, new java.lang.Object[]{__temp_odecl1, "number", ( (( u != null )) ? (u) : ("") ), n}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 115 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		
		//line 119 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object number()
	{
		//line 124 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object _int = this._int();
		//line 125 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object _float = this._float();
		//line 126 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 128 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if (( ! (( _int == null )) )) 
		{
			//line 130 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = _int;
		}
		else
		{
			//line 132 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (( ! (( _float == null )) )) 
			{
				//line 134 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = _float;
			}
			
		}
		
		//line 137 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object _double()
	{
		//line 144 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^\"([^\"]*)\" *", "");
		//line 145 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 146 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if (m.match(this.str)) 
		{
			//line 147 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 148 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			{
				//line 151 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl1 = ( ( "\"" + m.matched(1) ) + "\"" );
				//line 152 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl2 = m.matched(1);
				//line 148 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = new haxe.lang.DynamicObject(new java.lang.String[]{"quote", "string", "type", "value"}, new java.lang.Object[]{"\"", __temp_odecl1, "string", __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 154 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		else
		{
			//line 157 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		
		//line 160 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object single()
	{
		//line 167 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		haxe.root.EReg m = new haxe.root.EReg("^\'([^\']*)\' *", "");
		//line 168 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 169 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if (m.match(this.str)) 
		{
			//line 170 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.skip(m);
			//line 171 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			{
				//line 174 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl1 = ( ( "\'" + m.matched(1) ) + "\'" );
				//line 175 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				java.lang.String __temp_odecl2 = m.matched(1);
				//line 171 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = new haxe.lang.DynamicObject(new java.lang.String[]{"quote", "string", "type", "value"}, new java.lang.Object[]{"\'", __temp_odecl1, "string", __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 177 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			this.holder.push(ret);
		}
		else
		{
			//line 180 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = null;
		}
		
		//line 183 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object string()
	{
		//line 189 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object single = this.single();
		//line 190 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object _double = this._double();
		//line 192 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 194 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if (( ! (( single == null )) )) 
		{
			//line 196 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = single;
		}
		else
		{
			//line 197 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (( ! (( _double == null )) )) 
			{
				//line 198 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = _double;
			}
			
		}
		
		//line 201 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public java.lang.Object value()
	{
		//line 207 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object number = this.number();
		//line 208 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ident = this.ident();
		//line 209 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object string = this.string();
		//line 210 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object comma = this.comma();
		//line 212 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		java.lang.Object ret = null;
		//line 213 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		if (( ! (( number == null )) )) 
		{
			//line 215 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			ret = number;
		}
		else
		{
			//line 216 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (( ! (( ident == null )) )) 
			{
				//line 219 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				ret = ident;
			}
			else
			{
				//line 220 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				if (( ! (( string == null )) )) 
				{
					//line 222 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					ret = string;
				}
				else
				{
					//line 223 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (( ! (( comma == null )) )) 
					{
						//line 225 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						ret = comma;
					}
					
				}
				
			}
			
		}
		
		//line 230 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return ret;
	}
	
	
	public haxe.root.Array<java.lang.Object> parse()
	{
		//line 237 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		while (( this.str.length() > ( this.holder.length + 1 ) ))
		{
			//line 239 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			java.lang.Object obj = this.value();
			//line 241 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (( obj == null )) 
			{
				//line 243 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				throw haxe.lang.HaxeException.wrap(( ( "failed to parse near `" + haxe.lang.StringExt.substr(this.str, 0, 10) ) + "...`" ));
			}
			
		}
		
		//line 249 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return this.holder;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		{
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			switch (field.hashCode())
			{
				case -1211707988:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("holder")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						this.holder = ((haxe.root.Array<java.lang.Object>) (value) );
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return value;
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 114225:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("str")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						this.str = haxe.lang.Runtime.toString(value);
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return value;
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
			}
			
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		{
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			switch (field.hashCode())
			{
				case 106437299:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("parse")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parse")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 114225:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("str")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.str;
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("value")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "value")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -1211707988:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("holder")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.holder;
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -891985903:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("string")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "string")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 3532159:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("skip")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "skip")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -902265784:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("single")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "single")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 94843605:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("comma")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "comma")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -1325958191:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("double")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "double")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 100049392:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("ident")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ident")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -1034364087:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("number")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "number")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 104431:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("int")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "int")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 97526364:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("float")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "float")) );
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
			}
			
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		{
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			switch (field.hashCode())
			{
				case 106437299:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("parse")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.parse();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 3532159:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("skip")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						this.skip(((haxe.root.EReg) (dynargs.__get(0)) ));
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("value")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.value();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 94843605:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("comma")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.comma();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -891985903:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("string")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.string();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 100049392:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("ident")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.ident();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -902265784:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("single")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.single();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 104431:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("int")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this._int();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -1325958191:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("double")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this._double();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case 97526364:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("float")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this._float();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
				case -1034364087:
				{
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					if (field.equals("number")) 
					{
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						__temp_executeDef1 = false;
						//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
						return this.number();
					}
					
					//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
					break;
				}
				
				
			}
			
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		baseArr.push("holder");
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		baseArr.push("str");
		//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
		{
			//line 7 "C:\\Users\\Damilare\\Documents\\CSSValue\\src\\Parser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


