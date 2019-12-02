import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Language.*;

class Main{
    public static void main(String args[]){
        //We need to call a dictionary init to build a dictionary of opp codes

        //Read in the file and send each line to the lineReader
        BufferedReader reader;
        String[] parsed = null;
        try{
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            while(line != null){
                //CALL FUNC TO PARSE THE LINE
                parsed = LineParse(line);

                //READ THE NEXT LINE
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*  LineParse
    *   This function performs 2 actions
    *       -Determines if a line is a comment, if it is, the line will be ignored
    *       -Parses the line into its parts and returns as a String[]
     */
    public static String[] LineParse(String line){
        //Determines if the line is a comment or not
        boolean comment = line.indexOf("//") != -1? true: false;
        if(!comment){
            line.trim();
            String[] split = line.split("\\s");
            return split;
        }
        return null;
    }
}
