package practice.examples.methods.pass_by_reference;

import practice.examples.classes.Person;

public class PassByRef {

    public static void main(String[] args) {
        Person simon = new Person(33, 70, "Simon");

        System.out.println(simon.toString());

        addYearToPerson(simon);

        System.out.println(simon.toString());

    }

    public static void addYearToPerson(Person person){
        person.age = person.age + 1;
    }

}
