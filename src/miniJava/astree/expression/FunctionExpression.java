package miniJava.astree.expression;

import miniJava.astree.ArgumentListDeclaration;
import miniJava.astree.Expression;

public class FunctionExpression implements Expression {
    protected Expression object;
    protected String methodName;
    protected ArgumentListDeclaration args;

    public FunctionExpression(Expression object, String methodName, ArgumentListDeclaration args) {
        this.object = object;
        this.methodName = methodName;
        this.args = args;
    }
}
