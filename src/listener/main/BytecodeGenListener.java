package listener.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import listener.main.MiniCParser.ParamsContext;

import java.util.Iterator;

import static listener.main.BytecodeGenListenerHelper.*;
import static listener.main.SymbolTable.*;

public class BytecodeGenListener extends MiniCBaseListener implements ParseTreeListener {
    ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
    SymbolTable symbolTable = new SymbolTable();

    // program	: decl+

    @Override
    public void enterFun_decl(MiniCParser.Fun_declContext ctx) {
        symbolTable.initFunDecl();

        String fname = getFunName(ctx);
        ParamsContext params;

        if (!fname.equals("main")) {
            symbolTable.putFunSpecStr(ctx);
            params = (MiniCParser.ParamsContext) ctx.getChild(3);
            symbolTable.putParams(params);
        }
    }


    // var_decl	: type_spec IDENT ';' | type_spec IDENT '=' LITERAL ';'|type_spec IDENT '[' LITERAL ']' ';'
    @Override
    public void enterVar_decl(MiniCParser.Var_declContext ctx) {
        String varName = ctx.IDENT(0).getText();

        if (isArrayDecl(ctx)) {
            symbolTable.putGlobalVar(varName, Type.INTARRAY);
        } else if (isDeclWithInit(ctx)) {
            symbolTable.putGlobalVarWithInitVal(varName, Type.INT, initVal(ctx));
        } else { // simple decl
            symbolTable.putGlobalVar(varName, Type.INT);
        }
    }


    @Override
    public void enterProgram(MiniCParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(MiniCParser.ProgramContext ctx) {
//        String classProlog = getFunProlog();

        String fun_decl = "", var_decl = "";

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (isFunDecl(ctx, i))
                fun_decl += newTexts.get(ctx.decl(i));
            else
                var_decl += newTexts.get(ctx.decl(i));
        }

//        newTexts.put(ctx, classProlog + var_decl + fun_decl);
        String ret = var_decl + fun_decl + "\n"+symbolTable.getFunSpecStr("main");
        newTexts.put(ctx, ret);
        System.out.println(newTexts.get(ctx));
    }


    // decl	: var_decl | fun_decl
    @Override
    public void exitDecl(MiniCParser.DeclContext ctx) {
        String decl = "";
        if (ctx.getChildCount() == 1) {
            if (ctx.var_decl() != null)                //var_decl
                decl += newTexts.get(ctx.var_decl());
            else if(ctx.fun_decl() != null)                            //fun_decl
                decl += newTexts.get(ctx.fun_decl());
            else if(ctx.struct_decl() != null)
                decl += newTexts.get(ctx.struct_decl());
        }
        newTexts.put(ctx, decl);
    }

    // stmt	: expr_stmt | compound_stmt | if_stmt | while_stmt | return_stmt
    @Override
    public void exitStmt(MiniCParser.StmtContext ctx) {
        String stmt = "";
        if (ctx.getChildCount() > 0) {
            if (ctx.expr_stmt() != null)                // expr_stmt
                stmt += newTexts.get(ctx.expr_stmt());
            else if (ctx.compound_stmt() != null)    // compound_stmt
                stmt += newTexts.get(ctx.compound_stmt());
            else if (ctx.if_stmt() != null)    // if_stmt
                stmt += newTexts.get(ctx.if_stmt());
            else if (ctx.while_stmt() != null)    // while_stmt
                stmt += newTexts.get(ctx.while_stmt());
            else if (ctx.return_stmt() != null)    // return_stmt
                stmt += newTexts.get(ctx.return_stmt());
            // <(0) Fill here> maybe modified
        }
        newTexts.put(ctx, stmt);
    }

