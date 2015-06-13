// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g 2015-06-13 21:39:26

package output;
import de.haw.cip.Constraint;
import de.haw.cip.Number;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BLOCK", "EQUAL", "PUZZLE", "RESULT", "SUB", "SYMBOL", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK=5;
    public static final int EQUAL=6;
    public static final int PUZZLE=7;
    public static final int RESULT=8;
    public static final int SUB=9;
    public static final int SYMBOL=10;
    public static final int WS=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:17:1: puzzle : ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:18:3: ( ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints))
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:19:3: ^( PUZZLE (constraints+= constraint )* )
            {
            match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle66); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:19:23: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQUAL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:19:23: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_puzzle70);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 20:3: -> sums(sums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("sums", list_constraints));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:25:1: constraint : ^( EQUAL ^( ADD n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:33:3: ( ^( EQUAL ^( ADD n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:34:3: ^( EQUAL ^( ADD n1= number n2= number ) n3= number )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_constraint111); 

            match(input, Token.DOWN, null); 
            match(input,ADD,FOLLOW_ADD_in_constraint118); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint122);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint126);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint135);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 39:4: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            Constraint constraint = new Constraint();
            constraint.numbers.add((n1!=null?n1.number:null));
            constraint.numbers.add((n2!=null?n2.number:null));
            constraint.numbers.add((n3!=null?n3.number:null));
            constraint.prepare();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:42:1: number returns [Number number] : ^( BLOCK (syms+= SYMBOL )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:47:3: ( ^( BLOCK (syms+= SYMBOL )+ ) )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:48:3: ^( BLOCK (syms+= SYMBOL )+ )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_number187); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:48:15: (syms+= SYMBOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\SymbolraetselEmitter.g:48:15: syms+= SYMBOL
            	    {
            	    syms=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number191); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 


            }


            retval.number = new Number();
            retval.number.setDigits(list_syms);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_PUZZLE_in_puzzle66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle70 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_EQUAL_in_constraint111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_constraint118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_number_in_constraint126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_number187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_number191 = new BitSet(new long[]{0x0000000000000408L});

}