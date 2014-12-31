grammar PHI;

tokens { INDENT, DEDENT }
@lexer::header {
    import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
    private final DenterHelper denter = new DenterHelper(NL, PHIParser.INDENT, PHIParser.DEDENT) {
        @Override
        public Token pullToken() {
            return PHILexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}



LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '{' ;
RBRACKET : '}' ;
LSQBRACKET : '[' ;
RSQBRACKET : ']' ;
COMMA : ',';
DOT : '.';

STRING_CONST: '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\';

INT_CONST: [0-9]+;
FLOAT_CONST: [0-9]* ('.')? [0-9]+ ([Ee] [+-]? [0-9]+)?;

//Note: for now, just hope the above have munched up the bad characters.

//Identifiers consist of a non-illegal, non-numeric character, followed by any number of non-illegal characters
ID : ~([ \t\n\r] | [0-9]) ~[ \t\n\r]*;

//Line comments
LC : '//' ~[\r\n]* '\r'? '\n' -> skip;
//Nested comments
NC : ( '/*' .*? ~[\\] '*/' | '/**/') -> skip;

//Newline
NL : '\r'? '\n';

//Whitespace
//Note: Don't want to skip! It's significant!
SPACE : [ \t\n\r]+;

aspace : SPACE | NL | INDENT | DEDENT;

optspace : SPACE*;

sexpr : LPAREN apaddeditems RPAREN;
alistitems : listitem ((aspace)+ listitem)*;

apaddeditems : (aspace)* alistitems (aspace)*;

listitems : listitem (SPACE listitem)*;

listitem : dotapp | sexpr;

funapp : ID LPAREN funitems RPAREN;

funitems : apaddeditems (COMMA apaddeditems)*;

item : ID | INT_CONST | FLOAT_CONST | STRING_CONST;

dotitem : funapp | item;

dotapp : dotitem (DOT dotitem)*;

blockitems : blockapp | listitems;

blockapp : ID SPACE listitems optspace NL INDENT blocklines DEDENT;
blocklines : blockline+;

blockline : blockitems optspace NL;

start : blocklines EOF;
