/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.activity04_ex02;

/**
 *
 * @author nlakhal
 */

public class PersonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Name name = new Name("Ali", "Mohammed");
        Address address = new Address("Rabdan Street", "Abu Dhabi");
        Person p1 = new Person(name, address);

        Person p2 = (Person) p1.clone();
        
      

        System.out.println("Original object values:");
        System.out.println("Name: " + p1.getName().getFirstName() + " " + p1.getName().getLastName());
        System.out.println("Address: " + p1.getAddress().getStreet() + ", " + p1.getAddress().getCity());

        System.out.println("\nCloned object values:");
        System.out.println("Name: " + p2.getName().getFirstName() + " " + p2.getName().getLastName());
        System.out.println("Address: " + p2.getAddress().getStreet() + ", " + p2.getAddress().getCity());

           System.out.println("\nModifying original object p1: ");
          
  
        name.setFirstName("Fuad");
        address.setStreet("Khallij Alarabi");
        
        p1.setName(name);
        p1.setAddress(address);
        
        System.out.println("\nOriginal object after modif. : ");
        System.out.println("Name: " + p1.getName().getFirstName() + " " + p1.getName().getLastName());
        System.out.println("Address: " + p1.getAddress().getStreet() + ", " + p1.getAddress().getCity());
         
         
        System.out.println("\nClone object after original was modified:  ");
        
         System.out.println("\nCloned object values:");
        System.out.println("Name: " + p2.getName().getFirstName() + " " + p2.getName().getLastName());
        System.out.println("Address: " + p2.getAddress().getStreet() + ", " + p2.getAddress().getCity());

       //we have 2 differents objects with deep cloning


    }
}
