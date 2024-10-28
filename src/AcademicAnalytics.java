/*
 * Created on 2026-10-15
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.Random;

public class AcademicAnalytics {
    private Student[] students;

    public AcademicAnalytics(Student[] students) {
        this.students = students;
    }

    public static void main(String[] args) {
        Student[] studentGPAData = generateStudentArray(10);
        AcademicAnalytics sortingDemo = new AcademicAnalytics(studentGPAData);
        sortingDemo.sortByGPA();

        // TODO: Search for all students with a GPA >= or < a given GPA (use GPABinarySearch)
        // Hint: Define at least one additional method for AcademicAnalytics that invokes this functionality
        // Make sure that the array is sorted (ascending) first!
        // searchByGPA()
    }

    public void sortByGPA() {
        System.out.println("Original List:");
        printStudents(this.students);

        // QuickSort
        Student[] quickSortStudents = this.students.clone(); // clone(): Clones and returns a copy of the object
        QuickSort.sort(quickSortStudents);
        System.out.println("\nSorted by QuickSort (descending):");
        printStudents(quickSortStudents);

        // MergeSort
        Student[] mergeSortStudents = this.students.clone();
        MergeSort.sort(mergeSortStudents);
        System.out.println("\nSorted by MergeSort (ascending):");
        printStudents(mergeSortStudents);
    }

    private static Student[] generateStudentArray(int size) {
        Student[] students = new Student[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            // Generate a random GPA between 1.5 and 4.0, rounded to 2 decimals
            double gpa = Math.round(rand.nextDouble(1.5, 4.0) * 100) / 100.0;
            students[i] = new Student(RandomNameGenerator.generateRandomName(), gpa);
        }
        return students;
    }

    private void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class RandomNameGenerator {
    private static final String[] FIRST_NAMES = { "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George",
            "Hannah" };
    private static final String[] LAST_NAMES = { "Smith", "Johnson", "Brown", "Williams", "Jones", "Garcia", "Davis",
            "Martinez" };

    public static String generateRandomName() {
        Random random = new Random();
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }
}
