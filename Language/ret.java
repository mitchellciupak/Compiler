package Language;

import java.nio.ByteBuffer;

public class ret {
    public static void execute(String[] parsed) {
        char c = 70;
        FileOutput.write(c);
        int i = 0;
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
        c = 77;
        FileOutput.write(c);
        c = 48;
        FileOutput.write(c);
        symbolTable.PC += 8;
    }
}
