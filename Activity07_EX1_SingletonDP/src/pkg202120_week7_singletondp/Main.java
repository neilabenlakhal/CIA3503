
package pkg202120_week7_singletondp;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Create a program for task 1, 
        by creating two doctors and two patients.*/
        
        //Patient(char Gender, String Name)
        Patient p1=new Patient('F',"Mariam");
        Patient p2=new Patient('M',"Ahmed");
        
        //Doctor(String speciality, String Name)
        Doctor d1=new Doctor("Dermatologist","Alex");
        Doctor d2=new Doctor("Generalist","Max");
        
        /*Post information to the DisplayBoard, 
        so that one patient goes to one of the doctors and 
        the other patient to the other doctor. Print messages to the board.*/
        
        DisplayBoard db=DisplayBoard.getInstance();
        String msg1="Patient "+ p1.getName()+" has an appoitment with Dr."+d2.getName();
        
        db.postMessage(msg1);
        
        db.postMessage("Patient "+ p2.getName()+" has an appoitment with Dr."+d1.getName());
    }
    
}
