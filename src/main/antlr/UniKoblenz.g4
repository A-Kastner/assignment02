grammar UniKoblenz;

@header {
package org.softlang;
}

uniKoblenz :
  'Universität Koblenz-Landau' '{'
	'campus' CAMPUS
	faculty*
	employee*
	student*
	wifihotspot*
	mensa
  '}'
  EOF;
  
faculty :
  'faculty' STRING '{'
   'dean' employee
  '}';
  
mensa : '{'
	'menu' MENU
	'}';
  
wifihotspot :
  STRING '{'
    'availability' WIFIAVAILABILITY
    'speed' WIFISPEED
  '}';
  
server : '{'
	'klips' SERVERAVAILABILITY
	'email' SERVERAVAILABILITY
	'}';

student :
  STRING '{'
    'address' STRING
  '}';
  
employee :
  STRING '{'
  	'salary' FLOAT
    'address' STRING
  '}';
  
CAMPUS 				: 'Koblenz'
					| 'Landau';
WIFIAVAILABILITY 	: 'unavailable'
					| 'nonexistent'
					| 'occasionally working';
WIFISPEED			: 'snails pace'
					| 'turtle speed';    
SERVERAVAILABILITY	: 'available'
					| 'not today';
MENU				: 'something';
STRING 				: '"' (~'"')* '"';
FLOAT  				: ('0'..'9')+ ('.' ('0'..'9')+)?;
WS      			: (' '|'\r'? '\n'|'\t')+ {skip();};