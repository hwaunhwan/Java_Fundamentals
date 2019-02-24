package codingnomads.conditional_statements;

public class DoWhile {

    public static void main(String[] args) {

        int count = 0;

        do {
            //This code will be run at least once
            // such as requiring account number etc. to check the number first
            System.out.println("count is " + count);
            count++;
        } while (count < 10);

        System.out.println("All done with do-while loop");
    }
}
