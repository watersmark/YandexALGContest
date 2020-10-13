import java.awt.image.ShortLookupTable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;


class StackMax {
    public ArrayList<Integer> stack = new ArrayList<Integer>();

    // Добавить число в стек
    public void push(int x) {

        stack.add(x);
    }

    // Удаляем с вершины
    public void pop() {
        if (stack.size() == 0) {
            System.out.println("error");
            return;
        }

        stack.remove(stack.size() - 1);

    }

    // Напечатать максимальное число
    public void get_max() {
        if (stack.size() == 0) {
            System.out.println("None");
            return;
        }

        int max = stack.get(0);
        for (int elem : stack) {

            if (max < elem) {

                max = elem;
            }

        }

        System.out.println(max);
    }
}



public class mains {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StackMax first = new StackMax();

        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");

            if (command[0].equals("get_max")) {
                first.get_max();
            }
            if (command[0].equals("pop")) {
                first.pop();
            }
            if (command[0].equals("push")) {
                first.push(Integer.parseInt(command[1]));
            }

        }

    }
}
