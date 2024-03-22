/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hct.ae.activity07_ex2_factory;

/**
 *
 */
public class DinnerInvitation extends Invitation {
    
    
    public DinnerInvitation(String d){
        super(5);
        this.createInvitation(d);
    }
    @Override
    public void createInvitation(String d){
        super.setDate(d);
        super.addItem(new Item("Salad",30));
        super.addItem(new Item("Water",2));
    }

}
