package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers for an upper and lower bound (Please enter after each number):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        double avg = 0.0;
        if (num1 == num2){
            System.out.println("Two numbers you entered are the same");
        } else {
            if (num1 > num2){
                for (int i = num2; i <= num1; i++){
                    sum += i;
                }
            } else {
                for (int i = num1; i <= num2; i++){
                    sum += i;
                }
            }
            avg = (num1 + num2)/2.0;
            System.out.println("The sum is: " + sum);
            System.out.println("The avg is: " + avg);
        }
    }
}
