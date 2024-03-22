/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratordpex6;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create an instance of Horizontal scroll bar window
        //Solution1
        SimpleWindow sw=new SimpleWindow("This is the first simple Window"); 
        
        HorizontalScrollBarWindow hs=new HorizontalScrollBarWindow(sw);
        //Solution 2
        //  HorizontalScrollBarWindow hs1=new HorizontalScrollBarWindow(new SimpleWindow("This is the first simple Window"));
        
       // create an instance of  vertical scroll bar window
        VerticalScrollBarWindow vs=new VerticalScrollBarWindow(new SimpleWindow("This is the second simple Window"));
        
        //call draw methods
        hs.draw();
        vs.draw();
    }
    
}
