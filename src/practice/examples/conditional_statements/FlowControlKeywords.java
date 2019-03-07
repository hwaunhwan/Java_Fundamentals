package practice.examples.conditional_statements;

public class FlowControlKeywords {

    // Flow control
    // continue, break, return
    public static void main(String[] args) {
        //continue
        for(int i = 0; i < 10; i++){
            for(int x = 0; x < 10; x++) {
                if (x == 3 || x == 7) {
                    continue;
                    //forces an early iteration of the loop
                }
                System.out.println("x = " + x);
            }
            System.out.println("i = " + i);
        }

        //break
        for(int i = 0; i < 10; i++){
            if (i == 3 || i == 7) {
                break;
                //exits the nearest loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("done with break loop");
        int i = someMethod(1);
        System.out.println("i = "+i);

    }

    // return exits the current method
    public static int someMethod(int val){
        if(val == 0){
            System.out.println("1) will this print?");
            return 0;
        } else if (val==1){
            System.out.println("2) will this print?");
            return 1;
        }
//        else {
//            System.out.println("3) will this print?");
//            return -1;
//        }
        System.out.println("4) will this print");
        return -1;


    }

}
