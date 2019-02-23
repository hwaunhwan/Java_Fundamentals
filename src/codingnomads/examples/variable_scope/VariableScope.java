package codingnomads.examples.variable_scope;

public class VariableScope {

    static int globalVar = 10;

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Nissan";
        myCar.model = "XTerra";
        myCar.year = 2000;

        String message = "";
        if (myCar.model.equalsIgnoreCase("Toyota")){
            message = "It's a Toyota";
            System.out.println(message);
        } else {
            System.out.println("It's not a Toyota");
            System.out.println(message);
        }


    }


    public static int multiply(int a, int b){
        int result = a * b * globalVar;
        return result;
    }

    public static int divide(int a, int b){
        //int val = result / a / b;
        //result variable is out of scope so above line doesn't work

        int val = globalVar / a / b;
        return val;
    }



}
