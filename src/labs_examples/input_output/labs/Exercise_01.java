package labs_examples.input_output.labs;

import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

public class Exercise_01 {
    public static void main(String[] args) throws IOException {

        byte data[] = new byte[11];

        System.out.println("Enter some characters.");

        System.in.read(data);

        System.out.print("You entered: ");
        for(int i=0; i < data.length; i++)
            System.out.print((char) data[i]);
    }
}