/**
 * This is AuthorThenTitleComparator.java, packaged within
 * edu.unl.raikes.polymorphism.
 */
package edu.unl.raikes.polymorphism;

import java.util.Comparator;

/**
 * This class provides the definitions for AuthorThenTitleComparator in the edu.unl.raikes.polymorphism package.
 */
public class AuthorThenTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        // see if authors are same, if so, return comparison of titles
        int authorComp = o1.getAuthors()[0].compareTo(o2.getAuthors()[0]);
        if (authorComp == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return authorComp;
    }

}
