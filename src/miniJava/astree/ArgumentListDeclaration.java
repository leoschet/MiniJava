package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ArgumentListDeclaration implements INode {

    ArgumentDeclaration arg;

    public ArgumentListDeclaration(ArgumentDeclaration arg){
        this.arg = arg;
    }
}
