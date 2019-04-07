package labs_examples.packages.labs.package_1;

import labs_examples.packages.labs.package_2.ExtCar;

public class Car {
    private String make;
    private String model;
    private int year;
    private int price;

    public static void main(String[] args) {
        Car newCar = new Car("Hyundai", "Sonata", 2011, 5000);
        newCar.show();
        // protected method gets called in same package
        newCar.getPrice();
        ExtCar newCar2 = new ExtCar("Toyota", "Campry", 2002, 2000, 24,28);
        newCar2.show();
        //Can't access protected method from another package
        //newCar2.combinedMPG()
    }

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void show() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }

    protected void getPrice(){
        System.out.println("$"+price);
    }
}

