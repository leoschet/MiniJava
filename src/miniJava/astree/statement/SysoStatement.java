package miniJava.astree.statement;

import miniJava.astree.*;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class SysoStatement implements INode {

    Expression expr;

    public SysoStatement(Expression expr){
        this.expr = expr;
    }
}
