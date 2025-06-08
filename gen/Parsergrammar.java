// Generated from C:/Users/fawaz/OneDrive/Desktop/For Compiler/Compiler/src/Parsergrammar.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parsergrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEMPLATE=1, CONST=2, LET=3, IMPORT=4, EXPORT=5, CLASS=6, EXTENDS=7, FROM=8, 
		DESCRIBE=9, IT=10, BEFORE_EACH=11, ASYNC=12, AWAIT=13, TO_CONTAIN=14, 
		EXPECT=15, TO_BE_TRUTHY=16, TO_EQUAL=17, TRUE=18, FALSE=19, AS=20, TYPE=21, 
		CSS_AT_RULE=22, SELECTOR=23, STANDALONE=24, IMPORTS=25, TEMPLATEURL=26, 
		STYLEURL=27, LPAREN=28, RPAREN=29, COLON=30, COMMA=31, LBRACKET=32, RBRACKET=33, 
		LCURLY=34, RCURLY=35, ASSIGN=36, Point=37, GT=38, LT=39, LTE=40, GTE=41, 
		QUAS=42, BACKTICK=43, QUOTE=44, DOUBLE_QUOTE=45, ARROW=46, LBRACE=47, 
		RBRACE=48, SEMICOLON=49, OPERATOR=50, AT=51, NUMBER=52, MODULE_PATH=53, 
		IDENTIFIER=54, DIV=55, SPAN=56, P=57, A=58, IMG=59, UL=60, OL=61, LI=62, 
		TABLE=63, TR=64, TD=65, TH=66, FORM=67, INPUT=68, BUTTON=69, SELECT=70, 
		OPTION=71, TEXTAREA=72, LABEL=73, H1=74, H2=75, H3=76, H4=77, H5=78, H6=79, 
		HEADER=80, FOOTER=81, NAV=82, SECTION=83, ARTICLE=84, ASIDE=85, MAIN=86, 
		HTML_TAG_OPEN=87, HTML_TAG_CLOSE=88, HTML_SELF_CLOSING_TAG=89, HTML_ATTRIBUTE=90, 
		ANGULAR_DIRECTIVE=91, BINDING=92, EVENT_BINDING=93, INTERPOLATION=94, 
		DOCTYPE_DECLARATION=95, WS=96, StringLiteral=97, STRING=98, TEMPLATE_LITERAL_STRING=99, 
		COMMENT=100, MULTILINE_COMMENT=101, CSS_COMMENT=102, HTML_COMMENT=103, 
		TEXT=104;
	public static final int
		RULE_file = 0, RULE_angularComponentFile = 1, RULE_plainTsFile = 2, RULE_plainStatement = 3, 
		RULE_templateFile = 4, RULE_styleFile = 5, RULE_importDeclaration = 6, 
		RULE_importList = 7, RULE_importDeclarations = 8, RULE_classDeclaration = 9, 
		RULE_classDeclarations = 10, RULE_exportVariableDeclaration = 11, RULE_classMember = 12, 
		RULE_variableDeclaration = 13, RULE_typeName = 14, RULE_methodDeclaration = 15, 
		RULE_parameterList = 16, RULE_parameter = 17, RULE_block = 18, RULE_arrayLiteral = 19, 
		RULE_objectLiteral = 20, RULE_objectProperty = 21, RULE_statement = 22, 
		RULE_assignmentStatement = 23, RULE_functionCallStatement = 24, RULE_functionCall = 25, 
		RULE_argumentList = 26, RULE_expression = 27, RULE_methodChain = 28, RULE_arrowFunction = 29, 
		RULE_literal = 30, RULE_propertyAccess = 31, RULE_decoratorDeclaration = 32, 
		RULE_componentConfig = 33, RULE_componentProperty = 34, RULE_selectorProperty = 35, 
		RULE_standaloneProperty = 36, RULE_importsProperty = 37, RULE_templateProperty = 38, 
		RULE_templateUrlProperty = 39, RULE_styleUrlProperty = 40, RULE_describeBlock = 41, 
		RULE_functionExpression = 42, RULE_describeBody = 43, RULE_beforeEachBlock = 44, 
		RULE_itBlock = 45, RULE_awaitExpression = 46, RULE_itBody = 47, RULE_matcherChain = 48, 
		RULE_expectExpression = 49, RULE_htmlElement = 50, RULE_openTag = 51, 
		RULE_closeTag = 52, RULE_selfClosingTag = 53, RULE_textContent = 54, RULE_attribute = 55, 
		RULE_comment = 56, RULE_cssFile = 57, RULE_cssComment = 58, RULE_cssAtRule = 59, 
		RULE_ruleset = 60, RULE_declaration = 61, RULE_value = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "angularComponentFile", "plainTsFile", "plainStatement", "templateFile", 
			"styleFile", "importDeclaration", "importList", "importDeclarations", 
			"classDeclaration", "classDeclarations", "exportVariableDeclaration", 
			"classMember", "variableDeclaration", "typeName", "methodDeclaration", 
			"parameterList", "parameter", "block", "arrayLiteral", "objectLiteral", 
			"objectProperty", "statement", "assignmentStatement", "functionCallStatement", 
			"functionCall", "argumentList", "expression", "methodChain", "arrowFunction", 
			"literal", "propertyAccess", "decoratorDeclaration", "componentConfig", 
			"componentProperty", "selectorProperty", "standaloneProperty", "importsProperty", 
			"templateProperty", "templateUrlProperty", "styleUrlProperty", "describeBlock", 
			"functionExpression", "describeBody", "beforeEachBlock", "itBlock", "awaitExpression", 
			"itBody", "matcherChain", "expectExpression", "htmlElement", "openTag", 
			"closeTag", "selfClosingTag", "textContent", "attribute", "comment", 
			"cssFile", "cssComment", "cssAtRule", "ruleset", "declaration", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'template'", "'const'", "'let'", "'import'", "'export'", "'class'", 
			"'extends'", "'from'", "'describe'", "'it'", "'beforeEach'", "'async'", 
			"'await'", "'toContain'", "'expect'", "'toBeTruthy'", "'toEqual'", "'true'", 
			"'false'", "'as'", null, null, "'selector'", "'standalone'", "'imports'", 
			"'templateUrl'", "'styleUrl'", "'('", "')'", "':'", "','", "'['", "']'", 
			"'{{'", "'}}'", "'='", "'.'", "'>'", "'<'", "'<='", "'>='", "'?'", "'`'", 
			"'''", "'\"'", "'=>'", "'{'", "'}'", "';'", null, "'@'", null, null, 
			null, "'div'", "'span'", "'p'", "'a'", "'img'", "'ul'", "'ol'", "'li'", 
			"'table'", "'tr'", "'td'", "'th'", "'form'", "'input'", "'button'", "'select'", 
			"'option'", "'textarea'", "'label'", "'h1'", "'h2'", "'h3'", "'h4'", 
			"'h5'", "'h6'", "'header'", "'footer'", "'nav'", "'section'", "'article'", 
			"'aside'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE", "CONST", "LET", "IMPORT", "EXPORT", "CLASS", "EXTENDS", 
			"FROM", "DESCRIBE", "IT", "BEFORE_EACH", "ASYNC", "AWAIT", "TO_CONTAIN", 
			"EXPECT", "TO_BE_TRUTHY", "TO_EQUAL", "TRUE", "FALSE", "AS", "TYPE", 
			"CSS_AT_RULE", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATEURL", "STYLEURL", 
			"LPAREN", "RPAREN", "COLON", "COMMA", "LBRACKET", "RBRACKET", "LCURLY", 
			"RCURLY", "ASSIGN", "Point", "GT", "LT", "LTE", "GTE", "QUAS", "BACKTICK", 
			"QUOTE", "DOUBLE_QUOTE", "ARROW", "LBRACE", "RBRACE", "SEMICOLON", "OPERATOR", 
			"AT", "NUMBER", "MODULE_PATH", "IDENTIFIER", "DIV", "SPAN", "P", "A", 
			"IMG", "UL", "OL", "LI", "TABLE", "TR", "TD", "TH", "FORM", "INPUT", 
			"BUTTON", "SELECT", "OPTION", "TEXTAREA", "LABEL", "H1", "H2", "H3", 
			"H4", "H5", "H6", "HEADER", "FOOTER", "NAV", "SECTION", "ARTICLE", "ASIDE", 
			"MAIN", "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_SELF_CLOSING_TAG", "HTML_ATTRIBUTE", 
			"ANGULAR_DIRECTIVE", "BINDING", "EVENT_BINDING", "INTERPOLATION", "DOCTYPE_DECLARATION", 
			"WS", "StringLiteral", "STRING", "TEMPLATE_LITERAL_STRING", "COMMENT", 
			"MULTILINE_COMMENT", "CSS_COMMENT", "HTML_COMMENT", "TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parsergrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parsergrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public AngularComponentFileContext angularComponentFile() {
			return getRuleContext(AngularComponentFileContext.class,0);
		}
		public PlainTsFileContext plainTsFile() {
			return getRuleContext(PlainTsFileContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				angularComponentFile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				plainTsFile();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularComponentFileContext extends ParserRuleContext {
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(Parsergrammar.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<DecoratorDeclarationContext> decoratorDeclaration() {
			return getRuleContexts(DecoratorDeclarationContext.class);
		}
		public DecoratorDeclarationContext decoratorDeclaration(int i) {
			return getRuleContext(DecoratorDeclarationContext.class,i);
		}
		public AngularComponentFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularComponentFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAngularComponentFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAngularComponentFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAngularComponentFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularComponentFileContext angularComponentFile() throws RecognitionException {
		AngularComponentFileContext _localctx = new AngularComponentFileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_angularComponentFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			importDeclarations();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPORT || _la==CLASS) {
				{
				{
				setState(131);
				classDeclaration();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				decoratorDeclaration();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPORT || _la==CLASS) {
				{
				{
				setState(142);
				classDeclaration();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RBRACE);
			setState(149);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlainTsFileContext extends ParserRuleContext {
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Parsergrammar.EOF, 0); }
		public List<PlainStatementContext> plainStatement() {
			return getRuleContexts(PlainStatementContext.class);
		}
		public PlainStatementContext plainStatement(int i) {
			return getRuleContext(PlainStatementContext.class,i);
		}
		public PlainTsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainTsFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterPlainTsFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitPlainTsFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitPlainTsFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainTsFileContext plainTsFile() throws RecognitionException {
		PlainTsFileContext _localctx = new PlainTsFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_plainTsFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			importDeclarations();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509482604L) != 0)) {
				{
				{
				setState(152);
				plainStatement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlainStatementContext extends ParserRuleContext {
		public PlainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainStatement; }
	 
		public PlainStatementContext() { }
		public void copyFrom(PlainStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStmtContext extends PlainStatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCallStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStmtContext extends PlainStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclarationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclarationStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeBlockStmtContext extends PlainStatementContext {
		public DescribeBlockContext describeBlock() {
			return getRuleContext(DescribeBlockContext.class,0);
		}
		public DescribeBlockStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDescribeBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDescribeBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDescribeBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationsStmtContext extends PlainStatementContext {
		public ClassDeclarationsContext classDeclarations() {
			return getRuleContext(ClassDeclarationsContext.class,0);
		}
		public ClassDeclarationsStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclarationsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclarationsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclarationsStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportVariableDeclarationStmtContext extends PlainStatementContext {
		public ExportVariableDeclarationContext exportVariableDeclaration() {
			return getRuleContext(ExportVariableDeclarationContext.class,0);
		}
		public ExportVariableDeclarationStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterExportVariableDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitExportVariableDeclarationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitExportVariableDeclarationStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationStmtContext extends PlainStatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodDeclarationStmtContext(PlainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodDeclarationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodDeclarationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainStatementContext plainStatement() throws RecognitionException {
		PlainStatementContext _localctx = new PlainStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_plainStatement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ClassDeclarationsStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				classDeclarations();
				}
				break;
			case 2:
				_localctx = new ExportVariableDeclarationStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				exportVariableDeclaration();
				}
				break;
			case 3:
				_localctx = new FunctionCallStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				functionCallStatement();
				}
				break;
			case 4:
				_localctx = new VariableDeclarationStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				variableDeclaration();
				}
				break;
			case 5:
				_localctx = new MethodDeclarationStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				methodDeclaration();
				}
				break;
			case 6:
				_localctx = new DescribeBlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				describeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parsergrammar.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public TemplateFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateFileContext templateFile() throws RecognitionException {
		TemplateFileContext _localctx = new TemplateFileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 67717L) != 0)) {
				{
				{
				setState(168);
				htmlElement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleFileContext extends ParserRuleContext {
		public CssFileContext cssFile() {
			return getRuleContext(CssFileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Parsergrammar.EOF, 0); }
		public StyleFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleFileContext styleFile() throws RecognitionException {
		StyleFileContext _localctx = new StyleFileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_styleFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			cssFile();
			setState(177);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parsergrammar.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(Parsergrammar.FROM, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IMPORT);
			setState(180);
			match(LBRACE);
			setState(181);
			importList();
			setState(182);
			match(RBRACE);
			setState(183);
			match(FROM);
			setState(184);
			match(STRING);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(185);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IDENTIFIER);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				match(IDENTIFIER);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationsContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			importDeclaration();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(197);
				importDeclaration();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Parsergrammar.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(Parsergrammar.EXPORT, 0); }
		public TerminalNode EXTENDS() { return getToken(Parsergrammar.EXTENDS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(203);
				match(EXPORT);
				}
			}

			setState(206);
			match(CLASS);
			setState(207);
			match(IDENTIFIER);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(208);
				match(EXTENDS);
				setState(209);
				match(IDENTIFIER);
				}
			}

			setState(212);
			match(LBRACE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20266198323167244L) != 0)) {
				{
				{
				setState(213);
				classMember();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationsContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ClassDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationsContext classDeclarations() throws RecognitionException {
		ClassDeclarationsContext _localctx = new ClassDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221);
					classDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(Parsergrammar.EXPORT, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExportVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterExportVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitExportVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitExportVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportVariableDeclarationContext exportVariableDeclaration() throws RecognitionException {
		ExportVariableDeclarationContext _localctx = new ExportVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exportVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(EXPORT);
			setState(227);
			variableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableMemberContext extends ClassMemberContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorMemberContext extends ClassMemberContext {
		public DecoratorDeclarationContext decoratorDeclaration() {
			return getRuleContext(DecoratorDeclarationContext.class,0);
		}
		public DecoratorMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDecoratorMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDecoratorMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDecoratorMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodMemberContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classMember);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VariableMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new MethodMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				methodDeclaration();
				}
				break;
			case 3:
				_localctx = new DecoratorMemberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				decoratorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(Parsergrammar.CONST, 0); }
		public TerminalNode LET() { return getToken(Parsergrammar.LET, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==LET) {
				{
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(237);
			match(IDENTIFIER);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(238);
				match(COLON);
				setState(239);
				typeName();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(242);
				match(ASSIGN);
				setState(243);
				expression(0);
				}
			}

			setState(246);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	 
		public TypeNameContext() { }
		public void copyFrom(TypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomTypeContext extends TypeNameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> Point() { return getTokens(Parsergrammar.Point); }
		public TerminalNode Point(int i) {
			return getToken(Parsergrammar.Point, i);
		}
		public CustomTypeContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularTypeContext extends TypeNameContext {
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public List<TerminalNode> Point() { return getTokens(Parsergrammar.Point); }
		public TerminalNode Point(int i) {
			return getToken(Parsergrammar.Point, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public RegularTypeContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRegularType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRegularType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRegularType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeName);
		try {
			int _alt;
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new RegularTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(TYPE);
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(Point);
						setState(250);
						match(IDENTIFIER);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new CustomTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(IDENTIFIER);
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						match(Point);
						setState(258);
						match(IDENTIFIER);
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(LPAREN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(268);
				parameterList();
				}
			}

			setState(271);
			match(RPAREN);
			setState(272);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			parameter();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				parameter();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IDENTIFIER);
			setState(283);
			match(COLON);
			setState(284);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LBRACE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509490188L) != 0)) {
				{
				{
				setState(287);
				statement();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACKET);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22658740189396992L) != 0) || _la==STRING) {
				{
				setState(296);
				expression(0);
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(COMMA);
						setState(298);
						expression(0);
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(304);
					match(COMMA);
					}
				}

				}
			}

			setState(309);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LBRACE);
			{
			setState(312);
			objectProperty();
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(313);
				match(COMMA);
				}
				break;
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				objectProperty();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(323);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	 
		public ObjectPropertyContext() { }
		public void copyFrom(ObjectPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropContext extends ObjectPropertyContext {
		public TerminalNode TEMPLATE() { return getToken(Parsergrammar.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TemplatePropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPropContext extends ObjectPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterIdentifierProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitIdentifierProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitIdentifierProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropContext extends ObjectPropertyContext {
		public TerminalNode TEMPLATEURL() { return getToken(Parsergrammar.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TemplateUrlPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateUrlProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateUrlProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateUrlProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropContext extends ObjectPropertyContext {
		public TerminalNode IMPORTS() { return getToken(Parsergrammar.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportsProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportsProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportsProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlPropContext extends ObjectPropertyContext {
		public TerminalNode STYLEURL() { return getToken(Parsergrammar.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StyleUrlPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleUrlProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleUrlProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleUrlProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPropContext extends ObjectPropertyContext {
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStringProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStringProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStringProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropContext extends ObjectPropertyContext {
		public TerminalNode SELECTOR() { return getToken(Parsergrammar.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorPropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropContext extends ObjectPropertyContext {
		public TerminalNode STANDALONE() { return getToken(Parsergrammar.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandalonePropContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStandaloneProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStandaloneProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStandaloneProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectProperty);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(SELECTOR);
				setState(326);
				match(COLON);
				setState(327);
				expression(0);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(TEMPLATE);
				setState(329);
				match(COLON);
				setState(330);
				expression(0);
				}
				break;
			case TEMPLATEURL:
				_localctx = new TemplateUrlPropContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(TEMPLATEURL);
				setState(332);
				match(COLON);
				setState(333);
				expression(0);
				}
				break;
			case STYLEURL:
				_localctx = new StyleUrlPropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(STYLEURL);
				setState(335);
				match(COLON);
				setState(336);
				expression(0);
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(STANDALONE);
				setState(338);
				match(COLON);
				setState(339);
				expression(0);
				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(IMPORTS);
				setState(341);
				match(COLON);
				setState(342);
				expression(0);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(IDENTIFIER);
				setState(344);
				match(COLON);
				setState(345);
				expression(0);
				}
				break;
			case STRING:
				_localctx = new StringPropContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				match(STRING);
				setState(347);
				match(COLON);
				setState(348);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitStmtContext extends StatementContext {
		public AwaitExpressionContext awaitExpression() {
			return getRuleContext(AwaitExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public AwaitStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAwaitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAwaitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAwaitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCalStmtContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCalStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionCalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionCalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionCalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclStmtContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new VariableDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				assignmentStatement();
				}
				break;
			case 3:
				_localctx = new AwaitStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				awaitExpression();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(354);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 4:
				_localctx = new FunctionCalStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				functionCallStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(360);
				propertyAccess();
				}
				break;
			case 2:
				{
				setState(361);
				match(IDENTIFIER);
				}
				break;
			}
			setState(364);
			match(ASSIGN);
			setState(365);
			expression(0);
			setState(366);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			functionCall();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(369);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<MethodChainContext> methodChain() {
			return getRuleContexts(MethodChainContext.class);
		}
		public MethodChainContext methodChain(int i) {
			return getRuleContext(MethodChainContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(372);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(373);
				propertyAccess();
				}
				break;
			}
			setState(376);
			match(LPAREN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22658740189396992L) != 0) || _la==STRING) {
				{
				setState(377);
				argumentList();
				}
			}

			setState(380);
			match(RPAREN);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					methodChain();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			expression(0);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				expression(0);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExprContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationalExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(Parsergrammar.OPERATOR, 0); }
		public OperationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterOperationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitOperationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitOperationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(Parsergrammar.AS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeAssertionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTypeAssertionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTypeAssertionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTypeAssertionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExprContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionExprContext extends ExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrowFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrowFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrowFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessExprContext extends ExpressionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertyAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterPropertyAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitPropertyAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitPropertyAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(396);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new PropertyAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398);
				propertyAccess();
				}
				break;
			case 4:
				{
				_localctx = new ArrowFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				arrowFunction();
				}
				break;
			case 5:
				{
				_localctx = new ArrayLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
				arrayLiteral();
				}
				break;
			case 6:
				{
				_localctx = new ObjectLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				objectLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new OperationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(405);
						match(OPERATOR);
						setState(406);
						expression(2);
						}
						break;
					case 2:
						{
						_localctx = new TypeAssertionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						match(AS);
						setState(409);
						typeName();
						}
						break;
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodChainContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode Point() { return getToken(Parsergrammar.Point, 0); }
		public TerminalNode QUAS() { return getToken(Parsergrammar.QUAS, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodChainContext methodChain() throws RecognitionException {
		MethodChainContext _localctx = new MethodChainContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Point:
				{
				setState(415);
				match(Point);
				}
				break;
			case QUAS:
				{
				setState(416);
				match(QUAS);
				setState(417);
				match(Point);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(420);
			match(IDENTIFIER);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(421);
				match(LPAREN);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22658740189396992L) != 0) || _la==STRING) {
					{
					setState(422);
					argumentList();
					}
				}

				setState(425);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ExpressionContext expressionBody;
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(Parsergrammar.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LPAREN);
			setState(429);
			match(IDENTIFIER);
			setState(430);
			match(RPAREN);
			setState(431);
			match(ARROW);
			setState(432);
			((ArrowFunctionContext)_localctx).expressionBody = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode TRUE() { return getToken(Parsergrammar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Parsergrammar.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599628156928L) != 0) || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> Point() { return getTokens(Parsergrammar.Point); }
		public TerminalNode Point(int i) {
			return getToken(Parsergrammar.Point, i);
		}
		public List<TerminalNode> QUAS() { return getTokens(Parsergrammar.QUAS); }
		public TerminalNode QUAS(int i) {
			return getToken(Parsergrammar.QUAS, i);
		}
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(IDENTIFIER);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Point:
						{
						setState(437);
						match(Point);
						}
						break;
					case QUAS:
						{
						setState(438);
						match(QUAS);
						setState(439);
						match(Point);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(442);
					match(IDENTIFIER);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public DecoratorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDecoratorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDecoratorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDecoratorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorDeclarationContext decoratorDeclaration() throws RecognitionException {
		DecoratorDeclarationContext _localctx = new DecoratorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decoratorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(AT);
			setState(449);
			match(IDENTIFIER);
			setState(450);
			match(LPAREN);
			setState(451);
			componentConfig();
			setState(452);
			match(RPAREN);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(453);
				match(SEMICOLON);
				}
			}

			setState(456);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_componentConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACE);
			setState(459);
			componentProperty();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(460);
				match(COMMA);
				setState(461);
				componentProperty();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
	 
		public ComponentPropertyContext() { }
		public void copyFrom(ComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneComponentPropertyContext extends ComponentPropertyContext {
		public StandalonePropertyContext standaloneProperty() {
			return getRuleContext(StandalonePropertyContext.class,0);
		}
		public StandaloneComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStandaloneComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStandaloneComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStandaloneComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlComponentPropertyContext extends ComponentPropertyContext {
		public TemplateUrlPropertyContext templateUrlProperty() {
			return getRuleContext(TemplateUrlPropertyContext.class,0);
		}
		public TemplateUrlComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateUrlComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateUrlComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateUrlComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsComponentPropertyContext extends ComponentPropertyContext {
		public ImportsPropertyContext importsProperty() {
			return getRuleContext(ImportsPropertyContext.class,0);
		}
		public ImportsComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportsComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportsComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportsComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorComponentPropertyContext extends ComponentPropertyContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public SelectorComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateComponentPropertyContext extends ComponentPropertyContext {
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public TemplateComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlComponentPropertyContext extends ComponentPropertyContext {
		public StyleUrlPropertyContext styleUrlProperty() {
			return getRuleContext(StyleUrlPropertyContext.class,0);
		}
		public StyleUrlComponentPropertyContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleUrlComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleUrlComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleUrlComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_componentProperty);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STANDALONE:
				_localctx = new StandaloneComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				standaloneProperty();
				}
				break;
			case SELECTOR:
				_localctx = new SelectorComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				selectorProperty();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				importsProperty();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				templateProperty();
				}
				break;
			case TEMPLATEURL:
				_localctx = new TemplateUrlComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				templateUrlProperty();
				}
				break;
			case STYLEURL:
				_localctx = new StyleUrlComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				styleUrlProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(Parsergrammar.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public SelectorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPropertyContext selectorProperty() throws RecognitionException {
		SelectorPropertyContext _localctx = new SelectorPropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(SELECTOR);
			setState(478);
			match(COLON);
			setState(479);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(Parsergrammar.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TRUE() { return getToken(Parsergrammar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Parsergrammar.FALSE, 0); }
		public StandalonePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePropertyContext standaloneProperty() throws RecognitionException {
		StandalonePropertyContext _localctx = new StandalonePropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_standaloneProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(STANDALONE);
			setState(482);
			match(COLON);
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertyContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(Parsergrammar.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public ImportsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsPropertyContext importsProperty() throws RecognitionException {
		ImportsPropertyContext _localctx = new ImportsPropertyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_importsProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(IMPORTS);
			setState(486);
			match(COLON);
			setState(487);
			match(LBRACKET);
			setState(488);
			importList();
			setState(489);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(Parsergrammar.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TEMPLATE_LITERAL_STRING() { return getToken(Parsergrammar.TEMPLATE_LITERAL_STRING, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_templateProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(TEMPLATE);
			setState(492);
			match(COLON);
			setState(493);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==TEMPLATE_LITERAL_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropertyContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(Parsergrammar.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TemplateUrlPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrlProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlPropertyContext templateUrlProperty() throws RecognitionException {
		TemplateUrlPropertyContext _localctx = new TemplateUrlPropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_templateUrlProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(TEMPLATEURL);
			setState(496);
			match(COLON);
			setState(497);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlPropertyContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(Parsergrammar.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public StyleUrlPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrlProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlPropertyContext styleUrlProperty() throws RecognitionException {
		StyleUrlPropertyContext _localctx = new StyleUrlPropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_styleUrlProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(STYLEURL);
			setState(500);
			match(COLON);
			setState(501);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeBlockContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(Parsergrammar.DESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public DescribeBodyContext describeBody() {
			return getRuleContext(DescribeBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public DescribeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDescribeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDescribeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDescribeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeBlockContext describeBlock() throws RecognitionException {
		DescribeBlockContext _localctx = new DescribeBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_describeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(DESCRIBE);
			setState(504);
			match(LPAREN);
			setState(505);
			match(STRING);
			setState(506);
			match(COMMA);
			setState(507);
			functionExpression();
			setState(508);
			match(LBRACE);
			setState(509);
			describeBody();
			setState(510);
			match(RBRACE);
			setState(511);
			match(RPAREN);
			setState(512);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(Parsergrammar.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode ASYNC() { return getToken(Parsergrammar.ASYNC, 0); }
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionExpression);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(ARROW);
				}
				break;
			case ASYNC:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(515);
					match(ASYNC);
					}
				}

				setState(518);
				match(LPAREN);
				setState(519);
				match(RPAREN);
				setState(520);
				match(ARROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeBodyContext extends ParserRuleContext {
		public List<BeforeEachBlockContext> beforeEachBlock() {
			return getRuleContexts(BeforeEachBlockContext.class);
		}
		public BeforeEachBlockContext beforeEachBlock(int i) {
			return getRuleContext(BeforeEachBlockContext.class,i);
		}
		public List<ItBlockContext> itBlock() {
			return getRuleContexts(ItBlockContext.class);
		}
		public ItBlockContext itBlock(int i) {
			return getRuleContext(ItBlockContext.class,i);
		}
		public DescribeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDescribeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDescribeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDescribeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeBodyContext describeBody() throws RecognitionException {
		DescribeBodyContext _localctx = new DescribeBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_describeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IT || _la==BEFORE_EACH) {
				{
				setState(525);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEFORE_EACH:
					{
					setState(523);
					beforeEachBlock();
					}
					break;
				case IT:
					{
					setState(524);
					itBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeforeEachBlockContext extends ParserRuleContext {
		public TerminalNode BEFORE_EACH() { return getToken(Parsergrammar.BEFORE_EACH, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BeforeEachBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforeEachBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterBeforeEachBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitBeforeEachBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitBeforeEachBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeforeEachBlockContext beforeEachBlock() throws RecognitionException {
		BeforeEachBlockContext _localctx = new BeforeEachBlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_beforeEachBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(BEFORE_EACH);
			setState(531);
			match(LPAREN);
			setState(532);
			functionExpression();
			setState(533);
			match(LBRACE);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509490188L) != 0)) {
				{
				{
				setState(534);
				statement();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(RBRACE);
			setState(541);
			match(RPAREN);
			setState(542);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItBlockContext extends ParserRuleContext {
		public TerminalNode IT() { return getToken(Parsergrammar.IT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public ItBodyContext itBody() {
			return getRuleContext(ItBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode TEMPLATE_LITERAL_STRING() { return getToken(Parsergrammar.TEMPLATE_LITERAL_STRING, 0); }
		public ItBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterItBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitItBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitItBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItBlockContext itBlock() throws RecognitionException {
		ItBlockContext _localctx = new ItBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_itBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(IT);
			setState(545);
			match(LPAREN);
			setState(546);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==TEMPLATE_LITERAL_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(547);
			match(COMMA);
			setState(548);
			functionExpression();
			setState(549);
			match(LBRACE);
			setState(550);
			itBody();
			setState(551);
			match(RBRACE);
			setState(552);
			match(RPAREN);
			setState(553);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExpressionContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(Parsergrammar.AWAIT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AwaitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitExpressionContext awaitExpression() throws RecognitionException {
		AwaitExpressionContext _localctx = new AwaitExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_awaitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(AWAIT);
			setState(556);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ExpectExpressionContext> expectExpression() {
			return getRuleContexts(ExpectExpressionContext.class);
		}
		public ExpectExpressionContext expectExpression(int i) {
			return getRuleContext(ExpectExpressionContext.class,i);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
		}
		public ItBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterItBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitItBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitItBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItBodyContext itBody() throws RecognitionException {
		ItBodyContext _localctx = new ItBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_itBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509514764L) != 0)) {
				{
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(558);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(559);
					expectExpression();
					}
					break;
				case 3:
					{
					setState(560);
					functionCallStatement();
					}
					break;
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatcherChainContext extends ParserRuleContext {
		public TerminalNode Point() { return getToken(Parsergrammar.Point, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode TO_BE_TRUTHY() { return getToken(Parsergrammar.TO_BE_TRUTHY, 0); }
		public TerminalNode TO_EQUAL() { return getToken(Parsergrammar.TO_EQUAL, 0); }
		public TerminalNode TO_CONTAIN() { return getToken(Parsergrammar.TO_CONTAIN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatcherChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcherChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMatcherChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMatcherChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMatcherChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatcherChainContext matcherChain() throws RecognitionException {
		MatcherChainContext _localctx = new MatcherChainContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_matcherChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(Point);
			setState(567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 212992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(568);
			match(LPAREN);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22658740189396992L) != 0) || _la==STRING) {
				{
				setState(569);
				expression(0);
				}
			}

			setState(572);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpectExpressionContext extends ParserRuleContext {
		public TerminalNode EXPECT() { return getToken(Parsergrammar.EXPECT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public MatcherChainContext matcherChain() {
			return getRuleContext(MatcherChainContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ExpectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterExpectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitExpectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitExpectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectExpressionContext expectExpression() throws RecognitionException {
		ExpectExpressionContext _localctx = new ExpectExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(EXPECT);
			setState(575);
			match(LPAREN);
			setState(576);
			expression(0);
			setState(577);
			match(RPAREN);
			setState(578);
			matcherChain();
			setState(579);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContentContext extends HtmlElementContext {
		public TextContentContext textContent() {
			return getRuleContext(TextContentContext.class,0);
		}
		public HtmlTextContentContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlTextContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingHtmlElementContext extends HtmlElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelfClosingHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelfClosingHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelfClosingHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalHtmlElementContext extends HtmlElementContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public NormalHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends HtmlElementContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public HtmlCommentContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_htmlElement);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_OPEN:
				_localctx = new NormalHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				openTag();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 67717L) != 0)) {
					{
					{
					setState(582);
					htmlElement();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
				closeTag();
				}
				break;
			case HTML_SELF_CLOSING_TAG:
				_localctx = new SelfClosingHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				selfClosingTag();
				}
				break;
			case INTERPOLATION:
			case STRING:
				_localctx = new HtmlTextContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				textContent();
				}
				break;
			case HTML_COMMENT:
				_localctx = new HtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(Parsergrammar.HTML_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(Parsergrammar.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(HTML_TAG_OPEN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15L) != 0)) {
				{
				{
				setState(596);
				attribute();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_CLOSE() { return getToken(Parsergrammar.HTML_TAG_CLOSE, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode HTML_SELF_CLOSING_TAG() { return getToken(Parsergrammar.HTML_SELF_CLOSING_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(HTML_SELF_CLOSING_TAG);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15L) != 0)) {
				{
				{
				setState(607);
				attribute();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode INTERPOLATION() { return getToken(Parsergrammar.INTERPOLATION, 0); }
		public TextContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContentContext textContent() throws RecognitionException {
		TextContentContext _localctx = new TextContentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_textContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !(_la==INTERPOLATION || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ATTRIBUTE() { return getToken(Parsergrammar.HTML_ATTRIBUTE, 0); }
		public TerminalNode ANGULAR_DIRECTIVE() { return getToken(Parsergrammar.ANGULAR_DIRECTIVE, 0); }
		public TerminalNode BINDING() { return getToken(Parsergrammar.BINDING, 0); }
		public TerminalNode EVENT_BINDING() { return getToken(Parsergrammar.EVENT_BINDING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(Parsergrammar.HTML_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(HTML_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFileContext extends ParserRuleContext {
		public List<CssCommentContext> cssComment() {
			return getRuleContexts(CssCommentContext.class);
		}
		public CssCommentContext cssComment(int i) {
			return getRuleContext(CssCommentContext.class,i);
		}
		public List<CssAtRuleContext> cssAtRule() {
			return getRuleContexts(CssAtRuleContext.class);
		}
		public CssAtRuleContext cssAtRule(int i) {
			return getRuleContext(CssAtRuleContext.class,i);
		}
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public CssFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFileContext cssFile() throws RecognitionException {
		CssFileContext _localctx = new CssFileContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cssFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(622);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_COMMENT:
					{
					setState(619);
					cssComment();
					}
					break;
				case CSS_AT_RULE:
					{
					setState(620);
					cssAtRule();
					}
					break;
				case IDENTIFIER:
					{
					setState(621);
					ruleset();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_AT_RULE || _la==IDENTIFIER || _la==CSS_COMMENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCommentContext extends ParserRuleContext {
		public TerminalNode CSS_COMMENT() { return getToken(Parsergrammar.CSS_COMMENT, 0); }
		public CssCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCommentContext cssComment() throws RecognitionException {
		CssCommentContext _localctx = new CssCommentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cssComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(CSS_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleContext extends ParserRuleContext {
		public TerminalNode CSS_AT_RULE() { return getToken(Parsergrammar.CSS_AT_RULE, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public CssAtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleContext cssAtRule() throws RecognitionException {
		CssAtRuleContext _localctx = new CssAtRuleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cssAtRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(CSS_AT_RULE);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(629);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesetContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(IDENTIFIER);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				match(IDENTIFIER);
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			match(LBRACE);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(641);
				declaration();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(IDENTIFIER);
			setState(650);
			match(COLON);
			setState(651);
			value();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(652);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_value);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001h\u0296\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0081\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0085\b\u0001\n\u0001"+
		"\f\u0001\u0088\t\u0001\u0001\u0001\u0004\u0001\u008b\b\u0001\u000b\u0001"+
		"\f\u0001\u008c\u0001\u0001\u0005\u0001\u0090\b\u0001\n\u0001\f\u0001\u0093"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u009a\b\u0002\n\u0002\f\u0002\u009d\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00a7\b\u0003\u0001\u0004\u0005\u0004\u00aa\b\u0004\n\u0004"+
		"\f\u0004\u00ad\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00bb\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00c0\b\u0007\n\u0007\f\u0007\u00c3\t\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00c7\b\b\n\b\f\b\u00ca\t\b\u0001\t\u0003\t\u00cd\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d3\b\t\u0001\t\u0001\t\u0005"+
		"\t\u00d7\b\t\n\t\f\t\u00da\t\t\u0001\t\u0001\t\u0001\n\u0004\n\u00df\b"+
		"\n\u000b\n\f\n\u00e0\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00e9\b\f\u0001\r\u0003\r\u00ec\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00f1\b\r\u0001\r\u0001\r\u0003\r\u00f5\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00fc\b\u000e\n\u000e"+
		"\f\u000e\u00ff\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0104\b\u000e\n\u000e\f\u000e\u0107\t\u000e\u0003\u000e\u0109\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010e\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0116\b\u0010\n\u0010\f\u0010\u0119\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0121\b\u0012\n"+
		"\u0012\f\u0012\u0124\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u012c\b\u0013\n\u0013\f\u0013"+
		"\u012f\t\u0013\u0001\u0013\u0003\u0013\u0132\b\u0013\u0003\u0013\u0134"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u013b\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013f\b\u0014"+
		"\n\u0014\f\u0014\u0142\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015e"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0164"+
		"\b\u0016\u0001\u0016\u0003\u0016\u0167\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u016b\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0173\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0177\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017b\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u017f\b\u0019\n\u0019\f\u0019"+
		"\u0182\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0187\b"+
		"\u001a\n\u001a\f\u001a\u018a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0193\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u019b\b\u001b\n\u001b\f\u001b\u019e\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01a3\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01a8\b\u001c\u0001\u001c\u0003\u001c\u01ab\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01b9\b\u001f\u0001\u001f\u0005\u001f\u01bc\b\u001f\n\u001f"+
		"\f\u001f\u01bf\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01c7\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u01cf\b!\n"+
		"!\f!\u01d2\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01dc\b\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$"+
		"\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0003*\u0205\b*\u0001*\u0001*\u0001*\u0003*\u020a\b*\u0001"+
		"+\u0001+\u0005+\u020e\b+\n+\f+\u0211\t+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0005,\u0218\b,\n,\f,\u021b\t,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u0232\b/\n/\f/\u0235\t/\u0001"+
		"0\u00010\u00010\u00010\u00030\u023b\b0\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00012\u00012\u00052\u0248\b2\n2\f2\u024b"+
		"\t2\u00012\u00012\u00012\u00012\u00012\u00032\u0252\b2\u00013\u00013\u0005"+
		"3\u0256\b3\n3\f3\u0259\t3\u00013\u00013\u00014\u00014\u00015\u00015\u0005"+
		"5\u0261\b5\n5\f5\u0264\t5\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u00019\u00049\u026f\b9\u000b9\f9\u0270\u0001:\u0001:\u0001;\u0001"+
		";\u0003;\u0277\b;\u0001<\u0001<\u0001<\u0005<\u027c\b<\n<\f<\u027f\t<"+
		"\u0001<\u0001<\u0005<\u0283\b<\n<\f<\u0286\t<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u028e\b=\u0001>\u0001>\u0001>\u0001>\u0003>\u0294"+
		"\b>\u0001>\u0000\u00016?\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|\u0000\u0007\u0001\u0000\u0002\u0003\u0003\u0000\u0012"+
		"\u001344bb\u0001\u0000\u0012\u0013\u0001\u0000bc\u0002\u0000\u000e\u000e"+
		"\u0010\u0011\u0002\u0000^^bb\u0001\u0000Z]\u02b5\u0000\u0080\u0001\u0000"+
		"\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000"+
		"\u0000\u0000\u0006\u00a6\u0001\u0000\u0000\u0000\b\u00ab\u0001\u0000\u0000"+
		"\u0000\n\u00b0\u0001\u0000\u0000\u0000\f\u00b3\u0001\u0000\u0000\u0000"+
		"\u000e\u00bc\u0001\u0000\u0000\u0000\u0010\u00c4\u0001\u0000\u0000\u0000"+
		"\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u00de\u0001\u0000\u0000\u0000"+
		"\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00e8\u0001\u0000\u0000\u0000"+
		"\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000"+
		"\u001e\u010a\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\""+
		"\u011a\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u0127\u0001"+
		"\u0000\u0000\u0000(\u0137\u0001\u0000\u0000\u0000*\u015d\u0001\u0000\u0000"+
		"\u0000,\u0166\u0001\u0000\u0000\u0000.\u016a\u0001\u0000\u0000\u00000"+
		"\u0170\u0001\u0000\u0000\u00002\u0176\u0001\u0000\u0000\u00004\u0183\u0001"+
		"\u0000\u0000\u00006\u0192\u0001\u0000\u0000\u00008\u01a2\u0001\u0000\u0000"+
		"\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01b2\u0001\u0000\u0000\u0000>"+
		"\u01b4\u0001\u0000\u0000\u0000@\u01c0\u0001\u0000\u0000\u0000B\u01ca\u0001"+
		"\u0000\u0000\u0000D\u01db\u0001\u0000\u0000\u0000F\u01dd\u0001\u0000\u0000"+
		"\u0000H\u01e1\u0001\u0000\u0000\u0000J\u01e5\u0001\u0000\u0000\u0000L"+
		"\u01eb\u0001\u0000\u0000\u0000N\u01ef\u0001\u0000\u0000\u0000P\u01f3\u0001"+
		"\u0000\u0000\u0000R\u01f7\u0001\u0000\u0000\u0000T\u0209\u0001\u0000\u0000"+
		"\u0000V\u020f\u0001\u0000\u0000\u0000X\u0212\u0001\u0000\u0000\u0000Z"+
		"\u0220\u0001\u0000\u0000\u0000\\\u022b\u0001\u0000\u0000\u0000^\u0233"+
		"\u0001\u0000\u0000\u0000`\u0236\u0001\u0000\u0000\u0000b\u023e\u0001\u0000"+
		"\u0000\u0000d\u0251\u0001\u0000\u0000\u0000f\u0253\u0001\u0000\u0000\u0000"+
		"h\u025c\u0001\u0000\u0000\u0000j\u025e\u0001\u0000\u0000\u0000l\u0265"+
		"\u0001\u0000\u0000\u0000n\u0267\u0001\u0000\u0000\u0000p\u0269\u0001\u0000"+
		"\u0000\u0000r\u026e\u0001\u0000\u0000\u0000t\u0272\u0001\u0000\u0000\u0000"+
		"v\u0274\u0001\u0000\u0000\u0000x\u0278\u0001\u0000\u0000\u0000z\u0289"+
		"\u0001\u0000\u0000\u0000|\u0293\u0001\u0000\u0000\u0000~\u0081\u0003\u0002"+
		"\u0001\u0000\u007f\u0081\u0003\u0004\u0002\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0001\u0001\u0000\u0000"+
		"\u0000\u0082\u0086\u0003\u0010\b\u0000\u0083\u0085\u0003\u0012\t\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0003@ \u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0003\u0012\t\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u00050\u0000\u0000\u0095\u0096\u0005\u0000"+
		"\u0000\u0001\u0096\u0003\u0001\u0000\u0000\u0000\u0097\u009b\u0003\u0010"+
		"\b\u0000\u0098\u009a\u0003\u0006\u0003\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0000\u0000"+
		"\u0001\u009f\u0005\u0001\u0000\u0000\u0000\u00a0\u00a7\u0003\u0014\n\u0000"+
		"\u00a1\u00a7\u0003\u0016\u000b\u0000\u00a2\u00a7\u00030\u0018\u0000\u00a3"+
		"\u00a7\u0003\u001a\r\u0000\u00a4\u00a7\u0003\u001e\u000f\u0000\u00a5\u00a7"+
		"\u0003R)\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u0007\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003d2\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0000\u0000\u0001\u00af\t\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0003r9\u0000\u00b1\u00b2\u0005\u0000\u0000\u0001\u00b2\u000b\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u00b5\u0005"+
		"/\u0000\u0000\u00b5\u00b6\u0003\u000e\u0007\u0000\u00b6\u00b7\u00050\u0000"+
		"\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00ba\u0005b\u0000\u0000"+
		"\u00b9\u00bb\u00051\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\r\u0001\u0000\u0000\u0000\u00bc\u00c1"+
		"\u00056\u0000\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be\u00c0\u0005"+
		"6\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u000f\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c8\u0003\f\u0006\u0000\u00c5\u00c7\u0003\f\u0006"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u0011\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cd\u0005\u0005\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0006\u0000\u0000\u00cf\u00d2\u00056\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1\u00d3\u00056\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0005/\u0000\u0000\u00d5\u00d7"+
		"\u0003\u0018\f\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u00050\u0000\u0000\u00dc\u0013\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0003\u0012\t\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u0015\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3\u00e4\u0003\u001a\r\u0000"+
		"\u00e4\u0017\u0001\u0000\u0000\u0000\u00e5\u00e9\u0003\u001a\r\u0000\u00e6"+
		"\u00e9\u0003\u001e\u000f\u0000\u00e7\u00e9\u0003@ \u0000\u00e8\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00ec\u0007"+
		"\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0005"+
		"6\u0000\u0000\u00ee\u00ef\u0005\u001e\u0000\u0000\u00ef\u00f1\u0003\u001c"+
		"\u000e\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005$\u0000"+
		"\u0000\u00f3\u00f5\u00036\u001b\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u00051\u0000\u0000\u00f7\u001b\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fd\u0005\u0015\u0000\u0000\u00f9\u00fa\u0005%\u0000\u0000\u00fa\u00fc"+
		"\u00056\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0109\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0105\u00056\u0000\u0000\u0101\u0102\u0005%\u0000"+
		"\u0000\u0102\u0104\u00056\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u00f8\u0001\u0000\u0000\u0000"+
		"\u0108\u0100\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u00056\u0000\u0000\u010b\u010d\u0005\u001c\u0000\u0000\u010c"+
		"\u010e\u0003 \u0010\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005\u001d\u0000\u0000\u0110\u0111\u0003$\u0012\u0000\u0111\u001f\u0001"+
		"\u0000\u0000\u0000\u0112\u0117\u0003\"\u0011\u0000\u0113\u0114\u0005\u001f"+
		"\u0000\u0000\u0114\u0116\u0003\"\u0011\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118!\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u00056\u0000\u0000\u011b"+
		"\u011c\u0005\u001e\u0000\u0000\u011c\u011d\u0003\u001c\u000e\u0000\u011d"+
		"#\u0001\u0000\u0000\u0000\u011e\u0122\u0005/\u0000\u0000\u011f\u0121\u0003"+
		",\u0016\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u00050\u0000\u0000\u0126%\u0001\u0000\u0000\u0000"+
		"\u0127\u0133\u0005 \u0000\u0000\u0128\u012d\u00036\u001b\u0000\u0129\u012a"+
		"\u0005\u001f\u0000\u0000\u012a\u012c\u00036\u001b\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0132\u0005"+
		"\u001f\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0128\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005!\u0000\u0000\u0136\'\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005/\u0000\u0000\u0138\u013a\u0003*\u0015\u0000"+
		"\u0139\u013b\u0005\u001f\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0140\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0005\u001f\u0000\u0000\u013d\u013f\u0003*\u0015\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u00050\u0000\u0000\u0144)\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"\u0017\u0000\u0000\u0146\u0147\u0005\u001e\u0000\u0000\u0147\u015e\u0003"+
		"6\u001b\u0000\u0148\u0149\u0005\u0001\u0000\u0000\u0149\u014a\u0005\u001e"+
		"\u0000\u0000\u014a\u015e\u00036\u001b\u0000\u014b\u014c\u0005\u001a\u0000"+
		"\u0000\u014c\u014d\u0005\u001e\u0000\u0000\u014d\u015e\u00036\u001b\u0000"+
		"\u014e\u014f\u0005\u001b\u0000\u0000\u014f\u0150\u0005\u001e\u0000\u0000"+
		"\u0150\u015e\u00036\u001b\u0000\u0151\u0152\u0005\u0018\u0000\u0000\u0152"+
		"\u0153\u0005\u001e\u0000\u0000\u0153\u015e\u00036\u001b\u0000\u0154\u0155"+
		"\u0005\u0019\u0000\u0000\u0155\u0156\u0005\u001e\u0000\u0000\u0156\u015e"+
		"\u00036\u001b\u0000\u0157\u0158\u00056\u0000\u0000\u0158\u0159\u0005\u001e"+
		"\u0000\u0000\u0159\u015e\u00036\u001b\u0000\u015a\u015b\u0005b\u0000\u0000"+
		"\u015b\u015c\u0005\u001e\u0000\u0000\u015c\u015e\u00036\u001b\u0000\u015d"+
		"\u0145\u0001\u0000\u0000\u0000\u015d\u0148\u0001\u0000\u0000\u0000\u015d"+
		"\u014b\u0001\u0000\u0000\u0000\u015d\u014e\u0001\u0000\u0000\u0000\u015d"+
		"\u0151\u0001\u0000\u0000\u0000\u015d\u0154\u0001\u0000\u0000\u0000\u015d"+
		"\u0157\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015e"+
		"+\u0001\u0000\u0000\u0000\u015f\u0167\u0003\u001a\r\u0000\u0160\u0167"+
		"\u0003.\u0017\u0000\u0161\u0163\u0003\\.\u0000\u0162\u0164\u00051\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0167\u00030\u0018\u0000"+
		"\u0166\u015f\u0001\u0000\u0000\u0000\u0166\u0160\u0001\u0000\u0000\u0000"+
		"\u0166\u0161\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0167-\u0001\u0000\u0000\u0000\u0168\u016b\u0003>\u001f\u0000\u0169\u016b"+
		"\u00056\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		"$\u0000\u0000\u016d\u016e\u00036\u001b\u0000\u016e\u016f\u00051\u0000"+
		"\u0000\u016f/\u0001\u0000\u0000\u0000\u0170\u0172\u00032\u0019\u0000\u0171"+
		"\u0173\u00051\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u01731\u0001\u0000\u0000\u0000\u0174\u0177\u0005"+
		"6\u0000\u0000\u0175\u0177\u0003>\u001f\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0005\u001c\u0000\u0000\u0179\u017b\u00034\u001a\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u0180\u0005\u001d\u0000\u0000"+
		"\u017d\u017f\u00038\u001c\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u01813\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0188\u00036\u001b\u0000\u0184\u0185\u0005"+
		"\u001f\u0000\u0000\u0185\u0187\u00036\u001b\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u01895\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0006\u001b\uffff"+
		"\uffff\u0000\u018c\u0193\u0003<\u001e\u0000\u018d\u0193\u00032\u0019\u0000"+
		"\u018e\u0193\u0003>\u001f\u0000\u018f\u0193\u0003:\u001d\u0000\u0190\u0193"+
		"\u0003&\u0013\u0000\u0191\u0193\u0003(\u0014\u0000\u0192\u018b\u0001\u0000"+
		"\u0000\u0000\u0192\u018d\u0001\u0000\u0000\u0000\u0192\u018e\u0001\u0000"+
		"\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u019c\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\n\u0001\u0000\u0000\u0195\u0196\u00052\u0000"+
		"\u0000\u0196\u019b\u00036\u001b\u0002\u0197\u0198\n\u0002\u0000\u0000"+
		"\u0198\u0199\u0005\u0014\u0000\u0000\u0199\u019b\u0003\u001c\u000e\u0000"+
		"\u019a\u0194\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d7\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a3\u0005%\u0000\u0000\u01a0\u01a1"+
		"\u0005*\u0000\u0000\u01a1\u01a3\u0005%\u0000\u0000\u01a2\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01aa\u00056\u0000\u0000\u01a5\u01a7\u0005\u001c\u0000"+
		"\u0000\u01a6\u01a8\u00034\u001a\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0005\u001d\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005\u001c\u0000\u0000\u01ad\u01ae\u00056\u0000\u0000\u01ae\u01af"+
		"\u0005\u001d\u0000\u0000\u01af\u01b0\u0005.\u0000\u0000\u01b0\u01b1\u0003"+
		"6\u001b\u0000\u01b1;\u0001\u0000\u0000\u0000\u01b2\u01b3\u0007\u0001\u0000"+
		"\u0000\u01b3=\u0001\u0000\u0000\u0000\u01b4\u01bd\u00056\u0000\u0000\u01b5"+
		"\u01b9\u0005%\u0000\u0000\u01b6\u01b7\u0005*\u0000\u0000\u01b7\u01b9\u0005"+
		"%\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u00056\u0000"+
		"\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be?\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u00053\u0000\u0000\u01c1\u01c2\u00056\u0000\u0000\u01c2\u01c3"+
		"\u0005\u001c\u0000\u0000\u01c3\u01c4\u0003B!\u0000\u01c4\u01c6\u0005\u001d"+
		"\u0000\u0000\u01c5\u01c7\u00051\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0003\u0012\t\u0000\u01c9A\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0005/\u0000\u0000\u01cb\u01d0\u0003D\"\u0000\u01cc\u01cd"+
		"\u0005\u001f\u0000\u0000\u01cd\u01cf\u0003D\"\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005"+
		"0\u0000\u0000\u01d4C\u0001\u0000\u0000\u0000\u01d5\u01dc\u0003H$\u0000"+
		"\u01d6\u01dc\u0003F#\u0000\u01d7\u01dc\u0003J%\u0000\u01d8\u01dc\u0003"+
		"L&\u0000\u01d9\u01dc\u0003N\'\u0000\u01da\u01dc\u0003P(\u0000\u01db\u01d5"+
		"\u0001\u0000\u0000\u0000\u01db\u01d6\u0001\u0000\u0000\u0000\u01db\u01d7"+
		"\u0001\u0000\u0000\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dcE\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0005\u0017\u0000\u0000\u01de\u01df\u0005"+
		"\u001e\u0000\u0000\u01df\u01e0\u0005b\u0000\u0000\u01e0G\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0005\u0018\u0000\u0000\u01e2\u01e3\u0005\u001e\u0000"+
		"\u0000\u01e3\u01e4\u0007\u0002\u0000\u0000\u01e4I\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0005\u0019\u0000\u0000\u01e6\u01e7\u0005\u001e\u0000\u0000"+
		"\u01e7\u01e8\u0005 \u0000\u0000\u01e8\u01e9\u0003\u000e\u0007\u0000\u01e9"+
		"\u01ea\u0005!\u0000\u0000\u01eaK\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		"\u0001\u0000\u0000\u01ec\u01ed\u0005\u001e\u0000\u0000\u01ed\u01ee\u0007"+
		"\u0003\u0000\u0000\u01eeM\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u001a"+
		"\u0000\u0000\u01f0\u01f1\u0005\u001e\u0000\u0000\u01f1\u01f2\u0005b\u0000"+
		"\u0000\u01f2O\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u001b\u0000\u0000"+
		"\u01f4\u01f5\u0005\u001e\u0000\u0000\u01f5\u01f6\u0005b\u0000\u0000\u01f6"+
		"Q\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\t\u0000\u0000\u01f8\u01f9"+
		"\u0005\u001c\u0000\u0000\u01f9\u01fa\u0005b\u0000\u0000\u01fa\u01fb\u0005"+
		"\u001f\u0000\u0000\u01fb\u01fc\u0003T*\u0000\u01fc\u01fd\u0005/\u0000"+
		"\u0000\u01fd\u01fe\u0003V+\u0000\u01fe\u01ff\u00050\u0000\u0000\u01ff"+
		"\u0200\u0005\u001d\u0000\u0000\u0200\u0201\u00051\u0000\u0000\u0201S\u0001"+
		"\u0000\u0000\u0000\u0202\u020a\u0005.\u0000\u0000\u0203\u0205\u0005\f"+
		"\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u001c"+
		"\u0000\u0000\u0207\u0208\u0005\u001d\u0000\u0000\u0208\u020a\u0005.\u0000"+
		"\u0000\u0209\u0202\u0001\u0000\u0000\u0000\u0209\u0204\u0001\u0000\u0000"+
		"\u0000\u020aU\u0001\u0000\u0000\u0000\u020b\u020e\u0003X,\u0000\u020c"+
		"\u020e\u0003Z-\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210W\u0001\u0000"+
		"\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u000b"+
		"\u0000\u0000\u0213\u0214\u0005\u001c\u0000\u0000\u0214\u0215\u0003T*\u0000"+
		"\u0215\u0219\u0005/\u0000\u0000\u0216\u0218\u0003,\u0016\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c"+
		"\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u00050\u0000\u0000\u021d\u021e\u0005\u001d\u0000\u0000\u021e\u021f\u0005"+
		"1\u0000\u0000\u021fY\u0001\u0000\u0000\u0000\u0220\u0221\u0005\n\u0000"+
		"\u0000\u0221\u0222\u0005\u001c\u0000\u0000\u0222\u0223\u0007\u0003\u0000"+
		"\u0000\u0223\u0224\u0005\u001f\u0000\u0000\u0224\u0225\u0003T*\u0000\u0225"+
		"\u0226\u0005/\u0000\u0000\u0226\u0227\u0003^/\u0000\u0227\u0228\u0005"+
		"0\u0000\u0000\u0228\u0229\u0005\u001d\u0000\u0000\u0229\u022a\u00051\u0000"+
		"\u0000\u022a[\u0001\u0000\u0000\u0000\u022b\u022c\u0005\r\u0000\u0000"+
		"\u022c\u022d\u00032\u0019\u0000\u022d]\u0001\u0000\u0000\u0000\u022e\u0232"+
		"\u0003\u001a\r\u0000\u022f\u0232\u0003b1\u0000\u0230\u0232\u00030\u0018"+
		"\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000"+
		"\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000"+
		"\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234_\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0005%\u0000\u0000\u0237\u0238\u0007\u0004\u0000\u0000\u0238"+
		"\u023a\u0005\u001c\u0000\u0000\u0239\u023b\u00036\u001b\u0000\u023a\u0239"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u001d\u0000\u0000\u023da\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0005\u000f\u0000\u0000\u023f\u0240\u0005"+
		"\u001c\u0000\u0000\u0240\u0241\u00036\u001b\u0000\u0241\u0242\u0005\u001d"+
		"\u0000\u0000\u0242\u0243\u0003`0\u0000\u0243\u0244\u00051\u0000\u0000"+
		"\u0244c\u0001\u0000\u0000\u0000\u0245\u0249\u0003f3\u0000\u0246\u0248"+
		"\u0003d2\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000"+
		"\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000"+
		"\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0003h4\u0000\u024d\u0252\u0001\u0000\u0000\u0000"+
		"\u024e\u0252\u0003j5\u0000\u024f\u0252\u0003l6\u0000\u0250\u0252\u0003"+
		"p8\u0000\u0251\u0245\u0001\u0000\u0000\u0000\u0251\u024e\u0001\u0000\u0000"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000"+
		"\u0000\u0252e\u0001\u0000\u0000\u0000\u0253\u0257\u0005W\u0000\u0000\u0254"+
		"\u0256\u0003n7\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259\u0001"+
		"\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001"+
		"\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0257\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005&\u0000\u0000\u025bg\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0005X\u0000\u0000\u025di\u0001\u0000\u0000\u0000\u025e"+
		"\u0262\u0005Y\u0000\u0000\u025f\u0261\u0003n7\u0000\u0260\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263k\u0001\u0000"+
		"\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0266\u0007\u0005"+
		"\u0000\u0000\u0266m\u0001\u0000\u0000\u0000\u0267\u0268\u0007\u0006\u0000"+
		"\u0000\u0268o\u0001\u0000\u0000\u0000\u0269\u026a\u0005g\u0000\u0000\u026a"+
		"q\u0001\u0000\u0000\u0000\u026b\u026f\u0003t:\u0000\u026c\u026f\u0003"+
		"v;\u0000\u026d\u026f\u0003x<\u0000\u026e\u026b\u0001\u0000\u0000\u0000"+
		"\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271s\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0005f\u0000\u0000\u0273u\u0001\u0000\u0000\u0000\u0274\u0276\u0005"+
		"\u0016\u0000\u0000\u0275\u0277\u00051\u0000\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277w\u0001\u0000\u0000"+
		"\u0000\u0278\u027d\u00056\u0000\u0000\u0279\u027a\u0005\u001f\u0000\u0000"+
		"\u027a\u027c\u00056\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c"+
		"\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f"+
		"\u027d\u0001\u0000\u0000\u0000\u0280\u0284\u0005/\u0000\u0000\u0281\u0283"+
		"\u0003z=\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u00050\u0000\u0000\u0288y\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u00056\u0000\u0000\u028a\u028b\u0005\u001e\u0000\u0000\u028b"+
		"\u028d\u0003|>\u0000\u028c\u028e\u00051\u0000\u0000\u028d\u028c\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e{\u0001\u0000"+
		"\u0000\u0000\u028f\u0294\u00054\u0000\u0000\u0290\u0294\u0005b\u0000\u0000"+
		"\u0291\u0294\u00056\u0000\u0000\u0292\u0294\u00032\u0019\u0000\u0293\u028f"+
		"\u0001\u0000\u0000\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294}\u0001"+
		"\u0000\u0000\u0000D\u0080\u0086\u008c\u0091\u009b\u00a6\u00ab\u00ba\u00c1"+
		"\u00c8\u00cc\u00d2\u00d8\u00e0\u00e8\u00eb\u00f0\u00f4\u00fd\u0105\u0108"+
		"\u010d\u0117\u0122\u012d\u0131\u0133\u013a\u0140\u015d\u0163\u0166\u016a"+
		"\u0172\u0176\u017a\u0180\u0188\u0192\u019a\u019c\u01a2\u01a7\u01aa\u01b8"+
		"\u01bd\u01c6\u01d0\u01db\u0204\u0209\u020d\u020f\u0219\u0231\u0233\u023a"+
		"\u0249\u0251\u0257\u0262\u026e\u0270\u0276\u027d\u0284\u028d\u0293";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}