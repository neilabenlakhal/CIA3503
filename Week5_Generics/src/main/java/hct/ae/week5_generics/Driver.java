/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hct.ae.week5_generics;

import java.util.ArrayList;

/**
 *
 * @author nlakhal
 */
public class Driver {

    public static void main(String[] args) {
       // without generics 
        IntegerPrinter int1 = new IntegerPrinter(20);
        int1.print();
        StringPrinter string1 = new StringPrinter("twenty");
        string1.print();

        // we can define generic types     
        // Tell Java I want a print for Double
        //No need to have different classe, one for each type.
        Printer<Integer> int2 = new Printer(20);
        Printer<String> string2 = new Printer("twenty");
        Printer<Double> d = new Printer(2.3);
        d.print();
        int2.print();
        string2.print();
        
          
    }
}
