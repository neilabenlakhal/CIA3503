/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratordpex6;

/**
 *
 */
public class VerticalScrollBarWindow extends WindowDecorator {
    
    public VerticalScrollBarWindow(Window wrappee){
        super(wrappee);
    } 
    
    @Override
    public void draw(){
        super.wrappee.draw();
        drawVerticalScrolBar();
    }
    
    public String getDescription(){
        return super.getDescription();//
        //use the method getdescription() that is defined
        //in window decorator
        /*public String getDescription(){
        return wrappee.getDescription();}*/
        
    }
    
    private void drawVerticalScrolBar(){
        System.out.println("Window with vertical bar\n");
    }
}
