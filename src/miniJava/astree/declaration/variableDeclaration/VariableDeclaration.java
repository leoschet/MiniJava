package miniJava.astree.declaration.variableDeclaration;

import miniJava.astree.type.IDataType;
import miniJava.astree.INode;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class VariableDeclaration implements INode {

    public IDataType dt;
    public String id;

    public VariableDeclaration(IDataType dt, String id) {
        this.dt = dt;
        this.id = id;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
