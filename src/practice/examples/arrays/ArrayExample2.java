package practice.examples.arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        int[][] vals = new int[5][6];
        /*
        0 1 2 3 4 5
        1
        2
        3
        4
        int[][] tables = {
               {1, 2}
               {2. 3}
        }
         */
        int count = 0;
        //populate array
        for (int i = 0; i < vals.length; i++){
            for (int x = 0; x < vals[i].length; x++){
                vals[i][x] = count;
                count ++;
            }
        }

        //print array
        for (int i = 0; i < vals.length; i++){
            for (int x = 0; x < vals[i].length; x++){
                System.out.print(vals[i][x] + " | ");
            }
            System.out.println();
        }
    }
}
