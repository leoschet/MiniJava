package miniJava.astree.expression.array;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class ArrayCreationExpression implements IExpression {
    public IExpression size;

    public ArrayCreationExpression(IExpression size) {
        this.size = size;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
