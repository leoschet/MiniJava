package miniJava.astree.statement;

import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class WhileStatement implements INode {

    Expression expr;
    Statement stmt;

    public WhileStatement(Expression expr, Statement stmt){
        this.expr = expr;
        this.stmt = stmt;
    }
}
