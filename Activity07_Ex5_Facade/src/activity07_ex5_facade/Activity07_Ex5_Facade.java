/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity07_ex5_facade;

/**
 
 * The Facade pattern is about providing a simpler interface to a complex system (structural pattern), 
 * while the Factory pattern is about creating objects without having to specify the exact class of the object
 * (creational pattern).
 * 
 * @author nlakhal
 */
public class Activity07_Ex5_Facade {

    /**
     * @param args the command line arguments
     */
  
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
}
    

