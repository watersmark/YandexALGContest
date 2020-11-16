import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Напишем собственную реализацию
// поразрадной сортировки(Radix sort)
public class RadixSort {
    // Заведём массив два массива
    // Поочерёдно перезаполняя их
    // Получим отсортированный массив
    private static int[] firstMassDigit;
    private static int[] secondMassDigit;

    // Заведём массив для подсчёта знаков искомого разряда
    // Разряды идут от меньшего к большему
    // На каждой иттерации смещение на один влево
    // Числа в масиве от 0 до 9
    private static int[] countMass = new int[10];
    private static int[] countMassTemp = new int[10];

    // Заведём переменную для последнего числа
    // Так же временную переменную для каждого шага внутри
    // Поиска временной суммы
    private static int lastDigit;
    private static int tempSum;

    // Введём переменную для выхода из рекурсии
    private static int recEnd;


    // метод для сортировки данных (RadixSort)
    // сначала проходимся по массиву и заполняем
    // подсчётом массив countMass
    // потом сортируем согласно принципу Radix sort
    // рекурсивно вызываем этот же метод с новыми параметрами
    public static void radixSort(int tenDegree, int massNow) {

        // Условие выхода
        // Сразу напечатаем массив
        if (recEnd == 0) {
            if (massNow == 0) printMass(firstMassDigit);
            if (massNow == 1) printMass(secondMassDigit);

            return;
        }

        // Заполняем массив подсчётом
        for (int i = 0; i < firstMassDigit.length; i++) {
            //lastDigit = (firstMassDigit[i] / (int) Math.pow(10, tenDegree)) / (int) Math.pow(10, tenDegree - 1);
            countMass[(firstMassDigit[i] % (int) Math.pow(10, tenDegree)) / (int) Math.pow(10, tenDegree - 1)] += 1;
        }

        // Для выбора массивов по порядку
        if (massNow == 0) { // firstMassDigit выбран заполняем secondMassDigit
            sortMass(tenDegree, firstMassDigit, secondMassDigit);
        } else { // secondMassDigit выбран заполняем firstMassDigit
            sortMass(tenDegree, secondMassDigit, firstMassDigit);
        }

        // Делаем рекурсивный шаг на следующий уровень
        if (massNow == 0) massNow = 1;
        else massNow = 0;
        recEnd--;

        radixSort(tenDegree + 1, massNow);
    }

    // Метод для сортировки массива
    private static void sortMass(int tenDegree, int[] firstMassDigit, int[] secondMassDigit) {

        for (int i = 0; i < firstMassDigit.length; i++) {
            lastDigit = (firstMassDigit[i] % (int) Math.pow(10, tenDegree)) / (int) Math.pow(10, tenDegree - 1);

            // Ищем временную сумму
            for (int j = lastDigit; j < 10; j++) {
                tempSum += countMass[j];
                tempSum += countMassTemp[j];
            }

            // Вычитаем -1, так как это наш элемент
            tempSum -= (countMassTemp[lastDigit] + 1);

            // Записываем полученный элемент в массив
            secondMassDigit[secondMassDigit.length - 1 - tempSum] = firstMassDigit[i];

            // Обнуляем tempSum для следующей операции
            // Уменьшаем размер массива countMass в соответствующей ячейке
            tempSum = 0;

            countMass[lastDigit] -= 1;
            countMassTemp[lastDigit] += 1;
        }

        // Очищаем вспомогательный массив
        // Делаем значения во всех ячейках нулями
        Arrays.fill(countMassTemp, 0);

    }

    // Метод для печати массива отсортированного
    public static void printMass(int[] firstMassDigit) {
        for (int j : firstMassDigit) {
            System.out.print(j + " ");
        }
    }

    // Метод для поиска размерности рекурсии
    public static void findMax() {
        int tempMax = 0;

        for (int i = 0; i < firstMassDigit.length; i++) {
            if (i == 0) {
                tempMax = firstMassDigit[i];
                continue;
            }

            if (tempMax < firstMassDigit[i]) {
                tempMax = firstMassDigit[i];
            }
        }

        // Ищем кол-во разраядов в максиальном элементе
        recEnd = String.valueOf(tempMax).split("").length;
    }

    // Входная точка программы
    public static void main(String[] args) {

        // Откроем поток на чтение данных
        Scanner scanner = new Scanner(System.in);

        // Считаем кол-во чисел
        int countDigit = scanner.nextInt();

        // Инициализируем массивы
        firstMassDigit = new int[countDigit];
        secondMassDigit = new int[firstMassDigit.length];

        // Считаем данные в массив
        for (int i = 0; i < countDigit; i++) {
            firstMassDigit[i] = scanner.nextInt();
        }


        // Ищем максимальное число, чтобы задать максимальный
        // Уровень сортировки
        findMax();

        // Запускаем алгоритм сортировки
        radixSort(1, 0);

    }
}
