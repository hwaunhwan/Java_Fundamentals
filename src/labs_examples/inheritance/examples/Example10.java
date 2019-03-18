package labs_examples.inheritance.examples;

// Create an off-road vehicle class
class OffRoad extends Vehicle {
    private int groundClearance; // ground clearance in inches

    public OffRoad(int p, int f, int m, int groundClearance) {
        super(p, f, m);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }
}

class OffRoadDemo {
    public static void main(String args[]) {

        // construct some trucks
        OffRoad off = new OffRoad(2, 200, 7, 44);

        double gallons;
        int dist = 252;

        gallons = off.fuelneeded(dist);

        System.out.println("Offroad car has " + off.getGroundClearance() +
                " ground clearance.");
        System.out.println("To go " + dist + " miles offroad car needs " +
                gallons + " gallons of fuel.");
    }
}