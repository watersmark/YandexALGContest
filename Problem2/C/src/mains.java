import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class mains {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = reader.readLine().split("");

        Set<String> set = new HashSet<String>();
        int max = 0;

        for (int i = 0; i < str.length; i++) {

            if(set.contains(str[i])){
                if(max < set.size()){
                    max = set.size();
                }

                set.clear();
                set.add(str[i]);
                continue;
            }

            set.add(str[i]);
        }
        if(max < set.size()) max = set.size();
        System.out.println(max);
    }
}
