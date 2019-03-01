package arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers (Please press enter after each number):");
        for(int i=0;i<10;i++) {
            nums[i] = scan.nextInt();
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}