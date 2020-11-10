import java.sql.Array;
import java.util.*;

public class Start {
    public static int leftBorder;
    public static int rightBorder;

    public static int startIndex;
    public static int searchElem;

    public static boolean isEnd = false;

    public static Set<Integer> sets = new LinkedHashSet<Integer>();

    public static void binarySearch(int[] mass) {

        // Добавить условие выхода
        if (mass[startIndex] == searchElem || isEnd) {
            if (mass[startIndex] == searchElem) {
                sets.add(mass[startIndex]);
            }

            return;
        }

        // Идём влево
        if (mass[startIndex] > searchElem) {

            if (Math.round(startIndex - leftBorder) == 1 || Math.round(startIndex - leftBorder) == 0) isEnd = true;

            rightBorder = startIndex;
            startIndex = startIndex - Math.round((startIndex - leftBorder) / 2f);


            binarySearch(mass);
        }

        // Идём вправо
        if (mass[startIndex] < searchElem) {

            if (Math.round(rightBorder - startIndex) == 1 || Math.round(rightBorder - startIndex) == 0) isEnd = true;

            leftBorder = startIndex;
            startIndex = startIndex + Math.round((rightBorder - startIndex) / 2f);

            binarySearch(mass);
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Считываем размеры первого и второго массива
        int countFirst = scanner.nextInt();
        int countSecond = scanner.nextInt();

        // Инициализируем первый и второй массив
        int[] firstMass = new int[countFirst];
        int[] secondMass = new int[countSecond];

        //Заполняем первый массив
        for (int i = 0; i < countFirst; i++) {
            firstMass[i] = scanner.nextInt();
        }

        // Заполняем второй массив
        for (int i = 0; i < countSecond; i++) {
            secondMass[i] = scanner.nextInt();
        }

        // Сортируем массив на котором будем применять бинарный поиск
        Arrays.sort(secondMass);

        // Точка старта алгоритма

        for (int i = 0; i < firstMass.length; i++) {

            // Начальные параметры для каждого элемента
            leftBorder = 0;
            rightBorder = secondMass.length - 1;
            startIndex = (secondMass.length) / 2;
            searchElem = firstMass[i];
            isEnd = false;

            // Если элемент уже есть в множестве
            if (sets.contains(firstMass[i])) continue;

            // Обрабатывем случай нулевого второго массива
            try {
                // бинарный поиск
                binarySearch(secondMass);
            }
            catch (Exception ignored){
                // По заданию просто пропускаем
            }

        }


        // Проверяем, какие элементы входят в множество
        for (int elem : sets) {
            System.out.print(elem + " ");
        }


    }
}

/*
5
5
1 2 1 3 4
4 5 6 6 3
 */