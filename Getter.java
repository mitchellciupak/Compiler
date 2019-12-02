import javafx.css.ParsedValue;

public class Getter {
    public static void chooseCode(char * buffer){

        if (buffer == "halt") {
            Halt.print();
            exit(0);
        }

        switch (buffer) {
            case "jmp": //36
                jmp.execute();
                break;
            case "jmpc": //40
                jmpc.execute();
                break;
            case "pushi": //70
                pushi.execute();
                break;
            case "pushvi": //74
                pushvi.execute();
                break;
            case "popm": //76
                popm.execute();
                break;
            case "popa": //77
                popa.execute();
                break;
            case "popv": //80:
                popv.execute();
                break;
            case "peeki": //86:
                peeki.execute();
                break;
            case "pokei": //90:
                pokei.execute();
                break;
            case "swp": //94:
                swp.execute();
                break;
            case "add": //100:
                add.execute();
                break;
            case "sub": //104:
                sub.execute();
                break;
            case "mul": //108:
                mul.execute();
                break;
            case "div": //112:
                div.execute();
                break;
            case "cmpe": //132:
                cmpe.execute();
                break;
            case "cmplt": //136:
                cmplt.execute();
                break;
            case "cmpgt": //140:
                cmpgt.execute();
                break;
            case "printi": //146:
                printi.execute();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
