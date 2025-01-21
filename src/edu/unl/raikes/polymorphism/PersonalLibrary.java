/**
 * This is PersonalLibrary.java, packaged within
 * edu.unl.raikes.polymorphism.
 */
package edu.unl.raikes.polymorphism;

import java.util.ArrayList;

/**
 * This class provides the definitions for PersonalLibrary in the edu.unl.raikes.polymorphism package.
 */
public class PersonalLibrary {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        // TODO Auto-generated method stub
        Author[] tolkien = { new Author("J.", "R. R.", "Tolkien") };
        BookInSeries fellowship = new BookInSeries("The Fellowship of the Ring", tolkien, "409iur50239i48",
                "Lord of the Rings", 0, 3);
        BookInSeries towers = new BookInSeries("The Two Towers", tolkien, "203948029823", "Lord of the Rings", 1, 3);
        Book hobbit = new Book("The Hobbit", tolkien, "23984793487");
        BookInSeries rotk = new BookInSeries("The Return of the King", tolkien, "098979874", "Lord of the Rings", 2, 3);

        Author[] alcott = { new Author("Louisa", "May", "Alcott") };
        Book littleWomen = new Book("Little Women", alcott, "203948029823");

        Author[] gAndK = { new Author("Neil", "Gaiman"), new Author("Terry", "Pratchett") };
        Book goodOmens = new Book("Good Omens", gAndK, "lkweirjelkj");

        library.add(fellowship);
        library.add(towers);
        library.add(hobbit);
        library.add(rotk);
        library.add(littleWomen);
        library.add(goodOmens);

        library.sort(new AuthorThenTitleComparator());

        for (Book b : library) {
            System.out.println(b);
        }
    }

}
