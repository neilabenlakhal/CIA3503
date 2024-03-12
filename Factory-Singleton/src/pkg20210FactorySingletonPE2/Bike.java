/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20210FactorySingletonPE2;

/**
 *
 */
public class Bike implements Vehicle {
  
    private int wheels;
  
    
   
    
    //constructor
    public Bike(int wheels){
        this.wheels=wheels;
     
    }
   @Override 
    public int getWheels(){
        
        return this.wheels; 
    }
    
}
