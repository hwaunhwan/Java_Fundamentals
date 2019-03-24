package practice.examples.exceptions;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        ArithmeticExceptionExample a = new ArithmeticExceptionExample();
        System.out.println(a.division(10, 0));
    }
    public int division(int a, int b){
        try {
            return a/ b;
        } catch (ArithmeticException arExc){
            return -1;
        }
    }
}
