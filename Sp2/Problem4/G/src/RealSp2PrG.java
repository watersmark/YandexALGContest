import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealSp2PrG {

    public static void recAlphabet(int nowDigit, int reqDigit){

        if(nowDigit == reqDigit){
            System.out.print((char) nowDigit);
            return;
        }

        System.out.print((char) nowDigit + " ");
        recAlphabet(nowDigit + 1, reqDigit);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char end = reader.readLine().charAt(0);
        recAlphabet(97, (int) end);

    }
}
