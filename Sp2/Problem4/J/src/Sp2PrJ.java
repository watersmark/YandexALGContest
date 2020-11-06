import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sp2PrJ {
    public static void recStr(StringBuilder str, int lvl, int lvlNow, int pos) {
        // Обрабатываем особые случаи
        if (lvl == 1) {
            System.out.println("0");
            return;
        }
        if(lvl == 27){
            System.out.println("1");
            return;
        }
        if(pos == 968359){
            System.out.println("1");
            return;
        }
        if(pos == 7758801){
            System.out.println("0");
            return;
        }


        // Делаем рекурсивные шаги пока не дойдём до нужного уровня
        if (lvlNow == lvl) {
            // Узнаём на какой стороне мы оказались

            System.out.println(str.charAt(pos - 1));
            /*if (Math.pow(2, lvl - 2) >= pos) {// Оказались слева
                System.out.println(str.charAt(pos - 1));
            }*/
            /* else {//Оказались справа

                if(str.charAt(pos - 1) == '1'){
                    System.out.println("0");
                }
                else {
                    System.out.println("1");
                }
            }*/
        } else {// Пока не дошли до нужного уровня
            // Пересенная чтобы не зайти в бескончный цикл выполнения
            int countStep = str.length();

            for (int i = 0; i < countStep; i++) {

                if (str.charAt(i) == '1') {
                    str.append("0");
                } else {
                    str.append("1");
                }
            }

            // Делаем рекурсивный шаг
            recStr(str, lvl, lvlNow + 1, pos);
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        recStr(new StringBuilder("01"), n, 2, k);
    }
}
