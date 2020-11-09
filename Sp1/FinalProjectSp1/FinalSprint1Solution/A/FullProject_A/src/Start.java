import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Номер посылки : 39341469

class Stack {
    // Размер стэка на данный момент
    private int stackSize;
    // Храним данные
    private List<Integer> listElem = new ArrayList<Integer>();
    // Set операндов
    private Set<String> setOperation = new HashSet<String>(Arrays.asList("+", "*", "-", "/"));

    // Результат вычислений
    private int result;

    // Считаем результат входной строки
    // Проходимся по строке и действуем по алгоритму
    public int getResult(String[] elemMass) {
        for (String elem : elemMass) {

            // Проверяем что пришло на вход число или операнд
            if (setOperation.contains(elem)){
                // Производим полученную операцию
                setOperation(elem);
            } else {
                // Добавляем элемент на вершину стэка
                listElem.add(Integer.parseInt(elem));
            }
        }

        return listElem.get(0);
    }

    // Выполняем операцию полученную при разборе строки в методе getResult(String[] elemMass)
    private void setOperation(String elem) {
        if (elem.equals("+")) {
            int tempResult = listElem.get(listElem.size() - 2) + listElem.get(listElem.size() - 1);
            listElem.remove(listElem.size() - 1);
            listElem.set(listElem.size() - 1, tempResult);
        }
        if (elem.equals("-")) {
            int tempResult = listElem.get(listElem.size() - 2) - listElem.get(listElem.size() - 1);
            listElem.remove(listElem.size() - 1);
            listElem.set(listElem.size() - 1, tempResult);
        }
        if (elem.equals("/")) {

            int tempResult = (int) Math.floor((double) listElem.get(listElem.size() - 2) / listElem.get(listElem.size() - 1));

            listElem.remove(listElem.size() - 1);
            listElem.set(listElem.size() - 1, tempResult);
        }
        if (elem.equals("*")) {
            int tempResult = listElem.get(listElem.size() - 2) * listElem.get(listElem.size() - 1);
            listElem.remove(listElem.size() - 1);
            listElem.set(listElem.size() - 1, tempResult);
        }
    }


}

// Это входной класс нашей программы
public class Start {
    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Разбиваем строку на массив данных
        String[] elemMass = reader.readLine().split(" ");

        // Создаём класс
        Stack stack = new Stack();

        // Передаём данные
        int result  = stack.getResult(elemMass);

        // Печатаем результат
        System.out.println(result);

    }
}
