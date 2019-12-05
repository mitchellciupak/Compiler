package Language;

public class cmpgt {
    public static void execute(String[] parsed) {
        char c = 140;
        FileOutput.write(c);
        symbolTable.PC += 1;

        symbolTable.mem.add(140);
    }
}
