package Language;

import java.nio.ByteBuffer;

public class jmpc {
    public static void execute(String[] parsed){
        //pushi (label)
        if(parsed[1] == "error"){
            return;
        }
        int i = (int) symbolTable.ST.get(parsed[1]);
        char c = 74;
        FileOutput.write(c);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //bc.jmpc
        c = 40;
        FileOutput.write(c);
    }
}
