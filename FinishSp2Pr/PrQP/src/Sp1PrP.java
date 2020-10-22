import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Sp1PrP {

    public static void recVoid(String resNow, int lvlNow, String[] mass, HashMap<Integer, String[]> map){

        for(int i = 0; i < map.get(Integer.parseInt(mass[lvlNow])).length; i++ ){
            if(lvlNow != mass.length - 1){

                recVoid(resNow + map.get(Integer.parseInt(mass[lvlNow]))[i], lvlNow + 1, mass, map);

            }
            else{

                System.out.print(resNow + map.get(Integer.parseInt(mass[lvlNow]))[i] + " ");

            }


        }


    }


    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = reader.readLine().split("");

        HashMap<Integer, String[]> map = new HashMap<Integer, String[]>(){};

        map.put(2, new String[]{"a", "b", "c"});
        map.put(3, new String[]{"d", "e", "f"});
        map.put(4, new String[]{"g", "h", "i"});
        map.put(5, new String[]{"j", "k", "l"});
        map.put(6, new String[]{"m", "n", "o"});
        map.put(7, new String[]{"p", "q", "r", "s"});
        map.put(8, new String[]{"t", "u", "v"});
        map.put(9, new String[]{"w", "x", "y", "z"});


        recVoid("", 0, mass, map);

    }
}
