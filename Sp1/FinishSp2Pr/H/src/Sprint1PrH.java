import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Sprint1PrH {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем строку
        String elem = reader.readLine();

        int firstCursor = 0;
        int secondCursor = elem.length() - 1;
        boolean bool = false;

        Set<Integer> sets = new HashSet<Integer>();
        for (int i = 97; i <= 122; i++) {
            sets.add(i);
        }
        for (int i = 48; i <= 57; i++) {
            sets.add(i);
        }

        while (true) {
            bool = false;

            if (firstCursor + 1 == secondCursor) {

                if ((int) String.valueOf(elem.charAt(firstCursor)).toLowerCase().toCharArray()[0]
                        != (int) String.valueOf(elem.charAt(secondCursor)).toLowerCase().toCharArray()[0]) {

                    if(!sets.contains((int) String.valueOf(elem.charAt(firstCursor)).toLowerCase().toCharArray()[0])
                    || !sets.contains((int) String.valueOf(elem.charAt(secondCursor)).toLowerCase().toCharArray()[0])){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }


                } else {

                    System.out.println("True");

                }

                break;
            }

            if (firstCursor == secondCursor) {
                System.out.println("True");
                break;
            }

            if (!sets.contains((int) String.valueOf(elem.charAt(firstCursor)).toLowerCase().toCharArray()[0])) {

                firstCursor += 1;
                bool = true;

            }

            if (!sets.contains((int) String.valueOf(elem.charAt(secondCursor)).toLowerCase().toCharArray()[0])) {

                secondCursor -= 1;
                bool = true;
            }

            if (bool) {
                continue;
            }

            if ((int) (int) String.valueOf(elem.charAt(firstCursor)).toLowerCase().toCharArray()[0]
                    != (int) (int) String.valueOf(elem.charAt(secondCursor)).toLowerCase().toCharArray()[0]) {

                System.out.println("False");
                break;
            }

            firstCursor++;
            secondCursor--;

            //int a = (int) String.valueOf(elem.charAt(firstCursor)).toLowerCase().toCharArray()[0];


        }


    }
}
