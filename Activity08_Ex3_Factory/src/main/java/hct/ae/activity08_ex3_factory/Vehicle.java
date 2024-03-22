/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity08_ex3_factory;

/**
 *
 * @author nlakhal
 */
// Define the Vehicle interface
public interface Vehicle {

    int getWheels();
}

// Define the Car class that implements the Vehicle interface
class Car implements Vehicle {

    private int engine;
    private int wheels;

    public Car(int wheels, int engine) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car(int wheels) {
        this.wheels = wheels;

    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

}

// Define the Bike class that implements the Vehicle interface
class Bike implements Vehicle {

    private int wheels;

    public Bike(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

}

// Define the VehicleFactory class that creates Vehicle objects
 class VehicleFactory {
    public Vehicle createVehicle(String type, int wheels) {
        if (type.equalsIgnoreCase("car")) {
            return new Car(wheels);
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike(wheels);
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

