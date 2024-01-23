/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.exceptionhandling.ex4;

/**
 *
 * @author reematassi
 */
public class NotAllowedAge extends Exception {
    private String msg;

    public NotAllowedAge(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "NotAllowedAge{" + "msg=" + msg + '}';
    }
    
    
}
