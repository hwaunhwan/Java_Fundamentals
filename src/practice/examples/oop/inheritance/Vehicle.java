package practice.examples.oop.inheritance;

public class Vehicle {

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

    public void accelerate(double mph){
        System.out.println("vehicle accerlerating");
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
