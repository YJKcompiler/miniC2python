package listener.main;

import listener.main.MiniCParser.ExprContext;
import listener.main.MiniCParser.Fun_declContext;
import listener.main.MiniCParser.If_stmtContext;
import listener.main.MiniCParser.Local_declContext;
import listener.main.MiniCParser.ParamContext;
import listener.main.MiniCParser.ParamsContext;
import listener.main.MiniCParser.Type_specContext;
import listener.main.MiniCParser.Var_declContext;

public class BytecodeGenListenerHelper {
	
	// <boolean functions>
	
	static boolean isFunDecl(MiniCParser.ProgramContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniCParser.Fun_declContext;
	}
	
	// type_spec IDENT '[' ']'
	static boolean isArrayParamDecl(ParamContext param) {
		return param.getChildCount() == 4;
	}
	
	// global vars
	static int initVal(Var_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	// var_decl	: type_spec IDENT '=' LITERAL ';
	static boolean isDeclWithInit(Var_declContext ctx) {
		return ctx.getChildCount() == 5 ;
	}
	// var_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static boolean isArrayDecl(Var_declContext ctx) {
		return ctx.getChildCount() == 6;
	}
	// var_decl : IDENT IDENT ';';
	static boolean isStructDecl(Var_declContext ctx) {
		return ctx.IDENT().size()==2;
	}

	// <local vars>
	// local_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static int initVal(Local_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	static boolean isArrayDecl(Local_declContext ctx) {
		return ctx.getChildCount() == 6;
	}
	static boolean isStructDecl(Local_declContext ctx) {
		return ctx.IDENT().size()==2;
	}


	static boolean isArrayDecl(MiniCParser.Struct_attributeContext ctx) {
		return ctx.getChildCount() == 6;
	}
	static boolean isDeclWithInit(Local_declContext ctx) {
		return ctx.getChildCount() == 5 ;
	}
	
	static boolean isVoidF(Fun_declContext ctx) {
		if(ctx.type_spec().getText().equals("void")) { return true; }
		return false;
	}


	static boolean isArrayDecl(MiniCParser.ExprContext ctx){return ctx.getChildCount() == 6;}


	static boolean isStructAssign(MiniCParser.Expr_stmtContext ctx) {
		return ctx.IDENT() != null;
	}

	static String getTypeText(Type_specContext typespec) {
		switch (typespec.getText()){
			case "int":
				return "I";
			case "void":
				return "V";
		}
		return null;
	}

	// params
	static String getParamName(ParamContext param) {
		return param.getChild(1).getText();
	}
	
	static String getParamTypesText(ParamsContext params) {
		String typeText = "";
		
		for(int i = 0; i < params.param().size(); i++) {
			MiniCParser.Type_specContext typespec = (MiniCParser.Type_specContext)  params.param(i).getChild(0);
			typeText += getTypeText(typespec); // + ";";
		}
		return typeText;
	}
	
	static String getLocalVarName(Local_declContext local_decl) {
		return local_decl.getChild(1).getText();
	}
	
	static String getFunName(Fun_declContext ctx) {
		return ctx.getChild(1).getText();
	}
	
	static String getFunName(ExprContext ctx) {
		return ctx.getChild(0).getText();
	}
	
	static boolean noElse(If_stmtContext ctx) {
		return ctx.getChildCount() <= 5;
	}

	static String getCurrentClassName() {
		return "Test";
	}
//	static String getIndent(int tab){
//		String tabs = "";
//		for (int i = 0; i < tab; i++) {
//			tabs += "\t";
//		}
//		return tabs;
//	}
}
