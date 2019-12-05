package Language;

import java.nio.ByteBuffer;

public class peek {
    public static void execute(String[] parsed) {
        //pushi (var)
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 70;
        FileOutput.write(c);
        i = Integer.parseInt(parsed[2]);
        x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 86;
        FileOutput.write(c);
        symbolTable.PC += 11;

        symbolTable.mem.add(86);
    }
}
