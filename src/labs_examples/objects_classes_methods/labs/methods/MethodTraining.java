package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {
        int a = multiply(2,3);
        int b = multiply(2,3, 4);
        //double x = Math.PI;

        System.out.println("original a = " + a);
        System.out.println("original b = " + b);
        passByVal(a);
        System.out.println("current a = " + a);
        Fruit myFruit = new Fruit("banana");
        System.out.println(myFruit.toString());
        changeFruit(myFruit);
        System.out.println(myFruit.toString() + " (pass by reference)");
        largest(9,2,20,4);
        countConsonants("Simon Kim");
        art();
        System.out.println(isPrime(29));;
        System.out.println(isPrime(2));;
        System.out.println(isPrime(3));;
        System.out.println(isPrime(4));;

        int[] nums = {14,2,3,34,5};
        System.out.println("Original array: " + Arrays.toString(nums));
        int[] newNums = smallestLargest(nums);
        System.out.println("Smallest and Largest: " + Arrays.toString(newNums));
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList = arrayList(20, 2,7);
        System.out.println("ArrayList with divisors count: " + newArrayList.size());
        System.out.println("Original array: " + Arrays.toString(nums));
        //reverseArrayRecursive(nums, 0, nums.length-1);
        //System.out.println("Reversed array: " + Arrays.toString(nums));

        nums = reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    //overloading
    static int multiply(int a, int b){
        return a * b;
    }
    static int multiply(int a, int b, int c){
        return a * b * c;
    }

    //pass by value
    static void passByVal(int a){
        a = a * 2;
        System.out.println("a = " + a + " (inside the method)");

    }

    //pass by reference
    static class Fruit {
        String name;

        public Fruit(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static void changeFruit(Fruit fruit){
        fruit.name = "apple";
    }

    //varargs
    static void largest(int... a){
        int largest = a[0];
        for (int i = 0; i < a.length; i++){
            if(largest < a[i]){
                largest = a[i];
            }
        }
        System.out.println(largest + " is the largest number");
   }

   static void countConsonants(String s) {
       int count = 0;
       char a;
       //s = s.toUpperCase();
       System.out.println(s);
       for (int i = 0; i < s.length(); i++){
           a = s.charAt(i);
           if (!(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
                   a == 'A' ||  a == 'E' || a == 'I' || a == 'O' || a == 'U') && a >= 65 && a <= 90) {
                count++;
           }
       }
       System.out.println(count);
   }
   // ascii art
   static void art() {
       System.out.println("   _   ");
       System.out.println(" _(\")_ ");
       System.out.println("(_ . _)");
       System.out.println(" / : \\ ");
       System.out.println("(_/ \\_)");
   }
   // prime number
   static boolean isPrime(int num){
        // 2 is only even prime number
        if(num % 2 == 0) return false;
        for(int i = 3; i * i < num; i += 2){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
   }

   //Return Array
   static int[] smallestLargest(int[] nums){
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int[] newNums = {min, max};
        return newNums;
   }

   // Return ArrayList
    static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        for (int i = 0; i <= maxNum; i++){
            if (i % divisor1 == 0 && i % divisor2 == 0){
                arrInt.add(i);
            }
        }
        return arrInt;
    }


//    https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

//    Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array

    static void reverseArrayRecursive(int[] arr, int start, int end){
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursive(arr, start+1, end-1);
    }

    static int[] reverseArray(int[] arr){
        int temp;
        // if I don't divide it by 2, it will un-reverse it.
        for (int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}

