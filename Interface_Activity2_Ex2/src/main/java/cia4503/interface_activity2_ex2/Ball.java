/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.interface_activity2_ex2;

/**
 *
 * @author reematassi
 */
public abstract class Ball implements Tossable{
    private String brandName;
    
    Ball(String brandName){
        this.brandName=brandName;
     
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

   
    public abstract void toss();
       
    
    public abstract void bounce();
       
    @Override
    public String toString() {
        return "Ball{" + "brandName=" + brandName + '}';
    }
    
    
}
