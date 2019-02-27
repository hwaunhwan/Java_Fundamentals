package codingnomads.examples.arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {
        int[] vals = new int[5];

        for (int i = 0; i < vals.length; i++){
            vals[i] = i * 2; //populate array values
        }


        for (int val : vals) {
            System.out.println(val); //print every value
        }

        System.out.println();

        //For Loop vs For-Each Loop
        int[][] nums = new int[5][10];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (i * j) * 7 / 3;
            }
        }

        for (int[] outer : nums){
            for (int inner : outer){
                System.out.print(inner + " -> ");
            }
            System.out.println();
        }

    }


}
