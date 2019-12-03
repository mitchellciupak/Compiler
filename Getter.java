import javafx.css.ParsedValue;
import Language.*;

public class Getter {
    public static void chooseCode(String[] parsed){
        String buffer = parsed[0];

        switch (buffer) {

            case "add":
                add.execute(parsed);
                break;
            case "cmpe":
                cmpe.execute(parsed);
                break;
            case "cmpgt":
                cmpgt.execute(parsed);
                break;
            case "cmplt":
                cmplt.execute(parsed);
                break;
            case "decl":
                decl.execute(parsed);
                break;
            case "div":
                div.execute(parsed);
                break;
            case "jmp":
                jmp.execute(parsed);
                break;
            case "jmpc":
                jmpc.execute(parsed);
                break;
            case "lab":
                lab.execute(parsed);
                break;
            case "mul":
                mul.execute(parsed);
                break;
            case "peek":
                peek.execute(parsed);
                break;
            case "poke":
                poke.execute(parsed);
                break;
            case "popm":
                popm.execute(parsed);
                break;
            case "popv":
                popv.execute(parsed);
                break;
            case "printi":
                printi.execute(parsed);
                break;
            case "ret":
                ret.execute(parsed);
                break;
            case "printv":
                printv.execute(parsed);
                break;
            case "pushi":
                pushi.execute(parsed);
                break;
            case "pushv":
                pushv.execute(parsed);
                break;
            case "sub":
                sub.execute(parsed);
                break;
                /*
            case "subr":
                subr.execute(parsed);
                break;
                 */
            case "swp":
                swp.execute(parsed);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

