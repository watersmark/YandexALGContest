import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class problemFourth1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        String[] mass = reader.readLine().split(" ");

        for(String el : mass){
            if(!el.equals("0")){
                System.out.print(el + " ");
            }
        }
    }
}
