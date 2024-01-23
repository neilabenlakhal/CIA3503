

package com.mycompany.week3;

/**
 *
 * @author nlakhal
 */
public class WithException {

    public static void main(String[] args)  {
        
        try {
            int b = 20, c = 0;     
        System.out.println("Before the attempt to divide by zero.");
        System.out.println("Division: " + b/c);  //this instruction will not be executed when exception is raised
             //all instructions after the line where the exception was raised will not be executed
       System.out.println("This text will not be printed.");            

       }
        catch (ArithmeticException e) {
            System.out.println("division by 0 not allowed");  
            System.out.println (e.getMessage()); //Display the exception message
        }
    }
}


