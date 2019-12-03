package Language;

import java.nio.ByteBuffer;

public class popv {
    public static void execute(String[] parsed) {
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
        c = 80;
        FileOutput.write(c);
    }
}
