package miniJava.lexer;

%%

%line
%column
%unicode
%standalone
%public
%class Lexer

char = [A-Za-z]
endline = \r|\n|\r\n
space = [ \t\f]
digit = [0-9]
slcomment = \/\/.*
mlcomment = \/\*([^\*]|[\r\n]|(\*+([^\*\/]|[\r\n])))*\*+\/

wspace = {space}|{endline}
integer = 0|-?[1-9]({digit})*
float = {integer}\.{digit}+((e|E){integer})?
id = ({char}|_)({char}|{digit}|_)*
comment = {slcomment}|{mlcomment}

%%

class|public|extends|static|void|int|boolean|while|if|else|return|false|true|this|new
{System.out.println("keyword: " + yytext());}

;|\.|,|=|\(|\)|\{|\}|\[|\]
{System.out.println("delimiter: " + yytext());}

\|\||&&|==|\!=|<|<=|>|>=|\+|-|\*|\/|%|\!
{System.out.println("operator: " + yytext());}

{wspace}
{System.out.println("wspace: " + yytext());}

{integer}
{System.out.println("integer: " + yytext());}

{float}
{System.out.println("float: " + yytext());}

{id}
{System.out.println("identifier: " + yytext());}

{comment}
{System.out.println("comment: " + yytext());}

// Tokens não reconhecidos
.
{System.out.println("error: " + yytext() + " - line: " + yyline + " - column: " + yycolumn);}