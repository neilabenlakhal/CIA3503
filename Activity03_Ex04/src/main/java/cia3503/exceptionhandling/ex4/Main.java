/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia3503.exceptionhandling.ex4;

import java.util.Scanner;
 

/**
 *
 * @author Neila
 * 
 * 2.	Create a class with a main( ) that:
a.	Defines an instance of class student called myStudent with name=’Bob’ and CGPA=1.5.
b.	Throws an object of class AtRiskStudentException inside a try block if the student CGPA is less than 2.0;
c.	Catches the exception inside a catch clause and prints the “The student cannot add more than 4 courses”. 
d.	Adds a finally clause and print a message to prove you were there.

 */

/*
    public class Main2 {
    public static void main(String[] args) {
        try {
            Student myStudent = new Student("Bob", 4,30);

            if (myStudent.getCGPA() < 2.0) {
                throw new AtRiskStudentException("The student cannot add more than 4 courses");
            }
        } catch (AtRiskStudentException ex) {
            ex.printMessage();
        } 
        
        
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
*/


/* 6.	Update the main class as following:
a.	Set the age of myStudent to 26. What did you notice?  an error because method throws exception
b.	Set the age of myStudent to 30. What did you notice?


The nonAuthroizedageException was propageated to the main class, we need to catch it
in the Main class, otherwised in will not be handled.
   */ 

 // Main class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of class Student
        Student myStudent = new Student("Bob", 1.5, 0);

        try {
            // Checking CGPA and throwing AtRiskStudentException if it's less than 2.0
            if (myStudent.getAge() == 0) {
                throw new AtRiskStudentException("The student cannot add more than 4 courses");
            }
        } catch (AtRiskStudentException e) {
            e.printMessage();
        } finally {
            System.out.println("Finally block executed.");
        }

        // Setting the age of myStudent to 26
        try {
            myStudent.setAge(26);
        } catch (NonAuthorizedAgeException e) {
            e.printMessage();
        } finally {
            System.out.println("Finally block executed.");
        }

        // Setting the age of myStudent to 30
        try {
            myStudent.setAge(30);
        } catch (NonAuthorizedAgeException e) {
            e.printMessage();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}