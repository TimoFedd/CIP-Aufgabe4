package de.haw.cip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import output.DSLLexer;
import output.DSLParser;
import output.DSLWalker;
import output.SymbolraetselEmitter;

public class Main {
	private static final String TEMPLATE_FILE = "template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"TestInput.txt"));
		DSLLexer lexer = new DSLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DSLParser parser = new DSLParser(tokens);
		DSLParser.riddle_return result = parser.riddle();
		Tree t = (Tree) result.getTree();
		
		System.out.println("nach dem parsen");
		System.out.println(t.toStringTree());

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		DSLWalker normalizer = new DSLWalker(nodes);
		DSLWalker.riddle_return ast2 = normalizer.riddle();
		CommonTree r2 = ((CommonTree) ast2.getTree());
		
		System.out.println("\n\nnach dem normalisieren");
		System.out.println(r2.toStringTree());


		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
		nodes2.setTokenStream(tokens);
		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);
		InputStream templateIs = Main.class.getClassLoader()
				.getResourceAsStream(TEMPLATE_FILE);

		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
				AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		SymbolraetselEmitter.riddle_return puzzle_return = emitter.riddle();
		String output = puzzle_return.getTemplate().toString();
		System.out.println("\n\nAusgabe:\n");
		System.out.println(output);

		//Java Datei erzeugen
		FileWriter writer;
		File file = new File("src/de/haw/cip/Solution.java");
		
		writer = new FileWriter(file);
		writer.write(output);
		writer.flush();
		writer.close();
		
		//Solution.java compilieren
		String[] args1 = new String[] {"-d", System.getProperty("user.dir"),"src/de/haw/cip/Solution.java"};
		com.sun.tools.javac.Main.compile(args1);
		
		//Ausführen des Rätsels
		//PS: Wenn man z.b. den Rätsel Input ändert, muss man in Eclipse das Project einmal mit F5 Aktualisieren, da Eclipse sonst das alte Rätsel verwendet.
		Solution.main(args1);
	
		
	}
	
	

}
