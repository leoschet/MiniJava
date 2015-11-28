package miniJava.astree.declaration.classDeclaration;

import miniJava.astree.declaration.methodDeclaration.MethodListDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableListDeclaration;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class SimpleClassDeclaration implements IClassDeclaration {

    public String classId;
    public VariableListDeclaration vl;
    public MethodListDeclaration ml;

    public SimpleClassDeclaration(String classId, VariableListDeclaration vl, MethodListDeclaration ml) {
        this.classId = classId;
        this.vl = vl;
        this.ml = ml;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
