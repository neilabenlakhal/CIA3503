/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.dp_singleton;

/**
 *
 * 
 * In this example, we create a Sun instance using the getInstance() method with 
 * the given weight and radius values, and print the weight and radius values to the console using the attributes.
 * 

By using the Singleton pattern for the Sun class, we can ensure that only one instance of t
* he class is created throughout the lifetime of the application, and that this instance can be 
* accessed globally to retrieve the weight and radius values of the Sun. 
* However, we do not need to use the Singleton pattern
* for the Planet class, as we may need to create multiple instances of it in our application.
 * @author nlakhal
 */
public class DP_Singleton {

    public static void main(String[] args) {
        
        
 Sun sun = Sun.getInstance(1.989E30, 696340);
   
System.out.println("The weight of the Sun is " + sun.weight + " kg");

System.out.println("The radius of the Sun is " + sun.radius + " km");

 Sun sun2 = Sun.getInstance(2, 3);
 
 System.out.println(sun);
 System.out.println(sun2);
 
 
    }
}
