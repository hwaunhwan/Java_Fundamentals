package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise_02{
    public static void main(String[] args) {
        int num[] = {10, 2, 3};
        int den[] = {2, 0};

        for (int i = 0; i < num.length; i++){
            try {
                System.out.println(num[i] / den[i]);
            } catch(ArrayIndexOutOfBoundsException | ArithmeticException exc) {
                System.out.println("Exception: " + exc);
            }
            System.out.println("After the try/catch");
            System.out.println();
        }
    }
}


