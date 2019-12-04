package Language;

import java.nio.ByteBuffer;

public class jmp {
    public static void execute(String[] parsed){
        //pushi (label)
        try{
            int i = (int) symbolTable.ST.get(parsed[1]);
            char c = 70;
            FileOutput.write(c);
            byte[] x = ByteBuffer.allocate(4).putInt(i).array();
            FileOutput.write(x);

            //bc.jmp
            c = 36;
            FileOutput.write(c);
            symbolTable.PC += 7;
        }catch(NullPointerException ex){
            symbolTable.PC += 7;
            return;
        }
    }
}
