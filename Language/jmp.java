package Language;

public class jmp {
    public static void execute(String[] parsed){
        //pushi (label)
        char c = 70;
        FileOutput.write(c);
        //TODO (label)

        //bc.jmp
        c = 36;
        FileOutput.write(c);
    }
}
