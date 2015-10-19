package miniJava.astree;

/**
 * Created by Leonardo on 19/10/2015.
 */
public class ArgumentDeclaration implements INode {

    Expression expr;
    ArgumentDeclaration arg;

    public ArgumentDeclaration(Expression expr, ArgumentDeclaration arg){
        this.expr = expr;
        this.arg = arg;
    }
}
