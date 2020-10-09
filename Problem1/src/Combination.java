import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Combination {
    public static void main(String[] args) {

        /*
        Map<Integer, String[]> maps = new HashMap<>()
        {
            2 :
        };
         */


        Map<Integer, String> map2 = new HashMap(Map.of(21, "ff", 43, "ff"));
        map2.put(12, "gg");

        System.out.println(map2);


    }
}
