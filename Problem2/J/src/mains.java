import java.awt.image.ShortLookupTable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


class StackMax {
    public ArrayList<Integer> stack = new ArrayList<Integer>();
    Integer max = null;

    // Добавить число в стек
    public void push(int x) {
        if (max == null) {
            max = x;
            stack.add(x);
            return;
        }

        if (max < x) max = x;   
        stack.add(x);
    }

    // Удаляем с вершины
    public void pop() {

        if (stack.size() == 0) {
            System.out.println("error");
            return;
        }

        stack.remove(stack.size() - 1);

        if (stack.size() != 0) {
            max = Collections.max(stack);
            return;
        }

        max = null;

    }

    // Напечатать максимальное число
    public void get_max() {
        if (stack.size() == 0) {
            System.out.println("None");
            return;
        }

        System.out.println(this.max);
    }
}


public class mains {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StackMax first = new StackMax();

        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");

            if (command[0].equals("push")) {
                first.push(Integer.parseInt(command[1]));
            }
            else if (command[0].equals("get_max")) {
                first.get_max();
            }
            else {
                first.pop();
            }


        }

    }
}
