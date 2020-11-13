import java.util.SortedMap;
import java.util.TreeMap;

public class testSort {
    public static void main(String[] args) {

        SortedMap<Integer, Integer> sortMap = new TreeMap<>();

        sortMap.put(12, 3);
        sortMap.put(1, 9);
        sortMap.put(2, 5);
        sortMap.put(3, 31);
        sortMap.put(2, 11);

        System.out.println(sortMap);

        System.out.println(sortMap.get(1));

        //sortMap.put()


    }
}
