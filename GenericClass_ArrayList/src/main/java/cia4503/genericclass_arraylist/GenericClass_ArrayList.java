/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia4503.genericclass_arraylist;

/**
 *
 * @author reematassi
 */
//In this exercise, we'll create a generic class called Container that can hold a list 
//of any type of items. We'll implement methods to add items to the container, remove items, and print the contents of the container.
import java.util.ArrayList;
import java.util.List;
public class GenericClass_ArrayList {

    public static void main(String[] args) {

       // Create a container for integers
        Container<Integer> intContainer = new Container<>();
        intContainer.add(10);
        intContainer.add(20);
        intContainer.add(30);

        // Print the contents of the integer container
        intContainer.printContents();

        // Create a container for strings
        Container<String> stringContainer = new Container<>();
        stringContainer.add("Hello");
        stringContainer.add("World");

        // Print the contents of the string container
        stringContainer.printContents();
    }
}
