tree grammar DSLWalker;

options { 
  tokenVocab=DSL;
  ASTLabelType=CommonTree;
  output=AST;
}

tokens{
  RESULT; 
  BLOCK;
}

@header {package output;}




riddle :	exercise exercise exercise exercise exercise exercise;
exercise :      ^(EQUAL ^(ADD block block) block)
                | ^(EQUAL ^(SUB bl1=block bl2=block) bl3=block) -> ^(EQUAL ^(ADD["+"] $bl1 $bl2) $bl3)
;
block : ^(BLOCK SYMBOL+);

