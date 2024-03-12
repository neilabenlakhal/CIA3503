/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hct.ae.activity07_ex2_factory;

/**
 *
 */
public class InvitationFactory {

    public Invitation createInvitation(String type) {
        if (type.toLowerCase() == "lunch") {
            return new LunchInvitation("10/20/2022");
        } else if (type.toLowerCase() == "dinner") {
            return new DinnerInvitation("10/21/2022");
        } else {
            return null;
        }
    }

}
