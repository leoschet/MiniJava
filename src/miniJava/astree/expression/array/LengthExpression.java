package miniJava.astree.expression.array;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class LengthExpression implements IExpression {
    public IExpression array;

    public LengthExpression(IExpression array) {
        this.array = array;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}