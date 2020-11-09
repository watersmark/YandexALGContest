import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sprint1PrO {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Число людей первого сервера
        String[] massF = reader.readLine().split(" ");

        // Число людей пришедших с первого червера
        int countFirst = Integer.parseInt(reader.readLine());
        //Число людей со второго сервера и кол-во нулей в массиве первого сервера
        int countSecond = Integer.parseInt(reader.readLine());

        //Массив второго сервера
        String[] massS = reader.readLine().split(" ");

        //Позиция куда будут записаны данные в massF
        int posCursor = massF.length - 1;
        // Начала иттерации по массиву massF
        int start = massF.length - countSecond - 1;
        int prElem = 0;

        int i =0;
        while (true){

            if(posCursor == 0 || prElem == countSecond) break;

            //for (int j = 0; j < start ; j++)
            while (true){

                // Случай когда числа во втором массиве больше чисел в первом
                if ((Integer.parseInt(massS[massS.length - 1 - i]) > Integer.parseInt(massF[massF.length - 1 - countSecond])) && posCursor > countSecond) {
                    massF[posCursor] = massS[massS.length - 1 - i];
                    posCursor--;
                    i++;
                    break;
                }

                if (Integer.parseInt(massF[start]) >= Integer.parseInt(massS[massS.length - 1 - i])) {
                    massF[posCursor] = massF[start];
                    massF[start] = "0";
                    posCursor--;
                    start--;
                    continue;
                }

                // Вариант с записью нашего значения
                if (Integer.parseInt(massF[start]) < Integer.parseInt(massS[massS.length - 1 - i])) {
                    massF[posCursor] = massS[massS.length - 1- i];
                    //massF[start] = massS[massS.length - 1 - i];
                    //massF[start + 1] = "0";
                    posCursor--;
                    i++;
                    prElem++;
                    break;
                }

            }
        }

        for(String elem : massF){
            System.out.print(elem + " ");
        }

    }
}
