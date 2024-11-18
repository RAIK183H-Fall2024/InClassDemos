/**
 * This is Binary.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for Binary in the edu.unl.raikes.recursion package.
 */
public class Binary {
    public static String binarify(int x) {
        if (x == 0) {
            return "0";
        } else if (x == 1) {
            return "1";
        } else {
            String j = binarify(x / 2);
            return j + (x % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarify(3));
        System.out.println(binarify(4));
    }
}
