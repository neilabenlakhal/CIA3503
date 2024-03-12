/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20210FactorySingletonPE2;

/**
 *
 */
public class Car implements Vehicle {
  
    private int wheels;
    private int engine;
    
   
    
    //constructor
    public Car(int wheels, int engine){
        this.wheels=wheels;
        this.engine=engine;
    }
    public Car(int wheels){
        this.wheels=wheels;
      
    }
   @Override 
    public int getWheels(){
        
        return this.wheels; 
    }
}

