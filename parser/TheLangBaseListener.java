// Generated from TheLang.g4 by ANTLR 4.5.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

/**
 * This class provides an empty implementation of {@link TheLangListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class TheLangBaseListener implements TheLangListener {
	int label=1;
	List<myNode> lastNodes;
	myNode tempLastNode;
	List<myNode> allNodes;
	List<Integer> allLabels;
	List<String> allEdges;
	Stack<myNode> condStack;
	Stack<myNode> whileCondStack;
	int state;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public TheLangBaseListener(){
		lastNodes=new ArrayList<myNode>();
		allLabels=new ArrayList<Integer>();
		allNodes=new ArrayList<myNode>();
		allEdges=new ArrayList<String>();
		condStack=new Stack<myNode>(); //1 for if, 2 for else, 0 otherwise
		whileCondStack=new Stack<myNode>();
		state=0;

	}
	@Override public void enterAexpr(TheLangParser.AexprContext ctx) { 
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAexpr(TheLangParser.AexprContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAexpr1(TheLangParser.Aexpr1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAexpr1(TheLangParser.Aexpr1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAexpr2(TheLangParser.Aexpr2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAexpr2(TheLangParser.Aexpr2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAexpr3(TheLangParser.Aexpr3Context ctx) { 
	//System.out.println("Got terminal, assigning children to stack top"+ ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAexpr3(TheLangParser.Aexpr3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBexpr(TheLangParser.BexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBexpr(TheLangParser.BexprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBexpr1(TheLangParser.Bexpr1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBexpr1(TheLangParser.Bexpr1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBexpr2(TheLangParser.Bexpr2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBexpr2(TheLangParser.Bexpr2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOpr(TheLangParser.OprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOpr(TheLangParser.OprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDecl(TheLangParser.DeclContext ctx) { 
		makeNode(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDecl(TheLangParser.DeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLevel(TheLangParser.LevelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLevel(TheLangParser.LevelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt(TheLangParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt(TheLangParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignStmt(TheLangParser.AssignStmtContext ctx) { 
		makeNode(ctx);
		
}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignStmt(TheLangParser.AssignStmtContext ctx) { 
	

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSkipStmt(TheLangParser.SkipStmtContext ctx) { 
		makeNode(ctx);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSkipStmt(TheLangParser.SkipStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReadStmt(TheLangParser.ReadStmtContext ctx) { 
		makeNode(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReadStmt(TheLangParser.ReadStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWriteStmt(TheLangParser.WriteStmtContext ctx) { 

		makeNode(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWriteStmt(TheLangParser.WriteStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStmt(TheLangParser.IfStmtContext ctx) { 
		state=1;
		myNode node= new myNode(label++,(ParserRuleContext)ctx.getChild(1));
		allNodes.add(node);
		allLabels.add(label);
		if(lastNodes.size()>0) {
			for(int i =0;i<=lastNodes.size()-1;i++){
				lastNodes.get(i).EdgesOut.add(node);
				node.EdgesIn.add(lastNodes.get(i));
				allEdges.add(lastNodes.get(i).label+"->"+node.label);
			}
		lastNodes.clear();
		}
		else if(tempLastNode!=null){
			tempLastNode.EdgesOut.add(node);
			node.EdgesIn.add(tempLastNode);
			allEdges.add(tempLastNode.label+"->"+node.label);
		}
		tempLastNode=node;
		condStack.push(node);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStmt(TheLangParser.IfStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileStmt(TheLangParser.WhileStmtContext ctx) { 
		myNode node= new myNode(label++,(ParserRuleContext)ctx.getChild(1));
		allNodes.add(node);
		allLabels.add(label);
		if(lastNodes.size()>0) {
			for(int i =0;i<=lastNodes.size()-1;i++){
				lastNodes.get(i).EdgesOut.add(node);
				node.EdgesIn.add(lastNodes.get(i));
				allEdges.add(lastNodes.get(i).label+"->"+node.label);
			}
			lastNodes.clear();
		}
		
		lastNodes.add(node);
		whileCondStack.push(node);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileStmt(TheLangParser.WhileStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(TheLangParser.ProgramContext ctx) {
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(TheLangParser.ProgramContext ctx) {
				System.out.println("Label definitions: ");
				for(int i=0;i<=allNodes.size()-1;i++){
					System.out.println("Label "+ allNodes.get(i).label+"  "+ allNodes.get(i).childTree.getText());
				} 
				System.out.println("Flow Graph: ");
				System.out.println(allEdges);

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) {
		int token=  node.getSymbol().getType();
		if(token==25){//else
			state=2;
			lastNodes.add(tempLastNode);
			tempLastNode=condStack.pop();
		}
		else if(token==26){//fi
			if(condStack.size()>0){
				state=1;
				lastNodes.add(tempLastNode);
				tempLastNode=null;
				
			}
			else {
				state=0;
				lastNodes.add(tempLastNode);
				tempLastNode=null;
			}
		}
		// token od
		else if(token==29){
			myNode tempNode=whileCondStack.pop();
			if(lastNodes.size()>0) {
			for(int i =0;i<=lastNodes.size()-1;i++){
				lastNodes.get(i).EdgesOut.add(tempNode);
				tempNode.EdgesIn.add(lastNodes.get(i));
				allEdges.add(lastNodes.get(i).label+"->"+tempNode.label);
			}
			lastNodes.clear();
			lastNodes.add(tempNode);
		}

		}	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

	public void makeNode(ParserRuleContext ctx){
		if(state==1){
			myNode node= new myNode(label++,ctx);
			allNodes.add(node);
			allLabels.add(label);
			if (tempLastNode==null) {
				if(lastNodes.size()>0) {
				for(int i =0;i<=lastNodes.size()-1;i++){
					lastNodes.get(i).EdgesOut.add(node);
					node.EdgesIn.add(lastNodes.get(i));
					allEdges.add(lastNodes.get(i).label+"->"+node.label);
				}
			}
			lastNodes.clear();
			tempLastNode=node;
			}
			else {
			tempLastNode.EdgesOut.add(node);	
			node.EdgesIn.add(tempLastNode);
			allEdges.add(tempLastNode.label+"->"+node.label);
			tempLastNode=node;
			}
		}
		else if(state==2){
			myNode node= new myNode(label++,ctx);
			allNodes.add(node);
			allLabels.add(label);
			tempLastNode.EdgesOut.add(node);	
			node.EdgesIn.add(tempLastNode);
			allEdges.add(tempLastNode.label+"->"+node.label);
			tempLastNode=node;

		}
		else if(state==0){
			myNode node= new myNode(label++,ctx);
			allNodes.add(node);
			allLabels.add(label);
			if(lastNodes.size()>0) {
				for(int i =0;i<=lastNodes.size()-1;i++){
					lastNodes.get(i).EdgesOut.add(node);
					node.EdgesIn.add(lastNodes.get(i));
					allEdges.add(lastNodes.get(i).label+"->"+node.label);
				}
			}
			lastNodes.clear();
			lastNodes.add(node);

		}
	}
}