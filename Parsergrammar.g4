parser grammar Parsergrammar;

options {
  tokenVocab=Lexergrammar;
}

file
  : angularComponentFile
  | plainTsFile
  ;

angularComponentFile
  : importDeclarations classDeclaration* decoratorDeclaration+ classDeclaration* RBRACE EOF
  ;


plainTsFile
  : importDeclarations
  plainStatement* EOF
  ;

plainStatement
//  : importDeclaration            #ImportDeclarationStmt
    :classDeclarations           #ClassDeclarationsStmt
  | exportVariableDeclaration   #ExportVariableDeclarationStmt
  | functionCallStatement       #FunctionCallStmt
  | variableDeclaration         #VariableDeclarationStmt
  | methodDeclaration           #MethodDeclarationStmt
  | describeBlock               #DescribeBlockStmt
  ;

templateFile
  : htmlElement* EOF
  ;

styleFile
  : cssFile EOF
  ;

//—————————————————————————————
// TypeScript / Angular
//—————————————————————————————
importDeclaration
  : IMPORT LBRACE importList RBRACE FROM STRING SEMICOLON?
  ;

importList
  : IDENTIFIER (COMMA IDENTIFIER)*
  ;

importDeclarations
  : importDeclaration (importDeclaration)*
  ;
classDeclaration
  : EXPORT? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? LBRACE classMember* RBRACE
  ;

classDeclarations
  : classDeclaration+
  ;

exportVariableDeclaration
  : EXPORT variableDeclaration
  ;

classMember
  : variableDeclaration     #VariableMember
  | methodDeclaration       #MethodMember
  | decoratorDeclaration    #DecoratorMember
  ;

variableDeclaration
  : ( CONST | LET )? IDENTIFIER (COLON typeName)? (ASSIGN expression)? SEMICOLON
  ;

typeName
  : TYPE (Point IDENTIFIER)*     #RegularType
  |IDENTIFIER (Point IDENTIFIER)* #CustomType
  ;



methodDeclaration
  : IDENTIFIER LPAREN parameterList? RPAREN block
  ;

parameterList
  : parameter (COMMA parameter)*
  ;

parameter
  : IDENTIFIER COLON typeName
  ;

block
  : LBRACE statement* RBRACE
  ;

arrayLiteral
  : LBRACKET (expression (COMMA expression)* COMMA?)? RBRACKET
  ;

objectLiteral
  : LBRACE (objectProperty COMMA? (COMMA objectProperty)*) RBRACE
  ;

objectProperty
    : SELECTOR COLON expression           #SelectorProp
    | TEMPLATE COLON expression           #TemplateProp
    | TEMPLATEURL COLON expression        #TemplateUrlProp
    | STYLEURL COLON expression           #StyleUrlProp
    | STANDALONE COLON expression         #StandaloneProp
    | IMPORTS COLON expression            #ImportsProp
    | IDENTIFIER COLON expression         #IdentifierProp
    | STRING COLON expression             #StringProp
    ;

statement
    : variableDeclaration        #VariableDeclStmt
    | assignmentStatement        #AssignmentStmt
    | awaitExpression SEMICOLON? #AwaitStmt
    | functionCallStatement      #FunctionCalStmt
    ;

assignmentStatement
  : (propertyAccess | IDENTIFIER)
    ASSIGN expression SEMICOLON
  ;

functionCallStatement
  : functionCall SEMICOLON?
  ;

functionCall
  : (IDENTIFIER | propertyAccess)
    LPAREN argumentList? RPAREN
    methodChain*
  ;

argumentList
  : expression (COMMA expression)*
  ;

expression
  : literal                      #LiteralExpr
  | functionCall                 #FunctionCallExpr
  | propertyAccess               #PropertyAccessExpr
  | arrowFunction                #ArrowFunctionExpr
  | arrayLiteral                 #ArrayLiteralExpr
  | objectLiteral                #ObjectLiteralExpr
  | expression AS typeName       #TypeAssertionExpr
  |expression OPERATOR expression  #OperationalExpr
  ;

