# CSS-Value
A tiny cross-platform library for parsing css values. 

```hx
class Test 
{
	
	static function main() 
	{
		var str:String = "14px 1.5 'proxima-nova', 'Helvetica Neue', Arial, Helvetica, sans-serif";

		trace(CSSValue.parse(str));
	}
	
```
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


