package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class InnerClass implements INode {

    VariableListDeclaration vl;
    MethodListDeclaration ml;

    public InnerClass(VariableListDeclaration vl, MethodListDeclaration ml){
        this.vl = vl;
        this.ml = ml;
    }
}
