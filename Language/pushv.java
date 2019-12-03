package Language;

import java.nio.ByteBuffer;

public class pushv {
    public static void execute(String[] parsed) {
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 74;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
    }
}