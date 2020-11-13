import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Start {
    public static String[] tempMass;
    public static int posNow = 0;

    // Метод для нахождения общей площади участков
    public static void areaFind(SortedMap<Integer, Integer> pairMap) {

        for (Map.Entry<Integer, Integer> mapElem : pairMap.entrySet()) {

        }

    }

    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение данных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Кол-во пар обработанных участков
        int countPair = Integer.parseInt(reader.readLine());

        // map где храним участки
        SortedMap<Integer, Integer> pairMap = new TreeMap<Integer, Integer>();


        // Заполняем map
        for (int i = 0; i < countPair; i++) {
            tempMass = reader.readLine().split(" ");
            pairMap.put(Integer.parseInt(tempMass[0]), Integer.parseInt(tempMass[1]));
        }

    }
}
