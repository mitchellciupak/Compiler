package Language;

import java.nio.ByteBuffer;

public class poke {
    public static void execute(String[] parsed) {
        //pushi (var)
        char c = 70;
        FileOutput.write(c);
        //TODO (var)
//        int i = 0;
//        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
//        FileOutput.write(x);

        //pushi val
        c = 70;
        FileOutput.write(c);
        //TODO (val)

        //bc.peek<type>
        //TODO find <type>
        char type = 'i';
        if(type == 'c'){ //char
            c = 88;
        }
        else if(type == 's') { //short
            c = 89;
        }
        else if(type == 'i') { //int
            c = 90;
        }
        else if(type == 'f') { //float
            c = 91;
        }
        FileOutput.write(c);
    }
}
