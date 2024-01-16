/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia4503.interface_activity2_ex2;

/**
 *
 * @author reematassi
 */
public class Interface_Activity2_Ex2 {

    public static void main(String[] args) {

        Baseball myBall=new Baseball("McNAlly");
        System.out.println(myBall.toString());
        
        String bn=myBall.getBrandName();
        System.out.println(bn);
        
        myBall.bounce();



    }
}
