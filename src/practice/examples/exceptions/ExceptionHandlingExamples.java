package practice.examples.exceptions;

public class ExceptionHandlingExamples {

    public static void main(String[] args) {

        int[] nums = {34, 65, 78};

//        System.out.println(nums[10]);
//        //will not display the next line because the exception ends the program
//        System.out.println("Program complete");

        try {
            System.out.println(nums[10]);
        } catch(Exception exc) {
//        } catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Error Detected");
            System.out.println(exc.getMessage());
//            exc.printStackTrace(); // logging
        }
//        } catch(ArrayIndexOutOfBoundsException aeExc){
//            System.out.println("error 2");
//        }    Won't work because Exception is higher hierarchy than ArrayIndexOutOfBoundsException

        System.out.println("Program complete");
    }

}
