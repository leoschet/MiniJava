package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MethodDeclaration implements INode {

    DataType dt;
    String mId;
    ParameterListDeclaration pl;
    InnerMethod im;
    Expression expr;

    public MethodDeclaration(DataType dt, String mId, ParameterListDeclaration pl, InnerMethod im, Expression expr) {
        this.dt = dt;
        this.mId = mId;
        this.pl = pl;
        this.im = im;
        this.expr = expr;
    }
}
