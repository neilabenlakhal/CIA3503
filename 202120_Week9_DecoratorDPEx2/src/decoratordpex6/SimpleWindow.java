/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratordpex6;

/**
 *
 * 
 */
public class SimpleWindow implements Window{
    private String description;
    
    public SimpleWindow(String description){
        this.description=description;
    }
    
    @Override
    public  void draw(){
         System.out.println(this.description+ " has been drawn");
    }
    public  String getDescription(){
          return description;
    }
    
    
}
