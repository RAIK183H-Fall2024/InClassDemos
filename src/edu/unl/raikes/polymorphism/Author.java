/**
 * This is Author.java, packaged within
 * edu.unl.raikes.polymorphism.
 */
package edu.unl.raikes.polymorphism;

/**
 * This class provides the definitions for Author in the edu.unl.raikes.polymorphism package.
 */
public class Author implements Comparable<Author> {
    String givenName;
    String middleInitial;
    String familyName;
    String honorific;
    String suffix;

    /**
     * Creates an instance of the Author class.
     *
     * @param givenName
     * @param middleInitial
     * @param lastName
     * @param honorific
     * @param suffix
     */
    public Author(String givenName, String middleInitial, String lastName, String honorific, String suffix) {
        super();
        this.givenName = givenName;
        this.middleInitial = middleInitial;
        this.familyName = lastName;
        this.honorific = honorific;
        this.suffix = suffix;
    }

    /**
     * Creates an instance of the Author class.
     *
     * @param givenName
     * @param middleInitial
     * @param lastName
     */
    public Author(String givenName, String middleInitial, String lastName) {
        this(givenName, middleInitial, lastName, "", "");
    }

    /**
     * Creates an instance of the Author class.
     *
     * @param givenName
     * @param lastName
     */
    public Author(String givenName, String lastName) {
        this(givenName, "", lastName, "", "");
    }

    @Override
    public String toString() {
        return this.honorific + " " + this.givenName + " " + this.middleInitial + " " + this.familyName + " "
                + this.suffix;
    }

    @Override
    public int compareTo(Author o) {
        if (!this.familyName.equals(o.familyName)) {
            return this.familyName.compareTo(o.familyName);
        }
        return this.givenName.compareTo(o.givenName);
    }

}
