package practice.examples.exceptions;

public class ExceptionHandlingExampleMultiCatch {

    public static void main(String[] args) {
        int[] nums = { 34, 65, 78, 0};

//        try {
//            int x = nums[1] / nums[3];
//
//        } catch (ArrayIndexOutOfBoundsException aeExc){
//            System.out.println("AE Exception");
//        } catch (ArithmeticException arExc){
//            System.out.println("AR Exception");
//        } catch (Exception exc) {
//            System.out.println("Exception");
//        }
//        // below will show because the exception is handled gracefully
//        System.out.println("Program complete");


        SomeClass.someMethod(nums);
        System.out.println("super complete");
    }

}
