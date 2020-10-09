import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner reader = new Scanner(System.in);

        //String[] mass = reader.readLine().split("");
        String res_str = "";


        while (true) {

            //int elem = String.valueOf(reader.read()).toUpperCase().charAt(0);
            int elem = reader.read();

            if(elem == 10){
                break;
            }

            elem = String.valueOf((char) elem).toUpperCase().charAt(0);

            if ((elem >= 65 && elem <= 90) || (elem >= 48 && elem <= 57)) {
                res_str += (char) elem;
            }

            //System.out.print((char) elem);

        }




        for (int i = 0; i < (int) Math.floor(res_str.length() / 2.0); i++){
            if(res_str.charAt(i) != res_str.charAt(res_str.length() - 1 - i)){
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");


    }
}
