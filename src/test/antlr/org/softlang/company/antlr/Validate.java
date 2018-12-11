package org.softlang.company.antlr;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.softlang.Validator;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Validate {

    public static final String BASE_LISTENER = "BaseListener.java";
    public static final String BASE_VISITOR = "BaseVisitor.java";
    public static final String PARSER = "Parser";
    public static final String LEXER = "Lexer.java";

    File folder = new File(Validator.BASE_PATH);
    File[] listOfFiles = folder.listFiles();

    @TestFactory
    Stream<DynamicTest> antlrTests() {

        File folder = new File("src/main/antlr/");
        File[] listOfFiles = folder.listFiles();

        List<String> grammarFiles = Arrays.stream(listOfFiles)
                .map(file -> {
                    if (isPartOfMeta(file.getName())) return null;
                    if (file.isFile()) return FilenameUtils.removeExtension(file.getName());
                    return null;
                })
                .filter(s -> s != null)
                .collect(Collectors.toList());

        Stream<DynamicTest> baseListenerMeta = grammarFiles.stream()
                .map(grammar -> {
                    return DynamicTest.dynamicTest("Testing BaseListener META: " + grammar,
                            () -> {
                                CompilationUnit cu = JavaParser.parse(
                                        new FileInputStream(Validator.BASE_PATH + grammar + BASE_LISTENER));
                                Parser parser = (Parser) Class.forName(grammar + PARSER)
                                        .getConstructor(TokenStream.class).newInstance(new Object[]{null});
                                assertTrue(Validator.validateBaseListener(
                                        parser, cu, true));
                            });
                });

        Stream<DynamicTest> baseListener = grammarFiles.stream()
                .map(grammar -> {
                    return DynamicTest.dynamicTest("Testing BaseListener: " + grammar,
                            () -> {
                                CompilationUnit cu = JavaParser.parse(
                                        new FileInputStream(Validator.BASE_PATH + grammar + BASE_LISTENER));
                                Parser parser = (Parser) Class.forName(grammar + PARSER)
                                        .getConstructor(TokenStream.class).newInstance(new Object[]{null});
                                assertTrue(Validator.validateBaseListener(
                                        parser, cu, false));
                            });
                });

        Stream<DynamicTest> baseVisitor = grammarFiles.stream()
                .map(grammar -> {
                    return DynamicTest.dynamicTest("Testing BaseVisitor: " + grammar,
                            () -> {
                                CompilationUnit cu = JavaParser.parse(
                                        new FileInputStream(Validator.BASE_PATH + grammar + BASE_VISITOR));
                                Parser parser = (Parser) Class.forName(grammar + PARSER)
                                        .getConstructor(TokenStream.class).newInstance(new Object[]{null});
                                assertTrue(Validator.validateBaseVisitor(
                                        parser, cu));
                            });
                });

        Stream<DynamicTest> lexer = grammarFiles.stream()
                .map(grammar -> {
                    return DynamicTest.dynamicTest("Testing Lexer: " + grammar,
                            () -> {
                                CompilationUnit cu = JavaParser.parse(
                                        new FileInputStream(Validator.BASE_PATH + grammar + LEXER));
                                assertTrue(Validator.validateLexer(
                                        grammar, cu));
                            });
                });

        return Stream.of(baseListenerMeta, baseListener, baseVisitor, lexer).reduce(Stream::concat)
                .orElseGet(Stream::empty);
    }

    private boolean isPartOfMeta(String name) {
        return (name.equals("ANTLRv4Lexer.g4") || name.equals("ANTLRv4Parser.g4") || name.equals("LexBasic.g4"));
    }

}
