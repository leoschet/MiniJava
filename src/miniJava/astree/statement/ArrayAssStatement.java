package miniJava.astree.statement;

import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ArrayAssStatement implements INode {

    String id;
    Expression expr;
    Expression assExpr;

    public ArrayAssStatement(String id, Expression expr, Expression assExpr){
        this.id = id;
        this.expr = expr;
        this.assExpr = assExpr;
    }
}
