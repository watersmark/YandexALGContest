import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Start {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // Кол-во чисел для сортировки
        int countDigits = scanner.nextInt();

        // Массив с числами для сортировки
        int[] massDigits = new int[countDigits];

        for (int i = 0; i < countDigits; i++) {
            massDigits[i] = scanner.nextInt();
        }

        // Кол-во чисел образца
        int countObj = scanner.nextInt();

        // Создадим map, где будем хранит числа
        Map<Integer, Integer> mapDigit = new LinkedHashMap<Integer, Integer>();

        // Считаем сразу числа в map
        for (int i = 0; i < countObj; i++) {
            mapDigit.put(scanner.nextInt(), 0);
        }

        // Создадим массив, где храним избыток чисел
        ArrayList<Integer> listMuch = new ArrayList<>();

        // Заполняем словарь и массив для элементов
        // без образца
        for (int i = 0; i < countDigits; i++) {
            if (mapDigit.containsKey(massDigits[i])) {
                mapDigit.put(massDigits[i], mapDigit.get(massDigits[i]) + 1);
            } else {
                listMuch.add(massDigits[i]);
            }
        }

        for (Map.Entry<Integer, Integer> mapElem : mapDigit.entrySet()) {
            for (int i = 0; i < mapElem.getValue(); i++) {
                System.out.print(mapElem.getKey() + " ");
            }
        }

        // Сортируем вторичный массив
        Collections.sort(listMuch);

        for (int i = 0; i < listMuch.size(); i++) {
            System.out.print(listMuch.get(i) + " ");
        }

    }
}
