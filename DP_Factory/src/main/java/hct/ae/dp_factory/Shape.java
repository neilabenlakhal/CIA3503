/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.dp_factory;

/**
 *
 * @author nlakhal
 * 
 * 
 * @Here are the general steps to apply the factory pattern:

Step 1- Identify the objects that need to be created and make sure they all implement a common interface or inherit from
a common abstract class.
Step 2- Define a factory interface with a method that returns an object of the common interface or abstract class.
This method will be implemented by concrete factory classes.
Step 3- Create concrete factory classes that implement the factory interface and provide an implementation for the factory method.

Note : 
In client code, use the factory method to create objects instead of creating them directly. This way, the client code will not 
depend on specific implementations of the objects.
To create a new type of object, create a new concrete class that implements the common interface or 
abstract class and create a corresponding concrete factory class that creates objects of the new type.

 */
// Define the Shape interface
interface Shape {

    void draw(); //abstract Method
}

// Define concrete implementations of the Shape interface
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// step 2- Define the ShapeFactory class, which creates Shape objects
class ShapeFactory {
    // This method takes a string parameter indicating the type of shape to create
    // It then returns a Shape object of the specified type

    public Shape createShape(String type) { //this method is to be implemented by the concrete classes if the concrete class has attributes
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("square")) {
            return new Square();
        } else if (type.equals("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
