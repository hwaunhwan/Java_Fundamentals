package practice.examples.variables;

public class Variables {

    // global variable
    // field variable
    // instance variable

    static double val = 123.45;

    public static void main(String[] args) {
        double x = multiply(val, val * 2);
        Person myPerson = new Person("Simon", 33);
        myPerson.age = 34;
        Person yourPerson = new Person("Shinhye", 26);
        Person einstein = new Person("Einstein", 100);
        Person ellen = new Person("Ellen", 50);
        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());
        System.out.println(ellen.toString());
    }

    public static double multiply(double a, double b){
        // Local variable to method multiply
        double result = a * b;

        if (result > 0){
            double testVal = result * 2;
            // local to if statement
            System.out.println(testVal);
            // using static and local variable in multiply
            System.out.println(val + result);

        }

        printNum(result);
        return result;
    }

//    public static void test(){
//        System.out.println(result);
//    }

    public static void printNum(double numToPrint){
        System.out.println(numToPrint);
        System.out.println(val);
    }


}
