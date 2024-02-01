/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.activity04_ex02;

/**
 *
 * @author nlakhal
 */
class Name  implements Cloneable  {
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    @Override
    public Name clone() throws CloneNotSupportedException {
        return (Name) super.clone();
    }
    
}


//---------------------------------------------------------------------


class Address  implements Cloneable {
  private String street;
  private String city;

  public Address(String street, String city) {
    this.street = street;
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + '}';
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
    
  
  public void setCity(String city) {
    this.city = city;
  }
  }




