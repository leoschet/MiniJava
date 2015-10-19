package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class Parameters implements INode {

    ParameterDeclaration pd;
    Parameters p;

    public Parameters(ParameterDeclaration pd, Parameters p) {
        this.pd = pd;
        this.p = p;
    }
}
