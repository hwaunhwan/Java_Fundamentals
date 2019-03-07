package practice.examples.variable_scope;

//This is an example of POJO
//POFO = Plain Old Java Object
public class Vehicle {

    public String make;
    public String model;
    public int year;

    public void someMethod(){
        String color;
        //This won't be accessible from other class in this package
    }
}
