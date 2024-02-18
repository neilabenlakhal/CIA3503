/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia3503.exceptionhandling.ex4;

/**
 *
 * @author nlakhal
 * 
 4.	Create your own exception class called NonAuthorizedAgeException
a.	Write a constructor for this class that takes a String argument and stores it inside
* the object with a String reference. 
b.	Write a method that prints out the stored String.
* 
 * 
 */
public class NonAuthorizedAgeException extends Exception {
    private final String message;

    public NonAuthorizedAgeException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}

