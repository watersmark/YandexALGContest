import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Посылка номер: 39437279


// Реализация класса Que
// В данной реализации сделаем так, чтобы
// каждый элемент очереди был стеком
// Для этого реализуем дополнительно класс Stack
// С методами add, get
class QueOnStack {
    // Получаем Стэк при создании экземпляра
    private Stack tempStack;

    //Размер очереди на данный момент
    private int sizeNow;


    // Кноструктор очереди
    public QueOnStack(int sizeMass, Stack stack){
        this.tempStack = stack;
    }

    // Добавляем элемент в очередь
    // Используем для этого новый Stack
    public void put(int elem){
        tempStack.add(elem);
        this.sizeNow++;
    }

    //Получаем жлемент из очереди
    //Чтобы сохранялся принцип LIFO
    //Берём элемент из головы очереди
    //Для этого есть отдельная перемення
    public void get(){

        // Если очередь пуста, то ошибка
        if(this.sizeNow == 0){
            System.out.println("error");
            return;
        }

        System.out.println(tempStack.get());
        this.sizeNow--;
    }

    // Получаем число элементов в очереди
    public void getSize(){
        System.out.println(this.sizeNow);
    }



}

// Реализация класса Stack
class Stack {
    // Размер стэка на данный момент
    private int stackSizeNow;
    // Берём с стэка новый элемаент
    private int headStack;

    // Массив в котором хранятся наши элементы
    // Теперь реализация не через ArrayList<>, а через int[]
    int[] massElem;

    // Инициализируем Stack
    public Stack(int sizeStack){
        this.massElem = new int[sizeStack];
        stackSizeNow = sizeStack - 1;
        headStack = sizeStack - 1;
    }

    // Реализуем метод добавления в Stack
    // И уменьшаем размер стэка на 1
    public void add(int elem) {
        massElem[stackSizeNow] = elem;
        this.stackSizeNow--;
    }

    // Реализуем метод для взятия элемента
    // И уменьшаем голову стэка на 1
    public int get() {
        int elem =  massElem[headStack];
        this.headStack--;
        return elem;
    }

}


public class SolutionPr3 {
    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем число комманд
        int countCommand = Integer.parseInt(reader.readLine());

        // Инициализируем Stack
        Stack stack = new Stack(countCommand);

        // создаём экземпляр класса queOnStack
        // передаём кол-во команд, как максимальный размер очереди
        // Так же передаём экземпляр стэка
        QueOnStack que = new QueOnStack(countCommand, stack);

        // Считываем команды в цикле
        // И выполняем их

        for (int i = 0; i < countCommand; i++) {
            // Считываем новую комманду
            String[] command = reader.readLine().split(" ");

            if (command[0].equals("put")) {
                que.put(Integer.parseInt(command[1]));
            }
            if (command[0].equals("get")) {
                que.get();
            }
            if (command[0].equals("get_size")) {
                que.getSize();
            }

        }

    }

}
