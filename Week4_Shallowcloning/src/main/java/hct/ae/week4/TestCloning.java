/*
 *  Cloning ?

What is Cloning
Cloning an object refers to creating a copy of the object. 
Given an object,  you want to create multiple objects which are ‘exact’ copies of that object, 
but do not want to go through the process of defining a new object instance.


2 types : 

Shallow cloning : creating 2 references to the same object 
deep cloning : create a totally independant clone (replicat of an object), 
it also creates copies of the nested object hirerarchy inside the object being cloned.

How to do it ?

step 1 : We must implement Cloneable interface (Marker interface) : To say that you would like to be able to clone your class
step 2 : We must override clone() method from Object class.

Default behavior of the clone() method  is shallow cloning.

What is the Cloneable interface ?

 */
package hct.ae.week4;

/**
 *
 * @author nlakhal
 */
public class TestCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
       
        int a =12; //
        
        double b = (double) a;  //casting : requesting from java to convert the Data type 12.0
        
        
        
        Department dept = new Department(2, "Human Resource");
        Employee original = new Employee(133, "Admin", dept);
      //  Employee cloned = new Employee(133, "Admin", dept);

        //Lets create a clone of original object
        Employee cloned =  original.clone(); //shallow cloning

        System.out.println(original);
        System.out.println(cloned);

        //Let verify using employee id, if cloning actually workded
        System.out.println("Cloned employee ID is :" + cloned.getEmpoyeeId());
        System.out.println("original  employee ID is :" + original.getEmpoyeeId());

        //Must be true and objects must have different memory addresses
        System.out.println("Is the clone an exact copy of the object ?  " + (original != cloned));


//Let change the department name in cloned object and we will verify in original object
System.out.println("Clone employee  dep before change  :  "+cloned.getDepartment().getName());
System.out.println("Original employee dep before change  :   "+original.getDepartment().getName());

cloned.getDepartment().setName("Finance");     

System.out.println("Original employee dep After  change done with clone:   "+original.getDepartment().getName());
System.out.println("cloned employee dep After  change done with clone:   "+cloned.getDepartment().getName());


original.getDepartment().setName("IT");     

System.out.println("Original employee dep After  change done with clone:   "+original.getDepartment().getName());
System.out.println("cloned employee dep After  change done with clone:   "+cloned.getDepartment().getName());














    }
}
