package practice.examples.oop.static_nonstatic.methods;

public class ClassA {

    public static void main(String[] args) {

        // calling static methods in the same class
        staticMethod();
        int x = multiply(23, 56);
        System.out.println(x);

        // calling non-static methods in the same calls
        ClassA obj = new ClassA();
        obj.nonStaticMethod();
        double y = obj.multiply(12.34, 67.89);
        System.out.println(y);

        // calling non-static methods from non-static
        obj.nonStatic1();

        // calling static methods in another class
        ClassB.staticMethod();

        // calling non-static methods in another class
        ClassB obj2 = new ClassB();
        obj2.nonStaticMethod();

        // Math class is a great example of static methods
        // double pi = Math.PI;
    }

    public static void staticMethod(){
        System.out.println("printing staticMethod");
    }

    public void nonStaticMethod(){
        System.out.println("printing nonStaticMethod");
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public void nonStatic1(){
        nonStatic2();
    }

    public void nonStatic2(){
        System.out.println("printing non static 2");
    }
}
