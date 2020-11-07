import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sp2PrM {

    // Рекурсивная функция нахождения НОД
    public static void Nod(int max, int min) {

        // Случай для простых чисел
        if(max % min == 1){
            System.out.println(1);
            return;
        }

        // Случай для сложных чисел
        if(max % min == 0){
            System.out.println(min);
            return;
        }

        // Рекурсивный шаг
        Nod(min, max % min);

    }

    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение, получаем размеры
        // сторон периметра
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        // Стартовая точка алгоритма
        Nod(first, second);

    }
}
