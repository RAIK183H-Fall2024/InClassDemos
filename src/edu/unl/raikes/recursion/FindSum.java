/**
 * This is FindMin.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for FindMin in the edu.unl.raikes.recursion package.
 */
public class FindSum {

    public static int findSum(int[] array) {
        return findSum(array, 0);
    }

    private static int findSum(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            return array[index] + findSum(array, index + 1);
        }
    }

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 18, 42, 3, 17, 197, -4 };
        System.out.println(findSum(array));

    }

}
