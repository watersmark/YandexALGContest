import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем колличество сторон для образования треугольников
        int countMass = scanner.nextInt();

        // Массив для хранения сторон
        int[] massDigit = new int[countMass];

        // Заполняем массив
        for (int i = 0; i < countMass; i++) {
            massDigit[i] = scanner.nextInt();
        }

        Arrays.sort(massDigit);


        for (int i = 0; i < countMass; i++) {
            try {
                if (massDigit[massDigit.length - 1 - i] < massDigit[massDigit.length - 2 - i] + massDigit[massDigit.length - 3 - i]) {
                    System.out.println(massDigit[massDigit.length - 1 - i] + massDigit[massDigit.length - 2 - i] + massDigit[massDigit.length - 3 - i]);
                    break;
                }
            }
            catch (Exception e){
                break;
            }
        }

    }
}
