/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg202120_week7_singletondp;

/**
 *
 */
public class Doctor extends Person {
    
    private String speciality;

    /**
     * Get the value of speciality
     *
     * @return the value of speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * Set the value of speciality
     *
     * @param speciality new value of speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String speciality, String Name) {
        super(Name);
        this.speciality = speciality;
    }

    
}
