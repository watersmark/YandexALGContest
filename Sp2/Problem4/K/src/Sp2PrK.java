public class Sp2PrK {

    public static void recSqrt(int elem, double digit, int count) {
        Double lastElem = null;
        Boolean bool = false;
        for (int i = 0; ; i++) {

            if (i * i == elem || count == 6) {
                System.out.println(digit);
                return;
            }

            // вычисляем промежуточный результат
            double temp;
            if (count == 0) {
                temp = i;
            } else {
                temp = digit + i / (Math.pow(10, count));
            }


            if (temp * temp > elem) {
                bool = true;

                if (lastElem != null) {
                    recSqrt(elem, lastElem, count + 1);

                } else {
                    recSqrt(elem, temp, count + 1);

                }
            }

            lastElem = temp;

            if(bool){
                return;
            }
        }
    }


    public static void main(String[] args) {

        recSqrt(2, 1, 0);
    }
}
