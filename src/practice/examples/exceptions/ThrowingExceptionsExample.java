package practice.examples.exceptions;

public class ThrowingExceptionsExample {

    public static void main(String[] args) {
        try {
            methodOne();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception caught");
            //Throwables
            System.out.println(exc.getMessage());
            System.out.println(exc.toString());
            exc.printStackTrace();
        }
    }
    // methodOne will immediately throw any exceptions that occur to the main()
    public static void methodOne() throws ArrayIndexOutOfBoundsException {
        // methodTwo throws and Exception - we are not catching it here
        // pass it up to main
        methodTwo();
    }

    public static void methodTwo() throws ArrayIndexOutOfBoundsException {
        int[] nums = {1,2,3};

        try {
            int x = nums[10];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception caught in methodTwo");
            System.out.println("Now manually throwing exception back to methodOne");
            //below it re-throw the exception
            throw exc;
        }

    }

}
