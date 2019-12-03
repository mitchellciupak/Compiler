package Language;

import java.nio.ByteBuffer;

public class peek {
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
        //todo find <type>
        char type = 'i';
        if(type == 'c'){ //char
            c = 84;
        }
        else if(type == 's') { //short
            c = 85;
        }
        else if(type == 'i') { //int
            c = 86;
        }
        else if(type == 'f') { //float
            c = 87;
        }
        FileOutput.write(c);
    }
}
