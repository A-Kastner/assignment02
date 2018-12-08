package org.softlang.company.antlr;

import java.io.FileInputStream;
import java.io.InputStream;

import org.softlang.CompanyParser;
import org.softlang.CountParser;
import org.softlang.company.Validator;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;



class AntlrParser {
	   public static void main(String[] args) {
		   /*
		    * Lots of code for debugging purposes, delete/move later
		    */
	      try {	    	  
	    	 // Create antlr parser
	         CompanyParser companyParser = new CompanyParser(null);
	         CountParser countParser = new CountParser(null);
	         System.out.println();
	         	         	       
	    	 // TODO: Get the generated CompanyBaseListener.java and delete sampleListener.txt
		     		    
		     // Create
		     CompilationUnit cu = JavaParser.parse(new FileInputStream("src/generated/java/org/softlang/CompanyBaseListener.java"));
		     //CompilationUnit cu2 = JavaParser.parse(i2);
		     		    
		     // Validate
		     System.out.println("Result: " + Validator.validateBaseListener(companyParser, cu) + "\n---------------");
		     //System.out.println("Result: " + Validator.validateBaseListener(countParser, cu2));
	         
	      } catch (Exception e) {
	    	 System.out.println("Antlr Parse fail");
	         e.printStackTrace();	     
	      }    
	   }	   
	}
