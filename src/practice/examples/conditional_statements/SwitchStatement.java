package practice.examples.conditional_statements;

public class SwitchStatement {
    public static void main(String[] args) {
        int i = 4;
        //i = 7;

        switch(i) {
            case 0 :
                System.out.println("i is 0");
                break;
            case 1 :
                System.out.println("i is 1");
                break;
            case 2 :
                System.out.println("i is 2");
                break;
            case 3 :
                System.out.println("i is 3");
                break;
            case 4 :
                System.out.println("i is 4");
                break;
            default :
                System.out.println("default was hit");
        }
        String str = "gold";
        str = "bronze";
        System.out.println("Your membership gives you access to the following levels");

        switch(str){
            //use case of no breaks = cascading behavior
            case "gold":
                System.out.println("gold level");
            case "silver":
                System.out.println("silver level");
            case "bronze":
                System.out.println("bronze level");

        }
        // if there's no break statement, it ignores next case statement and does everything
        System.out.println("Done with switch statement");

    }
}
