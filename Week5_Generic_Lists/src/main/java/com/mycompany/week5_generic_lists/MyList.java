/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week5_generic_lists;

/**
 *
 * @author nlakhal
 * @param <T>
 */
public class MyList<T> {

    //Object[] tList;
    T[] tList;  // An array of type T to store elements.
    int index; //An integer variable to keep track of the current position in the array.

    public MyList(int size) {
        tList = (T[]) new Object[size];
        //The constructor initializes the tList array with a specified size and sets index to 0.
        //Note: it's necessary to cast new Object[size] to (T[]) to create an array of type T.
        index = 0;
    }

    public void add(T t) {
        tList[index++] = (T) t;

        //The add method adds an element of type T to the list at the current index position and then increments index.
        //It also casts the parameter t to type T before storing it in the array.
    }

    public T get(int i) {
        return (T) tList[i];

        //The get method retrieves the element at the specified index in the list.
        //It returns the element after casting it to type T.
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    // Additional teacher-specific methods can be added here
}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    // Additional student-specific methods can be added here
}
