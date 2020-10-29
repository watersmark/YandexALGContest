import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class RealSp2PrK {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] param = reader.readLine().split(" ");
        String[] countHome = reader.readLine().split(" ");

        int[] mass = new int[countHome.length];
        int money = Integer.parseInt(param[1]);
        int buyHome = 0;

        for (int i = 0; i < countHome.length; i++) {
            mass[i] = Integer.parseInt(countHome[i]);
        }

        Arrays.sort(mass);

        for (int i = 0; i < mass.length; i++){

            if(money < mass[i]) break;

            money -= mass[i];
            buyHome += 1;
        }

        System.out.println(buyHome);

    }
}
