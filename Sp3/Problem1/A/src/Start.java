import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Кол-во жлементов в массиве
        int countDigit = scanner.nextInt();

        // Массив чисел
        int[] massDigit = new int[countDigit];

        for (int i = 0; i < countDigit; i++) {
            massDigit[i] = scanner.nextInt();
        }

        // Начинаем сортировать
        int invElem = 0;
        for (int i = 0; i < massDigit.length; i++) {

            for (int j = 0; j < massDigit.length - 1 - i; j++) {

                if (massDigit[j] > massDigit[j + 1]) {
                    int temp1 = massDigit[j];
                    int temp2 = massDigit[j + 1];

                    massDigit[j] = temp2;
                    massDigit[j + 1] = temp1;
                }
            }

        }

        for (int i = 0; i < massDigit.length; i++) {
            System.out.print(massDigit[i] + " ");
        }

    }
}

//-30 -30 -20 -12 -10 2 3 5 7 8 13 26 27 18
//-30 -30 -20 -12 -10 2 3 5 7 8 13 18 26 27
