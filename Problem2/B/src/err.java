import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class err {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int el = reader.read();
        System.out.println((char) el);
    }
}
