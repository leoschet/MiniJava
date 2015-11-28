package miniJava.astree.expression.integer;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class LiteralIntegerExpression implements IExpression {
    public Integer value;

    public LiteralIntegerExpression(Integer value) {
        this.value = value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
