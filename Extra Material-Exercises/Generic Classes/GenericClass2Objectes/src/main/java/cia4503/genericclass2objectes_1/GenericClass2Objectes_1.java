/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia4503.genericclass2objectes_1;

/**
 *
 * @author reematassi
 */
public class GenericClass2Objectes_1 {

    public static void main(String[] args) {

        // Creating a Pair of String and Integer
        Pair<String, Integer> stringIntegerPair = new Pair<>("Hello", 42);

        // Creating a Pair of Double and Boolean
        Pair<Double, Boolean> doubleBooleanPair = new Pair<>(3.14, true);
        
        Pair<String, String> StringStringPair = new Pair<>("Reem", "Atassi");
        Pair<String, String> StringStringPair1 = new Pair<>("Reem", "Hello All");


        // Retrieving and printing values from the pairs
        System.out.println("String: " + stringIntegerPair.getFirst() + ", Integer: " + stringIntegerPair.getSecond());
        System.out.println("Double: " + doubleBooleanPair.getFirst() + ", Boolean: " + doubleBooleanPair.getSecond());

        // Modifying the values in the pairs
        stringIntegerPair.setFirst("World");
        doubleBooleanPair.setSecond(false);

        // Printing the modified values
        System.out.println("Updated String: " + stringIntegerPair.getFirst() );
        System.out.println( "Updated Boolean: " + doubleBooleanPair.getSecond());
    }
}

