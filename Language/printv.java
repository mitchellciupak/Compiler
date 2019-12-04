package Language;

import java.nio.ByteBuffer;

public class printv {
    public static void execute(String[] parsed) {
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
        c = 74;
        FileOutput.write(c);
        c = 146;
        FileOutput.write(c);
        symbolTable.PC += 8;
    }
}