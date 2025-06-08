lexer grammar Lexergrammar;

/////////// TypeScript Keywords
TEMPLATE:'template';
CONST: 'const';
LET:'let';
IMPORT: 'import';
EXPORT: 'export';
CLASS: 'class';
//INTERFACE:'interface';
EXTENDS: 'extends';
FROM: 'from';
DESCRIBE: 'describe';
IT: 'it';
BEFORE_EACH: 'beforeEach';
ASYNC: 'async';
AWAIT: 'await';
TO_CONTAIN: 'toContain';
EXPECT: 'expect';
TO_BE_TRUTHY: 'toBeTruthy';
TO_EQUAL: 'toEqual';
TRUE: 'true';
FALSE: 'false';
AS : 'as';
TYPE: 'string' | 'number' | 'boolean'|'any';

/////////// CSS
CSS_AT_RULE: '@tailwind' WS+ IDENTIFIER;
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
TEMPLATEURL: 'templateUrl';
STYLEURL: 'styleUrl';

/////////// Punctuation and Operators
LPAREN: '(';
RPAREN: ')';
COLON: ':';
COMMA: ',';
LBRACKET: '[';
RBRACKET: ']';
LCURLY: '{{';
RCURLY: '}}';
ASSIGN : '=';
Point : '.';
GT: '>';
LT: '<';
LTE:'<=';
GTE:'>=';
QUAS : '?';
BACKTICK: '`';
QUOTE: '\'';
DOUBLE_QUOTE: '"';
ARROW: '=>';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
OPERATOR: '+' | '-' | '*' | '/';
AT: '@';

/////////// Literals
NUMBER: [0-9]+;
MODULE_PATH: '@angular' '.' IDENTIFIER ( '.' IDENTIFIER )* | './' IDENTIFIER ( '/' IDENTIFIER )* IDENTIFIER ( '.' IDENTIFIER )*;
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$-]*;

/////////// HTML Rules
// Common HTML tags
DIV: 'div';
SPAN: 'span';
P: 'p';
A: 'a';
IMG: 'img';
UL: 'ul';
OL: 'ol';
LI: 'li';
TABLE: 'table';
TR: 'tr';
TD: 'td';
TH: 'th';
FORM: 'form';
INPUT: 'input';
BUTTON: 'button';
SELECT: 'select';
OPTION: 'option';
TEXTAREA: 'textarea';
LABEL: 'label';
H1: 'h1';
H2: 'h2';
H3: 'h3';
H4: 'h4';
H5: 'h5';
H6: 'h6';
HEADER: 'header';
FOOTER: 'footer';
NAV: 'nav';
SECTION: 'section';
ARTICLE: 'article';
ASIDE: 'aside';
MAIN: 'main';

// General HTML rules
HTML_TAG_OPEN: '<' IDENTIFIER;
HTML_TAG_CLOSE: '</' IDENTIFIER '>';
HTML_SELF_CLOSING_TAG: '<' IDENTIFIER '/>';
HTML_ATTRIBUTE: IDENTIFIER '=' STRING;
ANGULAR_DIRECTIVE: '*' IDENTIFIER '=' STRING;
BINDING: '[' IDENTIFIER ']' '=' STRING;
EVENT_BINDING: '(' IDENTIFIER ')' '=' STRING;
INTERPOLATION: '{{' .*? '}}';
DOCTYPE_DECLARATION: '<!doctype' WS+ 'html' WS* '>';

/////////// Whitespace and Comments (moved to end as requested)
WS: [ \t\r\n]+ -> skip;

/////////// String literals (moved to end as requested)
StringLiteral    : '"' (~["])* '"' ;
STRING: '\'' ( ~['\\] | '\\' . )* '\''
      | '"' ( ~["\\] | '\\' . )* '"'
      |'"' .*? '"';
TEMPLATE_LITERAL_STRING:'`' ( ~["\\] | '\\' . )* '`';

/////////// Comments (moved to end as requested)
COMMENT: '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
CSS_COMMENT: '/*' .*? '*/' ;
HTML_COMMENT: '<!--' .*? '-->';

/////////// Text (moved to end)
TEXT: [^<>{}]+ ;