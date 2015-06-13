grammar DSL;

options { 
  ASTLabelType=CommonTree;
  output=AST;
}



tokens{
  RESULT; 
  BLOCK;
}

@header {package output;}
@lexer::header {package output;}



riddle	:	opr00=block  op1=op opr01=block '=' opr02=block 
		op2=op op3=op   op4=op 
		opr10=block  op5=op opr11=block '=' opr12=block 
		 EQUAL        EQUAL         EQUAL
		opr20=block  op6=op opr21=block '=' opr22=block 
		EOF

		->
			^(EQUAL ^($op1 $opr00 $opr01) $opr02)
			^(EQUAL ^($op5 $opr10 $opr11) $opr12)
			^(EQUAL ^($op6 $opr20 $opr21) $opr22)
			^(EQUAL ^($op2 $opr00 $opr10) $opr20)
			^(EQUAL ^($op3 $opr01 $opr11) $opr21)
			^(EQUAL ^($op4 $opr02 $opr12) $opr22)
	; 


block	: 	SYMBOL+  -> ^(BLOCK SYMBOL+);
op	:	ADD | SUB;

SYMBOL	:	('A'..'Z');
ADD	:	'+';
SUB	:	'-';
EQUAL	: 	'=';


WS      :	(' '|'\t'|'\f'|'\n'|'\r')+{ $channel=HIDDEN; };