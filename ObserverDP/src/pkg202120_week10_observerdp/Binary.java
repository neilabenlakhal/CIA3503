/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg202120_week10_observerdp;

/**
 *
 */
public class Binary implements Observer{
    
    private NumberConvertor subject;
    
    public Binary(NumberConvertor subject){
        this.subject=subject;
        //register the observer
        this.subject.addObserver(this);
    }
    
    @Override
    public void update(){
        System.out.println("Binary string is: "+Integer.toBinaryString(subject.getValue()));
    }
    
    
}
