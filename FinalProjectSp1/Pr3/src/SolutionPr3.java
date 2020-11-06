import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Посылка номер: 39404993


// Реализация класса Que
// В данной реализации сделаем так, чтобы
// каждый элемент очереди был стеком
// Для этого реализуем дополнительно класс Stack
// С методами add, get
class QueOnStack {

    //Размер очереди на данный момент
    private int sizeNow;

    // Позиция хвоста на данный момент
    private int tail;
    //Голова очереди
    private int headQue;

    // Массив где хранятся элементы очереди
    Stack[] massQue;

    public QueOnStack(int sizeMass){
        this.massQue = new Stack[sizeMass];
    }

    // Добавляем элемент в очередь
    // Используем для этого новый Stack
    public void put(int elem){

        Stack tempStack = new Stack();
        tempStack.add(elem);

        massQue[tail] = tempStack;
        this.tail++;
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

        System.out.println(massQue[headQue].get());
        this.headQue++;
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

    // Массив в котором хранятся наши элементы
    // Теперь реализация не через ArrayList<>, а через int[]
    int[] massElem = new int[1];

    // Реализуем метод добавления в Stack
    // И увеличивем размер стэка на 1
    public void add(int elem) {
        massElem[stackSizeNow] = elem;
        this.stackSizeNow++;
    }

    // Реализуем метод для взятия элемента
    // И уменьшаем стэк на 1
    public int get() {
        this.stackSizeNow--;
        return massElem[stackSizeNow];
    }

}


public class SolutionPr3 {
    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем число комманд
        int countCommand = Integer.parseInt(reader.readLine());

        // создаём экземпляр класса queOnStack
        // передаём кол-во команд, как максимальный размер очереди
        QueOnStack que = new QueOnStack(countCommand);

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
