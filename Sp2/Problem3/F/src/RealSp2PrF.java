import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RealSp2PrF {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // count str
        int count = Integer.parseInt(reader.readLine());
        // count digit str
        int lenStr = Integer.parseInt(reader.readLine());

        ArrayList<String> listStr = new ArrayList<String>();

        // read all str
        for (int i = 0; i < count; i++) {
            listStr.add(reader.readLine());
        }

        // номера удалёных индексов
        //Set<Integer> dropIndex = new HashSet<Integer>();
        int countDel = 0;

        for (int i = 0; i < lenStr; i++) {
            for (int j = 0; j < count - 1; j++){
                if((int) listStr.get(j).charAt(i) > ((int) listStr.get(j + 1).charAt(i))){
                    countDel++;
                    break;
                }

            }


        }

        System.out.println(countDel);

    }
}
