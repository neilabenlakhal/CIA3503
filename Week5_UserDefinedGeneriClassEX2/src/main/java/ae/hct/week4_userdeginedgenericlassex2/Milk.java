/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ae.hct.week4_userdeginedgenericlassex2;

/**
 *
 * @author nbenayed
 */
public class Milk extends Food{
    

    @Override
    public double getPrice() {
        return super.getPrice()+10;
    }

    

   

    public Milk(String name, double price) {
        super(name,price);
    }

    @Override
    public String toString() {
        return "Milk{" + "name=" + super.getName()+ ", price=" + this.getPrice() + '}';
    }

    
}
