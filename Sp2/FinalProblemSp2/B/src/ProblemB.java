import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Данную задачу можно за log(n)
// времени решить с помощью рекурсии
public class ProblemB {
    // Объявляем переменную для поиска в массиве
    private static int searchElem;
    private static String[] massElems;


    // Рекурсивная функция для поиска элемента
    public static void recLog(int indexNow, int LeftEnd, int RightEnd, boolean isEnd) {


        // Разберём случай рекурсивного возврата
        // и случай для оптимизации быстрого возврата(частный случай)
        if (Integer.parseInt(massElems[0]) >= searchElem) {

            // Случай первого индекса
            if (Integer.parseInt(massElems[0]) == searchElem) {
                System.out.println("0");
                return;
            }

            // Случай последнего индекса, когда мы ничего не нашли
            if (Integer.parseInt(massElems[massElems.length - 1]) != searchElem) {
                System.out.println("-2");
                return;
            }

            // Случай когда нашли в последнем индексе
            System.out.println(massElems.length - 1);
            return;
        }


        // Теперь перейдём к случаю возврата из рекурсии(Общий случай)
        // Если ничего не нашли вернём -1
        // Так же проверим не попали ли мы на нужный нам элемент
        if (isEnd || Integer.parseInt(massElems[indexNow]) == searchElem) {

            if (Integer.parseInt(massElems[indexNow]) != searchElem) {
                System.out.println("-1");
                return;
            }

            // Печатаем индекс элемента, который нашли
            System.out.println(indexNow);
            return;
        }

        // Рассмотрим шаг рекурсии, каждый шаг
        // Делим оставшуюся последовательность на
        // две части и смотрим куда дальше пойдём
        //Случай точного попадания на элемент уже рассмотрен

        // Двигаемся в левую сторону
        if (Integer.parseInt(massElems[indexNow]) > searchElem) {

            if((int) Math.round(((double) indexNow - LeftEnd) / 2 ) == 1
                    || (int) Math.round(((double) indexNow - LeftEnd) / 2 ) == 0){
                isEnd = true;
            }
            recLog(indexNow - (int) Math.round(((double) indexNow - LeftEnd) / 2 ), LeftEnd, indexNow, isEnd);

        } else { // Двигаемся в правую сторону

            if((int) Math.round(((double) RightEnd - indexNow) / 2) == 1
                    ||(int) Math.round(((double) RightEnd - indexNow) / 2) == 0 )
            {
                isEnd = true;
            }

            recLog(RightEnd - (int) Math.round(((double) RightEnd - indexNow) / 2) , indexNow, RightEnd, isEnd);
        }


    }

    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Считываем длинну массива
        int lenMass = Integer.parseInt(reader.readLine());

        // Искомый элемент
        searchElem = Integer.parseInt(reader.readLine());

        // Считываем массив с последовательностью
        massElems = reader.readLine().split(" ");

        // Начало метода recLog
        recLog(Math.round((massElems.length - 1) / 2f), 0, massElems.length - 1, false);

    }
}
