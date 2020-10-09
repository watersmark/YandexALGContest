import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class twoProblem {

    public static ArrayList<Integer> mass;
    public static int counts;

    public static void sorts(String elNow, int countNow){
        if(mass.size() < counts){
            mass.add(countNow);
            Collections.sort(mass);
        }
        else{


        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = reader.readLine().split(" ");
        String count = reader.readLine();

        Arrays.sort(str);

        int countNow = 1;
        String elNow = "";

        for (int i = 0; i < str.length; i++) {

            if (i == 0) {
                elNow = str[i];
                counts = Integer.parseInt(count);
                continue;
            }

            if(elNow.equals(str[i])){
                countNow++;
            }
            else{
                sorts(elNow, countNow);

                elNow = str[i];
                countNow = 1;
            }



        }


    }
}
