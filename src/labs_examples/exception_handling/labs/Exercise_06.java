package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {
    private int test;

    public static void main(String[] args) {
        Exercise_06 e6 = new Exercise_06();
        try {
            e6.test = e6.divide(3, 0);
            System.out.println(e6.test);
        } catch (ArithmeticException exc){
            System.out.println(exc.getMessage());
        }
    }

    public int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

}

