package org.softlang.company.antlr;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.softlang.company.Validator;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Validate {
    @TestFactory
    Stream<DynamicTest> antlrTests() {

        File folder = new File("src/main/antlr/org/softlang");
        File[] listOfFiles = folder.listFiles();

        List<String> grammarFiles = Arrays.stream(listOfFiles)
                .map(file -> {
                    if(file.isFile()) return FilenameUtils.removeExtension(file.getName());
                    return null;
                })
                .filter(s -> s != null)
                .collect(Collectors.toList());

        return grammarFiles.stream()
                .map(grammar -> {
                    return DynamicTest.dynamicTest("Testing: " + grammar,
                            () -> {
                                CompilationUnit cu = JavaParser.parse(
                                        new FileInputStream("src/generated/java/org/softlang/"+ grammar + "BaseListener.java"));
                                Parser parser = (Parser) Class.forName("org.softlang."+grammar+"Parser")
                                        .getConstructor(TokenStream.class).newInstance(new Object[] {null});
                                assertTrue(Validator.validateBaseListener(
                                        parser, cu));
                            });
                });
    }
}
