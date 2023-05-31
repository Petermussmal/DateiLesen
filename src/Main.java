import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static String textFileName = "demo2.txt";

    public static void main(String[] args) {
        try{
            textFileName = args[0];
        }catch(Exception e){
            System.out.println(e);
        }

        try {
            System.out.format("%.4f\n", StringWorker.averageWordlength(Files.readString(Path.of(textFileName)).split(" ")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}