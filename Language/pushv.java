package Language;

import java.nio.ByteBuffer;

public class pushv {
    public static void execute(String[] parsed) {
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 74;
        FileOutput.write(c);
        symbolTable.PC += 6;

        //
        symbolTable.mem.add(74);
    }
}