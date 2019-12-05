package Language;
import java.nio.ByteBuffer;

public class printi {
    public static void execute(String[] parsed){
        char c = 70;
        FileOutput.write(c);
        int i = Integer.parseInt(parsed[1]);
        byte[] x = ByteBuffer.allocate(4).putInt(i).array();
        FileOutput.write(x);

        //
        symbolTable.mem.add(70);
        symbolTable.mem.add(i);

        c = 146;
        FileOutput.write(c);
        symbolTable.PC += 6;

        //
        symbolTable.mem.add(146);
    }
}
