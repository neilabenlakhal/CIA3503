/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.exception_throwsvshrow;

/**
 *
 * The throw keyword 
 * 
 * The throw keyword in Java is used to explicitly throw an exception.
 * It is used within a method to indicate that something unexpected has happened, 
 * and an exceptional condition needs to be reported
 * 
 * Here's an example:


 * @author nlakhal
 */
public class ThrowExample {
    public static void main(String[] args) {
        try {
            // Call a method that may throw an exception
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws an exception
    public static void divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            // Use the throw keyword to explicitly throw an exception
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}

