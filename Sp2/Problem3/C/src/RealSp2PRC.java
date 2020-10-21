import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealSp2PRC {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strFirst = reader.readLine().split("");
        String[] strSecond = reader.readLine().split("");

        if (strSecond.length < strFirst.length) {
            System.out.println("False");
            return;
        }


        if(strFirst.length == 0){
            System.out.println("True");
            return;
        }


        int posNow = 0;
        for (int i = 0; i < strSecond.length; i++) {
            if(strSecond[i].equals(strFirst[posNow])){
                posNow++;
            }

            if(posNow == strFirst.length){
                System.out.println("True");
                return;
            }

        }

        System.out.println("False");


    }
}
