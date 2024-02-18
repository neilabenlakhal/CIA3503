/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.genericlistexercise1;

/**
 *
 * @author reematassi
 */
public class Student extends Person{
    
    private String SID;

    public String getSID() {
        return SID;
    }
    
    public void setSID(String SID){
        this.SID=SID;
    }

    public Student(String name, int age, String SID) {
        super(name,age);
        this.SID = SID;
    }
    
    /*
    @Override
    public String toString() {
        return( "Student{" + "name=" + name + ", Age=" + age + ", SID=" + SID +"}");
    }

    */
}
    

