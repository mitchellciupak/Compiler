package Language;

import java.nio.ByteBuffer;

public class jmp {
    public static void execute(String[] parsed){
        //pushi (label)
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 70;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //bc.jmp
        c = 36;
        FileOutput.write(c);
    }
}
