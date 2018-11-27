/*
BSD License

Copyright (c) 2013, Tom Everett
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar Equation;

equationwa
   : EOF* equation
   ;

equation
   : expression relop expression
   ;

expression
   : multiplyingExpression
   | plusOrMinusExpression
   ;


plusOrMinusExpression
   : multiplyingExpression plusOrMinus multiplyingExpression
   | multiplyingExpression plusOrMinus plusOrMinusExpression
   ;


plusOrMinus
   : PLUS
   | MINUS
   ;


multiplyingExpression
   : poweredExpression
   | timesOrDivExpression
   ;


timesOrDivExpression
   : poweredExpression timesOrDiv poweredExpression
   | poweredExpression timesOrDiv timesOrDivExpression
   ;


timesOrDiv
   : TIMES
   | DIV
   ;


poweredExpression
   : signedAtom
   | powExpression
   ;


powExpression
   : signedAtom POW signedAtom
   | signedAtom POW powExpression
   ;


signedAtom
   : PLUS signedAtom
   | MINUS signedAtom
   | func
   | atom
   ;


array
   : '[' atom (',' atom)* ']'
   | '[' ']'
   ;


atom
   : JSON_POINTER
   | NUMBER
   | INT
   | BOOLEAN
   | NULL
   | THIS
   | LPAREN expression RPAREN
   | STRING
   | array
   ;

func
   : funcname LPAREN expression (COMMA expression)* RPAREN
   ;

funcname
   : COS
   | TAN
   | SIN
   | ACOS
   | ATAN
   | ASIN
   | LOG
   | LN
   | SQRT
   ;

relop
   : EQ
   | GT
   | LT
   ;


COS
   : 'cos'
   ;


SIN
   : 'sin'
   ;


TAN
   : 'tan'
   ;


ACOS
   : 'acos'
   ;


ASIN
   : 'asin'
   ;


ATAN
   : 'atan'
   ;


LN
   : 'ln'
   ;


LOG
   : 'log'
   ;


SQRT
   : 'sqrt'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


COMMA
   : ','
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;


THIS
   : 'this'
   ;


INT
   : '0' | [1-9] [0-9]*
   ;


NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;


fragment EXP
   : [Ee] [+\-]? INT
   ;


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


JSON_POINTER
   : '/' STRING_CONTENT*
   ;


STRING
   : '\\"' STRING_CONTENT* '\\"'
   ;


STRING_CONTENT
   : ESC
   | SAFECODEPOINT
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

WS
   : [ \r\n\t] + -> skip
   ;
