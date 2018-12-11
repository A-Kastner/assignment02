package org.softlang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.antlr.v4.tool.Rule;

import java.util.List;

public class ANTLR4Listener implements ANTLRv4ParserListener{

    public ANTLR4Listener(RuleCallback callback){
        ruleCallback = callback;
    }

    RuleCallback ruleCallback;

    @Override
    public void enterGrammarSpec(ANTLRv4Parser.GrammarSpecContext ctx) {

    }

    @Override
    public void exitGrammarSpec(ANTLRv4Parser.GrammarSpecContext ctx) {

    }

    @Override
    public void enterGrammarType(ANTLRv4Parser.GrammarTypeContext ctx) {

    }

    @Override
    public void exitGrammarType(ANTLRv4Parser.GrammarTypeContext ctx) {

    }

    @Override
    public void enterPrequelConstruct(ANTLRv4Parser.PrequelConstructContext ctx) {

    }

    @Override
    public void exitPrequelConstruct(ANTLRv4Parser.PrequelConstructContext ctx) {

    }

    @Override
    public void enterOptionsSpec(ANTLRv4Parser.OptionsSpecContext ctx) {

    }

    @Override
    public void exitOptionsSpec(ANTLRv4Parser.OptionsSpecContext ctx) {

    }

    @Override
    public void enterOption(ANTLRv4Parser.OptionContext ctx) {

    }

    @Override
    public void exitOption(ANTLRv4Parser.OptionContext ctx) {

    }

    @Override
    public void enterOptionValue(ANTLRv4Parser.OptionValueContext ctx) {

    }

    @Override
    public void exitOptionValue(ANTLRv4Parser.OptionValueContext ctx) {

    }

    @Override
    public void enterDelegateGrammars(ANTLRv4Parser.DelegateGrammarsContext ctx) {

    }

    @Override
    public void exitDelegateGrammars(ANTLRv4Parser.DelegateGrammarsContext ctx) {

    }

    @Override
    public void enterDelegateGrammar(ANTLRv4Parser.DelegateGrammarContext ctx) {

    }

    @Override
    public void exitDelegateGrammar(ANTLRv4Parser.DelegateGrammarContext ctx) {

    }

    @Override
    public void enterTokensSpec(ANTLRv4Parser.TokensSpecContext ctx) {

    }

    @Override
    public void exitTokensSpec(ANTLRv4Parser.TokensSpecContext ctx) {

    }

    @Override
    public void enterChannelsSpec(ANTLRv4Parser.ChannelsSpecContext ctx) {

    }

    @Override
    public void exitChannelsSpec(ANTLRv4Parser.ChannelsSpecContext ctx) {

    }

    @Override
    public void enterIdList(ANTLRv4Parser.IdListContext ctx) {

    }

    @Override
    public void exitIdList(ANTLRv4Parser.IdListContext ctx) {

    }

    @Override
    public void enterAction(ANTLRv4Parser.ActionContext ctx) {

    }

    @Override
    public void exitAction(ANTLRv4Parser.ActionContext ctx) {

    }

    @Override
    public void enterActionScopeName(ANTLRv4Parser.ActionScopeNameContext ctx) {

    }

    @Override
    public void exitActionScopeName(ANTLRv4Parser.ActionScopeNameContext ctx) {

    }

    @Override
    public void enterActionBlock(ANTLRv4Parser.ActionBlockContext ctx) {

    }

    @Override
    public void exitActionBlock(ANTLRv4Parser.ActionBlockContext ctx) {

    }

    @Override
    public void enterArgActionBlock(ANTLRv4Parser.ArgActionBlockContext ctx) {

    }

    @Override
    public void exitArgActionBlock(ANTLRv4Parser.ArgActionBlockContext ctx) {

    }

    @Override
    public void enterModeSpec(ANTLRv4Parser.ModeSpecContext ctx) {

    }

    @Override
    public void exitModeSpec(ANTLRv4Parser.ModeSpecContext ctx) {

    }

    @Override
    public void enterRules(ANTLRv4Parser.RulesContext ctx) {

    }

    @Override
    public void exitRules(ANTLRv4Parser.RulesContext ctx) {

    }

    @Override
    public void enterRuleSpec(ANTLRv4Parser.RuleSpecContext ctx) {

    }

    @Override
    public void exitRuleSpec(ANTLRv4Parser.RuleSpecContext ctx) {

    }

