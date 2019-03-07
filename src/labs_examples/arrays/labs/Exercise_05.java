package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }
        for(int i = nums.length; i > 0; i -= 2){
            System.out.println(nums[i-1]);
        }
    }
}
