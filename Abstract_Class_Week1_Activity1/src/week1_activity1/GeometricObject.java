
package pkg202120_week1_activity1;


public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    
    //getters & setters
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    //default constructor
    protected GeometricObject() {
    }
    
    //overloaded constructor
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    public abstract double getArea();
        
    
    
    public abstract double getPerimeter();
    
   
    
    

  
    
    
}
