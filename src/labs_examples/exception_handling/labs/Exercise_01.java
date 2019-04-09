package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        int test[] = new int[10];

        try {
            System.out.println("Starting try/catch");
            test[11] = 12;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("ToString(): " + exc.toString());;
        }

        System.out.println("After try/catch");
    }
}