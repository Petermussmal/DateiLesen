import java.util.Hashtable;

public class StringWorker {
    public static double averageWordlength(String[] text){
        int totalLength = 0;
        for(String s : text){
            totalLength += s.length();
        }

        return (double) totalLength /text.length;
    }
}
