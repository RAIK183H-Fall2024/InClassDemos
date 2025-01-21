package edu.unl.raikes.sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is AdventOfCodeDay5.java, packaged within edu.unl.raikes.sorting.
 */
public class AdventOfCodeDay5 {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        // create a data structure to hold these requirements
        int[] workingNumbers = { 8, 17, 83, 47, 61, 2, 93, 12, 36, 24, 18, 1, 6 };
        int[] wrongNumbers = { 47, 36, 61, 1, 18, 2, 93, 6, 17, 24, 12, 8, 83 };

        ArrayList<ArrayList<Integer>> requirements = new ArrayList<ArrayList<Integer>>(101);
        initializeArrayList(requirements);

        // 47 must come before 6
        requirements.get(6).add(47);

        // 2 must come before 93
        requirements.get(93).add(2);

        // 8 must come before 47
        requirements.get(47).add(8);

        // 12 must come before 1
        requirements.get(1).add(12);

        // 47 must come before 2
        requirements.get(2).add(47);

        // 17 must come before 47
        requirements.get(47).add(17);

        // 83 must come before 93
        requirements.get(93).add(83);

        // 47 must come before 61
        requirements.get(61).add(47);

        // 51 must come before 83
        requirements.get(83).add(51);

        // 36 must come before 1
        requirements.get(1).add(36);

        // 17 must come before 1
        requirements.get(1).add(17);

        // 8 must come before 1
        requirements.get(1).add(8);

        // 83 must come before 47
        requirements.get(47).add(83);

        // 12 must come before 24
        requirements.get(24).add(12);

        // 61 must come before 24
        requirements.get(24).add(61);

        // 93 must come before 24
        requirements.get(24).add(93);

        for (int i = 1; i < requirements.size(); i++) {
        }

        // verify that, for a given string, the requirements hold
        System.out.println("The workingNumbers are valid? " + verify(workingNumbers, requirements));

        // if the requirements don't hold, sort it
        System.out.println("The wrongNumbers are valid? " + verify(wrongNumbers, requirements));
        System.out.println("Let's sort them.");
        sort(wrongNumbers, requirements);
        System.out.println("The wrongNumbers are valid now? " + verify(wrongNumbers, requirements));

    }

    public static void initializeArrayList(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < 101; i++) {
            arr.add(new ArrayList<Integer>());
        }
    }

    public static boolean verify(int[] numbers, ArrayList<ArrayList<Integer>> requirements) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            ArrayList<Integer> reqsForThisNumber = requirements.get(number);

            for (int indexInReqs = 0; indexInReqs < reqsForThisNumber.size(); indexInReqs++) {
                // get index of req
                int indexOfReqsInNumbers = indexOf(reqsForThisNumber.get(indexInReqs), numbers);

                // see if requirement is met
                if (indexOfReqsInNumbers > i) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int indexOf(int needle, int[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }

        return -1;
    }

    public static void sort(int[] numbers, ArrayList<ArrayList<Integer>> requirements) {
        // loop through each number in numbers
        for (int indexInNumbers = 0; indexInNumbers < numbers.length; indexInNumbers++) {
            // assume all values before indexInNumbers are in the correct order

            int numberThatNeedsPlacing = numbers[indexInNumbers];

            // starting at the beginning of the numbers array, find the first number that says
            // numberThatNeedsPlacing must come before it
            int indexInSortedPartOfNumbers = 0;
            int indexOfFirstRequirement = -1;
            while (indexInSortedPartOfNumbers < indexInNumbers && indexOfFirstRequirement < 0) {
                int numberInSortedPartOfNumbers = 0; // TODO: WHAT SHOULD THIS VALUE BE?
                // if the numberThatNeedsPlacing is a requirement for this numberInSortedPartOfNumbers
                int indexOfNumberThatNeedsPlacingInRequirements = 0; // TODO: WHAT SHOULD THIS NUMBER BE

                // if we've found a number that requires our numberThatNeedsPlacing to be before ours, then stop the
                // loop
                if (true) { // TODO: HOW CAN WE EXIT THE LOOP EARLY?
                    // DO SOMETHING?
                }

                // TODO: HOW SHOULD WE MODIFY THE LOOP VARIABLES?
            }

            System.out.println("numberThatNeeds placing is " + numberThatNeedsPlacing
                    + " and it should be inserted at index " + indexOfFirstRequirement);

            if (true) { // TODO: HOW DO WE KNOW IF WE NEED TO SWAP
                swapIntoPlace(numbers, indexInNumbers, indexOfFirstRequirement);
            }

            System.out.println("  the sorted part of the array now looks like: "
                    + Arrays.toString(Arrays.copyOf(numbers, indexInNumbers + 1)) + "\n");

        }
    }

    public static void swapIntoPlace(int[] array, int fromIndex, int toIndex) {
        // TODO: FILL IN THIS FUNCTION
    }

}
