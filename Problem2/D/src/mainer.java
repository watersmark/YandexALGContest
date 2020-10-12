import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mainer {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во строк
        int m = scanner.nextInt(); // кол-во столбцов

        short[][] mass = new short[n][m]; // массив матрицы

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = (short) scanner.nextInt();
            }
        }

        int ns = scanner.nextInt();
        int ms = scanner.nextInt();

        //ArrayList<Short> list = new ArrayList<Short>();


        // Обрабатываем по строкам
        if (ns - 1 >= 0) {
            //list.add(mass[ns - 1][ms]);
        }
        if (ns + 1 < n) {
            //list.add(mass[ns + 1][ms]);
        }

        // Обрабатываем по столбцам
        if (ms - 1 >= 0) {
            //list.add(mass[ns][ms - 1]);
        }
        if (ms + 1 < m) {
            //list.add(mass[ns][ms + 1]);
        }


        /*
        for (int i : list) {
            System.out.print(i + " ");
        }

         */

    }
}
