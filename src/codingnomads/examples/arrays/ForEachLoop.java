package codingnomads.examples.arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            nums[i] = i * 14;
        }

        for(int element : nums){
            System.out.println(element);
        }

        System.out.println("--------------------");

        // 2-D Array with For Each Loop
        int[][] twoDArray = new int[3][5];
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = i * j;
            }
        }
        for(int[] vals : twoDArray){
            for(int val: vals){
                System.out.print(val + " ");
            }
            System.out.println("***");
        }
    }
}
