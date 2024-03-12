/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20210FactorySingletonPE2;

/**
 *
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
        VehicleFactory vehicle=VehicleFactory.getInstance(); 
       
        
  
        
        Car myCar= (Car)vehicle.createVehicle("CAR",5);
        
        System.out.println("The number of wheels in the car is "+myCar.getWheels());
        
        Bike myBike= (Bike)vehicle.createVehicle("BIKE",2);
        
        System.out.println("The number of wheels in the bike is "+myBike.getWheels());
       
         
   
       
    }
    
}
