package Language;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 
public class FileOutput {
    public static OutputStream outfile;

    public FileOutput(){
        try{
            outfile = new FileOutputStream("output.bin");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void write(char c){
        try{
            outfile.write(c);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void write(int i) {
        try {
            outfile.write(i);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void write(byte[] code){
        try{
            for(int i = code.length-1; i>=0 ; i--){
                outfile.write(code[i]);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
