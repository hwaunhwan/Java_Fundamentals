package practice.examples.oop.polymorphism;

public class Scooter implements MotorizedTransport {
    @Override
    public boolean start() {
        System.out.println("start scooter");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("stop scooter");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("acc scooter by " + mph);
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("dec scooter by " + mph);
    }
}
