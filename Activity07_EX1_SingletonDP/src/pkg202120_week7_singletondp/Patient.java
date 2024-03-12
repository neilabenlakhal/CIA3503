/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg202120_week7_singletondp;

/**
 *
 */
public class Patient extends Person {
    
    private char Gender;

    /**
     * Get the value of Gender
     *
     * @return the value of Gender
     */
    public char getGender() {
        return Gender;
    }

    /**
     * Set the value of Gender
     *
     * @param Gender new value of Gender
     */
    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public Patient(char Gender, String Name) {
        super(Name);
        this.Gender = Gender;
    }

    
    
}
