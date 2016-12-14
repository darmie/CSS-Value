# CSS-Value
A tiny cross-platform library for parsing css values, based on this Nodejs module [css-value](https://github.com/reworkcss/css-value)

This library is developed with [haxe](http://haxe.org) to be cross-platform and is expected to work on Java, Javascript, Neko and C++ targets.

```hx
class Test 
{
	
	static function main() 
	{
		var str:String = "14px 1.5 'proxima-nova', 'Helvetica Neue', Arial, Helvetica, sans-serif";

		trace(CSSValue.parse(str));
	}
}	
```
* Run the test in terminal like this `haxe test.hxml` , this assumes you have the haxe compiler installed.
* If you don't want to use the Haxe compiler, you can test using Java like this `java -jar bin/Test.jar` or the javascript target in browser : put the html/Test.js in script tag of your html application and test.

The result

```json
[  
   {  
      "string":"14px",
      "type":"number",
      "unit":"px",
      "value":14
   },
   {  
      "string":"1.5",
      "type":"number",
      "unit":"",
      "value":1.5
   },
   {  
      "quote":"'",
      "string":"'proxima-nova'",
      "type":"string",
      "value":"proxima-nova"
   },
   {  
      "string":",",
      "type":"comma"
   },
   {  
      "quote":"'",
      "string":"'Helvetica Neue'",
      "type":"string",
      "value":"Helvetica Neue"
   },
   {  
      "string":",",
      "type":"comma"
   },
   {  
      "string":"Arial",
      "type":"ident"
   },
   {  
      "string":",",
      "type":"comma"
   },
   {  
      "string":"Helvetica",
      "type":"ident"
   },
   {  
      "string":",",
      "type":"comma"
   }
]

```

###MIT License

Copyright (c) 2016 'Damilare Darmie Akinlaja

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
