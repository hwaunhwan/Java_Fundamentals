package practice.examples.oop.inheritance;

import practice.examples.oop.polymorphism.MotorizedTransport;

public abstract class Vehicle implements MotorizedTransport {

    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.1417;

//    public Vehicle() {
//    }

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

//    public final void accelerate(double mph){
//        System.out.println("vehicle accerlerating");
//    }

//interface example


    @Override
    public boolean start() {
        System.out.println("starting vehicle");
        return true;
    }

//    Commenting out stop() will require this class to be abstract
//    @Override
//    public void stop() {
//        System.out.println("stopping vehicle");
//    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating vehicle by " + mph);
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating vehicle by " + mph);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
