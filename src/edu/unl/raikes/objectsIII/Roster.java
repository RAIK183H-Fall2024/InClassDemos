/**
 * This is Roster.java, packaged within
 * edu.unl.raikes.objectsIII.
 */
package edu.unl.raikes.objectsIII;

import java.util.Arrays;

/**
 * This class provides the definitions for Roster in the edu.unl.raikes.objectsIII package.
 */
public class Roster {

    private String[] roster;

    public Roster(int registrationCap) {
        this.roster = new String[registrationCap];
    }

    /**
     * Gets the object's roster.
     *
     * @return the roster
     */
    public String[] getRoster() {
        return this.roster;
    }

    /**
     * Gets the object's registrationCap.
     *
     * @return the registrationCap
     */
    public int getRegistrationCap() {
        return this.roster.length;
    }

    /**
     * Sets the object's registrationCap.
     *
     * @param registrationCap the registrationCap to set
     */
    public void setRegistrationCap(int registrationCap) {
        String[] bigger = Arrays.copyOfRange(this.roster, 0, registrationCap);
    }

}
