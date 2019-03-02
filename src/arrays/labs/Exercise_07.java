package arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        for(int num: nums){
            System.out.print(num + " ");
        }

        System.out.println();
        int size = nums.size();
        System.out.println("Current Size: " + size);

        System.out.println();
        System.out.println("Remove index 1 and 3");

        nums.remove(3);
        nums.remove(1);

        for(int num: nums){
            System.out.print(num + " ");
        }

        size = nums.size();
        System.out.println();
        System.out.println("New Size: " + size);

    }

}
