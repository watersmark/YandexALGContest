import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Номер посылки : 39436569


// Вариант реализации Stack
class Stack {
    // Размер стэка на данный момент
    private int stackSizeNow;

    // Массив в котором хранятся наши элементы
    // Теперь реализация не через ArrayList<>, а через int[]
    int[] massElem;

    // Конструктор нашего класса Stack
    // Передаём размер массива
    // Размер не больше максимального числа элементов
    public Stack(int size){
        massElem = new int[size];
    }

    // Реализуем метод добавления в Stack
    // И увеличивем размер стэка на 1
    public void add(int elem){
        massElem[stackSizeNow] = elem;
        this.stackSizeNow++;
    }

    // Реализуем метод для взятия элемента
    // И уменьшаем стэк на 1
    public int get(){
        this.stackSizeNow--;
        return massElem[stackSizeNow];
    }

}


// Класс для проверки, что нам на вход пришёл
// знак операции
class CommandSet{
    // Set операндов
    private final static Set<String> setOperation = new HashSet<String>(Arrays.asList("+", "*", "-", "/"));

    public static Set<String> getSetOperation() {
        return setOperation;
    }
}

// Класс для работы с операциями
class WorkWithOperation{
    private Stack stack;

    public WorkWithOperation(Stack stack){
        this.stack = stack;
    }

    // Считаем результат входной строки
    // Проходимся по строке и действуем по алгоритму
    public int getResult(String[] elemMass) {
        for (String elem : elemMass) {

            // Проверяем что пришло на вход число или операнд
            if (CommandSet.getSetOperation().contains(elem)){
                // Производим полученную операцию
                setOperation(elem);
            } else {
                // Добавляем элемент на вершину стэка
                stack.add(Integer.parseInt(elem));
            }
        }

        // Возвращаем последний
        // элемент стэка
        return stack.get();
    }

    // Выполняем операцию полученную при разборе строки в методе getResult(String[] elemMass)
    private void setOperation(String elem) {
        if (elem.equals("+")) {
            int first = stack.get();
            int second = stack.get();
            stack.add(second + first);
        }
        if (elem.equals("-")) {
            int first = stack.get();
            int second = stack.get();
            stack.add(second - first);
        }
        if (elem.equals("/")) {
            int first = stack.get();
            int second = stack.get();
            stack.add((int) Math.floor((double) second / first));

        }
        if (elem.equals("*")) {
            int first = stack.get();
            int second = stack.get();
            stack.add(second * first);
        }
    }

}



// Это входной класс нашей программы
public class Start {
    public static void main(String[] args) throws IOException {
        int a = 0;
        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Разбиваем строку на массив данных
        String[] elemMass = reader.readLine().split(" ");

        // Создаём класс и передаём аргументы необходимые
        // для создания начального массива
        Stack stack = new Stack(elemMass.length);

        // Создаём класс для работы с данными
        // Передаём в него раннее созданный
        // Экземпляр стэка
        WorkWithOperation workData = new WorkWithOperation(stack);

        // Передаём в метод массив элементов
        int result = workData.getResult(elemMass);


        // Печатаем результат
        System.out.println(result);

    }
}
