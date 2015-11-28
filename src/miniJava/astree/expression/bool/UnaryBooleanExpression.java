package miniJava.astree.expression.bool;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class UnaryBooleanExpression implements IExpression {
    public Operator op;
    public IExpression expr;

    public UnaryBooleanExpression(Operator op, IExpression expr) {
        this.op = op;
        this.expr = expr;
    }

    public enum Operator {
        NEG
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}