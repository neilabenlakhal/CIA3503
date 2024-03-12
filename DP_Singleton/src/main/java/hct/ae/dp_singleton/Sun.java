/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.dp_singleton;

/**
 *
 * 
 * @author nlakhal
 */
/*public class Sun {

public double weight;
public double radius;

public Sun(double weight, double radius) {
this.weight = weight;
this.radius = radius;
}
}

In this example, we add a private static instance variable to the Sun class,
which will hold the single instance of the class. We also modify the constructor to be private, 
so that it cannot be called directly from outside the class.

The getInstance() method is now static and synchronized, which means that only 
one thread can access it at a time. The method checks if the instance variable is null,
and if it is, it creates a new Sun object with the given weight and radius values, 
and assigns it to the instance variable. If the instance variable is not null, it simply returns the existing instance.


*/

public class Sun {
    private static Sun instance; // private static instance variable : step 1
    public double weight;
    public double radius;

    private Sun(double weight, double radius) { // private constructor to prevent direct instantiation : step 2
        this.weight = weight;
        this.radius = radius;
    }

    public static  Sun getInstance(double weight, double radius) { // static  method to get the single instance
        if (instance == null) { // check if the instance is null
            instance = new Sun(weight, radius); // create a new instance if it's null
        }
        return instance; // return the instance
    }

    @Override
    public String toString() {
        return "Sun{" + "weight=" + weight + ", radius=" + radius + '}';
    }
    
    
    
    
}






