// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g 2015-06-21 15:26:18
package output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DSLLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DSLLexer() {} 
    public DSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g"; }

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:41:8: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:42:5: ( '+' )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:42:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:43:5: ( '-' )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:43:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:44:7: ( '=' )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:44:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:47:9: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:47:11: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:47:11: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:8: ( SYMBOL | ADD | SUB | EQUAL | WS )
        int alt2=5;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '=':
            {
            alt2=4;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:10: SYMBOL
                {
                mSYMBOL(); 


                }
                break;
            case 2 :
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:17: ADD
                {
                mADD(); 


                }
                break;
            case 3 :
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:21: SUB
                {
                mSUB(); 


                }
                break;
            case 4 :
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:25: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 5 :
                // C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\DSL.g:1:31: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}