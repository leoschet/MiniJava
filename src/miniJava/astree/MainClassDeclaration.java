package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class MainClassDeclaration implements INode {
    String classId;
    InnerMethod innerMainClass;

    public MainClassDeclaration(String cId, InnerMethod im){
        classId = cId;
        innerMainClass = im;
    }
}
