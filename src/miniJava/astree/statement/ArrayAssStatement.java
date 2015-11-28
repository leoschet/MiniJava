package miniJava.astree.statement;

import miniJava.astree.*;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ArrayAssStatement implements IStatement {

    public String id;
    public IExpression expr;
    public IExpression assExpr;

    public ArrayAssStatement(String id, IExpression expr, IExpression assExpr){
        this.id = id;
        this.expr = expr;
        this.assExpr = assExpr;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
