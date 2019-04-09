package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05 {

    public static void main(String[] args) {
        try {
            throwTest();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Caught");
        }

    }

    public static void throwTest() throws ArrayIndexOutOfBoundsException {
        int[] test = {1, 2, 3};
        try {
            test[10] = 10;
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Thrown");
            throw exc;
        }
    }

}