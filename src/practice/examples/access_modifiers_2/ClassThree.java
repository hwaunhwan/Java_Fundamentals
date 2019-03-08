package practice.examples.access_modifiers_2;
//Testing access modifiers from access modifiers package

import practice.examples.access_modifiers.ClassOne;

public class ClassThree {

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;

        //classOne.protectedVar = 20; protected no longer works because it's not in the same package



        //classOne.privateVar = 30; private error....use public method to modify private

        classOne.changePrivateVar(30);


    }

}
