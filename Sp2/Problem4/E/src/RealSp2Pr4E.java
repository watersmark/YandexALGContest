import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealSp2Pr4E {

    public static long recFact(int fact){

        if(fact == 0){
            return 1;
        }

        return fact * recFact(fact - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fact = Integer.parseInt(reader.readLine());

        System.out.println(recFact(fact));


    }
}
