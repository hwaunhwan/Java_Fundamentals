package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[][] tables = {
                {67, 45},
                {987, 234, 1, 14},
                {93, 213, 33},
                {1}
        };

        for(int i = 0; i < tables.length; i++){
            for(int x = 0; x < tables[i].length; x++){
                System.out.print(tables[i][x]+" ");
            }
            System.out.println();
        }
    }
}
