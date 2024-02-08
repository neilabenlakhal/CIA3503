/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5_generic_lists;

import java.util.ArrayList;

/**
 *
 * @author nlakhal
 */

    public class Main {
    public static void main(String[] args) {
        // Create a list of teachers
        MyList<Teacher> teacherList = new MyList(5);
        teacherList.add(new Teacher("Dr. Ahmed"));
        teacherList.add(new Teacher("Ms. Sarra"));

        // Create a list of students
        MyList<Student> studentList = new MyList(5);
        studentList.add(new Student("Dina"));
        studentList.add(new Student("Nour"));

        // Retrieve and print elements from the teacher list
        for (int i = 0; i < teacherList.index; i++) {
            Teacher teacher = teacherList.get(i);
            System.out.println("Teacher: " + teacher.getName());
        }

        // Retrieve and print elements from the student list
        for (int i = 0; i < studentList.index; i++) {
            Student student = studentList.get(i);
            System.out.println("Student: " + student.getName());
        }
        
        //using ArrayList
        
        
        // Using ArrayList for teachers
        ArrayList<Teacher> teacherList1 = new ArrayList<>();
        teacherList1.add(new Teacher("Mr. Smith"));
        teacherList1.add(new Teacher("Ms. Johnson"));

        // Using ArrayList for students
        ArrayList<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Alice"));
        studentList1.add(new Student("Bob"));

        // Retrieve and print elements from the teacher list
        for (Teacher teacher : teacherList1) {
            System.out.println("Teacher: " + teacher.getName());
        }

        // Retrieve and print elements from the student list
        for (Student student : studentList1) {
            System.out.println("Student: " + student.getName());
        }
        
        /*
        Declaration and Initialization:

        In the generic class, you need to instantiate MyList<T> with a specified size during initialization.
         In contrast, ArrayList dynamically adjusts its size, and you don't need to specify the initial capacity explicitly.
        
        generics can be more convenient when you need to add other methods beyond simple 
        add and remove operations.
        */
    }
}

