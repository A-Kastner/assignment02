package org.softlang.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.Parser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

public class Validator {

	/*
	 * Validates that for every Parser-rule name a dedicated enter and exit
	 * stub-method was generated in the BaseListener class
	 */
	public static boolean validateBaseListener(Parser parser, CompilationUnit cUnit ) {
	       System.out.println("Parser rule names:");
	       List<String> expectedParserRules = new ArrayList<>();
	       Arrays.stream(parser.getRuleNames()).map(s -> {
	           String sUpper = s.substring(0, 1).toUpperCase() + s.substring(1);
	           expectedParserRules.add("enter"+sUpper);
	           expectedParserRules.add("exit"+sUpper);
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

	public static boolean validateBaseVisitor(Parser parser, CompilationUnit cUnit) {
	       System.out.println("Parser rule names:");
	       List<String> expectedParserRules = new ArrayList<>();
	       Arrays.stream(parser.getRuleNames()).map(s -> {
	           String sUpper = s.substring(0, 1).toUpperCase() + s.substring(1);
	           expectedParserRules.add("visit"+sUpper);
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

}
