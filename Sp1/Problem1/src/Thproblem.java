import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Thproblem {
    public static void res(String first, String second){

        int elem = Integer.parseInt(first) + Integer.parseInt(second);
        for(String el : String.valueOf(elem).split("")){
            System.out.print(el + " ");
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String resStr = "";

        for (int i = 0; i < count; i++) {
            resStr += scanner.next();
        }

        String secondDigit = scanner.next();

        res(resStr, secondDigit);


    }
}
