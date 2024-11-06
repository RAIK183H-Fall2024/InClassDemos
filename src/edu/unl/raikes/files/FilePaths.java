/**
 * This is FilePaths.java, packaged within
 * edu.unl.raikes.files.
 */
package edu.unl.raikes.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class provides the definitions for FilePaths in the edu.unl.raikes.files package.
 */
public class FilePaths {
    public static void main(String[] args) throws FileNotFoundException {
        File charm = new File("./files/charm.txt");

        if (charm.exists()) {
            System.out.println("Hooray!");
        }

        Scanner charmScanner = new Scanner(charm);

        while (charmScanner.hasNextLine()) {
            System.out.println(charmScanner.nextLine());
        }
    }
}
