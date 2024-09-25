/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity04_ex01;

import hct.ae.activity04_ex01.Address;
import hct.ae.activity04_ex01.Name;

/**
 *
 * @author nlakhal
 */
class Person implements Cloneable   { //step 1

    @Override //step 2 
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
//step 1
  private Name name;
  private Address address;

 public Person() {
    }

    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(String firstName, String lastName, String street, String city) {
        this.name = new Name(firstName, lastName);
        this.address = new Address(street, city);

    }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  /*  For the shallow cloning project, the clone() method of the
  Person class will  only copy the references to the Name and Address objects rather than 
  creating new objects with their values. We can do this by directly returning this:*/

  
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }
}


/*
    @Override
	 protected  Person clone() throws CloneNotSupportedException  {  
		return (Person) super.clone();  //all classes are child of the Object class in java
	}
*/