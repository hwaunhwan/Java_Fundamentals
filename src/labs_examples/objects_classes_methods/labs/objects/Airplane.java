package labs_examples.objects_classes_methods.labs.objects;
// Exercise_01 & Exercise_04
class AirPlaneExample {
    public static void main(String[] args) {
        Airline airline = new Airline("Southwest");
        Plane plane = new Plane("Boeing", 737);
        Flight flight = new Flight(true);
        Capacity capacity = new Capacity(200);

        Airplane newAirplane = new Airplane(airline, plane, flight, capacity, 500.0, 500.0);

        System.out.println(newAirplane.toString());

        System.out.println();

        Airplane airplane2 = new Airplane();
        airplane2.airline = new Airline("Delta");
        System.out.println(airplane2.toString());

        System.out.println();

        Airline test = new Airline("United");
        Airplane airplane3 = new Airplane(test);
        System.out.println(airplane3.toString());

    }
}

class Airline {
    String company;

    public Airline(String company) {
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
    String make;
    int model;

    public Plane(String make, int model) {
        this.make = make;
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
    boolean isDomestic;

    public Flight(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "isDomestic=" + isDomestic +
                '}';
    }
}

class Capacity {
    int passengers;

    public Capacity(int passengers) {
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
    Airline airline;
    Plane plane;
    Flight flight;
    Capacity capacity;

    double fuelCapacity;
    double currentFuelLevel;

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
