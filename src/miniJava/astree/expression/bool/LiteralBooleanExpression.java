package miniJava.astree.expression.bool;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class LiteralBooleanExpression implements IExpression {
    public Boolean value;

    public LiteralBooleanExpression(Boolean value) {
        this.value = value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
