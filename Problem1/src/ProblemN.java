import java.util.Scanner;

public class ProblemN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();


        if (digit == 4) {
            System.out.println("True");
            return;
        }

        if ((Math.log(digit) / Math.log(4)) % 2 != 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
