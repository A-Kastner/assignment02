package com.khubla.antlr4example;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import com.khubla.antlr4example.CompanyLexer;
import com.khubla.antlr4example.CompanyParser;
import com.khubla.antlr4example.CompanyParser.CompanyContext;

class Main {
   public static void main(String[] args) {
      System.out.println("Antlr4 Example");
      try {
         /*
          * get the input file as an InputStream
          */
         InputStream inputStream = Main.class.getResourceAsStream("/sampleCompany.txt");
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
          * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
          */
         CompanyContext companyContext = parser.company();
         System.out.println(companyContext.getText());
      } catch (IOException e) {
    	 System.out.println("Epic Fail");
         e.printStackTrace();
      }
   }
}