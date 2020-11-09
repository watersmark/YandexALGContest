import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mainPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String[]> str = new ArrayList<String[]>();

        for (int i = 0; i < n; i++) {
            str.add(reader.readLine().split(" "));
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(str.get(j)[i] + " ");
            }

            System.out.println();
        }

    }
}
