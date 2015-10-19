package miniJava.astree;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class Program implements INode {

    MainClassDeclaration mainClass;
    ClassListDeclaration classList;

    public Program(MainClassDeclaration mc, ClassListDeclaration cl){
        mainClass = mc;
        classList = cl;
    }
}
