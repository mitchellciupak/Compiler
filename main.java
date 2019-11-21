import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main{
    public static void main(String args[]){

        //Read in the file and send each line to the lineReader
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            while(line != null){
                //CALL FUNC TO TAKE ACTION ON THE LINE
                System.out.println(line);
                //READ THE NEXT LINE
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
