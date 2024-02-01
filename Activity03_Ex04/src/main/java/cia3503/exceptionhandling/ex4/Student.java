/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia3503.exceptionhandling.ex4;

/**
 *
 * @author nlakhal
 */
public class Student {
    private String fullName;
    private double CGPA;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getCGPA() {
        return CGPA;
    }

    //public void setCGPA(double CGPA) {
    //    this.CGPA = CGPA;
 //   }

    public Student(String fullName, double CGPA) {
      this.fullName = fullName;
        this.CGPA = CGPA;
    }


private int age; // New attribute

    // Constructor updated to include age
    public Student(String fullName, double CGPA, int age) {
        this.fullName = fullName;
        this.CGPA = CGPA;
        this.age = age;
    }
// Getter and setter for age
    public int getAge() {
        return age;
    }

//5.	In the student class, do the following:
//a.	Throws an object of class NonAuthorizedAgeException inside a try block when we set the age of the student. Age must be greater than 20 and less than 28;
//b.	Catches the exception inside a catch clause and prints the “The student age must be between 20 and 28”. 
//c.	Adds a finally clause and print a message to prove you were there.



    public void setAge(int age) throws NonAuthorizedAgeException {
        // Check if age is between 20 and 28
        if (age > 20 && age < 28) {
            this.age = age;
        } else {
            throw new NonAuthorizedAgeException("The student age must be between 20 and 28");
        }
    }

}
