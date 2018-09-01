package algorithms.recursion;

public class Recursion {

    public static void main(String[] args) {
        int factorialNumber = 8;
        System.out.println(recursiveFactorial(factorialNumber));
    }

    // None of the recursive calls gets returned until the call stack gets done.
    // In recursion, you always need the breaking condition or else it will continually call the recursion
    // until you get the StackOverflowError
    // The iterative way is much better because of all the memory that's been used in the call stack for a
    // recursive function. Developers tend to use recursion because it's easier to understand.
    public static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }

}
