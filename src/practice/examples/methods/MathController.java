package practice.examples.methods;

public class MathController {

    public static void main(String[] args) {


        // If method is static

        //int x = CustomMath.multiply(2,2);
        //int y = CustomMath.divide(4,2);
        //System.out.println(x);

        // If method is not static
        CustomMath obj = new CustomMath();

        int a = 2;
        int b = 3;

        int x = obj.multiply(a, b);
        int y = obj.divide(4,2);

        System.out.println(x);
        System.out.println(y);

    }

}
