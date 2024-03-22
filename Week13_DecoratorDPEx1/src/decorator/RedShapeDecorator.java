/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 */
public class RedShapeDecorator extends ShapeDecorator{ // extra behavior added as child class
    
    public RedShapeDecorator (Shape wrappee){
        super(wrappee);  
    }
    
    @Override
    public void draw(){ //draw with extra behavior
        wrappee.draw();
        setRedBorder(wrappee);
    }
    
    private void setRedBorder(Shape wrappee){
        System.out.println("Border Color: Red");
    }
}
