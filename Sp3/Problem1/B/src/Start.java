import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Кол-во жлементов в массиве
        int countDigit = scanner.nextInt();

        // Массив чисел
        int[] massDigit = new int[countDigit];

        for (int i = 0; i < countDigit; i++) {
            massDigit[i] = scanner.nextInt();
        }

        // Начинаем сортировать Insertion sort(сортировка вставками)

        for (int i = 0; i < massDigit.length; i++) {

            // Индекс где мы сейчас находимся в массиве
            // рассматриваемым элементом
            int indexPosNow = i;

            // Переменна для замены значений
            // Между двумя ячейками массива
            int tempRec = i - 1;

            // Проверяем и сдвигаем элементы
            while (true) {

                if (indexPosNow == 0 || massDigit[indexPosNow] > massDigit[indexPosNow - 1]) {
                    break;
                }

                tempRec = massDigit[indexPosNow - 1];

                massDigit[indexPosNow - 1] = massDigit[indexPosNow];
                massDigit[indexPosNow] = tempRec;
                indexPosNow--;

            }
        }

        for (int i = 0; i < massDigit.length; i++){
            System.out.print(massDigit[i] + " ");
        }

    }
}
