/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_decoratordpex1;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define an instance of class circle
        //call the method draw
        
        Circle circle=new Circle();
        circle.draw();
        
        //set the border of that circle to red
        
        RedShapeDecorator redsd=new RedShapeDecorator(circle);
        redsd.draw();
    }
    
}
