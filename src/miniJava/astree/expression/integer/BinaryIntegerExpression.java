package miniJava.astree.expression.integer;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class BinaryIntegerExpression implements IExpression {
    public IExpression leftExpr;
    public Operator op;
    public IExpression rightExpr;

    public BinaryIntegerExpression(IExpression leftExpr, Operator op, IExpression rightExpr) {
        this.leftExpr = leftExpr;
        this.op = op;
        this.rightExpr = rightExpr;
    }

    public enum Operator {
        PLUS, MINUS, TIMES, DIV, MOD
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
