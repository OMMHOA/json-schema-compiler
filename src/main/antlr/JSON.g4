
/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JSON;

jsonwa
   : EOF+ json
   | json
   ;

json
   : value
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : STRING ':' value
   ;

array
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : STRING
   | NUMBER
   | INT
   | BOOLEAN
   | NULL
   | obj
   | array
   ;


STRING
   : '"' (ESC | SAFECODEPOINT)* '"'
   ;


fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;


fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;


fragment HEX
   : [0-9a-fA-F]
   ;


fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;


// no leading zeros

INT
   : '0' | [1-9] [0-9]*
   ;


NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;


fragment EXP
   : [Ee] [+\-]? INT
   ;

// \- since - means "range" inside [...]

BOOLEAN
   : TRUE | FALSE
   ;

TRUE
   : 'true'
   ;

FALSE
   : 'false'
   ;

NULL
   : 'null'
   ;

WS
   : [ \t\n\r] + -> skip
   ;
