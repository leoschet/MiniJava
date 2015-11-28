package miniJava.astree.type.nonPrimitive;
import miniJava.astree.type.IDataType;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public class IdType implements IDataType {

    public String typeName;

    public IdType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
