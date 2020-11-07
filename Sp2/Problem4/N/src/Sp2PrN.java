import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class Sp2PrN {

    // Начальные числа
    public static int first;
    public static int second;

    // параметры для шага функции
    static int qNew;
    static int r2New;
    static int s2New;
    static int t2New;
    static int RTemp;

    // Рекурсивный метод
    // Реализуем расширенный алгоритм Евклида
    public static void specNod(int r1, int r2, int s1,
                               int s2, int t1, int t2, int R) {

        // Случай для взаимнопростых простых чисел
        // gcd(r1, r2) = 1
        if (r2 == 1) {
            if (first * s2 + second * t2 == 0) {
                System.out.println(String.format("%d %d %d", s2, t2, 1));
                return;
            } else {
                System.out.println(String.format("%d %d %d", t2, s2, 1));
                return;
            }
        }

        // Случай для невзаимнопростых чисел
        if (R == 0) {
            // Делаем проверку на положение
            // коэффициентов
            if(first * s2 + second * t2 == 0) {
                System.out.println(String.format("%d %d %d", s1, t1, r1));
                return;
            } else {
                System.out.println(String.format("%d %d %d", t1, s1, r1));
                return;
            }
        }

        // Считаем параметры для новой функции
        qNew = r1 / r2;
        r2New = r1 % r2;
        s2New = s1 - qNew * s2;
        t2New = t1 - qNew * t2;
        RTemp = r1 % r2;

        // Делаем рекурсивный шаг функции
        specNod(r2, r2New, s2, s2New, t2, t2New, RTemp);


    }

    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        // Считывем коэффициенты
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        first = Integer.parseInt(reader.readLine());
        second = Integer.parseInt(reader.readLine());

        // Сделать проверку на большее и меньшее число
        // Так как для данного алгоритма важно получение
        // Большего числа в первую ячейку

        if(first > second){
            specNod(first, second, 1, 0, 0, 1, 1);
        }
        else{
            specNod(second, first, 1, 0, 0, 1, 1);
        }

    }
}
