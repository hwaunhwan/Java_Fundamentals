package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //correct order
        for (int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }
        System.out.println();
        //reverse order using extra variable
        int len = array.length;
        for (int i = 0; i < 10; i++){
            System.out.println(array[len - i - 1]);
        }
    }
}
