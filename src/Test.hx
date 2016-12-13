package;

import CSSValue;

/**
 * ...
 * @author Damilare Akinlaja
 */
class Test 
{
	
	static function main() 
	{
		var str:String = "14px 1.5 'proxima-nova', 'Helvetica Neue', Arial, Helvetica, sans-serif";

		trace(CSSValue.parse(str));
	}
	
}