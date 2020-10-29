import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealSp2PrJ {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

           if( str.charAt(str.length() - 1 - i) != ' '){
                count++;
           }
           else{
               break;
           }
        }

        System.out.println(count);

    }
}
