/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia4503.exceptionhandling.ex4;

import java.util.Scanner;
 

/**
 *
 * @author 
 */

public class ExceptionHandlingEx4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        //calling the function 
        System.out.println("The age of the person: ");
        int age=in.nextInt();
        
        validate(age);
        System.out.println("rest of the code..."); 
    }
      
    
    public static void validate(int age) { 
        try{ 
            if(age < 18){ 
                //throw arithmetic exception if not eligible to vote 
                throw new NotAllowedAge("Person is not eligible to vote" );
                }
            else 
            
                System.out.println("Person is eligible to vote!!"); 
            
        }
            catch (NotAllowedAge e) {
                    System.out.println(e.toString());
            
    
    }
    }}

