/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_ex3_12;

/**
 *
 * @author nlakhal
 * 
 * 1.	Write a generic class that can represent any type of drink as a string. 
 * Make the drink instance variable 
 * in the generic class as a private string. Write the setter and getter methods.
 * 
 */
 class Drink<T> {
    private T drinkType;

    // Getter method to retrieve the drink type
    public T getDrinkType() {
        return drinkType;
    }

    // Setter method to set the drink type
    public void setDrinkType(T drinkType) {
        this.drinkType = drinkType;
    }

    public static void main(String[] args) {
        // Example Usage:
        // Create an instance of the Drink class with String as the generic type
        Drink<String> myDrink = new Drink<>();

        // Set the drink type using the setter method
        myDrink.setDrinkType("Coffee");

        // Retrieve the drink type using the getter method and print it
        System.out.println("My drink type is: " + myDrink.getDrinkType());
    }
}

