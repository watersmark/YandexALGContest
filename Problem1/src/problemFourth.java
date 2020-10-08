import java.util.Scanner;

public class problemFourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int elem = 0;

        for (int i = 0; i < count; i++) {
            elem = scanner.nextInt();

            if (elem != 0) {
                System.out.print(elem + " ");
            }

        }
    }
}
