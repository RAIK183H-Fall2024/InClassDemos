/**
 * This is FindMin.java, packaged within
 * edu.unl.raikes.recursion.
 */
package edu.unl.raikes.recursion;

/**
 * This class provides the definitions for FindMin in the edu.unl.raikes.recursion package.
 */
public class FindMin {

    public static int findMin(int[] array) {
        return findMin(array, 0);
    }

    private static int findMin(int[] array, int index) {
        // base case
        if (index == array.length - 1) {
            return array[index];
        }
        // recursive case
        else {
            int prevMin = findMin(array, index + 1);
            return Math.min(array[index], prevMin);
        }
    }

    /**
     * This function ... TODO
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = { 18, 42, 3, 17, 197, -4 };
        System.out.println(findMin(array));
    }

}
