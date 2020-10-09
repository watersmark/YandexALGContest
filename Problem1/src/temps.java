import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class temps {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            int el = reader.read();
            int f = String.valueOf((char) el).toUpperCase().charAt(0);
            System.out.print((char) f);

        }








    }
}
