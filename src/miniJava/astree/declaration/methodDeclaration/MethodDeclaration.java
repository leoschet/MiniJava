package miniJava.astree.declaration.methodDeclaration;

import miniJava.astree.type.IDataType;
import miniJava.astree.INode;
import miniJava.astree.statement.StatementList;
import miniJava.astree.declaration.variableDeclaration.VariableListDeclaration;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MethodDeclaration implements INode {

    public IDataType dt;
    public String mId;
    public ArgListDeclaration pl;
    public VariableListDeclaration vl;
    public StatementList sl;
    public IExpression expr;

    public MethodDeclaration(IDataType dt, String mId, ArgListDeclaration pl, VariableListDeclaration vl, StatementList sl, IExpression expr) {
        this.dt = dt;
        this.mId = mId;
        this.pl = pl;
        this.vl = vl;
        this.sl = sl;
        this.expr = expr;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
