/**
 * This is FilesMisc.java, packaged within
 * edu.unl.raikes.files.
 */
package edu.unl.raikes.files;

import java.io.File;

/**
 * This class provides the definitions for FilesMisc in the edu.unl.raikes.files package.
 */
public class FilesMisc {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        File incriminatingEvidence = new File("incriminatingEvidence.txt");

        if (incriminatingEvidence.exists()) {
            File nothingToSeeHere = new File("nothingToSeeHere.txt");
            incriminatingEvidence.renameTo(nothingToSeeHere);

            System.out.println(incriminatingEvidence.exists());
            System.out.printf("The file's name is: %s and it has size: %d\n", incriminatingEvidence.getName(),
                    incriminatingEvidence.length());

            System.out.println(nothingToSeeHere.exists());
            System.out.printf("The file's name is: %s and it has size: %d\n", nothingToSeeHere.getName(),
                    nothingToSeeHere.length());
        } else {
            System.out.println("not guilty");
        }
    }

}
