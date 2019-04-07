package labs_examples.static_nonstatic.labs;

public class Class1 {

    public static void main(String[] args) {
//        1) A static method calling another static method in the same class
        staticMethod1();
//        2) A static method calling a non-static method in the same class
        Class1 c1 = new Class1();
        c1.nonStaticMethod1();
//        3) A static method calling a static method in another class
        Class2.staticMethod2();
//        4) A static method calling a non-static method in another class
        Class2 c2 = new Class2();
        c2.nonStaticMethod2();
//        5) A non-static method calling a non-static method in the same class
        c1.nonStatic1();
//        6) A non-static method calling a non-static method in another class
        c1.nonStatic3();
//        7) A non-static method calling a static method in the same class
        c1.nonStatic4();
//        8) A non-static method calling a static method in another class
        c1.nonStatic5();
    }

    public static void staticMethod1() {
        System.out.println("Class1 static method printing");
    }

    public void nonStaticMethod1(){
        System.out.println("Class1 non-static method printing");
    }

    public void nonStatic1(){
        nonStatic2();
    }

    public void nonStatic2(){
        System.out.println("NonStatic2 Printed");
    }

    public void nonStatic3(){
        Class2 c2 = new Class2();
        c2.nonStaticMethod2();
    }

    public void nonStatic4(){
        staticMethod1();
    }

    private void nonStatic5() {
        Class2.staticMethod2();
    }
}
