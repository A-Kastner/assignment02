## Antlr4 Validation

### Introduction

This is a repo for the validation of the generated Java code by ANTLR4.  
It will check the following problems:

#### BaseListener
Did all the parser rules from my grammar get generated into the BaseListener?

#### BaseVisitor
Did all the parser rules from my grammar get a corresponding Visitor?

#### Lexer Validation
Did the interpretation of my grammar get a corresponding Lexer?  
For now only partial validation on this part.


### Usage

1. Put your grammar into the **src/main/antlr/org/softlang** directory.  
2. Invoke the gradle build to generate the ANTLR and Java files
3. Testing  

Don't include headers and you should be good to go.

#### Tests
Tests are being generated dynamically.  
Just run the **Validate Test** and you can see the test results and it's outputs.

### Problems we encountered
A big problem in all software validation, is probably on which layer we shall start?  
This is one of the problems we encountered here. We could try to write our own parser for the ANTLR Grammer to truly validate if all the rules, either from the lexer and the parser, have been generated successfully, but honestly that is a little too meta I'd say. So we have these interpreter files that ANTLR generates for our grammar, these are really usefull when it comes to the part of checking if these rules have been generated into our Java code. Without these we would be in a need of a more complicated way of parsing these rules.  But if we think more deeply into the concept of validation we could ask ourselves if these interpreter files are even valid, but when it comes to this problem we can't easily test them. Therefore this project focuses on valid Java code generation.
