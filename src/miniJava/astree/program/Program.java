package miniJava.astree.program;

import miniJava.astree.INode;
import miniJava.astree.declaration.classDeclaration.ClassListDeclaration;
import miniJava.astree.declaration.classDeclaration.MainClassDeclaration;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class Program implements INode {

    public MainClassDeclaration mainClass;
    public ClassListDeclaration classList;

    public Program(MainClassDeclaration mc, ClassListDeclaration cl){
        mainClass = mc;
        classList = cl;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
