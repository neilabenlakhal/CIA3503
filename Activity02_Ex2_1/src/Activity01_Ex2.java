
/**
 *
 * @author nlakhal
 */
public class Activity01_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle r3 = new Rectangle(50,20, "pink", false);
        
        System.out.println(r3.toString());//displaying the details of my object
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
        System.out.println(r3.howToColor());
        
        
        
        
        
        
        
        
        //  GeometricObject a = new GeometricObject();
        Circle c1 = new Circle(10, "blue", true);
        System.out.println(c1.toString());
        System.out.println("The area of this circle is" + c1.getArea());
        System.out.println("The perimeter of this circle is " + c1.getPerimeter());

        Rectangle r = new Rectangle(10, 20, "blue", true);
        // char c='A';

        Circle c = new Circle(3.4, "red", false);

        System.out.println(c.toString());
        System.out.println("The perimeter of this circle is " + c.getPerimeter());

        System.out.println("The area of this circle is " + c.getArea());

        System.out.println(r.toString());

        Rectangle r1 = new Rectangle(5, 10, "blue", false);
        System.out.println(r1.toString());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Area: " + r1.getArea());

        Circle c2 = new Circle(6, "red", true);
        System.out.println(c2.toString());

        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());

    }

}
