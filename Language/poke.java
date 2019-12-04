package Language;

import java.nio.ByteBuffer;

public class poke {
    public static void execute(String[] parsed) {
        //pushi (var)
        int i = (int) symbolTable.ST.get(parsed[2]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //pushi val
        c = 70;
        FileOutput.write(c);
        i = Integer.parseInt(parsed[1]);
        x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);


        c = 90;
        FileOutput.write(c);
        symbolTable.PC +=13;
    }
}
