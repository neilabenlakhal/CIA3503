/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.activity08_ex3_factory;

/**
 *
 * @author nlakhal
 */
public class Driver {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle myCar = factory.createVehicle("CAR", 4);
        System.out.println("My car has " + myCar.getWheels() + " wheels");

        Vehicle myBike = factory.createVehicle("bike", 2);
        System.out.println("My bike has " + myBike.getWheels() + " wheels");
    }
}
