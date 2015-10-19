package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class VariableDeclaration implements INode {

    DataType dt;
    String id;

    public VariableDeclaration(DataType dt, String id) {
        this.dt = dt;
        this.id = id;
    }
}
