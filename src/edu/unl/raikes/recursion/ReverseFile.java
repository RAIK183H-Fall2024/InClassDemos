/**
 * This is ReverseFile.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class provides the definitions for ReverseFile in the edu.unl.raikes.recursion package.
 */
public class ReverseFile {

    public static String recurseReverse(Scanner s) {
        if (!s.hasNextLine()) {
            return "";
        } else {
//            String thisLine = ;
            String everythingElseReversedString = recurseReverse(s);
            return everythingElseReversedString + "\n" + s.nextLine();
        }
    }

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        // open file
        try {
            Scanner scanner = new Scanner(new File("hours.txt"));

            // recurse/reverse file
            String reversedString = recurseReverse(scanner);

            // print it
            System.out.println(reversedString);

            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
