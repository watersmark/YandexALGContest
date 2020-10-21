import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RealSp2PerE {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //count child
        int count = Integer.parseInt(reader.readLine());

        // Фактор жадности
        String[] massBad = reader.readLine().split(" ");

        // count cookie
        int cookie = Integer.parseInt(reader.readLine());

        // cookie mass
        String[] cookmass = reader.readLine().split(" ");

        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();


        for (int i = 0; i < cookmass.length; i++) {

            if (maps.containsKey(Integer.parseInt(cookmass[i]))) {
                maps.put(Integer.parseInt(cookmass[i]), maps.get(Integer.parseInt(cookmass[i])) + 1);
                continue;
            }

            maps.put(Integer.parseInt(cookmass[i]), 1);
        }


        int countPleasure = 0;



    }
}
