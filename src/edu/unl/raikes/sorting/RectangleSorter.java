/**
 * This is RectangleSorter.java, packaged within
 * edu.unl.raikes.sorting.
 */
package edu.unl.raikes.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * This class provides the definitions for RectangleSorter in the edu.unl.raikes.sorting package.
 */
public class RectangleSorter {
    public static void main(String[] args) {
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[15];

        // Generate 15 random rectangles
        for (int i = 0; i < rectangles.length; i++) {
            double randomWidth = random.nextInt(0, 10); // Width between 1 and 10
            double randomHeight = random.nextInt(0, 10); // Height between 1 and 10
            double randomX = random.nextInt(0, 10); // Height between 1 and 10
            double randomY = random.nextInt(0, 10); // Height between 1 and 10
            rectangles[i] = new Rectangle(randomWidth, randomHeight, randomX, randomY);
        }
//
//        // sort by x; break ties with y
//        Arrays.sort(rectangles, new RectangleXYComaprator());

        // sort by perim; break ties with area
        Arrays.sort(rectangles, new RectanglePerimeterAreaComaprator());

        // Print details of each rectangle
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
