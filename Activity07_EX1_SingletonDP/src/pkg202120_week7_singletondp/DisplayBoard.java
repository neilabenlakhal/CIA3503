/*


A clinic has two doctors. Patients wait for their turn to see their doctor.
A Clinic display board shows them turn to see the specified doctor.
Create a display board that can display the next patient and the visiting doctor.
Both doctors share the same board. The Doctor and Patient classes are given. 
Task1: Create a DisplayBoard class using an appropriate design pattern.
 */
package pkg202120_week7_singletondp;

/**
 *
 */
//apply Singleton Design Pattern
public class DisplayBoard {
    private String msg;
    
    private static DisplayBoard instance=null; //step 1

    private DisplayBoard() { //PRIVATE CONSTRUCTOR //step 2 
    }
    
    public static DisplayBoard getInstance() { //step 3
        if(instance==null)
            instance=new DisplayBoard();
        return instance;
    }
    
    public void postMessage(String msg){
        System.out.println(msg);
    }

    
}
