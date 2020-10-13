import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;







public class SP2PrJ {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StackMax first = new StackMax();

        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");

            if (command[0].equals("push")) {
                first.push(Integer.parseInt(command[1]));
            } else if (command[0].equals("get_max")) {
                first.get_max();
            } else {
                first.pop();
            }


        }
    }
}

