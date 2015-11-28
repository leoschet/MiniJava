package miniJava.astree.declaration.methodDeclaration;

import miniJava.astree.INode;
import miniJava.visitor.IVisitor;

import java.util.ArrayList;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MethodListDeclaration extends ArrayList<MethodDeclaration> implements INode {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}