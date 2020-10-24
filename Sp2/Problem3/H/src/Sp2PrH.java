import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sp2PrH {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(reader.readLine());
        max = 0;

        String[] massElem = reader.readLine().split(" ");

        int countNow = 1;
        for (int i = 0; i < massElem.length - 1; i++) {
            if (Integer.parseInt(massElem[i]) < Integer.parseInt(massElem[i + 1])) {
                countNow++;
            } else {

                if(max < countNow){
                    max = countNow;
                }

                countNow = 1;
            }
        }
        
        if(countNow > max) max = countNow;
        System.out.println(max);

    }
}
