import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FiveProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        String[] mass = reader.readLine().split(" ");
        Arrays.sort(mass);

        String last_el = mass[0];
        int k = 0;

        for (String el : mass) {
            if (k == 0) {
                k++;
                continue;
            }
            if (el.equals(last_el)) {
                System.out.println(el);
            }
            last_el = el;
        }


    }
}
