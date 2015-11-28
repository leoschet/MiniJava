package miniJava.astree.statement;

import miniJava.astree.*;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class SysoStatement implements IStatement {

    public IExpression expr;

    public SysoStatement(IExpression expr){
        this.expr = expr;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
