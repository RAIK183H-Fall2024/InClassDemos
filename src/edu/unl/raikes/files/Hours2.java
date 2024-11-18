/**
 * This is Hours.java, packaged within
 * edu.unl.raikes.files.
 */
package edu.unl.raikes.files;

// for File
import java.io.File;
import java.io.FileNotFoundException;
// for Scanner
import java.util.Scanner;

public class Hours2 {
    public static void main(String[] args) {
        // opened the file for reading
        Scanner input = null;

        try {
            input = new Scanner(new File("houhgjkjhfrs.txt"));
            // read each token of the file
            while (input.hasNext()) {
                String token = input.nextLine();
                System.out.println("token = " + token);
            }
        } catch (FileNotFoundException e) {
//          System.out.println(e.getMessage());
//          StackTraceElement[] dString = e.getStackTrace();
//          e.printStackTrace();
            System.out.println(
                    "there has been some mistake in the file name you requested. pardon us. please try again.");
            System.exit(0);
        } finally {
            if (input != null) {
                input.close();
            }
        }

        ///// NEXT CLASS - ADD FINALLY!

        System.out.println("do stuff");

    }
}
