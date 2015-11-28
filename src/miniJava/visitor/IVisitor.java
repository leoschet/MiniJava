package miniJava.visitor;

import miniJava.astree.declaration.classDeclaration.ExtendedClassDeclaration;
import miniJava.astree.declaration.classDeclaration.SimpleClassDeclaration;
import miniJava.astree.declaration.methodDeclaration.ArgDeclaration;
import miniJava.astree.declaration.methodDeclaration.ArgListDeclaration;
import miniJava.astree.expression.*;
import miniJava.astree.expression.array.ArrayAccessExpression;
import miniJava.astree.expression.array.ArrayCreationExpression;
import miniJava.astree.expression.array.LengthExpression;
import miniJava.astree.expression.bool.*;
import miniJava.astree.expression.identifier.IdentifierExpression;
import miniJava.astree.expression.identifier.ObjectCreationExpression;
import miniJava.astree.expression.integer.*;
import miniJava.astree.program.Program;
import miniJava.astree.type.nonPrimitive.IdType;
import miniJava.astree.statement.*;
import miniJava.astree.declaration.classDeclaration.ClassListDeclaration;
import miniJava.astree.declaration.classDeclaration.MainClassDeclaration;
import miniJava.astree.declaration.methodDeclaration.MethodDeclaration;
import miniJava.astree.declaration.methodDeclaration.MethodListDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableDeclaration;
import miniJava.astree.declaration.variableDeclaration.VariableListDeclaration;
import miniJava.astree.type.primitive.BoolType;
import miniJava.astree.type.primitive.IntArrayType;
import miniJava.astree.type.primitive.IntType;

/**
 * Created by Leonardo on 27/11/2015.
 */
public interface IVisitor<T> {
    // Tipos concretos
    T visit(ClassListDeclaration cdl);

    T visit(MainClassDeclaration mcd);

    T visit(ExtendedClassDeclaration ecd);

    T visit(SimpleClassDeclaration scd);

    T visit(ArgListDeclaration al);

    T visit(MethodListDeclaration mdl);

    T visit(ArgDeclaration a);

    T visit(MethodDeclaration md);

    T visit(VariableListDeclaration vdl);

    T visit(VariableDeclaration vd);

    T visit(LengthExpression ale);

    T visit(ArrayAccessExpression ale);

    T visit(ArrayCreationExpression nae);

    T visit(BinaryBooleanExpression bbe);

    T visit(LiteralBooleanExpression ble);

    T visit(UnaryBooleanExpression ube);

    T visit(IdentifierExpression ie);

    T visit(ObjectCreationExpression noe);

    T visit(BinaryIntegerExpression bie);

    T visit(LiteralIntegerExpression ile);

    T visit(UnaryIntegerExpression uie);

    T visit(ExpressionList e);

    T visit(MethodCallExpression mce);

    T visit(ThisExpression te);

    T visit(String id);

    T visit(Program p);

    T visit(StatementList sl);

    T visit(ArrayAssStatement aas);

    T visit(AssStatement as);

    T visit(BraceStatement bs);

    T visit(IfElseStatement is);

    T visit(SysoStatement ps);

    T visit(WhileStatement ws);

    T visit(BoolType bt);

    T visit(IdType it);

    T visit(IntArrayType iat);

    T visit(IntType it);
}
