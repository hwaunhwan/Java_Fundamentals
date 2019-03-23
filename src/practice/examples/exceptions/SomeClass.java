package practice.examples.exceptions;

public class SomeClass {

        public static void someMethod(int[] nums) {

            try {
                for(int i = 0; i < nums.length; i++){
                    System.out.println(nums[i] / nums[i+1]);
                }
            } catch (ArrayIndexOutOfBoundsException aeExc){
                System.out.println("AE Exception");
            } catch (ArithmeticException arExc){
                System.out.println("AR Exception");
            } catch (Exception exc) {
                System.out.println("Exception");
            }
            // below will show because the exception is handled gracefully
            System.out.println("Program complete");
        }

}
