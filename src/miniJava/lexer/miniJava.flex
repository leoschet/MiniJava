package miniJava.lexer;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import miniJava.parser.Tokens;

%%

%line
%column
%unicode
%standalone
%public
%implements Tokens
%cup
%class Lexer

%{
    private ComplexSymbolFactory symbolFactory;

	public Lexer(Path filePath, ComplexSymbolFactory sf) throws IOException {
		this(Files.newBufferedReader(filePath));
        symbolFactory = sf;
    }

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1, yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code,
						new Location(yyline+1, yycolumn +1, yychar),
						new Location(yyline+1, yycolumn+yylength(), yychar+yylength()), lexem);
    }

    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }

    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" +
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

char        = [A-Za-z]
endline     = \r|\n|\r\n
space       = [ \t\f]
digit       = [0-9]
slcomment   = \/\/.*
mlcomment   = \/\*([^\*]|[\r\n]|(\*+([^\*\/]|[\r\n])))*\*+\/

wspace      = {space}|{endline}
integer     = 0|-?[1-9]({digit})*
double       = {integer}\.{digit}+((e|E){integer})?
id          = ({char}|_)({char}|{digit}|_)*
comment     = {slcomment}|{mlcomment}s

%eofval{
    return symbolFactory.newSymbol("EOF", EOF);
%eofval}

%%

class
{ return symbolFactory.newSymbol("CLASS", CLASS); }

public
{ return symbolFactory.newSymbol("PUBLIC", PUBLIC); }

extends
{ return symbolFactory.newSymbol("EXTENDS", EXTENDS); }

static
{ return symbolFactory.newSymbol("STATIC", STATIC); }

void
{ return symbolFactory.newSymbol("VOID", VOID); }

int
{ return symbolFactory.newSymbol("INT", INT); }

boolean
{ return symbolFactory.newSymbol("BOOL", BOOL); }

while
{ return symbolFactory.newSymbol("WHILE", WHILE); }

if
{ return symbolFactory.newSymbol("IF", IF); }

else
{ return symbolFactory.newSymbol("ELSE", ELSE); }

return
{ return symbolFactory.newSymbol("RETURN", RETURN); }

false
{ return symbolFactory.newSymbol("FALSE", FALSE); }

true
{ return symbolFactory.newSymbol("TRUE", TRUE); }

this
{ return symbolFactory.newSymbol("THIS", THIS); }

new
{ return symbolFactory.newSymbol("NEW", NEW); }

";"
{ return symbolFactory.newSymbol("SEMICOLON", SEMICOLON); }

"."
{ return symbolFactory.newSymbol("DOT", DOT); }

","
{ return symbolFactory.newSymbol("COMMA", COMMA); }

"="
{ return symbolFactory.newSymbol("ASS", ASS); }

"("
{ return symbolFactory.newSymbol("O_PAR", O_PAR); }

")"
{ return symbolFactory.newSymbol("C_PAR", C_PAR); }

"{"
{ return symbolFactory.newSymbol("O_BRACE", O_BRACE); }

"}"
{ return symbolFactory.newSymbol("C_BRACE", C_BRACE); }

"["
{ return symbolFactory.newSymbol("O_BRACKET", O_BRACKET); }

"]"
{ return symbolFactory.newSymbol("C_BRACKET", C_BRACKET); }

"||"
{ return symbolFactory.newSymbol("OR", OR); }

"&&"
{ return symbolFactory.newSymbol("AND", AND); }

"=="
{ return symbolFactory.newSymbol("EQUAL", EQUAL); }

"!="
{ return symbolFactory.newSymbol("N_EQUAL", N_EQUAL); }

"<"
{ return symbolFactory.newSymbol("LESS", LESS); }

"<="
{ return symbolFactory.newSymbol("L_EQUAL", L_EQUAL); }

">"
{ return symbolFactory.newSymbol("GREATER", GREATER); }

">="
{ return symbolFactory.newSymbol("G_EQUAL", G_EQUAL); }

"+"
{ return symbolFactory.newSymbol("PLUS", PLUS); }

"-"
{ return symbolFactory.newSymbol("MINUS", MINUS); }

"*"
{ return symbolFactory.newSymbol("TIMES", TIMES); }

"/"
{ return symbolFactory.newSymbol("SLASH", SLASH); }

"%"
{ return symbolFactory.newSymbol("MOD", MOD); }

"!"
{ return symbolFactory.newSymbol("NEG", NEG); }

String
{ return symbolFactory.newSymbol("STRING", STRING); }

main
{ return symbolFactory.newSymbol("MAIN", MAIN); }

system\.out\.println
{ return symbolFactory.newSymbol("SYSO", SYSO); }

length
{ return symbolFactory.newSymbol("LENGTH", LENGTH); }

{integer}
{ return symbolFactory.newSymbol("INTEGER", INTEGER, Integer.parseInt(yytext())); }

{double}
{ return symbolFactory.newSymbol("DOUBLE", DOUBLE, Double.parseDouble(yytext())); }

{id}
{ return symbolFactory.newSymbol("ID", ID, yytext()); }

{wspace}
{ /* Ignorar wspaces - System.out.println("wspace: " + yytext()); */}

{comment}
{ /* Ignorar comments - System.out.println("comment: " + yytext()); */}

// Tokens não reconhecidos
.
{
throw new UnsupportedOperationException("ERROR: not recognized (" + yytext() + ")\n"
        + "line: " + yyline + "\n"
        + "column: " + yycolumn);
}