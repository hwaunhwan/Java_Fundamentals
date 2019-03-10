package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int x = multiply(3, 4);
        int y = divide(10,2);

        System.out.println(x);
        System.out.println(y);

        joke();

        int z = toSecodns(1);
        System.out.println(z);

        int c = varargsLength(1,2,3,4,5,6,7,8,9,10);
        System.out.println(c);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        static int multiply(int a, int b){
            return a * b;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
        static int divide(int a, int b){
            return a / b;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
        static void joke(){
            System.out.println("Q: What do you get when you cross a dinosaur with a pig?\n" +
                    "A: Jurrassic Pork.");
        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
        static int toSecodns(int a){
            return a * 60 * 60 * 24 * 365;
        }
    // 5) Create a varargs method that will return the length of the varargs array passed in
        static int varargsLength(int... varargs){
            int count = 0;
            for(int vararg: varargs){
                count++;
            }
            return count;
        }





}
