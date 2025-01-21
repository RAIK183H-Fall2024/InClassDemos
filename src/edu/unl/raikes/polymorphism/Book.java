/**
 * This is Book.java, packaged within
 * edu.unl.raikes.polymorphism.
 */
package edu.unl.raikes.polymorphism;

import java.util.Arrays;

/**
 * This class provides the definitions for Book in the edu.unl.raikes.polymorphism package.
 */
public class Book {
    String title;
    Author[] authors;
    String isbn13;

    /**
     * Creates an instance of the Book class.
     *
     * @param title
     * @param authors
     * @param isbn13
     */
    public Book(String title, Author[] authors, String isbn13) {
        super();
        this.title = title;
        this.authors = authors;
        this.isbn13 = isbn13;
    }

    /**
     * Gets the object's title.
     *
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the object's title.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the object's authors.
     *
     * @return the authors
     */
    public Author[] getAuthors() {
        return this.authors;
    }

    /**
     * Sets the object's authors.
     *
     * @param authors the authors to set
     */
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    /**
     * Gets the object's isbn13.
     *
     * @return the isbn13
     */
    public String getIsbn13() {
        return this.isbn13;
    }

    /**
     * Sets the object's isbn13.
     *
     * @param isbn13 the isbn13 to set
     */
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n  ISBN: " + this.isbn13 + "\n  Authors: " + Arrays.toString(this.authors);
    }

}
