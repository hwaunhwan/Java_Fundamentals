package codingnomads.examples.conditional_statements;

public class ForLoop {

    public static void main(String[] args) {
        //for(initializationl (boolean) condition; iterator}
        for(int i = 0; i < 10; i++){
            System.out.println("i = "+i);
            //for loops can be nested
            //other iterators i += 3, x -= 2 etc.
            for(int x = 0; x < 10; x+=2){
                System.out.println("-- x = " + x);
            }
        }
    }
}
