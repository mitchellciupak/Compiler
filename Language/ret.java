package Language;

import java.nio.ByteBuffer;

public class ret {
    public static void execute(String[] parsed) {
        char c = 70;
        FileOutput.write(c);
        int i = 0;
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 77;
        FileOutput.write(c);

        //
        symbolTable.mem.add(77);

        c = 48;
        FileOutput.write(c);
        symbolTable.PC += 7;

        //
        symbolTable.mem.add(48);
    }
}
