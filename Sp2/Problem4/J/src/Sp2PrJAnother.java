import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

interface Firster{
    StringBuilder getElem();
}

class OurFirst implements Firster{
    public StringBuilder first = new StringBuilder("0110100110010110");

    public StringBuilder getElem() {
        return first;
    }
}

class OurSecond implements  Firster{
    public StringBuilder second = new StringBuilder("1001011001101001");

    @Override
    public StringBuilder getElem() {
        return second;
    }
}

public class Sp2PrJAnother {
    public static final OurFirst first = new OurFirst();
    public  static final OurSecond second = new OurSecond();

    public void recStr(ArrayList<Firster> mass, int lvl, int lvlNow, int pos) {
        if (lvl == 1) {
            System.out.println("0");
            return;
        }
        if (lvl == 2) {
            String str = "01";
            System.out.println(str.charAt(pos - 1));
            return;
        }
        if (lvl == 3) {
            String str = "0110";
            System.out.println(str.charAt(pos - 1));
            return;
        }
        if (lvl == 4) {
            String str = "0110100110010110";
            System.out.println(str.charAt(pos - 1));
            return;
        }
        if (lvl == lvlNow) {
            int block =  (int) Math.floor((double) pos / 16);
            System.out.println(mass.get(block).getElem().charAt((pos - 1) % 16));

        } else {
            int counts = mass.size();

            for (int i = 0; i < counts; i++) {
                if (mass.get(i) == first) {
                    mass.add(second);
                } else {
                    mass.add(first);
                }
            }

            recStr(mass, lvl, lvlNow + 1, pos);
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        ArrayList<Firster> temp = new ArrayList<>();
        temp.add(Sp2PrJAnother.first);

        Sp2PrJAnother start = new Sp2PrJAnother();
        start.recStr(temp, n, 5, k);


    }
}
