package miniJava.astree.nonPrimitive;
import miniJava.astree.INode;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class IdType implements INode {

    String typeName;

    public IdType(String typeName) {
        this.typeName = typeName;
    }
}
