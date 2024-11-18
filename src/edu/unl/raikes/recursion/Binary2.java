/**
 * This is Binary.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for Binary in the edu.unl.raikes.recursion package.
 */
public class Binary2 {
    public static long binarify(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            long j = binarify(x / 2);
            return (j * 10) + (x % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarify(3));
        System.out.println(binarify(4));
        System.out.println(binarify(-4));
        System.out.println(binarify(98498));
    }
}
