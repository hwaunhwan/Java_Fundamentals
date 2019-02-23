package codingnomads.examples.operators;

public class OperatorsExamples {

    public static void main(String[] args) {

        // Arithmetic Operators
        int addition = 1 + 2;
        System.out.println(addition);
        int substraction = 6 - 3;
        System.out.println(substraction);
        int division = 9 / 3;
        System.out.println(division);
        int multiply = 2 * 3;
        System.out.println(multiply);
        int mod = 10 % 3;
        System.out.println(mod);

        //Relational Operators
        int val1 = 10;
        int val2 = 20;

        if (val1 <= val2){
            System.out.println("This will print");
        }
        if (val1 >= val2){
            System.out.println("This will not print");
        }
        if (val1 == val2){
            System.out.println("This will not print");
        }

        //Logical Operators
        boolean trueVal = true;
        boolean falseVal = false;
        if (trueVal) {
            System.out.println("This will print");
        }
        if (falseVal) {
            System.out.println("This will not print");
        }
        if (trueVal && falseVal) {
            System.out.println("This will not print");
        }
        if (trueVal ^ falseVal) {
            System.out.println("This will print");
        }
        if (trueVal || falseVal) {
            System.out.println("This will print");
        }
        if (!falseVal) {
            System.out.println("This will print");
        }



    }

}
