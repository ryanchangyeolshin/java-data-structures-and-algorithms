package algorithms.merge_sort;

import java.util.Arrays;

public class MergeSort {

    // Divide and conquer algorithm
    // It's a recursive algorithm
    // 2 phases: Splitting and Merging
    // Splitting leads to faster sorting during the Merging phase
    // Splitting is logical, we don't create new arrays. So less memory being used.

    // Not an In-Place Algorithm (A lot of temporary arrays are being created so it will use more memory)
    // O(n log n) - We're repeatedly dividing the array in half during the splitting phase.
    // Stable algorithm
    public static void main(String[] args) {
        int[] intArray = { 99, 23, 2, 14, -92, -3, 0, -7, 87, 64 };

        mergeSort(intArray, 0, intArray.length);

        for (int number: intArray) {
            System.out.println(number);
        }
    }

    public static void mergeSort(int[] input, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;
        mergeSort(input, startIndex, midIndex);
        mergeSort(input, midIndex, endIndex);
        merge(input, startIndex, midIndex, endIndex);
    }

    public static void merge(int[] input, int startIndex, int midIndex, int endIndex) {
        if (input[midIndex - 1] <= input[midIndex]) {
            return;
        }

        int i = startIndex;
        int j = midIndex;
        int tempIndex = 0;

        int[] temp = new int[endIndex - startIndex];
        while (i < midIndex && j < endIndex) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // handle remaining elements
        System.arraycopy(input, i, input, startIndex + tempIndex, midIndex - i);
        System.arraycopy(temp, 0, input, startIndex, tempIndex);
    }

}
