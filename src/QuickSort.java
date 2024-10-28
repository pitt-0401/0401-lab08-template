/*
 * Created on 2026-10-15
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class QuickSort {

    // Sorts the whole array by GPA (descending)
    public static void sort(Student[] array) {
        recursiveSort(array, 0, array.length - 1);
    }

    private static void recursiveSort(/* TODO: Type */, int left, int right) {
        if (left < right) {
            // Partitioning index of current pivot element
            int partitioningIndex = partition(array, left, right);

            // Preview: A method calling itself is called "recursion".
            // TODO: define the correct arguments to sort the sub-arrays
            recursiveSort(array, ...);
            recursiveSort(array, ...);
        }
    }

    private static int partition(/* TODO: Type */, int left, int right) {
        // TODO: Select the pivot element
        /* TODO: Type */ pivot = null;

        int i = left - 1;
        // Reorder the array (descending: larger GPAs move to the left)
        for (int j = left; j < right; j++) {
            if (array[j].getGPA() >= pivot.getGPA()) {
                i++;
                // TODO: reorder the elements
            }
        }
        // TODO: Place pivot element at the correct position in the array
        // All elements to the left of the pivot are greater than or equal to the pivot
        // All elements to the right of the pivot are smaller than the pivot

        // Returns the index of the pivot element after it has been
        // placed in its sorted position within the array or sub-array being partitioned
        return i + 1;
    }
}
