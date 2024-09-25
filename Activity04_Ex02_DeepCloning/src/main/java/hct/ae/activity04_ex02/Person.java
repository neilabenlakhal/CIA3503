/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity04_ex02;

/**
 *
 * @author nlakhal
 */
class Person implements Cloneable { //step 1

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

    /*  For the deep  cloning project, the clone() method  and   
  create  new objects with their values. We can do this by directly returning this:*/
    //Step 2 : override the clone() method from the Object class : deep cloning
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();

        clonedPerson.name = name.clone();  // Name class must implement the cloneable class 
        clonedPerson.address = address.clone(); // same applies here

        return clonedPerson;
    }

}
