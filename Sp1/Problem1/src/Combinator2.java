import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Combinator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();


        ArrayList<String[]> map = new ArrayList<String[]>();

        map.add(new String[]{"a", "b", "c"});
        map.add(new String[]{"d", "e", "f"});
        map.add(new String[]{"g", "h", "i"});
        map.add(new String[]{"j", "k", "l"});
        map.add(new String[]{"m", "n", "o"});
        map.add(new String[]{"p", "q", "r", "s"});
        map.add(new String[]{"t", "u", "v"});
        map.add(new String[]{"w", "x", "y", "z"});

        //String[] mass = map.get(2);

        for(String mass : map.get(first - 2)){
            for(String els : map.get(second - 2)){
                System.out.print(mass + els + " ");
            }
        }

    }
}
