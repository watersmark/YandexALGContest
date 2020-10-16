import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sp2PrB {
    public static void main(String[] args) throws IOException {
        int[] mass = new int[10001];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] allUn = reader.readLine().split(" ");
        int count = Integer.parseInt(reader.readLine());


        for (String elem : allUn) {
            mass[Integer.parseInt(elem)] += 1;
        }


        for (int i = 0; i < count; i++) {

        }


    }
}
