package;

/**
 * ...
 * @author Damilare Akinlaja
 */

class CSSValue
{

	public static function parse(str:String):Array<CSSValueType>
	{
		return new Parser(str).parse();
	}

}
