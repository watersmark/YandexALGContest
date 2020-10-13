import java.awt.image.ShortLookupTable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


class StackSet {
    Set<Integer> sets = new LinkedHashSet<Integer>();
    Integer lastElem = null;

    public void push(int item) {
        lastElem = item;
        sets.add(item);
    }

    public void pop() {
        if (sets.size() != 0) {
            sets.remove(lastElem);
        } else {
            System.out.println("error");
        }
    }

    public void peek() {
        if (sets.size() != 0) {
            System.out.println();
        } else {
            System.out.println("error");
        }
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