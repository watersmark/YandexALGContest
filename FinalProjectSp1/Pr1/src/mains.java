import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mains {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(32, 21, 45, 67));
        for(int i : set){
            System.out.println(i + 1);
        }


    }
}
