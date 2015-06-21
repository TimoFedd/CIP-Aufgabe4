tree grammar SymbolraetselEmitter;

options {
  tokenVocab   = DSL;
  output       = template;
  ASTLabelType = CommonTree;
}

  
@header {
package output;
import de.haw.cip.Number;
import de.haw.cip.Constraint;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
}

@members {
Set<Character> symbols = new HashSet<Character>();
}

riddle
  :
  constraints+=constraint*
  -> sums(symbols={symbols}, sums={$constraints})
  ;



constraint
@after {
Constraint constraint = new Constraint();
constraint.numbers.add($n1.number);
constraint.numbers.add($n2.number);
constraint.numbers.add($n3.number);
constraint.prepare();
}
  :
  ^(
    EQUAL
    ^(ADD n1=number n2=number) n3=number
   )
   -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
  ;

number returns [Number number]
@after {
$number = new Number();
$number.setDigits($syms);
symbols.addAll($number.getCharacters());  //Füge Symbole dem HashSet hinzu
}
  :
  ^(BLOCK syms+=SYMBOL+)
  ;
