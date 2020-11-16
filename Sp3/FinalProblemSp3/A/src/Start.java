import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Для решения данной задлачи реализуем сортировку слиянием
// Но при слиянии элементов массивов, будем использовать
// Личные правила сравнения, подходящте для данной задачи
public class Start {

    // вынесем константные переменные
    // храним в elemTemp элемент для следующего шага рекурсии
    public static int elemTemp;


    // метод для сортировки основанный на mergeSort,
    // но при слиянии будут использованы особые правила
    // выполняем разбиение массива рекурсивно
    public static List<Integer> mergeSort(List<Integer> massElem, int leftBorder, int rightBorder, int elemNow) {

        // Условие выхода из массива
        if (massElem.size() == 1) {
            return massElem;
        }


        // делаем шаг рекурсии сначала влево потом вправо
        // делам шаг влево
        elemTemp = elemNow - (int) Math.round((elemNow - leftBorder) / 2.0);
        mergeSort(massElem.subList(leftBorder, elemTemp + 1), leftBorder, elemNow, elemTemp);

        // делам шаг вправо, после возврата с шага влево
        elemTemp = elemNow - (int) Math.round((elemNow - leftBorder) / 2.0);
        //mergeSort(massElem.subList(elemTemp + 1, elemNow), elemTemp + 1, rightBorder, el)

        return massElem;
    }

    // Входная точка программы, считываем данные и передаём в методы выше
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Считываем кол-во элементов в массиве
        int countElem = scanner.nextInt();

        // Инициализируем массив
        List<Integer> listElem = new ArrayList<Integer>();

        //Считываем элементы в массив
        for (int i = 0; i < countElem; i++) {
            listElem.add(scanner.nextInt());
        }

    }
}
