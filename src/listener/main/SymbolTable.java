package listener.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import listener.main.MiniCParser.Fun_declContext;
import listener.main.MiniCParser.Local_declContext;
import listener.main.MiniCParser.Var_declContext;



public class SymbolTable {
    enum Type {
        INT, INTARRAY, VOID, ERROR
    }

    static public class VarInfo {
        Type type;
        int initVal;

        public VarInfo(Type type, int initVal) {
            this.type = type;
            this.initVal = initVal;
        }

        public VarInfo(Type type) {
            this.type = type;
            this.initVal = 0;
        }
    }

    static public class FInfo {
        public String sigStr;
    }


    private Map<String, VarInfo> _lsymtable = new HashMap<>();    // local v.
    private Map<String, VarInfo> _gsymtable = new HashMap<>();    // global v.
    private Map<String, FInfo> _fsymtable = new HashMap<>();    // function


    SymbolTable() {
        initFunDecl();
        initFunTable();
    }

    void initFunDecl() {        // at each func decl
        _lsymtable.clear();
    }

    void putLocalVar(String varname, Type type) {
        _lsymtable.put(varname, new VarInfo(type));    //have to modify
    }

    void putGlobalVar(String varname, Type type) {
        _gsymtable.put(varname, new VarInfo(type));
    }


    void putLocalVarWithInitVal(String varname, Type type, int initVar) {
        _lsymtable.put(varname, new VarInfo(type, initVar));
    }

    void putGlobalVarWithInitVal(String varname, Type type, int initVar) {
        _gsymtable.put(varname, new VarInfo(type,initVar));
    }

    void putParams(MiniCParser.ParamsContext params) {
        for (int i = 0; i < params.param().size(); i++) {
            putLocalVar(params.param(i).getChild(1).getText(), Type.INT);
        }
    }

    private void initFunTable() {
        FInfo printfInfo = new FInfo(); // 프린트 규칙
        FInfo strcatInfo = new FInfo();
        printfInfo.sigStr = "print";
        strcatInfo.sigStr = ""; // 스트링을 파이썬에서 아직 못 안함.
        FInfo maininfo = new FInfo(); //
        maininfo.sigStr = "\nif __name__ == \"__main__\": \n\tmain()";

        _fsymtable.put("printf", printfInfo);
        _fsymtable.put("strcat", strcatInfo);
        _fsymtable.put("main", maininfo);
    }

    public String getFunSpecStr(String fname) {
        return _fsymtable.get(fname).sigStr;
    }

    public String putFunSpecStr(Fun_declContext ctx) {
        String fname = BytecodeGenListenerHelper.getFunName(ctx);
        String argtype = "";
        String rtype = "";
        String res = "";

        argtype = BytecodeGenListenerHelper.getParamTypesText(ctx.params());
        rtype = BytecodeGenListenerHelper.getTypeText(ctx.type_spec());


        res = fname + "(" + argtype + ")" + rtype;

        FInfo finfo = new FInfo();
        finfo.sigStr = res;
        _fsymtable.put(fname, finfo);

        return res;
    }

}
