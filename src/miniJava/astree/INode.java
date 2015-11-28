package miniJava.astree;

import miniJava.visitor.IVisitor;

/**
 * Created by Leonardo on 18/10/2015.
 */
public interface INode {
    public <T> T accept(IVisitor<T> visitor);
}
