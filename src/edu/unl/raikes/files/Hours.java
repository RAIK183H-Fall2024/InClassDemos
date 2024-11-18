/**
 * This is Hours.java, packaged within
 * edu.unl.raikes.files.
 */
package edu.unl.raikes.files;

// for File
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
// for Scanner
import java.util.Scanner;

public class Hours {
    public static void main(String[] args) throws FileNotFoundException {
        // opened the file for reading
        Scanner input = new Scanner(new File("hours.txt"));

        PrintWriter outputPrintWriter = new PrintWriter(new File("WrittenFile.txt"));

        // read each line of the file
        while (input.hasNext()) {
            // get a full line
            String fullLineString = input.nextLine();
            Scanner thisPersonScanner = new Scanner(fullLineString);

            // process one person
            // get id
            int id = thisPersonScanner.nextInt();
            outputPrintWriter.println("id = " + id);

            // get name
            String name = thisPersonScanner.next();
            outputPrintWriter.println("name = " + name);

            // get all the hours
            double totalHours = 0.0;
            int days = 0;

            // loop through each hour record
            while (thisPersonScanner.hasNextDouble()) {
                double nextHours = thisPersonScanner.nextDouble();
                outputPrintWriter.println("next hours = " + nextHours);
                totalHours += nextHours;
                days++;
            }

            // print results
            outputPrintWriter.println(
                    name + " (ID#" + id + ") worked " + totalHours + " hours (" + (totalHours / days) + " hours/day)");

            thisPersonScanner.close();
        }
        input.close();
        outputPrintWriter.close();

    }
}
