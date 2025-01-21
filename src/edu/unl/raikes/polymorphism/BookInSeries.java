/**
 * This is BookInSeries.java, packaged within
 * edu.unl.raikes.polymorphism.
 */
package edu.unl.raikes.polymorphism;

/**
 * This class provides the definitions for BookInSeries in the edu.unl.raikes.polymorphism package.
 */
public class BookInSeries extends Book {

    public String seriesTitle;
    public int indexInSeries;
    public int lengthOfSeries;

    /**
     * Creates an instance of the BookInSeries class.
     *
     * @param title
     * @param authors
     * @param isbn13
     */
    public BookInSeries(String title, Author[] authors, String isbn13, String seriesTitle, int indexInSeries,
            int lengthOfSeries) {
        // construct the Book part of me
        super(title, authors, isbn13);

        // construct the BookInSeries part of me
        this.seriesTitle = seriesTitle;
        this.indexInSeries = indexInSeries;
        this.lengthOfSeries = lengthOfSeries;

    }

    @Override
    public String getTitle() {
        return this.getSeriesInfoString() + ": " + this.title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Series: " + this.getSeriesInfoString();
    }

    private String getSeriesInfoString() {
        return this.seriesTitle + " (Book " + (this.indexInSeries + 1) + " of " + this.lengthOfSeries + ")";
    }

}
