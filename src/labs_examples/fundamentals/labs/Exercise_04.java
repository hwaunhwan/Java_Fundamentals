package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double pi = Math.PI;
        double r;
        double h;
        double surface_area;
        double volume;

        //pi = 3.14;
        r = 3.14;
        h = 5.0;

        surface_area = (2 * pi * r * r) + (2 * pi * r * h);
        double rounded_surface = Math.round(surface_area * 100)/100.00;
        volume = (pi * r * r * h);
        double rounded_volume = Math.round(volume * 100)/100.00;

        System.out.println("surface area is " + rounded_surface);
        System.out.println("volume is " + rounded_volume);

    }
}
