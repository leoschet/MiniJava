package miniJava.astree.statement;

import miniJava.astree.*;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class WhileStatement implements IStatement {

    public IExpression expr;
    public IStatement stmt;

    public WhileStatement(IExpression expr, IStatement stmt){
        this.expr = expr;
        this.stmt = stmt;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
