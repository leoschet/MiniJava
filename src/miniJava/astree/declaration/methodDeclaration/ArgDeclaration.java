package miniJava.astree.declaration.methodDeclaration;

import miniJava.astree.type.IDataType;
import miniJava.astree.INode;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ArgDeclaration implements INode {

    public IDataType dt;
    public String paramId;

    public ArgDeclaration(IDataType dt, String id){
        this.dt = dt;
        paramId = id;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
