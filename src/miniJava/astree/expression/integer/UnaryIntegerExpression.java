package miniJava.astree.expression.integer;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class UnaryIntegerExpression implements IExpression {
    public Operator op;
    public IExpression expr;

    public UnaryIntegerExpression(Operator op, IExpression expr) {
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
