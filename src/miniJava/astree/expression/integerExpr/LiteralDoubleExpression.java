package miniJava.astree.expression.integerExpr;
import miniJava.astree.expression.DoubleExpression;

public class LiteralDoubleExpression implements DoubleExpression {

    protected Double value;

    public LiteralDoubleExpression(Double value) {
        this.value = value;
    }

}
