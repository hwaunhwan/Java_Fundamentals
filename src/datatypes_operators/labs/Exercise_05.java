package datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("OR: a or b is true");
        }

        // write your code below
        a = true;
        b = true;

        // &
        if (a & b){
            System.out.println("AND: a and b is true");
        }

        //&&
        if (a && b){
            System.out.println("SC AND: both a and b are true");
        }

        // ||
        a = true;
        b = false;
        if (a || b){
            System.out.println("SC OR: a or b is true");
        }

        a = true;
        b = false;
        if (a ^ b){
            System.out.println("XOR: either a or b is true");
        }

        if (!b){
            System.out.println("NOT: b is not false");
        }


    }

}

