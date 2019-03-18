package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10 is printed and it's because a has a type of class A even though it was constructed with B()
 *
 */
class A {
    int i = 10;

//    public int getI() {
//        return i;
//    }
}

class B extends A{
    int i = 20;

//    @Override
//    public int getI() {
//        return i;
//    }
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
//        System.out.println(a.getI());
    }
}