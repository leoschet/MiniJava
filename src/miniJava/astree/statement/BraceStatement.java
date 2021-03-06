package miniJava.astree.statement;
import miniJava.astree.*;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class BraceStatement implements IStatement {
    public StatementList sl;

    public BraceStatement(StatementList sl){
        this.sl = sl;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
