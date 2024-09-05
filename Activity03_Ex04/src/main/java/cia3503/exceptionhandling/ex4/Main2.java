/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia3503.exceptionhandling.ex4;

/**
 *
 * @author nlakhal
 */
public class Main2 {

    /* 2.	Create a class with a main( ) that:
a.	Defines an instance of class student called myStudent with name=’Bob’ and CGPA=1.5.
b.	Throws an object of class AtRiskStudentException inside a try block if the student CGPA is less than 2.0;
c.	Catches the exception inside a catch clause and prints the “The student cannot add more than 4 courses”. 
d.	Adds a finally clause and print a message to prove you were there.

     */
    public static void main(String[] args) {

        Student myStudent = new Student("BoB", 1.5);
        try {
            if (myStudent.getCGPA()<2.0 ) {
                throw new AtRiskStudentException("The student cannot add more than 4 courses");
            }
        } catch (AtRiskStudentException ex) {
            ex.printMessage();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
