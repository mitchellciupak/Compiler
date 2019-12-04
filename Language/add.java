package Language;

public class add {
    public static void execute(String[] parsed) {
        char c = 100;
        FileOutput.write(c);
        symbolTable.PC += 1;
    }
}
