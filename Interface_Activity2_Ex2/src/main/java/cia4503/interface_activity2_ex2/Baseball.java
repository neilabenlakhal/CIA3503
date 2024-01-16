/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.interface_activity2_ex2;

/**
 *
 * @author reematassi
 */
public class Baseball extends Ball{

    public Baseball(String brandName) {
        super(brandName);
    }
    

   @Override
    public void toss(){
        System.out.println("The baseball is tossing");
    }
    
    public void bounce(){
        System.out.println("The baseball is bouncing");
    
    }

    @Override
    public String toString() {
        return "Baseball{" + "brandName=" + getBrandName() + '}';
    }
    
      
}
