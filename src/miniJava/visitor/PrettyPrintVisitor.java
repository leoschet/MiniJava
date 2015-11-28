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
import miniJava.astree.expression.integer.BinaryIntegerExpression;
import miniJava.astree.expression.integer.LiteralIntegerExpression;
import miniJava.astree.program.Program;
import miniJava.astree.statement.*;
import miniJava.astree.type.nonPrimitive.IdType;
import miniJava.astree.type.primitive.BoolType;
import miniJava.astree.type.primitive.IntArrayType;
import miniJava.astree.type.primitive.IntType;

/**
 * Created by Leonardo on 27/11/2015.
 */
public class PrettyPrintVisitor extends AbstractVisitor<StringBuilder> {

    private int ident;

    public PrettyPrintVisitor(){
        this.ident = 0;
    }

    @Override
    public StringBuilder visit(ClassListDeclaration cdl){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cdl.size(); i++) {
            str.append(cdl.get(i).accept(this));
            str.append("\n\n");
            ident(str);
        }
        return str;
    }

    @Override
    public StringBuilder visit(MainClassDeclaration mcd) {
        StringBuilder str = new StringBuilder();
        str.append("public class");
        str.append(mcd.classId);
        str.append("\n\n");
        this.ident++;
        ident(str);
        str.append("public static void main (String[] args) {\n");
        this.ident++;
        ident(str);
        str.append(mcd.sl.accept(this));
        this.ident--;
        str.setLength(str.length() - 1);
        str.append("}");
        str.append("\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(ExtendedClassDeclaration ecd) {
        StringBuilder str = new StringBuilder();
        str.append("public class ");
        str.append(ecd.classId);
        str.append(" extends ");
        str.append(ecd.id);
        str.append("{\n");
        this.ident++;
        ident(str);
        str.append(ecd.vl.accept(this));
        str.append(ecd.ml.accept(this));
        str.setLength(str.length() - 1);
        str.append("}\n");
        this.ident--;
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(SimpleClassDeclaration scd){
        StringBuilder str = new StringBuilder();
        str.append("public class ");
        str.append(scd.classId);
        str.append("{\n");
        this.ident++;
        ident(str);
        str.append(scd.vl.accept(this));
        str.append(scd.ml.accept(this));
        str.setLength(str.length() - 1);
        str.append("}\n");
        this.ident--;
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(ArgListDeclaration al){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < al.size(); i++){
            str.append(al.get(i).accept(this));
        }
        return str;
    }

    @Override
    public StringBuilder visit(MethodListDeclaration mdl) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < mdl.size(); i++){
            str.append(mdl.get(i).accept(this));
        }
        return str;
    }

    @Override
    public StringBuilder visit(ArgDeclaration a) {
        StringBuilder str = new StringBuilder();
        str.append(a.dt.accept(this));
        str.append(a.paramId);
        return str;
    }

    @Override
    public StringBuilder visit(MethodDeclaration md) {
        StringBuilder str = new StringBuilder();
        str.append("public ");
        str.append(md.dt.accept(this));
        str.append(md.mId);
        str.append("(");
        str.append(md.pl.accept(this));
        str.append("){\n");
        this.ident++;
        ident(str);
        str.append(md.vl.accept(this));
        str.append(md.sl.accept(this));
        str.append("return ");
        str.append((md.expr));
        str.append(";\n");
        this.ident--;
        ident(str);
        str.append("}\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(VariableListDeclaration vdl){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < vdl.size(); i++) {
            str.append((vdl.get(i).accept(this)));
        }
        return str;
    }

    @Override
    public StringBuilder visit(VariableDeclaration vd){
        StringBuilder str = new StringBuilder();
        str.append(vd.dt.accept(this));
        str.append(" ");
        str.append(vd.id);
        str.append(";\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(LengthExpression ale){
        StringBuilder str = new StringBuilder();
        str.append(ale.array.accept(this));
        str.append(".length");
        return str;
    }

    @Override
    public StringBuilder visit(ArrayAccessExpression ale){
        StringBuilder str = new StringBuilder();
        str.append(ale.array.accept(this));
        str.append("[");
        str.append(ale.index.accept(this));
        str.append("]");
        return str;
    }

    @Override
    public StringBuilder visit(ArrayCreationExpression nae){
        StringBuilder str = new StringBuilder();
        str.append("new int[");
        str.append(nae.size.accept(this));
        str.append("]");
        return str;
    }

    @Override
    public StringBuilder visit(BinaryBooleanExpression bbe){
        StringBuilder str = new StringBuilder();
        str.append(bbe.leftExpr.accept(this));
        switch (bbe.op) {
            case AND:
                str.append(" && ");
                break;
            case OR:
                str.append(" || ");
                break;
            case EQUAL:
                str.append(" == ");
                break;
            case N_EQUAL:
                str.append(" != ");
                break;
            case LESS:
                str.append(" < ");
                break;
            case L_EQUAL:
                str.append(" <= ");
                break;
            case GREATER:
                str.append(" > ");
                break;
            case G_EQUAL:
                str.append(" >= ");
                break;
        }
        str.append(bbe.rightExpr.accept(this));
        return str;
    }

    @Override
    public StringBuilder visit(LiteralBooleanExpression ble){
        return new StringBuilder(Boolean.toString(ble.value));
    }

    @Override
    public StringBuilder visit(UnaryBooleanExpression ube){
        StringBuilder str = new StringBuilder();
        str.append("!");
        str.append(ube.expr.accept(this));
        return str;
    }

    @Override
    public StringBuilder visit(IdentifierExpression ie) {
        return new StringBuilder(ie.id);
    }

    @Override
    public StringBuilder visit(BinaryIntegerExpression bie){
        StringBuilder str = new StringBuilder();
        str.append(bie.leftExpr.accept(this));
        switch (bie.op){
            case PLUS:
                str.append(" + ");
                break;

            case MINUS:
                str.append(" - ");
                break;

            case TIMES:
                str.append(" * ");
                break;

            case DIV:
                str.append(" / ");
                break;

            case MOD:
                str.append(" % ");
                break;
        }

        str.append((bie.rightExpr.accept(this)));
        return str;
    }

    @Override
    public StringBuilder visit(LiteralIntegerExpression ile){
        return new StringBuilder(Integer.toString(ile.value));
    }

    @Override
    public StringBuilder visit(ExpressionList e){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < e.size(); i++){
            str.append(e.get(i).accept(this));
        }
        return str;
    }

    @Override
    public StringBuilder visit(MethodCallExpression mce){
        StringBuilder str = new StringBuilder();
        str.append(mce.object.accept(this));
        str.append(".");
        str.append(mce.methodName);
        str.append("(");
        str.append(mce.args.accept(this));
        str.append(")");
        return str;
    }

    @Override
    public StringBuilder visit(ThisExpression te){
        return new StringBuilder("this");
    }

    @Override
    public StringBuilder visit(String id){
        return new StringBuilder(id);
    }

    @Override
    public StringBuilder visit(Program p) {
        StringBuilder str = new StringBuilder();
        str.append(p.mainClass.accept(this));
        str.append(p.classList.accept(this));
        return str;
    }

    @Override
    public StringBuilder visit(StatementList sl) {
        StringBuilder str = new StringBuilder();
        for (int i = sl.size() - 1; i >= 0; i--) {
            str.append(sl.get(i).accept(this));
        }
        return str;
    }

    @Override
    public StringBuilder visit(ArrayAssStatement aas) {
        StringBuilder str = new StringBuilder();
        str.append(aas.id);
        str.append("[");
        str.append(aas.expr.accept(this));
        str.append("] = ");
        str.append(aas.assExpr.accept(this));
        return str;
    }

    @Override
    public StringBuilder visit(AssStatement as){
        StringBuilder str = new StringBuilder();
        str.append(as.id);
        str.append(" = ");
        str.append(as.expr.accept(this));
        str.append(";\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(BraceStatement bs){
        StringBuilder str = new StringBuilder();
        str.append("{\n");
        this.ident++;
        ident(str);
        str.append(bs.sl.accept(this));
        str.setLength(str.length() - 1);
        str.append("}\n");
        this.ident--;
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(IfElseStatement is){
        StringBuilder str = new StringBuilder();
        str.append("if(");
        str.append(is.expr.accept(this));
        str.append("){\n");
        this.ident++;
        ident(str);
        str.append(is.ifStmt.accept(this));
        str.append("\n");
        ident(str);
        str.setLength(str.length() - 1);
        str.append("} else {\n");
        ident(str);
        str.append(is.elseStmt.accept(this));
        str.append("\n");
        this.ident--;
        ident(str);
        str.append("}\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(SysoStatement ps) {
        StringBuilder str = new StringBuilder();
        str.append("System.out.println(");
        str.append(ps.expr.accept(this));
        str.append(");\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(WhileStatement ws) {
        StringBuilder str = new StringBuilder();
        str.append("while(");
        str.append(ws.expr.accept(this));
        str.append("){\n");
        this.ident++;
        ident(str);
        str.append(ws.stmt.accept(this));
        str.append("\n");
        this.ident--;
        ident(str);
        str.append("}");
        ident(str);
        str.append("\n");
        ident(str);
        return str;
    }

    @Override
    public StringBuilder visit(BoolType bt) {
        return new StringBuilder("boolean ");
    }

    @Override
    public StringBuilder visit(IdType it) {
        return new StringBuilder(it.typeName);
    }

    @Override
    public StringBuilder visit(IntArrayType iat) {
        return new StringBuilder("int[] ");
    }

    @Override
    public StringBuilder visit(IntType it) {
        return new StringBuilder("int ");
    }

    private void ident(StringBuilder str) {
        for (int i = 0; i < this.ident; i++) {
            str.append("\t");
        }
    }
}
