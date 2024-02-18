/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_ex3_1;

/**
 *
 * @author nlakhal
 */
// Apple class
public class Apple {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Mango class
class Mango {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Orange class
class Orange {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Generic Drink class
class Drink<T> {

    private T drinkType;
    private double price;

    public T getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(T drinkType) {
        this.drinkType = drinkType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Main {

    public static void main(String[] args) {
        // Example Usage:
        // Create an instance of the Drink class with Apple as the generic type
        Drink<Apple> appleDrink = new Drink<>();
        Apple apple = new Apple();
        apple.setName("Apple Juice");
        apple.setPrice(2.99);

        // Set the drink type using the setter method
        appleDrink.setDrinkType(apple);

        // Retrieve the drink type and price using the getter methods and print them
        System.out.println("Drink Type: " + appleDrink.getDrinkType().getName());
        System.out.println("Price: $" + appleDrink.getPrice());
    }
}
