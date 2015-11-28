package miniJava.astree.declaration.classDeclaration;

import miniJava.astree.INode;
import miniJava.astree.statement.StatementList;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MainClassDeclaration implements INode {
    public String classId;
    public StatementList sl;

    public MainClassDeclaration(String classId, StatementList sl) {
        this.classId = classId;
        this.sl = sl;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
