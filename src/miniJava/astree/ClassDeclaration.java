package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ClassDeclaration implements INode {

    String classId;
    Extends ext;
    InnerClass ic;

    public ClassDeclaration(String cId, Extends ext, InnerClass ic){
        classId = cId;
        this.ext = ext;
        this.ic = ic;
    }
}
