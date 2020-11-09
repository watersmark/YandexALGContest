import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class MyQueue {

    public ArrayList<Integer> listQ = new ArrayList<Integer>();

    // Добавить
    public void push(int item) {
        listQ.add(item);
    }

    // Удалить
    public void pop() {
        if(listQ.size() == 0){
            System.out.println("None");
            return;
        }

        System.out.println(listQ.get(0));
        listQ.remove(0);
    }

    // Напечатать первое число в очереди
    public void peek() {
        if(listQ.size() == 0){
            System.out.println("None");
            return;
        }

        System.out.println(listQ.get(0));
    }

    //Напечатать размер очереди
    public void size() {
        System.out.println(listQ.size());
    }


}


public class SP2PrM {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MyQueue que = new MyQueue();

        int count = Integer.parseInt(reader.readLine());

        for(int i=0; i< count; i++){
            String[] command = reader.readLine().split(" ");

            if(command[0].equals("pop")){
                que.pop();
            }
            if(command[0].equals("peek")){
                que.peek();
            }
            if(command[0].equals("size")){
                que.size();
            }
            if(command[0].equals("push")){
                que.push(Integer.parseInt(command[1]));
            }

        }

    }
}
