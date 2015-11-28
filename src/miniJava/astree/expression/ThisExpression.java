package miniJava.astree.expression;

import miniJava.visitor.IVisitor;

public class ThisExpression implements IExpression {

    public ThisExpression() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
