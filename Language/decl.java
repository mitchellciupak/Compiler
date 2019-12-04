package Language;

import java.nio.ByteBuffer;

public class decl {
    public static void execute(String[] parsed) {
        char c = 70;
        FileOutput.write(c);
        int i = 0;
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
        symbolTable.ST.put(parsed[1],symbolTable.offset++);
        symbolTable.PC += 6;
    }
}

