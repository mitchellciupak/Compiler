package Language;

import java.nio.ByteBuffer;
import java.util.Enumeration;

public class jmpc {
    public static void execute(String[] parsed){
        //pushi (label)
        try{
            int i = (int) symbolTable.ST.get(parsed[1]) + 1;
            char c = 70;
            FileOutput.write(c);
            byte[] x = ByteBuffer.allocate(4).putInt(i).array();
            FileOutput.write(x);

            //bc.jmpc
            c = 40;
            FileOutput.write(c);
            symbolTable.PC += 7;
        }catch (NullPointerException ex){
            //symbolTable.PC += 2;
            return;
        }
    }
}
