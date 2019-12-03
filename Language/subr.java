package Language;

import java.nio.ByteBuffer;

public class subr {
    //pushi 3 times (16,17,1)
    // call
    // halt
    public static void execute(String[] parsed){
        //pushi 16
        char c = 70;
        FileOutput.write(c);

        int i = 16; //Integer.parseInt(parsed[1]);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //pushi 16
        c = 70;
        FileOutput.write(c);

        i = 17; //Integer.parseInt(parsed[1]);
        x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //pushi 1
        c = 70;
        FileOutput.write(c);

        i = 1; //Integer.parseInt(parsed[1]);
        x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //call
        c = 44;
        FileOutput.write(c);

        //halt
        c = 0;
        FileOutput.write(c);
    }
}
