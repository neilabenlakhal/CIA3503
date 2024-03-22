/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_decoratordpex1;

/**
 *
 */
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator (Shape wrappee){
        super(wrappee);  
    }
    
    @Override
    public void draw(){
        wrappee.draw();
        setRedBorder(wrappee);
    }
    
    private void setRedBorder(Shape wrappee){
        System.out.println("Border Color: Red");
    }
}
