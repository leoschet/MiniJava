package miniJava.astree.statement;
import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class BraceStatement implements INode {
    StatementList sl;

    public BraceStatement(StatementList sl){
        this.sl = sl;
    }
}
