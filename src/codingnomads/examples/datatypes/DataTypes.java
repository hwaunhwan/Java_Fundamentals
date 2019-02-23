package codingnomads.examples.datatypes;

public class DataTypes {

    // can hold a true or false value
    boolean isAwesome = true;

    // 8 bits (or one byte)
    byte byteNum = 12;

    // 16 bits (or two bytes) in memory
    short shortNum = 12;

    // 32 bits of memory
    int intNum = 1456474;

    // 64 bits of memory
    long longNum = 45454535345345l;

    // 32 bits of memory
    float floatNum = 34.323123f;

    // 64 bits of memory
    double doubleNum = 123.45;

    static char c = 'a';
    static char d = 64;

    public static void main(String[] args) {

        System.out.println(d);
        System.out.println(c);
        c++;
        System.out.println(c);

    }

}
