package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean is(java.lang.Object v, java.lang.Object t)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( v == null )) 
		{
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return haxe.lang.Runtime.eq(t, java.lang.Object.class);
		}
		
		//line 32 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( t == null )) 
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 36 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.String name = clt.getName();
		//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		{
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			switch (__temp_hash3)
			{
				case 761287205:
				case -1325958191:
				{
					//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
					{
						//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						return haxe.lang.Runtime.isDouble(v);
					}
					
					//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					break;
				}
				
				
				case 1063877011:
				{
					//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (__temp_svar1.equals("java.lang.Object")) 
					{
						//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						return true;
					}
					
					//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					break;
				}
				
				
				case -2056817302:
				case 104431:
				{
					//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						return haxe.lang.Runtime.isInt(v);
					}
					
					//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					break;
				}
				
				
				case 344809556:
				case 64711720:
				{
					//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
					{
						//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						return v instanceof java.lang.Boolean;
					}
					
					//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.Class clv = v.getClass();
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static java.lang.Object parseInt(java.lang.String x)
	{
		
		if (x == null) return null;

		int ret = 0;
		int base = 10;
		int i = 0;
		int len = x.length();

		if (x.startsWith("0") && len > 2)
		{
			char c = x.charAt(1);
			if (c == 'x' || c == 'X')
			{
				i = 2;
				base = 16;
			}
		}

		boolean foundAny = i != 0;
		boolean isNeg = false;
		for (; i < len; i++)
		{
			char c = x.charAt(i);
			if (!foundAny)
			{
				switch(c)
				{
					case '-':
						isNeg = true;
						continue;
					case '+':
					case '\n':
					case '\t':
					case '\r':
					case ' ':
						if (isNeg) return null;
						continue;
				}
			}

			if (c >= '0' && c <= '9')
			{
				if (!foundAny && c == '0')
				{
					foundAny = true;
					continue;
				}
				ret *= base; foundAny = true;

				ret += ((int) (c - '0'));
			} else if (base == 16) {
				if (c >= 'a' && c <= 'f') {
					ret *= base; foundAny = true;
					ret += ((int) (c - 'a')) + 10;
				} else if (c >= 'A' && c <= 'F') {
					ret *= base; foundAny = true;
					ret += ((int) (c - 'A')) + 10;
				} else {
					break;
				}
			} else {
				break;
			}
		}

		if (foundAny)
			return isNeg ? -ret : ret;
		else
			return null;
	
	}
	
	
	public static double parseFloat(java.lang.String x)
	{
		//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( x == null )) 
		{
			//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return java.lang.Double.NaN;
		}
		
		//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		x = haxe.root.StringTools.ltrim(x);
		//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean found = false;
		//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasDot = false;
		//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasSign = false;
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasE = false;
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasESign = false;
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasEData = false;
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		int i = -1;
		//line 146 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		{
			//line 146 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			label1:
			//line 146 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			while ((  ++ i < x.length() ))
			{
				//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				int chr = ((int) (((char) (x.charAt(i)) )) );
				//line 149 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				if (( ( chr >= 48 ) && ( chr <= 57 ) )) 
				{
					//line 151 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (hasE) 
					{
						//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						hasEData = true;
					}
					
					//line 155 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					found = true;
				}
				else
				{
					//line 156 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					switch (chr)
					{
						case 101:
						{
							//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if ( ! (hasE) ) 
							{
								//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasE = true;
							}
							else
							{
								//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break label1;
							}
							
							//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break;
						}
						
						
						case 69:
						{
							//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if ( ! (hasE) ) 
							{
								//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasE = true;
							}
							else
							{
								//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break label1;
							}
							
							//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break;
						}
						
						
						case 46:
						{
							//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if ( ! (hasDot) ) 
							{
								//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasDot = true;
							}
							else
							{
								//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break label1;
							}
							
							//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break;
						}
						
						
						case 45:
						{
							//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if ((  ! (found)  &&  ! (hasSign)  )) 
							{
								//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasSign = true;
							}
							else
							{
								//line 163 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if (( ( ( found &&  ! (hasESign)  ) && hasE ) &&  ! (hasEData)  )) 
								{
									//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									hasESign = true;
								}
								else
								{
									//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									break label1;
								}
								
							}
							
							//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break;
						}
						
						
						case 43:
						{
							//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if ((  ! (found)  &&  ! (hasSign)  )) 
							{
								//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasSign = true;
							}
							else
							{
								//line 163 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if (( ( ( found &&  ! (hasESign)  ) && hasE ) &&  ! (hasEData)  )) 
								{
									//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									hasESign = true;
								}
								else
								{
									//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									break label1;
								}
								
							}
							
							//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break;
						}
						
						
						default:
						{
							//line 166 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break label1;
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( hasE &&  ! (hasEData)  )) 
		{
			//line 171 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			i--;
			//line 172 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (hasESign) 
			{
				//line 173 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				i--;
			}
			
		}
		
		//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( i != x.length() )) 
		{
			//line 178 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			x = haxe.lang.StringExt.substr(x, 0, i);
		}
		
		//line 181 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		try 
		{
			//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return java.lang.Double.parseDouble(haxe.lang.Runtime.toString(x));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 181 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			{
				//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				java.lang.Object e = __temp_catchall2;
				//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				return java.lang.Double.NaN;
			}
			
		}
		
		
	}
	
	
}


