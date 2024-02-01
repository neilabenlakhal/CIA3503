/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia3503.exceptionhandling.ex4;

/**
 *
 * @author Neila
 1.Create your own exception class called AtRiskStudentException
a.Write a constructor for this class that takes a String argument and stores 
it inside the object with a String reference. 

 */
public class AtRiskStudentException extends Exception {
    private String message;

    public AtRiskStudentException(String message) {
        this.message = message;
    }

    public void printMessage() { //b.	Write a method that prints out the stored String.

        System.out.println(message);
    }
}

    

