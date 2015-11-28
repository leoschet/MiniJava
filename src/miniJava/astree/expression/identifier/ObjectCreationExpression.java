package miniJava.astree.expression.identifier;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class ObjectCreationExpression implements IExpression {
    public String name;

    public ObjectCreationExpression(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
