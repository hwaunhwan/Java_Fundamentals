package objects_classes_methods.labs.objects;
/**
Following the example in CarExample.java, please use Object Composition to model an Airplane class.
The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
We'll use these a bit later.
**/

class AirPlaneExample {
    public static void main(String[] args) {
        Airline airline = new Airline("Southwest");
        Plane plane = new Plane("Boeing", 737);
        Flight flight = new Flight(true);
        Capacity capacity = new Capacity(200);

        Airplane newAirplane = new Airplane(airline, plane, flight, capacity, 500, 500);

        System.out.println(newAirplane.toString());
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

    @Override
    public String toString() {
        return "Airplane{" +
                "airline=" + airline +
                ", plane=" + plane +
                ", flight=" + flight +
                ", capacity=" + capacity +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
