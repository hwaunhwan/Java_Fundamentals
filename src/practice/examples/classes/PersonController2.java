package practice.examples.classes;

public class PersonController2 {
    public static void main(String[] args) {
        Person somePerson = new Person(33, 70,"Simon");
        Person someOtherPerson = new Person(26, 65, "Shinhye");

        System.out.println("The first person is named " + somePerson.name +
                " he/she is " + somePerson.height + " inches tall and he/she is "
                +somePerson.age + " years old");
        System.out.println("The first person is named " + someOtherPerson.name +
                " he/she is " + someOtherPerson.height + " inches tall and he/she is "
                +someOtherPerson.age + " years old");

    }
}
