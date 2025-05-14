package com.tnsif.copyconstructor;

import java.util.Scanner;

public class Student {
	String name;
    int id;

    // Constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter student ID: ");
        int studentId = sc.nextInt();

        // Instant object creation and method call
        new Student(studentName, studentId).display();

        sc.close();
    }
}




