import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class queOnStack {

    // List где хранятся наши очереди-стеки
    private List<int[]> queList = new ArrayList<int[]>();
    private int sizeNow;

    // Добавляем элемент в очередь
    // Каждый новый элемент очереди является одиночным стеком
    // То есть Мы получаем массив,где каждый элемент это массив из одного элемента
    public void put(int elem) {
        queList.add(new int[]{elem});
        sizeNow++;
    }

    // Получаем элемент из очереди, для очереди принцип
    // LIFO сохраняется
    // Чтобы сохранялся принцип FIFO для стека берём элемент с конца
    // одиночного массива, но так как в стеке всего один элемент всегда
    // то мы для упрощения указываем индекс 0
    // Если очередь пустая выведем error
    public void get() {
        if(this.sizeNow == 0){
            System.out.println("error");
            return;
        }

        System.out.println(queList.get(0)[0]);
        queList.remove(0);
        sizeNow--;
    }

    // Получаем колличество элементов чейчас
    //то есть получаем колличество одиночных стеков
    public void getSize() {
        System.out.println(this.sizeNow);
    }

}


public class SolutionPr3 {
    public static void main(String[] args) throws IOException {

        // Открываем поток на чтение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем число комманд
        int countCommand = Integer.parseInt(reader.readLine());

        //Создаём экземпляр класса queOnStack
        queOnStack que = new queOnStack();

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
