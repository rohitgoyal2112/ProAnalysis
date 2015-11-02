import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class myNode{
	int label;
	ParserRuleContext childTree;
	List<myNode> EdgesIn;
	List<myNode> EdgesOut;

	public myNode(int l, ParserRuleContext tree){
		label=l;
		childTree=tree;
		EdgesIn= new ArrayList<myNode>();
		EdgesOut=new ArrayList<myNode>();
	}

}