    @Override
    public void enterParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx) {
        String ruleName = ctx.children.stream().filter(parseTree -> parseTree.getClass() == TerminalNodeImpl.class)
                .map(parseTree -> (TerminalNodeImpl) parseTree)
                .filter(terminalNode -> (terminalNode.symbol.getType() == 2))
                .findFirst().get().getText();
        if(ruleName != null) ruleCallback.onRuleReceived(ruleName);
    }

    @Override
    public void exitParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx) {

    }

    @Override
    public void enterExceptionGroup(ANTLRv4Parser.ExceptionGroupContext ctx) {

    }

    @Override
    public void exitExceptionGroup(ANTLRv4Parser.ExceptionGroupContext ctx) {

    }

    @Override
    public void enterExceptionHandler(ANTLRv4Parser.ExceptionHandlerContext ctx) {

    }

    @Override
    public void exitExceptionHandler(ANTLRv4Parser.ExceptionHandlerContext ctx) {

    }

    @Override
    public void enterFinallyClause(ANTLRv4Parser.FinallyClauseContext ctx) {

    }

    @Override
    public void exitFinallyClause(ANTLRv4Parser.FinallyClauseContext ctx) {

    }

    @Override
    public void enterRulePrequel(ANTLRv4Parser.RulePrequelContext ctx) {

    }

    @Override
    public void exitRulePrequel(ANTLRv4Parser.RulePrequelContext ctx) {

    }

    @Override
    public void enterRuleReturns(ANTLRv4Parser.RuleReturnsContext ctx) {

    }

    @Override
    public void exitRuleReturns(ANTLRv4Parser.RuleReturnsContext ctx) {

    }

    @Override
    public void enterThrowsSpec(ANTLRv4Parser.ThrowsSpecContext ctx) {

    }

    @Override
    public void exitThrowsSpec(ANTLRv4Parser.ThrowsSpecContext ctx) {

    }

    @Override
    public void enterLocalsSpec(ANTLRv4Parser.LocalsSpecContext ctx) {

    }

    @Override
    public void exitLocalsSpec(ANTLRv4Parser.LocalsSpecContext ctx) {

    }

    @Override
    public void enterRuleAction(ANTLRv4Parser.RuleActionContext ctx) {

    }

    @Override
    public void exitRuleAction(ANTLRv4Parser.RuleActionContext ctx) {

    }

    @Override
    public void enterRuleModifiers(ANTLRv4Parser.RuleModifiersContext ctx) {

    }

    @Override
    public void exitRuleModifiers(ANTLRv4Parser.RuleModifiersContext ctx) {

    }

    @Override
    public void enterRuleModifier(ANTLRv4Parser.RuleModifierContext ctx) {

    }

    @Override
    public void exitRuleModifier(ANTLRv4Parser.RuleModifierContext ctx) {

    }

    @Override
    public void enterRuleBlock(ANTLRv4Parser.RuleBlockContext ctx) {

    }

    @Override
    public void exitRuleBlock(ANTLRv4Parser.RuleBlockContext ctx) {

    }

    @Override
    public void enterRuleAltList(ANTLRv4Parser.RuleAltListContext ctx) {

    }

    @Override
    public void exitRuleAltList(ANTLRv4Parser.RuleAltListContext ctx) {

    }

    @Override
    public void enterLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx) {

    }

    @Override
    public void exitLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx) {

    }

    @Override
    public void enterLexerRuleSpec(ANTLRv4Parser.LexerRuleSpecContext ctx) {

    }

    @Override
    public void exitLexerRuleSpec(ANTLRv4Parser.LexerRuleSpecContext ctx) {

    }

    @Override
    public void enterLexerRuleBlock(ANTLRv4Parser.LexerRuleBlockContext ctx) {

    }

    @Override
    public void exitLexerRuleBlock(ANTLRv4Parser.LexerRuleBlockContext ctx) {

    }

    @Override
    public void enterLexerAltList(ANTLRv4Parser.LexerAltListContext ctx) {

    }

    @Override
    public void exitLexerAltList(ANTLRv4Parser.LexerAltListContext ctx) {

    }

    @Override
    public void enterLexerAlt(ANTLRv4Parser.LexerAltContext ctx) {

    }

    @Override
    public void exitLexerAlt(ANTLRv4Parser.LexerAltContext ctx) {

    }

    @Override
    public void enterLexerElements(ANTLRv4Parser.LexerElementsContext ctx) {

    }

    @Override
    public void exitLexerElements(ANTLRv4Parser.LexerElementsContext ctx) {

    }

    @Override
    public void enterLexerElement(ANTLRv4Parser.LexerElementContext ctx) {

    }

    @Override
    public void exitLexerElement(ANTLRv4Parser.LexerElementContext ctx) {

    }

    @Override
    public void enterLabeledLexerElement(ANTLRv4Parser.LabeledLexerElementContext ctx) {

    }

    @Override
    public void exitLabeledLexerElement(ANTLRv4Parser.LabeledLexerElementContext ctx) {

    }

    @Override
    public void enterLexerBlock(ANTLRv4Parser.LexerBlockContext ctx) {

    }

    @Override
    public void exitLexerBlock(ANTLRv4Parser.LexerBlockContext ctx) {

    }

    @Override
    public void enterLexerCommands(ANTLRv4Parser.LexerCommandsContext ctx) {

    }

    @Override
    public void exitLexerCommands(ANTLRv4Parser.LexerCommandsContext ctx) {

    }

    @Override
    public void enterLexerCommand(ANTLRv4Parser.LexerCommandContext ctx) {

    }

    @Override
    public void exitLexerCommand(ANTLRv4Parser.LexerCommandContext ctx) {

    }

    @Override
    public void enterLexerCommandName(ANTLRv4Parser.LexerCommandNameContext ctx) {

    }

    @Override
    public void exitLexerCommandName(ANTLRv4Parser.LexerCommandNameContext ctx) {

    }

    @Override
    public void enterLexerCommandExpr(ANTLRv4Parser.LexerCommandExprContext ctx) {

    }

    @Override
    public void exitLexerCommandExpr(ANTLRv4Parser.LexerCommandExprContext ctx) {

    }

    @Override
    public void enterAltList(ANTLRv4Parser.AltListContext ctx) {

    }

    @Override
    public void exitAltList(ANTLRv4Parser.AltListContext ctx) {

    }

    @Override
    public void enterAlternative(ANTLRv4Parser.AlternativeContext ctx) {

    }

    @Override
    public void exitAlternative(ANTLRv4Parser.AlternativeContext ctx) {

    }

    @Override
    public void enterElement(ANTLRv4Parser.ElementContext ctx) {

    }

    @Override
    public void exitElement(ANTLRv4Parser.ElementContext ctx) {

    }

    @Override
    public void enterLabeledElement(ANTLRv4Parser.LabeledElementContext ctx) {

    }

    @Override
    public void exitLabeledElement(ANTLRv4Parser.LabeledElementContext ctx) {

    }

    @Override
    public void enterEbnf(ANTLRv4Parser.EbnfContext ctx) {

    }

    @Override
    public void exitEbnf(ANTLRv4Parser.EbnfContext ctx) {

    }

    @Override
    public void enterBlockSuffix(ANTLRv4Parser.BlockSuffixContext ctx) {

    }

    @Override
    public void exitBlockSuffix(ANTLRv4Parser.BlockSuffixContext ctx) {

    }

    @Override
    public void enterEbnfSuffix(ANTLRv4Parser.EbnfSuffixContext ctx) {

    }

    @Override
    public void exitEbnfSuffix(ANTLRv4Parser.EbnfSuffixContext ctx) {

    }

    @Override
    public void enterLexerAtom(ANTLRv4Parser.LexerAtomContext ctx) {

    }

    @Override
    public void exitLexerAtom(ANTLRv4Parser.LexerAtomContext ctx) {

    }

    @Override
    public void enterAtom(ANTLRv4Parser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(ANTLRv4Parser.AtomContext ctx) {

    }

    @Override
    public void enterNotSet(ANTLRv4Parser.NotSetContext ctx) {

    }

    @Override
    public void exitNotSet(ANTLRv4Parser.NotSetContext ctx) {

    }

    @Override
    public void enterBlockSet(ANTLRv4Parser.BlockSetContext ctx) {

    }

    @Override
    public void exitBlockSet(ANTLRv4Parser.BlockSetContext ctx) {

    }

    @Override
    public void enterSetElement(ANTLRv4Parser.SetElementContext ctx) {

    }

    @Override
    public void exitSetElement(ANTLRv4Parser.SetElementContext ctx) {

    }

    @Override
    public void enterBlock(ANTLRv4Parser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(ANTLRv4Parser.BlockContext ctx) {

    }

    @Override
    public void enterRuleref(ANTLRv4Parser.RulerefContext ctx) {

    }

    @Override
    public void exitRuleref(ANTLRv4Parser.RulerefContext ctx) {

    }

    @Override
    public void enterCharacterRange(ANTLRv4Parser.CharacterRangeContext ctx) {

    }

    @Override
    public void exitCharacterRange(ANTLRv4Parser.CharacterRangeContext ctx) {

    }

    @Override
    public void enterTerminal(ANTLRv4Parser.TerminalContext ctx) {

    }

    @Override
    public void exitTerminal(ANTLRv4Parser.TerminalContext ctx) {

    }

    @Override
    public void enterElementOptions(ANTLRv4Parser.ElementOptionsContext ctx) {

    }

    @Override
    public void exitElementOptions(ANTLRv4Parser.ElementOptionsContext ctx) {

    }

    @Override
    public void enterElementOption(ANTLRv4Parser.ElementOptionContext ctx) {

    }

    @Override
    public void exitElementOption(ANTLRv4Parser.ElementOptionContext ctx) {

    }

    @Override
    public void enterIdentifier(ANTLRv4Parser.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(ANTLRv4Parser.IdentifierContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
