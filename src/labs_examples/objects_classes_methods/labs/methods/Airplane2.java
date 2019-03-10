package labs_examples.objects_classes_methods.labs.methods;
// Exercise_02 from objects
class AirPlaneExample {
    public static void main(String[] args) {
        Airline airline = new Airline();
        airline.setCompany("Southwest");
        System.out.println(airline.getCompany());

        Plane plane = new Plane("Boeing");
        plane.setModel(737);
        System.out.println(plane.toString());
        System.out.println();

        Flight flight = new Flight();
        flight.setDomestic(false);
        Capacity capacity = new Capacity();
        capacity.setPassengers(150);

        Airplane newAirplane = new Airplane(airline, plane, flight, capacity, 500.0, 500.0);

        System.out.println(newAirplane.toString());
    }
}

class Airline {
    private String company;

    public Airline(String company) {
        this.company = company;
    }
    public Airline() { }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "company='" + company + '\'' +
                '}';
    }
}

class Plane {
    private String make;
    private int model;

    public Plane(String make, int model) {
        this.make = make;
        this.model = model;
    }

    public Plane(String make) {
        this.make = make;
    }

    public Plane(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "make='" + make + '\'' +
                ", model=" + model +
                '}';
    }
}

class Flight {
    private boolean isDomestic;

    public Flight(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }
    public Flight(){}

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "isDomestic=" + isDomestic +
                '}';
    }
}

class Capacity {
    private int passengers;

    public Capacity(int passengers) {
        this.passengers = passengers;
    }
    public Capacity(){}

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "passengers=" + passengers +
                '}';
    }
}


class Airplane {
    private Airline airline;
    private Plane plane;
    private Flight flight;
    private Capacity capacity;

    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(Airline airline, Plane plane, Flight flight, Capacity capacity, double fuelCapacity, double currentFuelLevel) {
        this.airline = airline;
        this.plane = plane;
        this.flight = flight;
        this.capacity = capacity;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Airplane(Airline airline) {
        this.airline = airline;
    }

    public Airplane(){}

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{\n" +
                "airline=" + airline +
                ", \nplane=" + plane +
                ", \nflight=" + flight +
                ", \ncapacity=" + capacity +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
