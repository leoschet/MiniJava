package miniJava.astree.expression.array;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class ArrayAccessExpression implements IExpression {
    public IExpression array;
    public IExpression index;

    public ArrayAccessExpression(IExpression array, IExpression index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}