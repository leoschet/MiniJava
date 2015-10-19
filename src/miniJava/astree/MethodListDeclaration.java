package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MethodListDeclaration implements INode {

    MethodListDeclaration ml;
    MethodDeclaration md;

    public MethodListDeclaration(MethodListDeclaration ml, MethodDeclaration md){
        this.ml = ml;
        this.md = md;
    }
}