    // expr_stmt	: expr ';'
    @Override
    public void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx) {
        String stmt = "";
        if (ctx.getChildCount() == 2)
            stmt += "\n" + newTexts.get(ctx.expr());    // expr
        else if(isStructAssign(ctx))
            stmt += "\n" + ctx.IDENT().getText() + "." + newTexts.get(ctx.expr());
        newTexts.put(ctx, stmt);
    }


    // while_stmt	: WHILE '(' expr ')' stmt
    @Override
    public void exitWhile_stmt(MiniCParser.While_stmtContext ctx) {
        // <(1) Fill here!>
        String stmt = "";
        stmt += "\n\n" + ctx.getChild(0) + "(" + ctx.expr().getText() + "):";
        stmt += newTexts.get(ctx.stmt());

        newTexts.put(ctx, stmt);
    }


    @Override
    public void exitFun_decl(MiniCParser.Fun_declContext ctx) {
        // <(2) Fill here!>
        String fun_decl = "\n\ndef " + ctx.IDENT().getText() + "(";
        fun_decl += newTexts.get(ctx.params()) + "):";
        fun_decl += newTexts.get(ctx.compound_stmt());
        newTexts.put(ctx, fun_decl);
    }

    @Override
    public void exitParams(ParamsContext ctx) {
        /**
         * params == param (, param)*
         * param == newTexts.get(ctx.child)
         **/
        if (ctx.VOID() != null) {   //except void
            return;
        }

        int childCnt = ctx.getChildCount();
        String ret = "";
        for (int i = 0; i < childCnt; i += 2) {   //odd(i) == param and even(i) == ','
            ret += newTexts.get(ctx.getChild(i));
            if (i + 1 < childCnt) ret += ", "; //if param is last break
        }
        newTexts.put(ctx, ret);
    }

    @Override
    public void exitParam(MiniCParser.ParamContext ctx) {
        // for except type
        // type x => newTexts.put(x)
        newTexts.put(ctx, ctx.IDENT().getText());
    }



    @Override
    public void exitVar_decl(MiniCParser.Var_declContext ctx) {
        // a[0]
        // 위와 같이 배열을 선언했을 때
        if (isArrayDecl(ctx)){
            String name = ctx.IDENT(0).getText();
            String size = ctx.LITERAL().getText();
            newTexts.put(ctx, "\n" + name +"=" + "[0]*"+size);
            return;
        }
        // a[3] = {1,2,3}
        // 이러한 방법으로 배열 선언을 했을 때 자식의 갯수는 6개 이상.
        if (ctx.getChildCount()>6){
            String name = ctx.IDENT(0).getText();
            //String size = ctx.LITERAL().getText();
            String arr = "";
            for (int i = 0; i < ctx.expr().size()-1; i++) {
                arr  += ctx.expr(i).getText()+",";
            }
            arr += ctx.expr(ctx.expr().size()-1).getText();
            newTexts.put(ctx, "\n" + name +"=" + "["+arr+"]");
            return;
        }

        // person p
        // person is name of struct
        if(isStructDecl(ctx)) {
            newTexts.put(ctx, "\n"+ctx.IDENT(1)+" = "+ctx.IDENT(0)+"()");
            return;
        }

        String name = ctx.IDENT(0).getText();
        String value = "None";

        if (ctx.LITERAL() != null) {
            value = ctx.LITERAL().getText();
        }

        // int x;    -->  x = ""
        // int x=10; --> x = 10
        newTexts.put(ctx, "\n" + name + " = " + value);
    }

    @Override
    public void exitType_spec(MiniCParser.Type_specContext ctx) {
        return;
    }


    @Override
    public void exitLocal_decl(MiniCParser.Local_declContext ctx) {
        // a[0]
        // 위와 같이 배열을 선언했을 때
        if (isArrayDecl(ctx)){
            String name = ctx.IDENT(0).getText();
            String size = ctx.LITERAL().getText();
            newTexts.put(ctx, "\n" + name +"=" + "[0]*"+size);
            return;
        }
        // a[3] = {1,2,3}
        // 이러한 방법으로 배열 선언을 했을 때 자식의 갯수는 6개 이상.
        if (ctx.getChildCount()>6){
            String name = ctx.IDENT(0).getText();
            //String size = ctx.LITERAL().getText();
            String arr = "";

            // 아래에서 문자열인지 아닌지를 검사한다.
            if (ctx.getChild(6).getText().contains("\"")){
                newTexts.put(ctx, "\n" + name +" = " + ctx.getChild(6).getText());
            }
            // 아래는 배열임을 나타낸다.
            else {
                for (int i = 0; i < ctx.expr().size()-1; i++) {
                    arr  += ctx.expr(i).getText()+",";
                }
                arr += ctx.expr(ctx.expr().size()-1).getText();
                newTexts.put(ctx, "\n" + name +"=" + "["+arr+"]");
            }

            return;
        }

        // person p
        // person is name of struct
        if(isStructDecl(ctx)) {
            newTexts.put(ctx, "\n"+ctx.IDENT(1)+" = "+ctx.IDENT(0)+"()");
            return;
        }

        String name = ctx.IDENT(0).getText();
        String value = "None";

        if (ctx.LITERAL() != null) {
            value = ctx.LITERAL().getText();
        }

        // int x;    -->  x = ""
        // int x=10; --> x = 10
        newTexts.put(ctx, "\n" + name + " = " + value);
    }


    // compound_stmt	: '{' local_decl* stmt* '}'
    @Override
    public void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx) {
        String compound_stmt = "";
        // 0 : {
        // -1 : }
        for (int i = 1; i < ctx.getChildCount() - 2; i++) {
            // 1 ~ -3
            compound_stmt += newTexts.get(ctx.getChild(i));
        }


        compound_stmt += newTexts.get(ctx.getChild(ctx.getChildCount() - 2));
        compound_stmt = compound_stmt.replace("\n", "\n\t");
        // -2
        newTexts.put(ctx, compound_stmt);
    }

    // if_stmt	: IF '(' expr ')' stmt | IF '(' expr ')' stmt ELSE stmt;
    @Override
    public void exitIf_stmt(MiniCParser.If_stmtContext ctx) {
        String stmt = "";
        stmt += "\n\n" + ctx.getChild(0) + " " + newTexts.get(ctx.expr()) + ":";
        stmt += newTexts.get(ctx.stmt(0));

        if (noElse(ctx)) {

        } else {
            stmt += "\n" + ctx.getChild(5).getText() + ":" + newTexts.get(ctx.stmt(1));
        }

        newTexts.put(ctx, stmt);
    }


    // return_stmt	: RETURN ';' | RETURN expr ';'
    @Override
    public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) {
        // <(4) Fill here>
        String stmt = "\n\nreturn"; // 리턴문을 미리 넣어놓고
        if (ctx.expr() != null) { // expr에 값이 있다면.
            stmt += " " + newTexts.get(ctx.expr()); // 거기의 구문을 가져와서 다시 stmt에 스트링으로 저장한다.
        }
        newTexts.put(ctx, stmt); // 저장
    }


    @Override
    public void exitExpr(MiniCParser.ExprContext ctx) {
        String expr = "";
        if(ctx.getChild(0).getText().equals("strcat")){
            expr = ctx.getChild(2).getChild(0).getText() + " + " + ctx.getChild(2).getChild(2).getText();
        }else {
            if (ctx.getChildCount() == 1) { // 자식을 변수를 가져옴
                expr += ctx.getChild(0).getText();
            } else if (ctx.getChildCount() == 2) { // 단항 연산자를 쓴 변수
                expr += handleUnaryExpr(ctx, expr);
            } else if (ctx.getChildCount() == 3) { // 연산자 집합
                if (ctx.expr(1) == null)
                    expr += ctx.getChild(0).getText() + " " + ctx.getChild(1).getText() + " " + newTexts.get(ctx.expr(0));
                else
                    expr += newTexts.get(ctx.expr(0)) + " " + ctx.getChild(1).getText() + " " + newTexts.get(ctx.expr(1));
            } else if (ctx.getChildCount() == 4) { // ????
                expr += ctx.getChild(0).getText() + "(" + ctx.args().getText() + ")";
            } else if (isArrayDecl(ctx)) { // a[10]=8 과 같음,  배열에 해당하는 위치 값을 삽입한다.
                expr += ctx.getChild(0).getText() + "[" + newTexts.get(ctx.expr(0)) + "] = " + newTexts.get(ctx.expr(1));
            }
        }

        newTexts.put(ctx, expr);
    }


    private String handleUnaryExpr(MiniCParser.ExprContext ctx, String expr) {

        switch (ctx.getChild(0).getText()) {
            case "-":
                expr = ctx.getChild(0).getText() + newTexts.get(ctx.expr(0));
                break;
            case "+":
                expr = ctx.getChild(0).getText() + newTexts.get(ctx.expr(0));
                break;
            case "!":
                expr = ctx.getChild(0).getText() + newTexts.get(ctx.expr(0));
                break;
            case "--":
                expr = newTexts.get(ctx.expr(0)) + " -= 1";
                break;
            case "++":
                expr = newTexts.get(ctx.expr(0)) + " += 1";
                break;
        }
        return expr;
    }

    private String handleBinExpr(MiniCParser.ExprContext ctx, String expr) {
        expr += newTexts.get(ctx.expr(0));
        expr += newTexts.get(ctx.expr(1));
        return expr;
    }

    private String handleFunCall(MiniCParser.ExprContext ctx, String expr) {
        String fname = getFunName(ctx);
        return null;

    }

    // args	: expr (',' expr)* | ;
    @Override
    public void exitArgs(MiniCParser.ArgsContext ctx) {

        String argsStr = "\n";

        for (int i = 0; i < ctx.expr().size(); i++) {
            argsStr += newTexts.get(ctx.expr(i));
        }
        newTexts.put(ctx, argsStr);
    }

    @Override
    public void exitStruct_decl(MiniCParser.Struct_declContext ctx) {
        String struct_decl = "";

        String name = "class "+ctx.IDENT(1)+":"; // class a
        String constructer = "\ndef __init__(self):" + newTexts.get(ctx.struct_stmt());

        // indent
        constructer = constructer.replace("\n", "\n\t");

        struct_decl = "\n" + name + constructer;
        struct_decl += "\n"; // 한 칸 띄우기
        newTexts.put(ctx, struct_decl);
    }

    @Override
    public void exitStruct_stmt(MiniCParser.Struct_stmtContext ctx) {
        String struct_stmt = "";

        // attribute 선언들
        Iterator it = ctx.struct_attribute().iterator();
        while(it.hasNext()) {
            String attribute = newTexts.get((ParseTree) it.next());
            struct_stmt += attribute;
        }

        // indent
        struct_stmt = struct_stmt.replace("\n", "\n\t");
        newTexts.put(ctx, struct_stmt);
    }

    /**
     *
     * @param ctx
     */
    @Override
    public void exitStruct_attribute(MiniCParser.Struct_attributeContext ctx) {
        // self.a
        String name = "self." + ctx.IDENT().getText();

        if (isArrayDecl(ctx)){
            // 배열을 선언했을 때
            String size = ctx.LITERAL().getText();
            // self.a = [0]*10
            newTexts.put(ctx, "\n" + name + " = " + "[0]*"+size);
            return;
        } else {
            // self.a = 0
            newTexts.put(ctx, "\n" + name + " = 0");
            return;
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

}
