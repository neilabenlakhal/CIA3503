/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg202120_week10_observerdp;

/**
 *
 * @author nbenayed
 */
import java.util.ArrayList;
//Observerable class
public class NumberConvertor {
    //define the instance variables
    private ArrayList<Observer> observers;
    private int value;
    
    //default constructor
    public NumberConvertor(){
        observers=new ArrayList<Observer>();
    }
    
    //define addObserver()
    public void addObserver(Observer o){
        this.observers.add(o);
    }
    
    //define deleteObserver()
    public void deleteObserver(Observer o){
        //check whether the observer o exists in the observers array
        int i=observers.indexOf(o);
        //if observer o exists, then delete it
        if (i>=0) this.observers.remove(i);
    }
    public void notifyObservers(){
        // inform all observers to update their behaviour
        for(int i=0; i<observers.size();i++){
            Observer obs=observers.get(i);
            obs.update();
        }
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        //this is specific to oberver DP
        notifyObservers();
    }
    
    
}
