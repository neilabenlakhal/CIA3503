/*

 */
package hct.ae.week4;

/**
 *
 * @author nlakhal
 */

       //step 1 : cloning  : implement the cloneable interface

public class Employee implements Cloneable {

    //Department d = new Department (122,"CIS");
    // Employee e = new Employee(12, "Ali", d);
	private int empoyeeId;
	private String employeeName;
	private Department department;

        
	public Employee(int id, String name, Department dept) 
	{
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}
	

        //Step 2 : override the clone() method from the Object class
        
        @Override
	 protected  Employee clone() throws CloneNotSupportedException  {  
		return (Employee) super.clone();  //all classes are child of the Object class in java
	}

         
         //Getters and Setters
        
    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}