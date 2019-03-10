package practice.examples.methods;

public class RecursiveFactorial {

    //Recursion = a method that calls itself

    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);
    }

    static int factorial(int x){
        int total;

        //base case - this will be used to end the recursive calls
        if( x == 1)
            return 1;

        // Otherwise, factorial is called and passed x -1
        // reducing x each time until it reaches 1
        total = x * factorial(x -1);

        return total;
    }

}

/*
    2 * 1! -> 2 * 1 = 2 (base case)
    3 * 2! -> 3 * 2 = 6
    4 * 3! -> 4 * 6 = 24
    5 * 4! -> 5 * 24 = 120
    5! = 120            (oldest)
 */