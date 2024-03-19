/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg202120_week8_facadedp;

/**
 *
 * @author nbenayed
 */
//facade class
public class ShapeMaker {
   //add private attributes
    private Circle circle;
    private Shape rectangle;
    private Shape square;
    
    
    //add the constructor
    
    ShapeMaker(){
        this.circle=new Circle();
        this.rectangle=new Rectangle();
        this.square=new Square();
    
    }
    
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    
    
    
}
