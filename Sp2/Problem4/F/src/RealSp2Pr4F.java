import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealSp2Pr4F {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());

        long multiple = 1;

        for(int i = 2; i <= digit; i++){
            multiple *= i;
        }

        System.out.println(multiple);
    }


}
