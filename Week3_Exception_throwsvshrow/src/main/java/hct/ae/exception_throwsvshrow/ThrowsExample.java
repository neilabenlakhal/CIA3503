/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.exception_throwsvshrow;

/**
 
 * 
 *On the other hand, the throws keyword is used in a method declaration to 
 * indicate that the method might throw certain exceptions.
 * It is part of the method signature and informs the caller of the method about the potential exceptions that need to be handled.
 * 
 * It leaves the responsibility of handling the exception to the caller or propagating it further up the call stack.

 * Here's an example:

 
 * @author nlakhal
 */
public class ThrowsExample {
   
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } 
catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
       }
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}


/*
In summary, 
throw is used to throw an exception explicitly within a method, 
 throws is used in the method declaration to inform the caller that the method may throw certain exceptions.
*/






