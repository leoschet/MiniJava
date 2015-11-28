package miniJava.astree.expression.identifier;

import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

public class IdentifierExpression implements IExpression {
    public String id;

    public IdentifierExpression(String id) {
        this.id = id;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}