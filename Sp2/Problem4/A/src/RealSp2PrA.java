import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class RealSp2PrA {

    public  static int recFib(int lastEl, int newEl, int lvlNow, int lvlReq){

        if(lvlReq == 0 || lvlReq == 1){
            return 1;
        }

        if(lvlNow == lvlReq){
            return newEl;
        }

        return recFib(newEl, lastEl + newEl, lvlNow + 1, lvlReq);

    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lvl = Integer.parseInt(reader.readLine());

        System.out.println(recFib(1, 1, 1, lvl));
    }
}
