/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hct.ae.exception_finally;

/**
 *
 * 1. Understanding Exceptions In Java, exceptions are unexpected or exceptional
 * events that disrupt the normal flow of program execution. These exceptions
 * can be caused by various factors like invalid input, file not found, division
 * by zero, etc.
 *
 * 2. try-catch Blocks To handle exceptions, Java provides the try-catch
 * mechanism. In this structure:
 *
 * You place the potentially problematic code within a try block. One or more
 * catch blocks follow the try block, each capable of catching specific
 * exceptions. If an exception occurs in the try block, the corresponding catch
 * block is executed. If no exception occurs, the catch blocks are skipped.
 *
 * try { 
 * // Code that might throw an exception
 * } 
 * catch (ExceptionType1 e1) {
 * //
 * Handle ExceptionType1 }
 * catch (ExceptionType2 e2) 
 * { // Handle ExceptionType2
 * }
 * finally { // Code that runs regardless of whether an exception occurred or
 * not }
 *
 *
 * Here's how the control flow works:
 *
 * If an exception of ExceptionType1 occurs, the first catch block is executed,
 * followed by the finally block. If an exception of ExceptionType2 occurs, the
 * second catch block is executed, followed by the finally block. If no
 * exception occurs, the try block runs, and then the finally block is executed.
 *
 *
 * @author nlakhal
 */
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("example.txt");
            // Code to read from the file
        } catch (IOException e) {
            System.out.println("An IO exception occurred: " + e.getMessage());
        } finally {

            /* In this example, we attempt to open a file ("example.txt") for reading.
                 If an IOException occurs during the file operation, we catch it and print an error message. 
                Regardless of whether an exception occurred or not, we use the finally block to close 
               the file to ensure proper resource cleanup.
             */
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
