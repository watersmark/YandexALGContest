import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        String[] mass = Integer.toString(digit, 2).split("");
        int count = 0;

        for(String el : mass){
            if(el.equals("1")) count++;
        }

        System.out.println(count);
    }
}
