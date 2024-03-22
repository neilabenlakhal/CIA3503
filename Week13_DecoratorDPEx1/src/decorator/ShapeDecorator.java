/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 */
public class ShapeDecorator implements Shape{ // step 1 : create wrapper class 
    protected Shape wrappee;  // step 2 : add instance variable as wrappee
    
    public ShapeDecorator(Shape wrappee){ //constructor
        this.wrappee=wrappee;
        
    }
    
    @Override
    public void draw(){
        wrappee.draw(); // ovverride the method 
    }
}
