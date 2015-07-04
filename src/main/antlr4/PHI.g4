grammar PHI;

@parser::header {
    package phi.antlr;
}

tokens { INDENT, DEDENT }
@lexer::header {
    package phi.antlr;
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

//TODO: add parser support!
DEF : 'def' | 'define';
SUBS : '<:' | 'subs' | 'subtypes';
SUPS : ':>' | 'sups' | 'supertypes';
TYPE : 'type';
NAMESPACE : 'namespace';
LAMBDA : 'lambda' | '\\';
LET : 'let';

def : DEF;
subs : SUBS;
sups : SUPS;
type : TYPE;
namespace : NAMESPACE;
lambda : LAMBDA;
let : LET;

reservedword : def | subs | sups | type | namespace | lambda | let;

STRING_CONST: '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\';

INT_CONST: [0-9]+;
FLOAT_CONST: [0-9]* ('.')? [0-9]+ ([Ee] [+-]? [0-9]+)?;

//Line comments
LC : '//' ~[\r\n]* '\r'? '\n' -> skip;
//Nested comments
NC : ( '/*' .*? ~[\\] '*/' | '/**/') -> skip;

//Newline
NL : '\r'? '\n' [ \t]*;

//Note: for now, just hope the above have munched up the bad characters.

//Identifiers consist of a non-illegal, non-numeric character, followed by any number of non-illegal characters

ID : ~[\(\)\[\]\{\} \t\n\r0-9] ~[\(\)\[\]\{\} \t\n\r]*;

identifier: ID | reservedword;
intconst: INT_CONST;
floatconst: FLOAT_CONST;
stringconst: STRING_CONST;

//Whitespace
//Note: Don't want to skip! It's significant!
SPACE : [ \t]+;

aspace : SPACE | NL | INDENT | DEDENT;

optspace : SPACE*;

sexpr : LPAREN apaddeditems RPAREN;
alistitems : listitem ((aspace)+ listitem)*;

apaddeditems : (aspace)* alistitems (aspace)*;

listitems : listitem (SPACE listitem)*;

listitem : dotapp | sexpr;

funapp : identifier LPAREN funitems RPAREN;

funitems : apaddeditems (COMMA apaddeditems)*;

item: identifier | intconst | floatconst | stringconst;
dotitem : funapp | item;

dotapp : dotitem (DOT dotitem)*;

blockitems : blockapp | listitems;

blockapp : dotapp (SPACE listitems)? optspace INDENT blocklines DEDENT;
blocklines : blockline+;

blockline : blockitems optspace (NL | EOF) (NL | SPACE)*;

start : blocklines EOF;
