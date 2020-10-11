import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class mains2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] str = reader.readLine().split("");
        //ArrayList<String> el = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<>(Arrays.asList(reader.readLine().split("")));

        int max = 0;
        int lastInd = 0;

        for (int i = 0; i < str.size(); i++){
            if(i == 0) continue;

            for(int k = lastInd; k < i; k++){
                if(str.get(k).equals(str.get(i))){// делаем проверку

                    if(max < (i - lastInd)){
                        max = (i - lastInd);
                    }

                    lastInd = k + 1;
                    break;
                }
            }

        }

        if(max < str.size() - lastInd){
            max = str.size() - lastInd;
        }

        System.out.println(max);
    }
}
