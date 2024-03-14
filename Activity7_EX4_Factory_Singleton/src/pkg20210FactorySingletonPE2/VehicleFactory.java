/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20210FactorySingletonPE2;

/**
 *
 */
public class VehicleFactory {
    private static VehicleFactory theinstance=null; 
    
    private VehicleFactory(){
        
    }
    
    public static VehicleFactory getInstance(){
        if (theinstance==null) {theinstance=new VehicleFactory();}
        return theinstance;
        
        
    }
    
    //factory method. 
    
    public Vehicle createVehicle(String type, int wheels){
        
        if (type.toUpperCase()== "CAR") return new Car(wheels);
        else if(type.toUpperCase()=="BIKE") {return new Bike(wheels);}
        else return null;
    }
    
    
}
