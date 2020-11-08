import java.util.Arrays;
import java.util.Scanner;

public class Start2 {

    static int indexMin;
    static int indexMax;
    static int photo;

    static int zeroEnd = 0;
    static int zeroStart = 0;

    // Массив где считаются наши фото
    public static void photoCount(int[] massVolume) {

        for (int i = 0; ; i++) {

            // Условие выхода из цикла остался один data центр
            if(zeroStart + zeroEnd >= massVolume.length - 1){
                break;
            }

            // Начальный случай
            if (i == 0) {
                indexMax = massVolume.length - 1;
                indexMin = 0;
                zeroStart++;
            } else {

                if (massVolume[indexMin] > massVolume[massVolume.length - 1 - zeroStart]) {
                    indexMin = massVolume.length - 1 - zeroEnd;
                    zeroEnd++;
                } else {
                    indexMin++;
                    zeroStart++;
                }
            }

            // Забираем элементы из минимума пока не зклнчатся
            while (massVolume[indexMin] != 0) {

                massVolume[indexMin]--;
                massVolume[indexMax]--;
                photo++;

                if(massVolume[indexMax] == 0){
                    zeroEnd++;
                }

                // Если можем сделать шаг влево
                // В остальных случаях курсор стоит на месте
                if (indexMax - 1 == indexMin || massVolume[indexMax - 1] == 0) {
                    indexMax = massVolume.length - 1 - zeroEnd;
                    continue;
                }

                // Обычный случай
                if (massVolume[indexMax] < massVolume[indexMax - 1]) {
                    indexMax--;
                    continue;
                }
            }


        }

    }


    public static void main(String[] args) {

        // Открываем поток на чтение данных
        Scanner scanner = new Scanner(System.in);

        // Переменная кол-ва data центров
        int count = scanner.nextInt();

        //Массив, где мы будем их хранить
        int[] massVolume = new int[count];

        //Считываем данные
        for (int i = 0; i < count; i++) {
            massVolume[i] = scanner.nextInt();
        }

        // Сортируем для дальнейшей работы алгоритам
        Arrays.sort(massVolume);

        // Передаём массив данных в алгоритм
        photoCount(massVolume);
        System.out.println(photo);
    }
}
