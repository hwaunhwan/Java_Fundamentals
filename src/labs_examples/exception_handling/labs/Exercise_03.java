package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03{
    public static void main(String[] args) {
        for(int i=0; i < 4; i++) {
            finallyDemo.genException(i);
            System.out.println();
        }
    }
}

class finallyDemo{

    public static void genException(int i) {
        int test[] = {0, 1, 2, 3};
        int test1[] = {0, 1, 2};
        int result;

        try {
            result = test[i] / test1[i];
            System.out.println(result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("printing from finally");
        }

        System.out.println("After try/catch/finally");

    }
}