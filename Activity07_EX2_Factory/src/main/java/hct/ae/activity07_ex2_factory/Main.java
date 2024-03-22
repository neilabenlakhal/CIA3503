/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hct.ae.activity07_ex2_factory;

/**
 *
 */
public class Main {
    

    /**
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define an instance of factory class
        
        InvitationFactory myInvit=new InvitationFactory();
        
        //create an lunch invitation using Factory method
        
        Invitation myLunch=myInvit.createInvitation("lunch");
        
        //create a dinner invitation using Factory method
       Invitation myDinner=myInvit.createInvitation("dinner");
        
        //display all items of the lunch invitation
        System.out.println("My lunch is ");
        for(int i=0; i<myLunch.count();i++)
            System.out.println(myLunch.getItem(i).toString());
        
         //display all items of the lunch invitation
        System.out.println("My Dinner is ");
        for(int i=0; i<myDinner.count();i++)
            System.out.println(myDinner.getItem(i).toString());
        
    }
    
}
