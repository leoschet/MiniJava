package miniJava.astree.declaration.classDeclaration;

import miniJava.astree.declaration.methodDeclaration.MethodListDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableListDeclaration;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 27/11/2015.
 */
public class ExtendedClassDeclaration extends SimpleClassDeclaration {

    public String id;

    public ExtendedClassDeclaration(String classId, VariableListDeclaration vl, MethodListDeclaration ml, String id) {
        super(classId, vl, ml);
        this.id = id;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
