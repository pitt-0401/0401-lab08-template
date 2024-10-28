/*
 * Created on 2026-10-15
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class MergeSort {

    // Sorts the whole array by GPA (ascending)
    public static void sort(Student[] array) {
        recursiveSort(array, 0, array.length - 1);
    }

    // Sorts array[left..right] using merge()
    private static void recursiveSort(/* TODO type*/, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            recursiveSort(array, left, mid);
            recursiveSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merges two sub-arrays of array[]
    // Sub-array left: array[left..mid]
    // Sub-array right: array[mid+1..right]
    private static void merge(/* TODO type*/, int left, int mid, int right) {
        // TODO: Define sub-array lengths
        int leftElementLength;
        int rightElementLength;

        // Define sub-arrays
        /* TODO type*/ leftSubArray[] = new /* TODO type*/[leftElementLength];
        /* TODO type*/ rightSubArray[] = new /* TODO type*/[rightElementLength];

        // Copy data to sub-arrays
        for (int i = 0; i < leftElementLength; ++i) {
            leftSubArray[i] = array[left + i];
        }
        for (int j = 0; j < rightElementLength; ++j) {
            rightSubArray[j] = array[mid + 1 + j];
        }

        // Merge the sub-arrays
        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftElementLength && j < rightElementLength) {
            if (leftSubArray[i].getGPA() <= rightSubArray[j].getGPA()) {
                array[k] = leftSubArray[i];
                i++;
            } else {
                array[k] = rightSubArray[j];
                j++;
            }
            k++;
        }
        // Handle remaining elements that have not yet been added to the main array:
        // TODO: Copy remaining elements of leftSubArray[], if any

        // TODO: Copy remaining elements of rightSubArray[], if any

    }
}
