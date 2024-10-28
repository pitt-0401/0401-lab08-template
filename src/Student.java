/*
 * Created on 2026-10-15
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class Student {
    private static int idCount = 0;

    private int id;
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        idCount++;
        this.id = idCount;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("New GPA (" + gpa + ") is not valid, should be a number between 0 and 4.0!");
        }
    }

    @Override
    public String toString() {
        return "Student " + id + " - " + name + " (GPA: " + gpa + ")";
    }
}
