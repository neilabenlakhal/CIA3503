/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagement.model;

/**
 *
 */
public class Program {

    private String code;

    /**
     * Get the value of code
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the value of code
     *
     * @param code new value of code
     */
    public void setCode(String code) {
        this.code = code;
    }

    private String title;

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    private String accreditation;

    /**
     * Get the value of accreditation
     *
     * @return the value of accreditation
     */
    public String getAccreditation() {
        return accreditation;
    }

    /**
     * Set the value of accreditation
     *
     * @param accreditation new value of accreditation
     */
    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public Program(String code, String title, String accreditation) {
        this.code = code;
        this.title = title;
        this.accreditation = accreditation;
    }

@Override
    public String toString() {
        return "Program{ code= " + code +", title"+ title+ ", accrediation=" + accreditation+ "}";
    }

    
}
