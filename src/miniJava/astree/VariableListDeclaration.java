package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class VariableListDeclaration implements INode {

    VariableListDeclaration vl;
    VariableDeclaration vd;

    public VariableListDeclaration(VariableListDeclaration vl, VariableDeclaration vd) {
        this.vl = vl;
        this.vd = vd;
    }
}
