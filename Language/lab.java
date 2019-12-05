package Language;

public class lab {
    public static void execute(String[] parsed) {
        symbolTable.ST.put(parsed[1], symbolTable.PC++);
    }
}
