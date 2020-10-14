import javax.management.relation.InvalidRelationTypeException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class MyQueue {

    public MyQueue(int maxSize){

        this.maxSize = maxSize;
        this.listQ = new int[maxSize];
    }

    //Максимальный размер
    public int maxSize = 0;
    // Индекс извлечения
    public int head = 0;
    // Индекс добавления
    public int tail = 0;
    //Размер сейчас
    public int sizeNow = 0;

    public int[] listQ;

    // Добавить элемент
    public void push(int item) {
        if (sizeNow != maxSize) {
            this.listQ[tail] = item;
            this.tail = (this.tail + 1) % this.maxSize;
            sizeNow += 1;

        } else {
            System.out.println("error");
        }

    }

    // Удалить
    public void pop() {

        if (this.sizeNow == 0) {
            System.out.println("None");
            return;
        }

        int x = this.listQ[head];
        this.head = (this.head + 1) % this.maxSize;
        this.sizeNow --;

        System.out.println(x);
    }

    // Напечатать первое число в очереди
    public void peek() {
        if (this.sizeNow == 0) {
            System.out.println("None");
            return;
        }

        System.out.println(listQ[head]);
    }

    //Напечатать размер очереди
    public void size() {
        System.out.println(this.sizeNow);
    }

    /*
    public void initMass(int maxSize){

        this.maxSize = maxSize;
        this.listQ = new int[maxSize];
    }
     */


}


public class SP2PrN {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        int maxSize = Integer.parseInt(reader.readLine());

        MyQueue que = new MyQueue(maxSize);

        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");

            if (command[0].equals("pop")) {
                que.pop();
            }
            if (command[0].equals("peek")) {
                que.peek();
            }
            if (command[0].equals("size")) {
                que.size();
            }
            if (command[0].equals("push")) {
                que.push(Integer.parseInt(command[1]));
            }

        }

    }
}
