package miniJava.astree.statement;

import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class IfElseStatement implements INode {

    Expression expr;
    Statement ifStmt;
    Statement elseStmt;

    public IfElseStatement(Expression expr, Statement ifStmt, Statement elseStmt){
        this.expr = expr;
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
    }
}
