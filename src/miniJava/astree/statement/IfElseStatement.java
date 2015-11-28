package miniJava.astree.statement;

import miniJava.astree.*;
import miniJava.astree.expression.IExpression;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class IfElseStatement implements IStatement {

    public IExpression expr;
    public IStatement ifStmt;
    public IStatement elseStmt;

    public IfElseStatement(IExpression expr, IStatement ifStmt, IStatement elseStmt){
        this.expr = expr;
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
