import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mains {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        String[][] mass = new String[m][n];
        String[] res;

        for (int i = 0; i < n; i++) {
            res = reader.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                mass[j][i] = res[j];
            }

        }


        for (String[] el : mass) {

            for (String elem : el) {
                System.out.print(elem + " ");
            }

            System.out.println();
        }

    }
}
