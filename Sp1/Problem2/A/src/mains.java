import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class mains {
    public static void main(String[] args) throws IOException {
        Set<String> set1 = new LinkedHashSet<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            set1.add(reader.readLine());
        }

        for(String el : set1){
            System.out.println(el);
        }

    }
}
