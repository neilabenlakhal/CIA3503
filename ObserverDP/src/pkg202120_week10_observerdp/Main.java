/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg202120_week10_observerdp;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create instance of NumberConverter
        NumberConvertor subject=new NumberConvertor();
        //register hexa, binary, octal observers to Number Convertor
        Hexa h=new Hexa(subject);
        Binary b=new Binary(subject);
        Octal oc=new Octal(subject);
        
        //convert 15 to the different bases
        System.out.println("Convert 15 to the different bases");
        subject.setValue(15);
        
        
        //convert 999 to the different bases
        System.out.println("\nConvert 999 to the different bases");
        subject.setValue(999);
    }
    
}
