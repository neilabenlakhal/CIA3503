/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deep_vs_shallowcloning;

/**
 *
 * @author nlakhal
 * 
 * you can follow these general steps:

1- Create a Class: Define a class that you want to clone. This class should implement the Cloneable interface, 
which serves as a marker interface to indicate that the class can be cloned.

2 - Override the clone Method: Within your class, override the clone method provided by the Object class. 
The clone method should return an instance of your class and perform the cloning logic, whether shallow or deep.
 */
class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class CloningExample {
    public static void main(String[] args) {
        try {
            // Creating an original Person object
            Person originalPerson = new Person("John", 25);

            // Shallow cloning
            Person shallowClonedPerson = (Person) originalPerson.clone();

            // Deep cloning (not applicable here since there are no nested objects)
            Person deepClonedPerson = (Person) originalPerson.clone();

            // Modifying the original person to demonstrate shallow cloning
            originalPerson.setAge(30);

            // Displaying original and cloned person details
            System.out.println("Original Person: " + originalPerson.getName() + " - " + originalPerson.getAge());
            System.out.println("Shallow Cloned Person: " + shallowClonedPerson.getName() + " - " + shallowClonedPerson.getAge());
            System.out.println("Deep Cloned Person: " + deepClonedPerson.getName() + " - " + deepClonedPerson.getAge());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    

        /*
        In this example:

The Person class implements the Cloneable interface.
The Person class overrides the clone() method to enable shallow cloning for the entire object.
Since there are no nested objects within the Person class, deep cloning is not applicable here.
        The clone() method provided by Object class is sufficient for this simple scenario.
The modifications made to the original person are reflected in the shallow cloned person, 
        but deep cloned person remains unaffected as there are no nested objects to be deep-cloned.
        */



        // Explain the results
        System.out.println("\nExplanation:");
        System.out.println("1. Shallow Cloning:");
        System.out.println("   - Original and shallow cloned person share the same 'name' and 'age'.");
        System.out.println("   - Modifying the original person's 'name' also affects the shallow cloned person.");

        System.out.println("\n2. Deep Cloning:");
        System.out.println("   - Deep cloned person is a separate object with its own 'name' and 'age'.");
        System.out.println("   - Modifying the original person's 'name' does not affect the deep cloned person.");

        // Explain Object class and Cloneable interface
        System.out.println("\nAdditional Information:");
        System.out.println("The Object class is the root class for all Java classes. It provides default implementations");
        System.out.println("for certain methods, including the 'clone' method, which can be overridden in subclasses.");
        System.out.println("The Cloneable interface is a marker interface in Java, indicating that a class allows cloning.");
        System.out.println("It doesn't have any methods, but it is necessary to use the 'clone' method.");
    }
}

