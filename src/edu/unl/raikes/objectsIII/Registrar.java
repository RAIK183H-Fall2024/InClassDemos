/**
 * This is Registrar.java, packaged within
 * edu.unl.raikes.objectsIII.
 */
package edu.unl.raikes.objectsIII;

import java.util.Arrays;

/**
 * This class provides the definitions for Registrar in the edu.unl.raikes.objectsIII package.
 */
public class Registrar {

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        Course course1 = new Course("Val", "RAIK 183H", "Something Ridiculous", 4, 42, "KAUF 112");
        Course course2 = new Course("Steve", "RAIK 186H", "Something Ridiculous About Leadership", 1, 38, "KAUF 112");
        Course course3 = new Course("Bob", "RAIK 163H", "Marketing", 3, 38, "Great Hall");

        Course[] courses = { course1, course2, course3 };

        Arrays.sort(courses);

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }

    }

}
