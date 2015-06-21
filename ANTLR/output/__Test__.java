package output;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import output.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        DSLLexer lex = new DSLLexer(new ANTLRFileStream("C:\\Users\\Timo\\Desktop\\cip4\\ANTLR\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        DSLParser parser = new DSLParser(tokens);
        DSLParser.riddle_return r = parser.riddle();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        DSLWalker walker = new DSLWalker(nodes);
        try {
            walker.riddle();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}