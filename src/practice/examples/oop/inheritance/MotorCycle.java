package practice.examples.oop.inheritance;

public class MotorCycle extends Vehicle {
    //method overriding

    private int cc;
    private boolean twoSeat;

    public MotorCycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }
    public void demonstrate(){
        this.accelerate(10);
        super.accelerate(10);
    }

    @Override
    public void stop() {
        System.out.println("stopping moto");
    }

    //use @override to prevent errors
    @Override
    public void accelerate(double mph){
        System.out.println("motorcycle accelerating");
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }
}
