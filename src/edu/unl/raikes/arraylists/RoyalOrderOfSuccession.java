/**
 * This is RoyalOrderOfSuccession.java, packaged within
 * edu.unl.raikes.arraylists.
 */
package edu.unl.raikes.arraylists;

import java.util.ArrayList;

/**
 * This class provides the definitions for RoyalOrderOfSuccession in the edu.unl.raikes.arraylists package.
 */
public class RoyalOrderOfSuccession {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] heirs = { "Prince William", "Prince George", "Princess Charlotte", "Prince Louis", "Prince Harry",
                "Archie Mountbatten-Windsor", "Prince Andrew", "Princess Beatrice", "Princess Eugenie" };

        // initialize the heirs array list
        ArrayList<String> heirsList = new ArrayList<String>();

        // add elements manually
        for (int i = 0; i < heirs.length; i++) {
            heirsList.add(heirs[i]);
        }

        heirsList.add("Prince Edward");
        heirsList.add(6, "Lilibet Mountbatten-Windsor");

        // add elements manually
        for (int i = 0; i < heirsList.size(); i++) {
            System.out.println((i + 1) + ". " + heirsList.get(i));
        }

        int indexOfEugenie = heirsList.indexOf("Princess Eugenie");
        System.out.println("Princess E is " + (indexOfEugenie + 1) + " in line.");

        String fourth = heirsList.get(3);
        System.out.println(fourth + " is fourth in line.");

        // remove prince louis
        heirsList.remove("Prince Louis");
        int indexOfLouis = heirsList.indexOf("Prince Louis");
        System.out.println("Prince L is at index " + (indexOfLouis) + " in the list.");

        // change princess charlotte's name
        heirsList.set(heirsList.indexOf("Princess Charlotte"), "Princess Charlie");
        System.out.println(heirsList);

        System.out.println(heirsList.size());

        System.out.println("the list contains Steve: " + heirsList.contains("Stephen Cooper"));
    }

}
