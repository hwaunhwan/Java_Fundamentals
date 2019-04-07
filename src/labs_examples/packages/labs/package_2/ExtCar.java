package labs_examples.packages.labs.package_2;

import labs_examples.packages.labs.package_1.Car;

public class ExtCar extends Car {
    private int cityMpg;
    private int hwMpg;
    public ExtCar(String make, String model, int year, int price, int cityMpg, int hwMpg) {
        super(make, model, year, price);
        this.cityMpg = cityMpg;
        this.hwMpg = hwMpg;
    }

    public void show(){
        super.show();
        System.out.println(cityMpg);
        System.out.println(hwMpg);
    }

    protected void combinedMPG(){
        System.out.println((cityMpg + hwMpg)/2);
    }

    public static void main(String[] args) {
        ExtCar carA = new ExtCar("Toyota", "Campry", 2002, 2000, 24,28);
        //Calling protected Method in different package using extend
        carA.show();
        carA.getPrice();
        carA.combinedMPG();
    }
}
