package algorithms.shell_sort;

public class ShellSort {

    // Big O depends. Worst case scenario it can be O(n^2) but it can be better.
    public static void main(String[] args) {
        int[] intArray = { 99, 23, 2, 14, -92, -3, 0, -7, 87, 64 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i += gap) {
                int newNumberToShift = intArray[i];
                int j = i;

                while (j > 0 && intArray[j - gap] > newNumberToShift) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newNumberToShift;
            }
        }

        for (int number: intArray) {
            System.out.println(number);
        }
    }

}
