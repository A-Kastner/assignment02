package org.softlang.company.antlr;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.softlang.company.antlr.CompanyLexer;
import org.softlang.company.antlr.CompanyParser;
import org.softlang.company.antlr.CompanyParser.CompanyContext;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

class AntlrParser {
	   public static void main(String[] args) {
		   /*
		    * Lots of code for debugging purposes, delete/movie later
		    */
	      System.out.println("Antlr4 Example:");
	      try {
	         /*
	          * get the input file as an InputStream
	          */
	         InputStream inputStream = AntlrParser.class.getResourceAsStream("/sampleCompany.txt");
	       
	         /*
	          * make Lexer
	          */
	         Lexer lexer = new CompanyLexer(CharStreams.fromStream(inputStream));
	         /*
	          * get a TokenStream on the Lexer
	          */
	         TokenStream tokenStream = new CommonTokenStream(lexer);
	         /*
	          * make a Parser on the token stream
	          */
	         CompanyParser parser = new CompanyParser(tokenStream);
	         /*
	          * get the top node of the AST. This corresponds to the topmost rule of Company.g4, "equation"
	          */
	         CompanyContext companyContext = parser.company();
	         System.out.println(companyContext.getText());
	      } catch (Exception e) {
	    	 System.out.println("Antlr Parse fail");
	         e.printStackTrace();
	      }
	      	    
	      

	      
	      System.out.println("Java Parser Example:");
	      try {
	    	  // sampleListener.txt only exists as example here, we need to get CompanyBaseListener.java instead
		      InputStream inputStream2 = AntlrParser.class.getResourceAsStream("/sampleListener.txt");
		      CompilationUnit cu = JavaParser.parse(inputStream2);
		      
		      System.out.println(cu.toString());
		      System.out.println(cu.getChildNodes().get(4).getChildNodes().get(0));
		      
	      } catch (Exception e) {
		     System.out.println("Java Parser fail");
		     e.printStackTrace();
	      } 
	   }
	}
