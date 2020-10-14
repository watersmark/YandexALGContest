import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Que {
    public static int size = 0;

    public int value = 0;
    public Que next = null;

}


public class SP2PrP {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Que head = null;

        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");


            // Команда добавить элемент в список
            if (command[0].equals("put")) {

                // Особый случай для нулевой очереди
                if (Que.size == 0) {
                    head = new Que();
                    head.value = Integer.parseInt(command[1]);
                    Que.size++;
                    continue;
                }

                // Если с головы есть хотябы один элемент
                Que nextQue = head;

                // Делаем проход до последнего элемента
                while (true) {

                    if (nextQue.next == null) {

                        Que newQueNow = new Que();
                        newQueNow.value = Integer.parseInt(command[1]);
                        nextQue.next = newQueNow;
                        Que.size++;
                        break;

                    } else {
                        nextQue = nextQue.next;
                    }

                }


            }
            // Команда взять голову списка
            if (command[0].equals("get")) {
                if (Que.size == 0) {
                    System.out.println("error");
                }
                else {
                    System.out.println(head.value);

                    if(Que.size == 1){
                        Que.size--;
                    }
                    else {
                        head = head.next;
                        Que.size--;
                    }
                }

            }

            // Команда взять размер
            if (command[0].equals("size")) {
                System.out.println(Que.size);
            }

        }

    }
}
