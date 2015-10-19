package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class ClassListDeclaration implements INode {

    ClassListDeclaration classList;
    ClassDeclaration classDeclaration;

    public ClassListDeclaration(ClassDeclaration cd, ClassListDeclaration cl){
        classDeclaration = cd;
        classList = cl;
    }
}
