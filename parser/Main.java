

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

  public static void main(String args[]) throws Exception {

  TheLangLexer lex = new TheLangLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    TheLangParser parser = new TheLangParser(tokens);

    try {
      //TheLangParser.program_return parserResult = parser.program();
      ParserRuleContext tree = parser.program();
      /*if (parserResult != null) {
        CommonTree tree = (CommonTree) parserResult.tree;
        //System.out.println(tree.getFirstChild());
        System.out.println(tree.toStringTree());*/
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        TheLangBaseListener extractor = new TheLangBaseListener();
        walker.walk(extractor, tree);
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
}
