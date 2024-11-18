/**
 * This is FindMin.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for FindMin in the edu.unl.raikes.recursion package.
 */
public class Reverse {

    public static String reverse(String toReverse) {
        return reverse(toReverse, 0);
    }

    private static String reverse(String toReverse, int index) {
        // even length string base case
        if (toReverse.length() % 2 == 0 && index == toReverse.length() / 2) {
            return "";
        }
        // odd length string base case
        else if (index == toReverse.length() / 2) {
            return toReverse.charAt(index) + "";
        }
        // recursive case
        else {
            char lastChar = toReverse.charAt(toReverse.length() - index - 1);
            char firstChar = toReverse.charAt(index);
            return lastChar + reverse(toReverse, index + 1) + firstChar;
        }
    }

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "Thanksgiving can't come soon enough!!";
        System.out.println(reverse(s));

        String r = "starburst";
        System.out.println(reverse(r));
    }

}
