package practice.examples.arrays;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

//        int[] array = new int[5];
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("cool");
        arrayList.add("Programming");

        String val = arrayList.get(4);
        //System.out.println(val); // print "so"

        boolean check = arrayList.contains("Programming");
        //System.out.println(check); //print true

        for(String s : arrayList){
            System.out.println(s);
        }

        //arrayList. will show all available methods

        int lastIndexOfProgramming = arrayList.lastIndexOf("Programming");
        System.out.println(lastIndexOfProgramming);

        System.out.println(arrayList);

    }

}
