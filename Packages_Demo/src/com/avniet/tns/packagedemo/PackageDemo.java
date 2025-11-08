package com.avniet.tns.packagedemo;

// A simple class to demonstrate package usage
public class PackageDemo {
    // Public access modifier
    public String studentName;

    // Private access modifier
    private int studentId;

    // Protected access modifier
    protected String studentCourse;

    // Default access modifier (no modifier)
    String studentEmail;

    // Constructor
    public PackageDemo(String name, int id, String course, String email) {
        this.studentName = name;
        this.studentId = id;
        this.studentCourse = course;
        this.studentEmail = email;
    }

    // Public method to access private variable
    public int getStudentId() {
        return studentId;
    }
}