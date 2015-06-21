// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g 2015-06-21 15:26:05
package output;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class DSLWalker extends TreeParser {
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


    public DSLWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public DSLWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return DSLWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g"; }


    public static class riddle_return extends TreeRuleReturnScope {
        private CommonTree tree;
        public Object getTree() { return tree; }
		public void setTree(CommonTree tree) {
			this.tree = tree;
		}
    };


    // $ANTLR start "riddle"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:19:1: riddle : exercise exercise exercise exercise exercise exercise ;
    public final DSLWalker.riddle_return riddle() throws RecognitionException {
        DSLWalker.riddle_return retval = new DSLWalker.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        DSLWalker.exercise_return exercise1 =null;

        DSLWalker.exercise_return exercise2 =null;

        DSLWalker.exercise_return exercise3 =null;

        DSLWalker.exercise_return exercise4 =null;

        DSLWalker.exercise_return exercise5 =null;

        DSLWalker.exercise_return exercise6 =null;



        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:19:8: ( exercise exercise exercise exercise exercise exercise )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:19:10: exercise exercise exercise exercise exercise exercise
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle64);
            exercise1=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle66);
            exercise2=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle68);
            exercise3=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle70);
            exercise4=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle72);
            exercise5=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle74);
            exercise6=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise6.getTree());


            }

            retval.setTree((CommonTree)adaptor.rulePostProcessing(root_0));

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
    // $ANTLR end "riddle"


    public static class exercise_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exercise"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:20:1: exercise : ( ^( EQUAL ^( ADD block block ) block ) | ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block ) -> ^( EQUAL ^( ADD[\"+\"] $bl1 $bl2) $bl3) );
    public final DSLWalker.exercise_return exercise() throws RecognitionException {
        DSLWalker.exercise_return retval = new DSLWalker.exercise_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUAL7=null;
        CommonTree ADD8=null;
        CommonTree EQUAL12=null;
        CommonTree SUB13=null;
        DSLWalker.block_return bl1 =null;

        DSLWalker.block_return bl2 =null;

        DSLWalker.block_return bl3 =null;

        DSLWalker.block_return block9 =null;

        DSLWalker.block_return block10 =null;

        DSLWalker.block_return block11 =null;


        CommonTree EQUAL7_tree=null;
        CommonTree ADD8_tree=null;
        CommonTree EQUAL12_tree=null;
        CommonTree SUB13_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQUAL=new RewriteRuleNodeStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:20:10: ( ^( EQUAL ^( ADD block block ) block ) | ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block ) -> ^( EQUAL ^( ADD[\"+\"] $bl1 $bl2) $bl3) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQUAL) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:20:17: ^( EQUAL ^( ADD block block ) block )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUAL7=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_exercise87); 
                    EQUAL7_tree = (CommonTree)adaptor.dupNode(EQUAL7);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUAL7_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD8=(CommonTree)match(input,ADD,FOLLOW_ADD_in_exercise90); 
                    ADD8_tree = (CommonTree)adaptor.dupNode(ADD8);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD8_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise92);
                    block9=block();

                    state._fsp--;

                    adaptor.addChild(root_2, block9.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise94);
                    block10=block();

                    state._fsp--;

                    adaptor.addChild(root_2, block10.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise97);
                    block11=block();

                    state._fsp--;

                    adaptor.addChild(root_1, block11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:21:19: ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUAL12=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_exercise119);  
                    stream_EQUAL.add(EQUAL12);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB13=(CommonTree)match(input,SUB,FOLLOW_SUB_in_exercise122);  
                    stream_SUB.add(SUB13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise126);
                    bl1=block();

                    state._fsp--;

                    stream_block.add(bl1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise130);
                    bl2=block();

                    state._fsp--;

                    stream_block.add(bl2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise135);
                    bl3=block();

                    state._fsp--;

                    stream_block.add(bl3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: bl2, bl1, bl3, EQUAL
                    // token labels: 
                    // rule labels: bl1, bl3, bl2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_bl1=new RewriteRuleSubtreeStream(adaptor,"rule bl1",bl1!=null?bl1.tree:null);
                    RewriteRuleSubtreeStream stream_bl3=new RewriteRuleSubtreeStream(adaptor,"rule bl3",bl3!=null?bl3.tree:null);
                    RewriteRuleSubtreeStream stream_bl2=new RewriteRuleSubtreeStream(adaptor,"rule bl2",bl2!=null?bl2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:65: -> ^( EQUAL ^( ADD[\"+\"] $bl1 $bl2) $bl3)
                    {
                        // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:21:68: ^( EQUAL ^( ADD[\"+\"] $bl1 $bl2) $bl3)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUAL.nextNode()
                        , root_1);

                        // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:21:76: ^( ADD[\"+\"] $bl1 $bl2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_bl1.nextTree());

                        adaptor.addChild(root_2, stream_bl2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_bl3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "exercise"


    public static class block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:23:1: block : ^( BLOCK ( SYMBOL )+ ) ;
    public final DSLWalker.block_return block() throws RecognitionException {
        DSLWalker.block_return retval = new DSLWalker.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK14=null;
        CommonTree SYMBOL15=null;

        CommonTree BLOCK14_tree=null;
        CommonTree SYMBOL15_tree=null;

        try {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:23:7: ( ^( BLOCK ( SYMBOL )+ ) )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:23:9: ^( BLOCK ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BLOCK14=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_block165); 
            BLOCK14_tree = (CommonTree)adaptor.dupNode(BLOCK14);


            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK14_tree, root_1);


            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:23:17: ( SYMBOL )+
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
            	    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSLWalker.g:23:17: SYMBOL
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL15=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_block167); 
            	    SYMBOL15_tree = (CommonTree)adaptor.dupNode(SYMBOL15);


            	    adaptor.addChild(root_1, SYMBOL15_tree);


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
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "block"

    // Delegated rules


 

    public static final BitSet FOLLOW_exercise_in_riddle64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle70 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle72 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_exercise87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_exercise90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_exercise92 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_exercise94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_exercise97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_exercise119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_exercise122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_exercise126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_exercise130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_exercise135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_block167 = new BitSet(new long[]{0x0000000000000408L});

}