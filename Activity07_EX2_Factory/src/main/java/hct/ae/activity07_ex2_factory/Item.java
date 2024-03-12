/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hct.ae.activity07_ex2_factory;

/**
 *
 */
public class Item {
    public String name;
    private double price;
    
    public double getPrice(){
        return this.price;
    }
    public void setPrice(){
        this.price=price;
    }
    public Item(String name,double price){
        this.name=name;
        this.price=price;
    }
     public String toString(){
         return " the item is "+this.name +", and the price is "+this.price;
     }
    
}
