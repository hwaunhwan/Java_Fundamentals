package practice.examples.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {
    public static void main(String[] args) {
        // the main method is where every application
        // begins by default
        System.out.println("first we're here");
        printCurrentTime();
        System.out.println("End");
    }

    public static void printCurrentTime(){
        System.out.println("now we are here");
        String time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss").format(new Date());
        System.out.println(time);
    }
}
