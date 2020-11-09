import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemL {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] first = reader.readLine().split("");
        String[] second = reader.readLine().split("");

        int fSum = 0;
        int sSum = 0;

        for (int i = 0; i < first.length; i++) {
            fSum += first[i].charAt(0);
        }

        for (int i = 0; i < second.length; i++) {
            sSum += second[i].charAt(0);
        }

        System.out.println((char)(sSum - fSum));
    }
}
