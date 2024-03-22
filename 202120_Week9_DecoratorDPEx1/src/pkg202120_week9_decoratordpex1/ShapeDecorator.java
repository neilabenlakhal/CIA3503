/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_decoratordpex1;

/**
 *
 */
public class ShapeDecorator implements Shape{
    protected Shape wrappee;
    
    public ShapeDecorator(Shape wrappee){
        this.wrappee=wrappee;
        
    }
    
    @Override
    public void draw(){
        wrappee.draw();
    }
}
