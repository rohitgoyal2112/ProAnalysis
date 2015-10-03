

import org.antlr.runtime.*;  
import org.antlr.runtime.tree.*;  

public class Main {

  public static void main(String args[]) throws Exception {
    TheLangLexer lex = new TheLangLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    TheLangParser parser = new TheLangParser(tokens);

    try {
      TheLangParser.program_return parserResult = parser.program();
      if (parserResult != null) {
        CommonTree tree = (CommonTree) parserResult.tree;
        //System.out.println(tree.getFirstChild());
        DOTTreeGenerator gen = new DOTTreeGenerator();  
    //StringTemplate st = gen.toDOT(tree);  
    System.out.println(gen.toDOT(tree));
      }
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
}
