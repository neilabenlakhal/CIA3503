/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.genericlistexercise1;

/**
 *
 * @author reematassi
 */
public class Person {
    
    public String name;
    private int age;

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age= age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", Age=" + age + '}';
    }

    
}

   
