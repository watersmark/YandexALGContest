import java.util.Arrays;
import java.util.Scanner;

public class RadixSortNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDigit = scanner.nextInt();

        int[] arr = new int[countDigit];

        for (int i = 0; i < countDigit; i++) {
            arr[i] = scanner.nextInt();
        }

        radixSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void radixSort(int[] arr) {
        //get max element in array
        int max = getMaxElementInArray(arr);
        int position = 1;
        // move from least significant digit
        // to most significant digit
        while (max / position > 0) {
            countingSort(arr, position);
            position *= 10;
        }
    }

    private static int getMaxElementInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Counting sort used to sort array in each pass
    private static void countingSort(int[] arr, int position) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[n];

        //Calculate frequency of each element, put it in count array
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / position) % 10]++;
        }
        // Modify count array to get the final position of elements
        for (int i = 1; i < n; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Add elements to output array for this pass
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / position) % 10] - 1] = arr[i];
            count[(arr[i] / position) % 10]--;
        }
        // Copy output array to the input for
        // the next pass of counting sort
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }

    }
}