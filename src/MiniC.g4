grammar MiniC;


@header { 
package generated;
}
program	        :   decl+			;
decl		    :   var_decl
		        |   fun_decl
		        |   struct_decl     ;
var_decl	    :   type_spec IDENT ';'
		        |   type_spec IDENT '=' LITERAL ';'
		        |   type_spec IDENT '[' LITERAL ']' ';'
		        |   type_spec IDENT '[' LITERAL ']' '=' '{' expr (',' expr)* '}' ';'
		        |   IDENT IDENT ';';
type_spec	    :   VOID
		        |   INT
		        |   DOUBLE
		        |   FLOAT
		        |   CHAR;
fun_decl	    :   type_spec IDENT '(' params ')' compound_stmt ;
params		    :   param (',' param)*
		        |   VOID
		        |			;
param		    :   type_spec IDENT
		        |   type_spec IDENT '[' ']'	;
stmt		    :   expr_stmt
		        |   compound_stmt
		        |   if_stmt
		        |   while_stmt
		        |   return_stmt			;
expr_stmt	    :   expr ';'
                |   IDENT '.' expr ';';
while_stmt	    :   WHILE '(' expr ')' stmt	;
compound_stmt   :   '{' local_decl* stmt* '}'	;
local_decl	    :   type_spec IDENT ';'
		        |   type_spec IDENT '=' LITERAL ';'
		        |   type_spec IDENT '[' LITERAL ']' ';'
		        |   type_spec IDENT '[' LITERAL ']' '=' '{' expr (',' expr)* '}' ';'
		        |   type_spec IDENT '[' LITERAL ']' '=' STRING ';'
            |   IDENT IDENT ';';
if_stmt		    :   IF '(' expr ')' stmt
		        |   IF '(' expr ')' stmt ELSE stmt 		;
return_stmt	    :   RETURN ';'
		        |   RETURN expr ';'				;
expr	        :   LITERAL
	            |   '(' expr ')'
	            |   IDENT
	            |   IDENT '[' expr ']'
	            |   IDENT '(' args ')'
	            |   STRING
	            |   DemicalPoint
	            |   '-' expr
	            |   '+' expr
                |   '--' expr
                |   '++' expr
                |   expr '*' expr
                |   expr '/' expr
                |   expr '%' expr
                |   expr '+' expr
                |   expr '-' expr
                |   expr EQ expr
                |   expr NE expr
                |   expr LE expr
                |   expr '<' expr
                |   expr GE expr
                |   expr '>' expr
                |   '!' expr
                |   expr AND expr
                |   expr OR expr
                |   IDENT '=' expr
                |   IDENT '[' expr ']' '=' expr		;
args	        :   expr (',' expr)*
	            |					 ;
struct_decl     :   STRUCT IDENT struct_stmt IDENT ';' ;
struct_stmt     :   '{' struct_attribute+ '}' ;
struct_attribute:   type_spec IDENT ';'
                |   type_spec IDENT '[' LITERAL ']' ';' ;

VOID            :   'void';
INT             :   'int';
DOUBLE          :   'double';
FLOAT           :   'float';
CHAR            :   'char';
STRUCT          :   'struct';

WHILE           :   'while';
IF              :   'if';
ELSE            :   'else';
RETURN          :   'return';
OR              :   'or';
AND             :   'and';
LE              :   '<=';
GE              :   '>=';
EQ              :   '==';
NE              :   '!=';

IDENT           :   [a-zA-Z_]   (   [a-zA-Z_]
                |   [0-9]   )*;

STRING          :   '"' ~('\r' | '\n' | '"')* '"' ;




LITERAL         :   DecimalConstant
                |   OctalConstant
                |   HexadecimalConstant
                |   DemicalPoint;

DemicalPoint          :   DecimalConstant'.'[0-9]+;

DecimalConstant :   '0'
	            |   [1-9] [0-9]*    ;

OctalConstant   :   '0'[0-7]*   ;

HexadecimalConstant
                :   '0' [xX] [0-9a-fA-F] +  ;

WS              :   (   ' '
                |   '\t'
                |   '\r'
                |   '\n'
                )+
                -> channel(HIDDEN)  ;
