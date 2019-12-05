package Language;

public class swp {
    public static void execute(String[] parsed) {
        char c = 94;
        FileOutput.write(c);
        symbolTable.PC +=1;

        //
        symbolTable.mem.add(94);
    }
}
