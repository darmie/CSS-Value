package haxe.ds._Vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Vector_Impl_
{
	
	
	public static <T> haxe.root.Array<T> toArray(T[] this1)
	{
		//line 163 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
		haxe.root.Array<T> a = new haxe.root.Array<T>();
		//line 164 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
		int len = ((T[]) (this1) ).length;
		//line 169 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
		{
			//line 169 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
			int _g = 0;
			//line 169 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
			while (( _g < len ))
			{
				//line 169 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
				int i = _g++;
				//line 170 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
				a.__set(i, ((T) (((T[]) (this1) )[i]) ));
			}
			
		}
		
		//line 171 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\Vector.hx"
		return a;
	}
	
	
}


