package codingnomads.examples.classes;

// POJO :  Plain Old Java Object
// classes starts with capital letter
public class Person {

    // instance variable
    int age;
    double height;
    String name;

    // constructors
    // ...
    // public Person(){}     is default constructor that's provided by java
    // It's used when "new" keyword is used
    // below is an example of parameterized constructor
    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    //overloading to make PersonController class to work
    //This is called default constructor
    public Person(){}

    // methods
    // ...

    final double PI = 3.14;
    // only final has all caps
}
