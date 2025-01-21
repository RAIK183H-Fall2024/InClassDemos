/**
 * This is RectangleXYComaprator.java, packaged within
 * edu.unl.raikes.sorting.
 */
package edu.unl.raikes.sorting;

import java.util.Comparator;

/**
 * This class provides the definitions for RectangleXYComaprator in the edu.unl.raikes.sorting package.
 */
public class RectanglePerimeterAreaComaprator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() != r2.getPerimeter()) {
            return (int) (r1.getPerimeter() - r2.getPerimeter());
        } else {
            return (int) (r1.getArea() - r2.getArea());
        }
    }

}
