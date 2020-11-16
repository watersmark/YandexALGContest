import java.util.ArrayList;
import java.util.List;

public class TestSublist {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(32);
        list.add(55);

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1 = list.subList(0, 3);
        list2 = list.subList(3, 5);

        System.out.println(list1);
        System.out.println(list2);

    }
}
