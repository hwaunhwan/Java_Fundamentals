package practice.examples.oop.static_nonstatic.variables;

public class StaticController {

    public static void main(String[] args) {

        House h1 = new House(1000, "123 A Street");
        House h2 = new House(500, "456 B Street");
        House h3 = new House(1500, "789 C Street");

//        System.out.println(h1.toString());
//        System.out.println(h2.toString());
//        System.out.println(h3.toString());

        System.out.println(h1.numHousesBuilt);
        System.out.println(h2.numHousesBuilt);
        System.out.println(h3.numHousesBuilt);

        House h4 = new House(12000, "new address");
        System.out.println(h1.numHousesBuilt);
        System.out.println(h2.numHousesBuilt);
        System.out.println(h3.numHousesBuilt);
        System.out.println(h4.numHousesBuilt);
    }

}
