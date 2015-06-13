// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g 2015-06-13 21:51:09
package output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class DSLParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DSLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DSLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return DSLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g"; }


    public static class riddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:21:1: riddle : opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22) ;
    public final DSLParser.riddle_return riddle() throws RecognitionException {
        DSLParser.riddle_return retval = new DSLParser.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal1=null;
        Token char_literal2=null;
        Token EQUAL3=null;
        Token EQUAL4=null;
        Token EQUAL5=null;
        Token char_literal6=null;
        Token EOF7=null;
        DSLParser.block_return opr00 =null;

        DSLParser.op_return op1 =null;

        DSLParser.block_return opr01 =null;

        DSLParser.block_return opr02 =null;

        DSLParser.op_return op2 =null;

        DSLParser.op_return op3 =null;

        DSLParser.op_return op4 =null;

        DSLParser.block_return opr10 =null;

        DSLParser.op_return op5 =null;

        DSLParser.block_return opr11 =null;

        DSLParser.block_return opr12 =null;

        DSLParser.block_return opr20 =null;

        DSLParser.op_return op6 =null;

        DSLParser.block_return opr21 =null;

        DSLParser.block_return opr22 =null;


        CommonTree char_literal1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree EQUAL3_tree=null;
        CommonTree EQUAL4_tree=null;
        CommonTree EQUAL5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree EOF7_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:21:8: (opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22) )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:21:10: opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF
            {
            pushFollow(FOLLOW_block_in_riddle71);
            opr00=block();

            state._fsp--;

            stream_block.add(opr00.getTree());

            pushFollow(FOLLOW_op_in_riddle76);
            op1=op();

            state._fsp--;

            stream_op.add(op1.getTree());

            pushFollow(FOLLOW_block_in_riddle80);
            opr01=block();

            state._fsp--;

            stream_block.add(opr01.getTree());

            char_literal1=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle82);  
            stream_EQUAL.add(char_literal1);


            pushFollow(FOLLOW_block_in_riddle86);
            opr02=block();

            state._fsp--;

            stream_block.add(opr02.getTree());

            pushFollow(FOLLOW_op_in_riddle93);
            op2=op();

            state._fsp--;

            stream_op.add(op2.getTree());

            pushFollow(FOLLOW_op_in_riddle97);
            op3=op();

            state._fsp--;

            stream_op.add(op3.getTree());

            pushFollow(FOLLOW_op_in_riddle103);
            op4=op();

            state._fsp--;

            stream_op.add(op4.getTree());

            pushFollow(FOLLOW_block_in_riddle110);
            opr10=block();

            state._fsp--;

            stream_block.add(opr10.getTree());

            pushFollow(FOLLOW_op_in_riddle115);
            op5=op();

            state._fsp--;

            stream_op.add(op5.getTree());

            pushFollow(FOLLOW_block_in_riddle119);
            opr11=block();

            state._fsp--;

            stream_block.add(opr11.getTree());

            char_literal2=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle121);  
            stream_EQUAL.add(char_literal2);


            pushFollow(FOLLOW_block_in_riddle125);
            opr12=block();

            state._fsp--;

            stream_block.add(opr12.getTree());

            EQUAL3=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle131);  
            stream_EQUAL.add(EQUAL3);


            EQUAL4=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle140);  
            stream_EQUAL.add(EQUAL4);


            EQUAL5=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle150);  
            stream_EQUAL.add(EQUAL5);


            pushFollow(FOLLOW_block_in_riddle156);
            opr20=block();

            state._fsp--;

            stream_block.add(opr20.getTree());

            pushFollow(FOLLOW_op_in_riddle161);
            op6=op();

            state._fsp--;

            stream_op.add(op6.getTree());

            pushFollow(FOLLOW_block_in_riddle165);
            opr21=block();

            state._fsp--;

            stream_block.add(opr21.getTree());

            char_literal6=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle167);  
            stream_EQUAL.add(char_literal6);


            pushFollow(FOLLOW_block_in_riddle171);
            opr22=block();

            state._fsp--;

            stream_block.add(opr22.getTree());

            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_riddle176);  
            stream_EOF.add(EOF7);


            // AST REWRITE
            // elements: op4, opr22, opr01, opr10, opr02, opr12, op6, opr20, op3, opr21, op1, EQUAL, opr11, EQUAL, opr12, opr10, opr01, EQUAL, opr21, EQUAL, opr22, opr11, opr02, opr00, op5, op2, opr00, opr20, EQUAL, EQUAL
            // token labels: 
            // rule labels: opr10, opr21, opr22, opr11, opr00, opr01, opr12, opr02, retval, op2, op1, op4, op3, op6, op5, opr20
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_opr10=new RewriteRuleSubtreeStream(adaptor,"rule opr10",opr10!=null?opr10.tree:null);
            RewriteRuleSubtreeStream stream_opr21=new RewriteRuleSubtreeStream(adaptor,"rule opr21",opr21!=null?opr21.tree:null);
            RewriteRuleSubtreeStream stream_opr22=new RewriteRuleSubtreeStream(adaptor,"rule opr22",opr22!=null?opr22.tree:null);
            RewriteRuleSubtreeStream stream_opr11=new RewriteRuleSubtreeStream(adaptor,"rule opr11",opr11!=null?opr11.tree:null);
            RewriteRuleSubtreeStream stream_opr00=new RewriteRuleSubtreeStream(adaptor,"rule opr00",opr00!=null?opr00.tree:null);
            RewriteRuleSubtreeStream stream_opr01=new RewriteRuleSubtreeStream(adaptor,"rule opr01",opr01!=null?opr01.tree:null);
            RewriteRuleSubtreeStream stream_opr12=new RewriteRuleSubtreeStream(adaptor,"rule opr12",opr12!=null?opr12.tree:null);
            RewriteRuleSubtreeStream stream_opr02=new RewriteRuleSubtreeStream(adaptor,"rule opr02",opr02!=null?opr02.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.tree:null);
            RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
            RewriteRuleSubtreeStream stream_op4=new RewriteRuleSubtreeStream(adaptor,"rule op4",op4!=null?op4.tree:null);
            RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);
            RewriteRuleSubtreeStream stream_op6=new RewriteRuleSubtreeStream(adaptor,"rule op6",op6!=null?op6.tree:null);
            RewriteRuleSubtreeStream stream_op5=new RewriteRuleSubtreeStream(adaptor,"rule op5",op5!=null?op5.tree:null);
            RewriteRuleSubtreeStream stream_opr20=new RewriteRuleSubtreeStream(adaptor,"rule opr20",opr20!=null?opr20.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:3: -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22)
            {
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:29:4: ^( EQUAL ^( $op1 $opr00 $opr01) $opr02)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:29:12: ^( $op1 $opr00 $opr01)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr00.nextTree());

                adaptor.addChild(root_2, stream_opr01.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr02.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:30:4: ^( EQUAL ^( $op5 $opr10 $opr11) $opr12)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:30:12: ^( $op5 $opr10 $opr11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op5.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr10.nextTree());

                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr12.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:31:4: ^( EQUAL ^( $op6 $opr20 $opr21) $opr22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:31:12: ^( $op6 $opr20 $opr21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op6.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr20.nextTree());

                adaptor.addChild(root_2, stream_opr21.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr22.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:32:4: ^( EQUAL ^( $op2 $opr00 $opr10) $opr20)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:32:12: ^( $op2 $opr00 $opr10)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr00.nextTree());

                adaptor.addChild(root_2, stream_opr10.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr20.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:33:4: ^( EQUAL ^( $op3 $opr01 $opr11) $opr21)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:33:12: ^( $op3 $opr01 $opr11)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr01.nextTree());

                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr21.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:34:4: ^( EQUAL ^( $op4 $opr02 $opr12) $opr22)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:34:12: ^( $op4 $opr02 $opr12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op4.nextNode(), root_2);

                adaptor.addChild(root_2, stream_opr02.nextTree());

                adaptor.addChild(root_2, stream_opr12.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_opr22.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "riddle"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:1: block : ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) ;
    public final DSLParser.block_return block() throws RecognitionException {
        DSLParser.block_return retval = new DSLParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SYMBOL8=null;

        CommonTree SYMBOL8_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:7: ( ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:10: ( SYMBOL )+
            {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:10: ( SYMBOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:10: SYMBOL
            	    {
            	    SYMBOL8=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_block320);  
            	    stream_SYMBOL.add(SYMBOL8);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:19: -> ^( BLOCK ( SYMBOL )+ )
            {
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:38:22: ^( BLOCK ( SYMBOL )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SYMBOL.nextNode()
                    );

                }
                stream_SYMBOL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:39:1: op : ( ADD | SUB );
    public final DSLParser.op_return op() throws RecognitionException {
        DSLParser.op_return retval = new DSLParser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:39:4: ( ADD | SUB )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set9=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set9)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_riddle71 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle76 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle80 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle82 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle86 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle93 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle97 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle110 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle115 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle125 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle156 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_riddle161 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle167 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_riddle171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_riddle176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_block320 = new BitSet(new long[]{0x0000000000000402L});

}