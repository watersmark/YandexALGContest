import java.util.Scanner;

public class mainsScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[][] mass = new String[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[j][i] = scanner.next();
            }
        }

        for (String[] elems : mass) {
            for (String elem : elems) {
                System.out.print(elem + " ");
            }

            System.out.println();
        }

    }
}
