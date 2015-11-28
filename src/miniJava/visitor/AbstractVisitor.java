package miniJava.visitor;

import miniJava.astree.declaration.classDeclaration.ClassListDeclaration;
import miniJava.astree.declaration.classDeclaration.ExtendedClassDeclaration;
import miniJava.astree.declaration.classDeclaration.MainClassDeclaration;
import miniJava.astree.declaration.classDeclaration.SimpleClassDeclaration;
import miniJava.astree.declaration.methodDeclaration.ArgDeclaration;
import miniJava.astree.declaration.methodDeclaration.ArgListDeclaration;
import miniJava.astree.declaration.methodDeclaration.MethodDeclaration;
import miniJava.astree.declaration.methodDeclaration.MethodListDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableListDeclaration;
import miniJava.astree.expression.ExpressionList;
import miniJava.astree.expression.MethodCallExpression;
import miniJava.astree.expression.ThisExpression;
import miniJava.astree.expression.array.ArrayAccessExpression;
import miniJava.astree.expression.array.ArrayCreationExpression;
import miniJava.astree.expression.array.LengthExpression;
import miniJava.astree.expression.bool.BinaryBooleanExpression;
import miniJava.astree.expression.bool.LiteralBooleanExpression;
import miniJava.astree.expression.bool.UnaryBooleanExpression;
import miniJava.astree.expression.identifier.IdentifierExpression;
import miniJava.astree.expression.identifier.ObjectCreationExpression;
import miniJava.astree.expression.integer.BinaryIntegerExpression;
import miniJava.astree.expression.integer.LiteralIntegerExpression;
import miniJava.astree.expression.integer.UnaryIntegerExpression;
import miniJava.astree.program.Program;
import miniJava.astree.statement.*;
import miniJava.astree.type.nonPrimitive.IdType;
import miniJava.astree.type.primitive.BoolType;
import miniJava.astree.type.primitive.IntArrayType;
import miniJava.astree.type.primitive.IntType;

/**
 * Created by Leonardo on 27/11/2015.
 */
public abstract class AbstractVisitor<T> implements IVisitor<T> {

    @Override
    public T visit(ClassListDeclaration cdl){
        return null;
    }
    @Override
    public T visit(MainClassDeclaration mcd){
        return null;
    }

    @Override
    public T visit(ExtendedClassDeclaration ecd){
        return null;
    }

    @Override
    public T visit(SimpleClassDeclaration scd){
        return null;
    }

    @Override
    public T visit(ArgListDeclaration al){
        return null;
    }

    @Override
    public T visit(MethodListDeclaration mdl){
        return null;
    }

    @Override
    public T visit(ArgDeclaration a){
        return null;
    }

    @Override
    public T visit(MethodDeclaration md){
        return null;
    }

    @Override
    public T visit(VariableListDeclaration vdl){
        return null;
    }

    @Override
    public T visit(VariableDeclaration vd){
        return null;
    }

    @Override
    public T visit(LengthExpression ale){
        return null;
    }

    @Override
    public T visit(ArrayAccessExpression ale){
        return null;
    }

    @Override
    public T visit(ArrayCreationExpression nae){
        return null;
    }

    @Override
    public T visit(BinaryBooleanExpression bbe){
        return null;
    }

    @Override
    public T visit(LiteralBooleanExpression ble){
        return null;
    }

    @Override
    public T visit(UnaryBooleanExpression ube){
        return null;
    }

    @Override
    public T visit(IdentifierExpression ie){
        return null;
    }

    @Override
    public T visit(ObjectCreationExpression noe){
        return null;
    }

    @Override
    public T visit(BinaryIntegerExpression bie){
        return null;
    }

    @Override
    public T visit(LiteralIntegerExpression ile){
        return null;
    }

    @Override
    public T visit(UnaryIntegerExpression uie){
        return null;
    }

    @Override
    public T visit(ExpressionList e){
        return null;
    }

    @Override
    public T visit(MethodCallExpression mce){
        return null;
    }

    @Override
    public T visit(ThisExpression te){
        return null;
    }

    @Override
    public T visit(String id){
        return null;
    }

    @Override
    public T visit(Program p){
        return null;
    }

    @Override
    public T visit(StatementList sl){
        return null;
    }

    @Override
    public T visit(ArrayAssStatement aas){
        return null;
    }

    @Override
    public T visit(AssStatement as){
        return null;
    }

    @Override
    public T visit(BraceStatement bs){
        return null;
    }

    @Override
    public T visit(IfElseStatement is){
        return null;
    }

    @Override
    public T visit(SysoStatement ps){
        return null;
    }

    @Override
    public T visit(WhileStatement ws){
        return null;
    }

    @Override
    public T visit(BoolType bt){
        return null;
    }

    @Override
    public T visit(IdType it){
        return null;
    }

    @Override
    public T visit(IntArrayType iat){
        return null;
    }

    @Override
    public T visit(IntType it){
        return null;
    }
}
