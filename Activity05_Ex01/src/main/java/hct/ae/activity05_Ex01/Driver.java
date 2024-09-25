package hct.ae.activity05_Ex01;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 *
 * Array and ArrayList are two commonly used data structures in Java for storing
 * collections of data. However, there are some significant differences between
 * the two.
 *
 * Array:
 *
 * Arrays in Java are fixed-sized data structures. This means that once you
 * create an array, you cannot change its size. Arrays are best suited for cases
 * where you know the exact size of the data you need to store ahead of time.
 * Accessing elements in an array is fast and efficient.
 *
 *
 *
 * @author nlakhal
 */
public class Driver {

    public static void main(String[] args) {

        /*Arrays in Java are fixed-sized data structures. This means that once you create an array, you cannot change its size.
Arrays are best suited for cases where you know the exact size of the data you need to store ahead of time.
Accessing elements in an array is fast and efficient.
         */
        // Example of an Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int array_size = numbers.length; //attribute

        /*     ArrayList:

ArrayList, is a dynamic data structure that automatically grows and shrinks as you add or remove elements.
ArrayList is best suited for cases where you don't know the exact size of the data you need to store
or if you need to store elements of different data types.
ArrayList is less efficient than arrays when it comes to accessing elements because
it needs to dynamically resize itself when elements are added or removed.
         */
        ArrayList<Integer> list_numbers = new ArrayList<>();   //Java predefined generic class
        list_numbers.add(1); //0
        list_numbers.add(22); //index 1
        list_numbers.add(34);
        list_numbers.add(44);
        list_numbers.add(50);
        System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList:  5
        list_numbers.remove(1); // remove the second element, which has an index of 1
        list_numbers.remove(Integer.valueOf(3)); // remove the element with the value 3

        System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList after modif : 3"
        for (int i = 0; i < list_numbers.size(); i++) {
            System.out.println(list_numbers.get(i));
        }

        for (Integer a : list_numbers) { //method 2
            System.out.println(a);
        }

        ArrayList<Float> list_float = new ArrayList<>();
        list_float.add(1.0f);
        list_numbers.add(2);
        list_numbers.add(3);
        list_numbers.add(4);
        list_numbers.add(5);

        System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList: 

        list_numbers.remove(1); // remove the second element, which has an index of 1

        list_numbers.remove(Integer.valueOf(3)); // remove the element with the value 3

        System.out.println("Size of ArrayList: " + list_numbers.size()); // outputs "Size of ArrayList after modif : 3

        for (int i = 0; i < list_numbers.size(); i++) { //method 1
            System.out.println(list_numbers.get(i));
        }

        for (Integer a : list_numbers) { //method 2
            System.out.println(a);
        }

        ArrayList<Person> list_Person = new ArrayList<>(); //declaring 

        Person p3 = new Person("P3", new Date());
        Employee e3 = new Employee("E3", new Date(), "HCT003", 45000);

        list_Person.add(p3);
        list_Person.add(e3);

        for (Person p : list_Person) { //method 2
            System.out.println(p);
        }

        //----------------------------------------------------------------------------------------------------------------------------------------------
        /*ArrayList<Person> personList = new ArrayList<>();

        Person p = new Person("Dina", new Date());

        Employee e = new Employee("Sarah", new Date(), "E2007", 5000);

        Person p2 = new Person("Lina", new Date());

        personList.add(p); // notice that we can add objects from different types to the Arraylist
        personList.add(e);
        personList.add(p2);

        for (Person person : personList) { //method 1
            System.out.println(person.toString());
        }

        for (int i = 0; i < personList.size(); i++) {//method 2
            System.out.println(personList.get(i).toString());
        }
         */
    }
}
