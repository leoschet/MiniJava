package miniJava.astree.type.primitive;

import miniJava.astree.type.IDataType;
import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 27/11/2015.
 */
public class IntType implements IDataType {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
