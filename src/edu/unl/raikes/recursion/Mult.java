/**
 * This is Mult.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for Mult in the edu.unl.raikes.recursion package.
 */
public class Mult {

    /**
     * This function multiplies two numbers via addition (e.g., 3*4 = 4+4+4).
     *
     * @param  a The first value to be multiplied.
     * @param  b The second value to be multiplied.
     * @return   The result of the multiplication of a and b.
     */
    public static int mult(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a < 0) {
            return -mult(-a, b);
        } else {
            return b + mult(a - 1, b);
        }
    }

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(mult(3, 4));
        System.out.println(mult(-3, 4));
        System.out.println(mult(-3, -4));
    }

}
