import java.util.Arrays;
import java.util.Scanner;

public class Start {


    // Метод для подсчёта сколько
    // фотографий мы можем разместить на серверах
    // Передаём массив серверов(отсортирован)
    public static void photoAlg(int[] massVolume) {
        // Кол-во фото
        int photo = 0;

        // Начальный минимум и максимум
        // для индексов
        int indexMinNow = 0;
        int indexMaxNow = massVolume.length - 1;

        // Кол-во нулей сзади
        int zeroEnd = 0;
        // Кл-во нулей спереди
        int zeroFront = 0;

        for (int i = 0; ; i++) {

            if (zeroFront + zeroEnd == massVolume.length - 1) {
                break;
            }

            // Рассматриваем поиск нового минимума
            // Первый минимум изначально задан
            if (i != 0) {
                for (; ; ) {
                    // Рассмотрим особые случаи
                    if (indexMinNow + 1 == indexMaxNow) {

                        // Назначаем новый максимум и минимум
                        // Ищем справа максимум
                        indexMinNow = indexMaxNow;
                        indexMaxNow = massVolume.length - 1;

                        while (true) {
                            if (massVolume[indexMaxNow] == 0 || indexMaxNow == indexMinNow) {
                                indexMaxNow--;
                                continue;
                            }
                            break;
                        }
                        break;
                    }

                    // Случай если максимальный индекс стоит в конце
                    if (indexMaxNow == massVolume.length - 1 - zeroEnd) {
                        indexMinNow += 1;
                        break;
                    }

                    // Рассмотрим общий случай
                    if (massVolume[indexMinNow + 1] < massVolume[massVolume.length - 1 - zeroEnd]) {
                        indexMinNow += 1;
                        zeroFront++;
                    } else {
                        indexMinNow = massVolume.length - 1 - zeroEnd;
                        zeroEnd++;
                    }

                    break;
                }


            }

            while (true) {
                //  Полностью забрали все места в минимальном data центре
                // Берём новый минимум и новый максимум
                if (massVolume[indexMinNow] == 0) {
                    break;
                }

                massVolume[indexMinNow] -= 1;
                massVolume[indexMaxNow] -= 1;
                photo++;

                // Делаем смещение курсора на новый индекс
                // Рассматриваем левую сторону
                if (massVolume[indexMaxNow - 1] != 0 || indexMinNow != indexMaxNow - 1) {

                    //Проверка является следующий элемент максимумом
                    if (massVolume[indexMaxNow] >= massVolume[indexMaxNow - 1]) {
                        // Максимальный индекс не меняется
                    } else {
                        // Сдвигаемся влево
                        indexMaxNow -= 1;
                    }

                } else {// Случай для возврата вначало массива(движение по кругу)(правая сторона)
                    // Ищем первый подходящий нам элемент с конца
                    indexMaxNow = massVolume.length - 1;
                    while (true) {
                        if (massVolume[indexMaxNow] == 0 || indexMaxNow == indexMinNow) {
                            indexMaxNow--;
                            continue;
                        }

                        break;
                    }
                }

            } // Конец цикла while()
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
        photoAlg(massVolume);
    }
}
