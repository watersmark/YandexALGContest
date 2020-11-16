import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalA {

    public static String[] digitF;
    public static String[] digitS;

    // Сортировка слиянием с особыми правилами
    public static List<Integer> mergeSort(List<Integer> elemMass, int leftBorder, int rightBorder) {

        // Условие выхода
        if (elemMass.size() == 1) {
            return elemMass;
        }

        int elemMid = (int) Math.round((rightBorder - leftBorder) / 2.0);

        List<Integer> temp1 = elemMass.subList(leftBorder, elemMid);
        List<Integer> temp2 = elemMass.subList(elemMid, rightBorder + 1);

        // Очищаем память
        elemMass = null;

        // шаг рекурсиии влево
        List<Integer> sorted1 = mergeSort(temp1, 0, temp1.size() - 1);
        // шаг рекурсии вправо
        List<Integer> sorted2 = mergeSort(temp2, 0, temp2.size() - 1);

        // очищаем память
        temp1 = null;
        temp2 = null;


        // Начинаем слияние
        List<Integer> listElem = new ArrayList<Integer>();

        int iFirst = 0;
        int iSecond = 0;

        int countStep = 0;

        // Слияние
        while (true) {

            // Условие выхода
            if ((sorted1.size()) + (sorted2.size()) == countStep) {
                break;
            }


            digitF = String.valueOf(sorted1.get(iFirst)).split("");
            digitS = String.valueOf(sorted2.get(iSecond)).split("");

            int elemNow = 0;


            // Начало с наибольших элементов
            while (true) {

                if (digitF.length == elemNow) {
                    listElem.add(sorted1.get(iFirst));

                    ///
                    if (sorted1.size() - 1 < iFirst + 1) {
                        int temp1S = sorted2.size() - iSecond;

                        for (int i = 0; i < temp1S; i++) {
                            listElem.add(sorted2.get(iSecond));
                            iSecond++;
                            countStep++;
                        }
                        //iFirst++;
                        countStep++;
                        break;
                    }

                    ///
                    if ((sorted1.size() - 1) > iFirst) iFirst++;
                    countStep++;
                    break;
                }

                if (digitS.length == elemNow) {
                    listElem.add(sorted2.get(iSecond));
                    ////
                    if (sorted2.size() - 1 < iSecond + 1) {
                        int temp2S = sorted1.size() - iFirst;
                        for (int i = 0; i < temp2S; i++) {
                            listElem.add(sorted1.get(iFirst));
                            iFirst++;
                            countStep++;
                        }
                        //iSecond++;
                        countStep++;
                        break;
                    }
                    /////

                    if ((sorted2.size() - 1) > iSecond) iSecond++;
                    countStep++;
                    break;
                }

                if (Integer.parseInt(digitF[elemNow]) > Integer.parseInt(digitS[elemNow])) {
                    listElem.add(sorted1.get(iFirst));

                    if (sorted1.size() - 1 < iFirst + 1) {
                        int temp1S = sorted2.size() - iSecond;

                        for (int i = 0; i < temp1S; i++) {
                            listElem.add(sorted2.get(iSecond));
                            iSecond++;
                            countStep++;
                        }
                        //iFirst++;
                        countStep++;
                        break;
                    }

                    if (sorted1.size() - 1 > iFirst) {
                        iFirst++;
                    }

                    countStep++;
                    break;
                }

                if (Integer.parseInt(digitF[elemNow]) < Integer.parseInt(digitS[elemNow])) {
                    listElem.add(sorted2.get(iSecond));

                    if (sorted2.size() - 1 < iSecond + 1) {
                        int temp2S = sorted1.size() - iFirst;
                        for (int i = 0; i < temp2S; i++) {
                            listElem.add(sorted1.get(iFirst));
                            iFirst++;
                            countStep++;
                        }
                        //iSecond++;
                        countStep++;
                        break;
                    }


                    if (sorted2.size() - 1 > iSecond) {
                        iSecond++;
                    }

                    countStep++;
                    break;
                }

                if (Integer.parseInt(digitF[elemNow]) == Integer.parseInt(digitS[elemNow])) {
                    elemNow++;
                }


            }

        }

        return listElem;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Считываем кол-во элементов в массиве
        int countElem = scanner.nextInt();

        // Инициализируем массив
        List<Integer> listElem = new ArrayList<Integer>();

        //Считываем элементы в массив
        for (int i = 0; i < countElem; i++) {
            listElem.add(scanner.nextInt());
        }


        for (int elem : mergeSort(listElem, 0, listElem.size() - 1)) {
            System.out.print(elem);
        }


    }
}
