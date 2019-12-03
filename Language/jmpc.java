package Language;

import java.nio.ByteBuffer;
import java.util.Enumeration;

public class jmpc {
    public static void execute(String[] parsed){
        //pushi (label)
        try{
            int i = (int) symbolTable.ST.get(parsed[1]);
            char c = 70;
            FileOutput.write(c);
            byte[] x = ByteBuffer.allocate(4).putInt(i).array();
            FileOutput.write(x);

            //bc.jmpc
            c = 40;
            FileOutput.write(c);
        }catch (NullPointerException ex){
            return;
        }
    }
}
