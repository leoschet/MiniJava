package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class StatementList implements INode {

    StatementList sl;
    Statement s;

    public StatementList(StatementList sl, Statement s) {
        this.sl = sl;
        this.s = s;
    }
}
