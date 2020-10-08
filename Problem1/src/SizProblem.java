import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SizProblem {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();

        char[] massF = first.toCharArray();
        char[] massS = second.toCharArray();

        Arrays.sort(massF);
        Arrays.sort(massS);

        String f = new String(massF);
        String s = new String(massS);

        if(f.equals(s)) System.out.println("True");
        else System.out.println("False");





    }
}
