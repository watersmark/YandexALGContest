import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Колличество элементов
        int count = scanner.nextInt();

        //Массив под числа
        int[] massDigit = new int[count];

        //Переменные индексы
        int evenIndex = 0;
        int oddIndex = 1;
        int elem = 0;

        for (int i = 0; i < count; i++) {
            elem = scanner.nextInt();

            if (elem % 2 == 0) {
                massDigit[evenIndex] = elem;
                evenIndex += 2;
            } else {
                massDigit[oddIndex] = elem;
                oddIndex += 2;
            }
        }

        for(int el : massDigit){
            System.out.print(el + " ");
        }


    }
}
