package Language;

import java.nio.ByteBuffer;

public class pushi {
    public static void execute(String[] parsed) {
        char c = 70;
        FileOutput.write(c);
        int i = Integer.parseInt(parsed[1]);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);
    }
}