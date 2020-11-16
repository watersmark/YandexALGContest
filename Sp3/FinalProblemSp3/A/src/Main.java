import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static String[] digitF;
    public static String[] digitS;

    public static void main(String[] args) {
        int[] array1 = {8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43};
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    /**
     * @param buffer1    Массив для сортировки.
     * @param buffer2    Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex   Конечный индекс в buffer1 для сортировки.
     * @return
     */
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        List<Integer> listElem = new ArrayList<Integer>();

        int iFirst = 0;
        int iSecond = 0;

        // Слияние
        while (true) {

            digitF = String.valueOf(sorted1[iFirst]).split("");
            digitS = String.valueOf(sorted2[iSecond]).split("");

            int elemNow = 0;

            // Условие выхода
            if ((sorted1.length - 1) + (sorted2.length - 1) == iFirst + iSecond
                    && iFirst == sorted1.length - 1 && iSecond == sorted2.length - 1) {
                break;
            }

            // Начало с наибольших элементов
            while (true) {

                if (digitF.length == elemNow) {
                    listElem.add(sorted1[iFirst]);
                    if ((sorted1.length - 1) > iFirst) iFirst++;
                    break;
                }

                if (digitS.length == elemNow) {
                    listElem.add(sorted2[iSecond]);
                    if ((sorted2.length - 1) > iSecond) iSecond++;
                    break;
                }

                if (Integer.parseInt(digitF[elemNow]) > Integer.parseInt(digitS[elemNow])) {
                    listElem.add(sorted1[iFirst]);
                    if (sorted1.length - 1 > iFirst) iFirst++;
                    break;
                }

                if (Integer.parseInt(digitF[elemNow]) < Integer.parseInt(digitS[elemNow])) {
                    listElem.add(sorted2[iSecond]);
                    if (sorted2.length - 1 > iSecond) iSecond++;
                    break;
                }
                if (Integer.parseInt(digitF[elemNow]) == Integer.parseInt(digitS[elemNow])) {
                    elemNow++;
                }


            }

        }

        int[] temps = new int[sorted1.length + sorted2.length];

        for (int i = 0; i < listElem.size(); i++) {
            temps[i] = listElem.get(i);
        }

        return temps;
    }
}