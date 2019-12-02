import java.util.Dictionary;
import java.util.Hashtable;

public class opCode {
    public Dictionary opCodeDict = new Hashtable();

    opCode(){
        char code = 132;
        opCodeDict.put("cmpe",code);
        code = 136;
        opCodeDict.put("cmplt",code);
        code = 140;
        opCodeDict.put("cmpgt",code);
        code = 36;
        opCodeDict.put("jmp",code);
        code = 40;
        opCodeDict.put("jmpc",code);
        code = 44;
        opCodeDict.put("call",code);
        code = 48;
        opCodeDict.put("ret",code);
        code = 68;
        opCodeDict.put("pushc",code);
        code = 69;
        opCodeDict.put("pushs",code);
        code = 70;
        opCodeDict.put("pushi",code);
        code = 71;
        opCodeDict.put("pushf",code);
        code = 72;
        opCodeDict.put("pushvc",code);
        code = 73;
        opCodeDict.put("pushvs",code);
        code = 74;
        opCodeDict.put("pushvi",code);
        code = 75;
        opCodeDict.put("pushvf",code);
        code = 76;
        opCodeDict.put("popm",code);
        code = 80;
        opCodeDict.put("popv",code);
        code = 77;
        opCodeDict.put("popa",code);
        code = 84;
        opCodeDict.put("peekc",code);
        code = 85;
        opCodeDict.put("peeks",code);
        code = 86;
        opCodeDict.put("peeki",code);
        code = 87;
        opCodeDict.put("peekf",code);
        code = 88;
        opCodeDict.put("pokec",code);
        code = 89;
        opCodeDict.put("pokes",code);
        code = 90;
        opCodeDict.put("pokei",code);
        code = 91;
        opCodeDict.put("pokef",code);
        code = 94;
        opCodeDict.put("swp",code);
        code = 100;
        opCodeDict.put("add",code);
        code = 104;
        opCodeDict.put("sub",code);
        code = 108;
        opCodeDict.put("mul",code);
        code = 112;
        opCodeDict.put("div",code);
        code = 144;
        opCodeDict.put("printc",code);
        code = 145;
        opCodeDict.put("prints",code);
        code = 146;
        opCodeDict.put("printi",code);
        code = 147;
        opCodeDict.put("printf",code);
        code = 0;
        opCodeDict.put("halt",code);
    }

    public void getOpCode(String command){

    }

}