methodChain
  : (Point | QUAS Point) IDENTIFIER (LPAREN argumentList? RPAREN)?
  ;

arrowFunction
  : LPAREN IDENTIFIER RPAREN ARROW expressionBody=expression
  ;

literal
  : NUMBER
  | STRING
  | TRUE
  | FALSE
  ;

propertyAccess
  : IDENTIFIER ((Point | QUAS Point) IDENTIFIER)*
  ;

decoratorDeclaration
  : AT IDENTIFIER LPAREN componentConfig RPAREN SEMICOLON? classDeclaration
  ;

// @Component({ … })
componentConfig
  : LBRACE componentProperty (COMMA componentProperty)* RBRACE
  ;

componentProperty
  : standaloneProperty      #StandaloneComponentProperty
  | selectorProperty        #SelectorComponentProperty
  | importsProperty         #ImportsComponentProperty
  | templateProperty       #TemplateComponentProperty
  | templateUrlProperty    #TemplateUrlComponentProperty
  | styleUrlProperty       #StyleUrlComponentProperty
  ;

selectorProperty
  : SELECTOR COLON STRING
  ;

standaloneProperty
  : STANDALONE COLON (TRUE| FALSE)
  ;

importsProperty
  : IMPORTS COLON LBRACKET importList RBRACKET
  ;

templateProperty
  : TEMPLATE COLON (
  TEMPLATE_LITERAL_STRING
  | STRING
  )
  ;

templateUrlProperty
  : TEMPLATEURL COLON STRING
  ;

styleUrlProperty
  : STYLEURL COLON STRING
  ;

describeBlock
  : DESCRIBE LPAREN STRING COMMA functionExpression LBRACE describeBody RBRACE RPAREN SEMICOLON
  ;

functionExpression
  : ARROW
  | ASYNC? LPAREN RPAREN ARROW
  ;

describeBody
  : (beforeEachBlock
  | itBlock
   )*
  ;

beforeEachBlock
  : BEFORE_EACH LPAREN functionExpression LBRACE statement* RBRACE RPAREN SEMICOLON
  ;

itBlock
  : IT LPAREN (
  STRING
  | TEMPLATE_LITERAL_STRING
  ) COMMA functionExpression
    LBRACE itBody RBRACE RPAREN SEMICOLON
  ;

awaitExpression
  : AWAIT functionCall
  ;

itBody
  : (variableDeclaration | expectExpression | functionCallStatement)*
  ;

matcherChain
  : Point (TO_BE_TRUTHY | TO_EQUAL | TO_CONTAIN) LPAREN expression? RPAREN
  ;

expectExpression
  : EXPECT LPAREN expression RPAREN matcherChain SEMICOLON
  ;

//—————————————————————————————
// HTML (inline or templateFile)
//—————————————————————————————

htmlElement
    : openTag htmlElement* closeTag     #NormalHtmlElement
    | selfClosingTag                    #SelfClosingHtmlElement
    | textContent                       #HtmlTextContent
    | comment                           #HtmlComment
    ;


openTag
  : HTML_TAG_OPEN attribute* GT
  ;

closeTag
  : HTML_TAG_CLOSE
  ;

selfClosingTag
  : HTML_SELF_CLOSING_TAG attribute*
  ;

textContent
  : STRING
  | INTERPOLATION
  ;

attribute
  : HTML_ATTRIBUTE
  | ANGULAR_DIRECTIVE
  | BINDING
  | EVENT_BINDING
  ;

comment
  : HTML_COMMENT
  ;

//—————————————————————————————
// CSS (inline styles or styleFile)
//—————————————————————————————

cssFile
  : (cssComment | cssAtRule | ruleset)+
  ;

cssComment
  : CSS_COMMENT
  ;

cssAtRule
  : CSS_AT_RULE SEMICOLON?
  ;

ruleset
  : IDENTIFIER (COMMA IDENTIFIER)* LBRACE declaration* RBRACE
  ;

declaration
  : IDENTIFIER COLON value SEMICOLON?
  ;

value
  : NUMBER
  | STRING
  | IDENTIFIER
  | functionCall
  ;
