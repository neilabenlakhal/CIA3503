/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.activity05_ex02;

import java.util.ArrayList;

/**
 *
 * @author nlakhal
 */
public class Driver {
  public static void main(String[] args) {
    Course c1 = new Course("CIA4503", "Advanced Object-Oriented programming", 3);
    Course c2 = new Course("CIS2403", "Object-Oriented programming", 3);
    Course c3 = new Course("CIS2413", "Algorithms and Data Structures", 3);
    Course c4 = new Course("CIA3113", "IoT and Security", 3);

    ArrayList<Course> courses = new ArrayList();
    
     Program p1 = new Program("ITA", "CAA",courses);
    p1.addCourse(c1);
    p1.addCourse(c2);
    p1.addCourse(c3);
    p1.addCourse(c4);

    System.out.println(p1);

    p1.deleteCourse("CIA3113");

    System.out.println(p1);
  }
}
