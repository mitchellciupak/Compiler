import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
    public static void main(String args[]){

        //Read in the file and send each line to the lineReader
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            while(line != null){
                //CALL FUNC TO TAKE ACTION ON THE LINE
                LineReader(line);
                //READ THE NEXT LINE
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void LineReader(String line){
        //Determines if the line is a comment or not
        boolean comment = line.indexOf("//") != -1? true: false;
        if(!comment){
            System.out.println(line);
        }
    }
}
