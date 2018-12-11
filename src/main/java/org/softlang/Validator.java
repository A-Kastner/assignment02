package org.softlang;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.antlr.v4.runtime.*;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

public class Validator {

    public static final String LEXER_RULE_NAME = "rule names:";

    /*
     * Validates that for every Parser-rule name a dedicated enter and exit
     * stub-method was generated in the BaseListener class
     */
    public static boolean validateBaseListener(Parser parser, CompilationUnit cUnit, boolean shallBeMeta) throws IOException {
        System.out.println("Parser rule names:");
        List<String> parserRules;
        if(shallBeMeta){
            parserRules = getParserRulesMeta(parser.getGrammarFileName());
        }
        else {
            parserRules = Arrays.asList(parser.getRuleNames());
        }
        List<String> expectedParserRules = new ArrayList<>();
        parserRules.stream().map(s -> {
            String sUpper = s.substring(0, 1).toUpperCase() + s.substring(1);
            expectedParserRules.add("enter" + sUpper);
            expectedParserRules.add("exit" + sUpper);
            return s;
        }).forEach(System.out::println);

        System.out.println("\nExpected methods:");
        expectedParserRules.stream().forEach(System.out::println);

        // Find the <Name>BaseListener in the JavaParser AST
        Optional<ClassOrInterfaceDeclaration> baseListener
                = cUnit.getClassByName(parser.getGrammarFileName().substring(0, parser.getGrammarFileName().lastIndexOf(".")) + "BaseListener");

        // Extract all method names from the BaseListener (if present)
        if (baseListener.isPresent()) {
            List<String> methods = baseListener.get().getChildNodes().stream()
                    .filter(n -> n instanceof MethodDeclaration)
                    .map(n -> ((MethodDeclaration) n).getNameAsString())
                    .collect(Collectors.toList());
            System.out.println("\nExtracted methods:");
            methods.stream().forEach(System.out::println);
            return expectedParserRules.stream().allMatch(s -> methods.contains(s));
        }
        return false;
    }

    private static List<String> getParserRulesMeta(String grammarName) throws IOException {
        ANTLRv4Lexer lexer = new ANTLRv4Lexer(CharStreams.fromFileName("src/main/antlr/"+ grammarName));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        List<String> ruleNames = new ArrayList<>();
        treeWalker.walk(new ANTLR4Listener(ruleName -> ruleNames.add(ruleName)), parser.grammarSpec());
        return ruleNames;
    }

    public static boolean validateBaseVisitor(Parser parser, CompilationUnit cUnit) {
        System.out.println("Parser rule names:");
        List<String> expectedParserRules = new ArrayList<>();
        Arrays.stream(parser.getRuleNames()).map(s -> {
            String sUpper = s.substring(0, 1).toUpperCase() + s.substring(1);
            expectedParserRules.add("visit" + sUpper);
            return s;
        }).forEach(System.out::println);

        System.out.println("\nExpected methods:");
        expectedParserRules.stream().forEach(System.out::println);

        // Find the <Name>BaseVisitor in the JavaParser AST
        Optional<ClassOrInterfaceDeclaration> baseVisitor
                = cUnit.getClassByName(parser.getGrammarFileName().substring(0, parser.getGrammarFileName().lastIndexOf(".")) + "BaseVisitor");

        // Extract all method names from the BaseListener (if present)
        if (baseVisitor.isPresent()) {
            List<String> methods = baseVisitor.get().getChildNodes().stream()
                    .filter(n -> n instanceof MethodDeclaration)
                    .map(n -> ((MethodDeclaration) n).getNameAsString())
                    .collect(Collectors.toList());
            System.out.println("\nExtracted methods:");
            methods.stream().forEach(System.out::println);
            return expectedParserRules.stream().allMatch(s -> methods.contains(s));
        }
        return false;
    }

    public static boolean validateLexer(String grammarName, CompilationUnit cUnit) throws IOException {
        List<String> interp = FileUtils.readLines(new File("src/generated/java/org/softlang/" + grammarName + "Lexer.interp"), StandardCharsets.UTF_8);
        int startIndex = IntStream.range(0, interp.size()).filter(value -> LEXER_RULE_NAME.equals(interp.get(value))).findFirst().getAsInt();
        int endIndex = IntStream.range(startIndex, interp.size()).filter(value -> "".equals(interp.get(value))).findFirst().getAsInt();

        List<String> ruleNames = interp.subList(startIndex + 1, endIndex);
        System.out.println("\nExtracted lexer rule names from lexer interpreter:");
        ruleNames.stream().forEach(System.out::println);

        List<String> expectedRuleNames = IntStream.range(1, ruleNames.size() + 1).mapToObj(i -> ruleNames.get(i - 1) + " = " + i).collect(Collectors.toList());
        System.out.println("\nExpected variables:");
        expectedRuleNames.stream().forEach(System.out::println);

        // Find the <Name>Lexer in the JavaParser AST
        Optional<ClassOrInterfaceDeclaration> lexer
                = cUnit.getClassByName(grammarName + "Lexer");
        if (lexer.isPresent()) {
            String lexerVariables = lexer.get().getMember(3).toString();
            System.out.println("\nActual variables:\n" + lexerVariables);
            return expectedRuleNames.stream().allMatch(lexerVariables::contains);
        }
        return false;
    }

}
