/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.abstract_interface_review;

/**
 *
 * @author nlakhal
 */
public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.area()); // Output: Rectangle Area: 15.0
        rectangle.display(); // Output: Shape display method

        // Creating a Circle
        Circle circle = new Circle(2.0);
        System.out.println("Circle Area: " + circle.area()); // Output: Circle Area: 12.566370614359172
        circle.display(); // Output: Shape display method

        // Creating a Book
        Book book = new Book("Java Programming");
        book.print(); // Output: Printing book: Java Programming

        // Creating a Document
        Document document = new Document("SampleDocument.doc");
        document.print(); // Output: Printing document: SampleDocument.doc

        // Creating a Rectangle2
        Rectangle2 rectangle2 = new Rectangle2(4.0, 6.0);
        System.out.println("Rectangle2 Area: " + rectangle2.area()); // Output: Rectangle2 Area: 24.0
        rectangle2.print(); // Output: Printing rectangle with length 4.0
    }
}

