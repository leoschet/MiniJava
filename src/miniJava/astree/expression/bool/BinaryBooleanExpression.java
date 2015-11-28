package miniJava.astree.expression.bool;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class BinaryBooleanExpression implements IExpression {
    public IExpression leftExpr;
    public Operator op;
    public IExpression rightExpr;

    public BinaryBooleanExpression(IExpression leftExpr, Operator op, IExpression rightExpr) {
        this.leftExpr = leftExpr;
        this.op = op;
        this.rightExpr = rightExpr;
    }

    public enum Operator {
        AND, OR, EQUAL, N_EQUAL, LESS, L_EQUAL, GREATER, G_EQUAL
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}