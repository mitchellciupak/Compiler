package Language;

public class cmpe {
    public static void execute(String[] parsed) {
        char c = 132;
        FileOutput.write(c);
        symbolTable.PC += 1;

        //
        symbolTable.mem.add(132);
    }
}
