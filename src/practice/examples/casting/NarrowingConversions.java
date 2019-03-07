package practice.examples.casting;

public class NarrowingConversions {

    public static void main(String[] args) {
        double x = 10.23;
        float f = (float) x;

        //double x is being casted to an int z below
        System.out.println("double x = "+x);
        System.out.println("float f = "+f);
        int z = (int) x;
        System.out.println("int z = "+z);

        double d = 100.04;
        long l = (long) d;


        int i = (int) l;
        System.out.println("double d = "+d);
        System.out.println("long l = "+l);
        System.out.println("int i = "+i);

    }

}
