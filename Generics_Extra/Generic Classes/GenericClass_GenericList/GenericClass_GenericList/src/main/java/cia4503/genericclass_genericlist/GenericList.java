/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cia4503.genericclass_genericlist;

/**
 *
 * @author reematassi
 */
public class GenericList<T> {
    private Object[] elements;
    private int index;
    
    public GenericList(int capacity) {
        elements = new Object[capacity];
        index = 0;
    }
    
    public void add(T item) {
        if (index < elements.length) {
            elements[index] = item;
            index++;
        } 
        else {
           // Handle list resizing or throw an exception
           System.out.println("List is full. Cannot add more elements.");
        }
    }
    
    public T get(int loc) {
        if (loc >= 0 && loc < index) {
            T item = (T) elements[loc];
            return item;
        } else {
            // Handle index out of bounds or throw an exception
            System.out.println("Index out of bounds.");
            return null;
        }
    }
    
    public int size() {
        return index;
    }
    
    
}
