import java.util.Arrays;

public class Start {
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {

// Двигаем левый маркер слева направо пока элемент меньше, чем pivot

            while (source[leftMarker] < pivot) {
                leftMarker++;
            }

            System.out.println("Left marker: " + source[leftMarker]);
// Двигаем правый маркер, пока элемент больше, чем pivot

            while (source[rightMarker] > pivot) {
                rightMarker--;
            }

            System.out.println("Right marker: " + source[rightMarker]);

// Проверим, не нужно обменять местами элементы, на которые указывают маркеры

            if (leftMarker <= rightMarker) {

// Левый маркер будет меньше правого только если мы должны выполнить swap

                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }

// Сдвигаем маркеры, чтобы получить новые границы

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


// Выполняем рекурсивно для частей

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }


    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 5, 7, 6};
        //{1, 7, 33, 6, 8, 9, 10};

        quickSort(mass, 0, mass.length - 1);

        System.out.println(Arrays.toString(mass));



    }
}
