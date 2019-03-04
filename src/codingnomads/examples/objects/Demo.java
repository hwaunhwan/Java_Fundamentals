package codingnomads.examples.objects;


//Example of Object Composition.
// What is better, inheritance vs Composition?
public class Demo {

    public static void main(String[] args) {
        Oven myOven = new Oven(true, 500, "GE");
        Dishwasher dishwasher = new Dishwasher(true, "GE", 5);
        Refrigerator refrigerator = new Refrigerator(true, "Kenmore", 150);
        Sink sink = new Sink(true, "sinkBrank", "stainless steel");
        Kitchen myKitchen = new Kitchen(dishwasher, myOven, refrigerator, sink);

        System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " + "with a max temp of "
        + myKitchen.getOven().getMaxTemp());

        System.out.println(myKitchen.toString());
    }

}
