/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cia4503.genericclass_genericlist;

/**
 *
 * @author reematassi
 */
public class GenericClass_GenericList {

    public static void main(String[] args) {
        // Create a GenericList for integers
        GenericList<Integer> intList = new GenericList<>(5);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

    
        // Create a GenericList for strings
        GenericList<String> strList = new GenericList<>(5);
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");
        
        // Access and print elements
        System.out.println("Integer List:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        
        System.out.println("String List:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
