import javafx.css.ParsedValue;

public class Getter {
    public static void chooseCode(String[] parsed){
        String buffer = parsed[0];

        if (buffer == "halt") {
            Halt.print(parsed);
            exit(0);
        }

        switch (buffer) {
            case "jmp": //36
                jmp.execute(parsed);
                break;
            case "jmpc": //40
                jmpc.execute(parsed);
                break;
            case "pushi": //70
                pushi.execute(parsed);
                break;
            case "pushvi": //74
                pushvi.execute(parsed);
                break;
            case "popm": //76
                popm.execute(parsed);
                break;
            case "popa": //77
                popa.execute(parsed);
                break;
            case "popv": //80:
                popv.execute(parsed);
                break;
            case "peeki": //86:
                peeki.execute(parsed);
                break;
            case "pokei": //90:
                pokei.execute(parsed);
                break;
            case "swp": //94:
                swp.execute(parsed);
                break;
            case "add": //100:
                add.execute(parsed);
                break;
            case "sub": //104:
                sub.execute(parsed);
                break;
            case "mul": //108:
                mul.execute(parsed);
                break;
            case "div": //112:
                div.execute(parsed);
                break;
            case "cmpe": //132:
                cmpe.execute(parsed);
                break;
            case "cmplt": //136:
                cmplt.execute(parsed);
                break;
            case "cmpgt": //140:
                cmpgt.execute(parsed);
                break;
            case "printi": //146:
                printi.execute(parsed);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
