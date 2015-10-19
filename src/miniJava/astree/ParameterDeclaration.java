package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ParameterDeclaration implements INode {

    DataType dt;
    String paramId;

    public ParameterDeclaration(DataType dt, String id){
        this.dt = dt;
        paramId = id;
    }
}
