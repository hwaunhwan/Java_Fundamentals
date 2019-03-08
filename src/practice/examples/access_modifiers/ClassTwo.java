package practice.examples.access_modifiers;

public class ClassTwo {

    static void main(String[] args) { //can make it default to access things in the same package
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.protectedVar = 20;
        //classOne.privateVar = 30; private error....use public method to modify private

        classOne.changePrivateVar(30);


    }

}
