/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia3503.exceptionhandling.ex4;

import java.util.Scanner;
 

/**
 *
 * @author Neila
 * 
 

/* 6.	Update the main class as following:
a.	Set the age of myStudent to 26. What did you notice?  an error because method throws exception
b.	Set the age of myStudent to 30. What did you notice?


The nonAuthroizedageException was propagated to the main class, we need to catch it
in the Main class, otherwise in will not be handled.
   */ 

 // Main class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of class Student
        Student myStudent = new Student("Bob", 1.5, 10);

      // myStudent.setAge(26);
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