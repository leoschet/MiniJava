package miniJava.astree.statement;

import miniJava.astree.*;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class AssStatement implements IStatement {

    public String id;
    public IExpression expr;

    public AssStatement(String id, IExpression expr){
        this.id = id;
        this.expr = expr;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
