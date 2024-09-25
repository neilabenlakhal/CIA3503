
package hct.ae.activity05_Ex01;

/**
 * 
 * calculateAnnualSalary() method :
 * returns the annual salary of an employee (annualSalary=12*salary). 
 * 
 * toString() 
 * method returns a string representation of Employee object along with the annual salary.
 *
 * @author nlakhal
 */
import java.util.Date;

public class Employee extends Person {
   private String EID;
   private double salary;

   public Employee(String name, Date birthdate, String EID, double salary) {
      super(name, birthdate);
      this.EID = EID;
      this.salary = salary;
   }

   public String getEID() {
      return EID;
   }

   public void setEID(String EID) {
      this.EID = EID;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public double calculateAnnualSalary() {
     
       return 12 * salary;
   }

   
   
   @Override
   public String toString() {
      
      return "Employee{" +
              super.toString()+
              ", EID='" + EID + '\'' +
              ", salary=" + salary +
              ", annualSalary=" + calculateAnnualSalary() +
              '}';
   }
}

