/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagement.model;

/**
 *
 * @author nbenayed
 */
public class Course {

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

    private int credits;

    /**
     * Get the value of credits
     *
     * @return the value of credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Set the value of credits
     *
     * @param credits new value of credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    private Program program;

    /**
     * Get the value of progCode
     *
     * @return the value of progCode
     */
    public Program getProgram() {
        return this.program;
    }

    /**
     * Set the value of progCode
     *
     * @param progCode new value of progCode
     */
    public void setProgram(Program program) {
        this.program = program;
    }

    public Course(String code, String title, int credits, Program program) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.program = program;
    }
@Override
    public String toString() {
        return "Course{ code= " + code +", title"+ title+ ", credits=" + credits+ ", program code=" + program.getCode()+"}";
    }
    
}
