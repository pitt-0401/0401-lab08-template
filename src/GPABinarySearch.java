/*
 * Created on 2026-10-15
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.Arrays;

public class GPABinarySearch {
    // Returns students with GPA >= threshold (isAbove) or GPA < threshold (!isAbove)
    // Requires the array to be sorted in ascending order by GPA
    public static Student[] search(Student[] array, double threshold, boolean isAbove) {
        int cutoffIndex = binarySearch(array, threshold);

        // TODO: Based on the cutoff index returned by binary search, decide which part of the
        // array to keep
        // Hint: You can use Arrays.copyOfRange(array, fromIndex, toIndex) or use a loop!

        // TODO: If no student matches, print an expressive message
        return null;
    }

    // Finds the cutoff index: the first index where GPA >= threshold
    private static int binarySearch(Student[] array, double threshold) {
        // Default if all GPAs < threshold
        int result = array.length; // = cutoff is beyond the last index
        // TODO: Implement

        // Hints: create a loop
        // calculate the mid element
        // GPA >= threshold: remember mid, look left
        // otherwise: look right

        return result;
    }
}
