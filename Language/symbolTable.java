package Language;

import java.util.Dictionary;
import java.util.Hashtable;

public class symbolTable {
    public static Dictionary ST = new Hashtable();
    public static int offset = 0;
    public void add(String name, int offset){
        ST.put(name,offset++);
    }
}
