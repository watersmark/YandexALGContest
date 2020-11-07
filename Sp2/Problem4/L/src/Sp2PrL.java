import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Sp2PrL {
    public static int count = 0;
    public static int[]  massIntNominal;

    // Метод для рекурсивного поиска суммы
    public static void recSum(int sum,  int sumNow, int indexDrop, boolean bool) {

        for (int i = 0; i < massIntNominal.length; i++) {

            // Когда достигли нужного результата
            // переходим на уровень выше
            if(sum == sumNow +  massIntNominal[i] ){
                count++;
                return;
            }

            // Если перебрали с суммой
            // Возвращаемся на уровень выше
            if(sum > sum +  massIntNominal[i]){
                return;
            }

            // Делаем рекурсивный шаг
            // Достигнув конца мы поднимаемся только выше
            // Вниз мы больше не возвращаемся
            if(bool) {
                recSum(sum, sumNow + massIntNominal[i], indexDrop, bool);
                bool = false;
            }
        }


    }


    public static void main(String[] args) throws IOException {

        // Объявили поток входных данных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Объявили требуемую сумму
        int costSum = Integer.parseInt(reader.readLine());

        // Сколько будет разных монет
        int differentMoney = Integer.parseInt(reader.readLine());

        // Считываем номинал монет
        String[] massNominal = reader.readLine().split(" ");

        // Преобразуем в массив int[]
        massIntNominal = new int[massNominal.length];

        // Перегоняем значения из String в Int
        for (int i = 0; i < massNominal.length; i++) {
            massIntNominal[i] = Integer.parseInt(massNominal[i]);
        }

        Arrays.sort(massIntNominal);


    }
}
