package algorithms.insertion_sort;

// O(n^2)
public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 99, 23, 2, 14, -92, -3, 0, -7, 87, 64 };

        for (int i = 1; i < intArray.length; i++) {
            int newElement = intArray[i];

            int j;

            for (j = i; j > 0 && intArray[j - 1] > newElement; j--) {
                intArray[j] = intArray[j - 1];
            }

            intArray[j] = newElement;
        }

        for (int number: intArray) {
            System.out.println(number);
        }
    }

}
