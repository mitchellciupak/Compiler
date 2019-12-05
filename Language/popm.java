package Language;

import java.nio.ByteBuffer;

public class popm {
    public static void execute(String[] parsed) {
        char c = 70;
        FileOutput.write(c);
        int i = Integer.parseInt(parsed[1]);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 76;
        FileOutput.write(c);
        symbolTable.PC += 6;

        //
        symbolTable.mem.add(76);
    }
}