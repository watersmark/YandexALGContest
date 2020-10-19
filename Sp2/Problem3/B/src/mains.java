import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mains {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        String[] mass = reader.readLine().split(" ");

        int digitNow = 0;
        //int temp_elem = 0;
        int profit = 0;

        boolean firstStep = true;

        for (int i = 0; i < count; i++) {
            int elem = Integer.parseInt(mass[i]);

            if(firstStep){

                if(i == count - 1){
                    break;
                }

                if(elem >= Integer.parseInt(mass[i + 1])){
                    continue;
                }

                digitNow = elem;
                //temp_elem = elem;
                firstStep = false;

            }
            else{

                if(i == count - 1){
                    profit += elem - digitNow;
                    break;
                }

                if(elem <= Integer.parseInt(mass[i + 1])){
                    continue;
                }

                profit += elem - digitNow;
                firstStep = true;
            }

        }

        System.out.println(profit);

    }
}
