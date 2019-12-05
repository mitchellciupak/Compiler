package Language;

public class div {
    public static void execute(String[] parsed) {
        char c = 112;
        FileOutput.write(c);
        symbolTable.PC += 1;
        symbolTable.mem.add(112);
    }
}
