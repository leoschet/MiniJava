package miniJava.astree.expression;

import miniJava.visitor.IVisitor;

public class MethodCallExpression implements IExpression {
    public IExpression object;
    public String methodName;
    public ExpressionList args;

    public MethodCallExpression(IExpression object, String methodName, ExpressionList args) {
        this.object = object;
        this.methodName = methodName;
        this.args = args;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
