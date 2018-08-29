package algorithms.selection_sort;

public class SelectionSort {

    // O(n^2)
    public static void main(String[] args) {
        int[] intArray = { 99, 23, 2, 14, -92, -3, 0, -7, 87, 64 };

        for (int i = intArray.length - 1; i > 0; i--) {
            int indexWithLargest = 0;

            for (int j = 1; j < i; j++) {
                if (intArray[j] > intArray[indexWithLargest]) {
                    indexWithLargest = j;
                }
            }
            swap(indexWithLargest, i, intArray);
        }

        for (int number: intArray) {
            System.out.println(number);
        }
    }

    public static void swap(int indexOne, int indexTwo, int[] intArray) {
        if (indexOne == indexTwo) {
            return;
        }

        int temp = intArray[indexOne];
        intArray[indexOne] = intArray[indexTwo];
        intArray[indexTwo] = temp;
    }

}
