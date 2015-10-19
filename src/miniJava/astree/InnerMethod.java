package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class InnerMethod implements INode {

    VariableListDeclaration vl;
    StatementList sl;

    public InnerMethod(VariableListDeclaration vl, StatementList sl){
        this.vl = vl;
        this.sl = sl;
    }
}
