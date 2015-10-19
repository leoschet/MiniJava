package miniJava.astree.statement;

import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class AssStatement implements INode {

    String id;
    Expression expr;

    public AssStatement(String id, Expression expr){
        this.id = id;
        this.expr = expr;
    }
}
