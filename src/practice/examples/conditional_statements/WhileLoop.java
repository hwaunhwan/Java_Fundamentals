package practice.examples.conditional_statements;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 1;
        int temp = 0;

        while(count < 11){
            System.out.println("count is " + count);
            count++;
            //System.out.println(temp);
            //temp++;
        }

        System.out.println("All done with while loop!");

        int outerCount = 0;
        int innerCount = 0;

        while(outerCount < 10){
            while (innerCount < 10){
                System.out.println("Outer count = " + outerCount
                + " and Inner count = " + innerCount);
                innerCount++;
            }
            innerCount = 0;
            outerCount++;
        }

        System.out.println("All done with nested while loop");


    }

}
