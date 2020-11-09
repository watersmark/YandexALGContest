import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        String[] str = reader.readLine().split(" ");
        Arrays.sort(str);

        int step = 1;
        String elemNow = "";

        for (int i = 0; i < str.length; i++){

            if(i == 0){
                elemNow = str[0];
                continue;
            }

            if(elemNow.equals(str[i]) && step < 2){
                step++;
            }

            else{
                if(step != 2){
                    System.out.println(elemNow);
                    step = 2;
                    break;
                }

                elemNow = str[i];
                step = 1;
            }

        }

        if(step != 2){
            System.out.println(elemNow);
        }

    }
}
