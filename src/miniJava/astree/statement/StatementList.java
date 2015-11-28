package miniJava.astree.statement;

import miniJava.astree.INode;
import miniJava.visitor.IVisitor;

import java.util.ArrayList;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class StatementList extends ArrayList<IStatement> implements INode {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
