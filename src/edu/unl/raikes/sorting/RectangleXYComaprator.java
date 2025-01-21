/**
 * This is RectangleXYComaprator.java, packaged within
 * edu.unl.raikes.sorting.
 */
package edu.unl.raikes.sorting;

import java.util.Comparator;

/**
 * This class provides the definitions for RectangleXYComaprator in the edu.unl.raikes.sorting package.
 */
public class RectangleXYComaprator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getX() != r2.getX()) {
            return (int) (r1.getX() - r2.getX());
        } else {
            return (int) (r1.getY() - r2.getY());
        }
    }

}
