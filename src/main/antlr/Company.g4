grammar Company;

@members {
public double total = 0;
}

@header {
package org.softlang;
}

company :
  'company' STRING '{' department* '}' EOF;

department :
  'department' STRING '{'
    'manager' employee
    ('employee' employee)*
    department*
  '}';

employee :
  STRING '{'
    'address' STRING
    'salary' FLOAT
    { total += Double.parseDouble($FLOAT.text); }
  '}';

STRING  :   '"' (~'"')* '"';
FLOAT   :   ('0'..'9')+ ('.' ('0'..'9')+)?;
WS      :   (' '|'\r'? '\n'|'\t')+ {skip();};