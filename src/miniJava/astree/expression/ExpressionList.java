package miniJava.astree.expression;

import miniJava.astree.INode;
import miniJava.visitor.IVisitor;

import java.util.ArrayList;

/**
 * Created by Leonardo on 27/11/2015.
 */
public class ExpressionList extends ArrayList<IExpression> implements INode {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
