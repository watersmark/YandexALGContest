import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Start {
    public static int elem = 0;

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int countWear = Integer.parseInt(reader.readLine());
        Scanner scanner = new Scanner(System.in);
        int countWear = scanner.nextInt();

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < countWear; i++) {
            elem = scanner.nextInt();
            if (elem == 0) zero++;
            if (elem == 1) one++;
            if (elem == 2) two++;
        }

        for (int i = 0; i < countWear; i++) {
            if (zero != 0) {
                System.out.print(0 + " ");
                zero--;
                continue;
            }
            if (one != 0) {
                System.out.print(1 + " ");
                one--;
                continue;
            }

            if (two != 0) {
                System.out.print(2 + " ");
                two--;
            }

        }
    }
}
