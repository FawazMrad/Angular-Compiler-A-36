// Generated from C:/Users/fawaz/OneDrive/Desktop/For Compiler/Compiler/src/Parsergrammar.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parsergrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsergrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(Parsergrammar.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#angularComponentFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularComponentFile(Parsergrammar.AngularComponentFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#plainTsFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainTsFile(Parsergrammar.PlainTsFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclarationStmt(Parsergrammar.ImportDeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationsStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationsStmt(Parsergrammar.ClassDeclarationsStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportVariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportVariableDeclarationStmt(Parsergrammar.ExportVariableDeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(Parsergrammar.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStmt(Parsergrammar.VariableDeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationStmt(Parsergrammar.MethodDeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescribeBlockStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeBlockStmt(Parsergrammar.DescribeBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#templateFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateFile(Parsergrammar.TemplateFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#styleFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleFile(Parsergrammar.StyleFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Parsergrammar.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(Parsergrammar.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclarations(Parsergrammar.ImportDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#classDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarations(Parsergrammar.ClassDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#exportVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportVariableDeclaration(Parsergrammar.ExportVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMember(Parsergrammar.VariableMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(Parsergrammar.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorMember(Parsergrammar.DecoratorMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Parsergrammar.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(Parsergrammar.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Parsergrammar.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parsergrammar.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(Parsergrammar.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(Parsergrammar.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProp(Parsergrammar.SelectorPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProp(Parsergrammar.TemplatePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProp(Parsergrammar.TemplateUrlPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlProp(Parsergrammar.StyleUrlPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProp(Parsergrammar.StandalonePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProp(Parsergrammar.ImportsPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierProp(Parsergrammar.IdentifierPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringProp(Parsergrammar.StringPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclStmt(Parsergrammar.VariableDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(Parsergrammar.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitStmt(Parsergrammar.AwaitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCalStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCalStmt(Parsergrammar.FunctionCalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(Parsergrammar.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Parsergrammar.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Parsergrammar.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpr(Parsergrammar.ObjectLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(Parsergrammar.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionExpr(Parsergrammar.TypeAssertionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpr(Parsergrammar.ArrayLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(Parsergrammar.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionExpr(Parsergrammar.ArrowFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessExpr(Parsergrammar.PropertyAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodChain(Parsergrammar.MethodChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(Parsergrammar.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Parsergrammar.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(Parsergrammar.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#decoratorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorDeclaration(Parsergrammar.DecoratorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(Parsergrammar.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneComponentProperty(Parsergrammar.StandaloneComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorComponentProperty(Parsergrammar.SelectorComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsComponentProperty(Parsergrammar.ImportsComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateComponentProperty(Parsergrammar.TemplateComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlComponentProperty(Parsergrammar.TemplateUrlComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlComponentProperty(Parsergrammar.StyleUrlComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(Parsergrammar.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#standaloneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(Parsergrammar.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(Parsergrammar.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(Parsergrammar.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#templateUrlProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProperty(Parsergrammar.TemplateUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#styleUrlProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlProperty(Parsergrammar.StyleUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#describeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeBlock(Parsergrammar.DescribeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(Parsergrammar.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#describeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeBody(Parsergrammar.DescribeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#beforeEachBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeEachBlock(Parsergrammar.BeforeEachBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#itBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItBlock(Parsergrammar.ItBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#awaitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(Parsergrammar.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#itBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItBody(Parsergrammar.ItBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#matcherChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatcherChain(Parsergrammar.MatcherChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#expectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpectExpression(Parsergrammar.ExpectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHtmlElement(Parsergrammar.NormalHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtmlElement(Parsergrammar.SelfClosingHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextContent}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextContent(Parsergrammar.HtmlTextContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(Parsergrammar.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(Parsergrammar.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(Parsergrammar.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(Parsergrammar.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(Parsergrammar.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Parsergrammar.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(Parsergrammar.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#cssFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFile(Parsergrammar.CssFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#cssComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssComment(Parsergrammar.CssCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#cssAtRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRule(Parsergrammar.CssAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(Parsergrammar.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Parsergrammar.ValueContext ctx);
}