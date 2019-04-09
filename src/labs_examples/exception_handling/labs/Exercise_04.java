package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise_04{
    public static void main(String[] args) {
        int test[] = {0, 1, 2, 3};
        int test1[] = {0, 1, 2};
        int result;

        try {
            for(int i=0; i < test.length; i++) {
                try {
                    result = test[i] / test1[i];
                    System.out.println(test[i] + " / " + test1[i] + " = " +result);
                } catch (ArithmeticException exc) {
                    System.out.println(exc.getMessage());
                } finally {
                    System.out.println("printing from finally; from inside the nest");
                    System.out.println();
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("printing from finally; from outside the nest");
            System.out.println();
        }

    }
}


