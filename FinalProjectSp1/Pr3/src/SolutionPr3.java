import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class queOnStack {

    // List где хранятся наши очереди-стеки
    private List<Integer> queList = new ArrayList<Integer>();
    private int sizeNow;

    // Добавляем элемент в очередь
    // Каждый новый элемент очереди является одиночным стеком
    // То есть Мы получаем массив,где каждый элемент это массив из одного элемента
    public void put(int elem){

    }

    // Получаем элемент из очереди
    // Чтобы сохранялся принцип FIFO берём элемент с конца
    // одиночного массива
    public void get(){

    }

    public void getSize(){
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

            }
            if (command[0].equals("get")) {

            }
            if (command[0].equals("get_size")) {


            }


        }

    }

}
