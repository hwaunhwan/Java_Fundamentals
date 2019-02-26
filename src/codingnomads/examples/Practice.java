import java.util.Arrays;

public class Practice {

    static int findMissing(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int min = numbers[0];
        int max = numbers[len - 1];

        //Sum of Array
        int arraySum = 0;
        for(int i = 0; i < len; i++){
            arraySum += numbers[i];
        }

        //Sum of Array + missing number
        int actualSum = 0;
        for(int x = min; x <= max; x++){
            actualSum += x;
        }

        return actualSum - arraySum;
    }


    public static void main(String[] args) {
        int[] num = {4,6,5,7,9,10};
        int missing = findMissing(num);
        System.out.println(missing);
    }
}
