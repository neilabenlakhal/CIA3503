/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

The Factory Pattern is a design pattern that provides a way to create objects without
specifying the exact class of object that will be created. 
Instead of creating objects directly using the "new" keyword, the pattern uses a factory method to create objects. 
The factory method can create different types of objects based on the parameters passed to it.

For example, let's say you have a program that needs to create different types of shapes, such as circles, squares, and triangles
. Rather than creating each shape directly, you can use the Factory Pattern to create shapes through a ShapeFactory class.
The ShapeFactory class has a method called createShape, which takes a parameter specifying the type of shape to create. 
The createShape method then creates the appropriate shape object based on the type parameter.

Why we use Factory pattern ?
-----------------------------------------------
This pattern is useful because it allows you to create objects without knowing their exact class. 
This makes your code more flexible and easier to maintain, as you can easily add new types of objects without 
having to modify existing code.

The factory pattern is a creational pattern that provides an interface for creating objects, 
but allows the subclasses to alter the type of objects that will be created. It is useful when you 
have a system that needs to create multiple similar objects with different properties,
but you don't want the client code to be tightly coupled to the concrete classes that implement those objects.



Using a factory pattern can help you:

--Encapsulate object creation logic in one place, making it easier to change or update the logic later on.
--Simplify client code by providing a single interface to create objects, rather than having client code instantiate objects directly.
--Make your code more flexible and extensible by allowing you to create new types of objects without modifying existing code.
--Improve testability by allowing you to easily substitute mock objects for testing purposes.



Here are the general steps to apply the factory pattern:

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

package hct.ae.dp_factory;

/**
 *
 * @author nlakhal
 */
// Example usage of the ShapeFactory to create shapes
public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.createShape("circle");
    circle.draw();

    Shape square = shapeFactory.createShape("square");
    square.draw();

    Shape triangle = shapeFactory.createShape("triangle");
    triangle.draw();
  }
}
