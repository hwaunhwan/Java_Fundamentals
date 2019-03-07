package practice.examples.classes;

public class PersonController
{
    public static void main(String[] args) {

        // Declare and instantiate
        Person somePerson = new Person();

        // Declare
        Person someOtherPerson;

        // Then instantiate
        someOtherPerson = new Person();

        somePerson.age = 33;
        somePerson.height = 70;
        somePerson.name = "Simon";

        someOtherPerson.age = 26;
        someOtherPerson.height = 65;
        someOtherPerson.name = "Shinhye";

        System.out.println("The first person is named " + somePerson.name +
                " he/she is " + somePerson.height + " inches tall and he/she is "
                +somePerson.age + " years old");
        System.out.println("The first person is named " + someOtherPerson.name +
                " he/she is " + someOtherPerson.height + " inches tall and he/she is "
                +someOtherPerson.age + " years old");
    }
}
