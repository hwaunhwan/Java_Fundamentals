package practice.examples.oop.polymorphism;

import practice.examples.oop.inheritance.MotorCycle;
import practice.examples.oop.inheritance.Sedan;
import practice.examples.oop.inheritance.Truck;

public class DependencyInjectionController {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);
        MotorCycle moto = new MotorCycle("Ducati", "Monster", 500, 1000, false);

        Dependency example = new Dependency(truck);
        example.testMethods();

        example.setTransport(sedan);
        example.testMethods();

        example.setTransport(moto);
        example.testMethods();
    }


}
