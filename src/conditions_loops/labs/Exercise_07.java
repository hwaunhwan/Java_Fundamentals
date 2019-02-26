package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word of your choice: ");
        String word = scanner.nextLine();
        int num = 0;
        int length = word.length();

        //System.out.println(length);
        //System.out.println(word.charAt(0));
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
        char A = 'A', E = 'E', I = 'I', O = 'O', U = 'U';
        while(num < length){
            if (word.charAt(num) == a || word.charAt(num) == A){
                System.out.println("Word Entered: " + word + ", Vowel: a" );
                break;
            } else if (word.charAt(num) == e || word.charAt(num) == E){
                System.out.println("Word Entered: " + word + ", Vowel: e");
                break;
            } else if (word.charAt(num) == i || word.charAt(num) == I){
                System.out.println("Word Entered: " + word + ", Vowel: i");
                break;
            } else if (word.charAt(num) == o || word.charAt(num) == O){
                System.out.println("Word Entered: " + word + ", Vowel: o");
                break;
            } else if (word.charAt(num) == u || word.charAt(num) == U){
                System.out.println("Word Entered: " + word + ", Vowel: u");
                break;
            } else {
                num++;
            }
        }
        if (num == length) {
            System.out.println("Word Entered: " + word + ", Vowel: No vowel found");
        }
    }

}
