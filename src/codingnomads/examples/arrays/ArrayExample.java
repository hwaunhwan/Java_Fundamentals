package codingnomads.examples.arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        // can't change length of array

        intArray[0] = 97;
        intArray[1] = 17;
        intArray[2] = 56;
        intArray[3] = 14;
        intArray[4] = 39;
        //intArray[4] = 39.9;
        //int type array can't take double value

        //System.out.println(intArray[3]);

        for(int i = 0; i < intArray.length; i++){
            System.out.println("The array at the index of " + i + " is "+ intArray[i]);
        }

        //Alternative Decorative Array Syntax
        //Not very common
        int [] intArray2 = {23, 34, 21, 56, 98};
        for(int i = 0; i < intArray2.length; i++){
            System.out.println("The new array at the index of " + i + " is "+ intArray2[i]);
        }

        printArray(intArray);
    }
    public static void printArray(int[] vals){
        for(int i = 0; i < vals.length; i++){
            System.out.println("testing .length " + vals[i]);
        }
    }
}
