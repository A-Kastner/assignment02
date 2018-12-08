package org.softlang.company.antlr;

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
	 * stub-method was generated in the CompanyBaseListener class
	 */
	public static boolean validateBaseListener(Parser parser, CompilationUnit cUnit ) {	
	       System.out.println("Parser rule names:");
	       Arrays.stream(parser.getRuleNames()).forEach(System.out::println);
		   
		   // Find the BaseListener in the JavaParser AST
		   Optional<ClassOrInterfaceDeclaration> baseListener = cUnit.findAll(ClassOrInterfaceDeclaration.class).stream()
				   .filter(c -> c.getNameAsString().contains("BaseListener"))
				   .findFirst();
		   // Extract all method names from the BaseListener (if present)
		   if (baseListener.isPresent()) {
			   List<String> methods = baseListener.get().getChildNodes().stream()
					   .filter(n -> n instanceof MethodDeclaration)
					   .map(n -> ((MethodDeclaration) n).getNameAsString())
					   .collect(Collectors.toList());
			   System.out.println("\nExtracted method names");
			   methods.stream().forEach(System.out::println);
			   
			   // ....
		   }
		   return false;		   
	   }
}
