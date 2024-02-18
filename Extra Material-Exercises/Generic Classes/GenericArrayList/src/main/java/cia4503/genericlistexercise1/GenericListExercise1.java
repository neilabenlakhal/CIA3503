/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cia4503.genericlistexercise1;
import java.util.ArrayList;
/**
 *
 * @author reematassi
 */
public class GenericListExercise1 {

    public static void main(String[] args) {
        Person p1=new Person("Amna",20);
        System.out.println(p1.name + "  "+ p1.getAge());
        
        Student s1=new Student("Maryam", 21, "H00123456");
        System.out.println(s1.name + "  "+ s1.getAge() +" " + s1.getSID());
        
        ArrayList<Person> pList = new ArrayList<Person>();
        ArrayList<Student> sList = new ArrayList<Student>();
        
        Student s2=new Student("Jawahir", 19, "H00987654");
        Student s3=new Student("Al Anood", 22, "H00102938");
        
        pList.add(p1);
        
        sList.add(s1); // index=0
        sList.add(s2); // index=1
        sList.add(s3); //index =2
                
        System.out.println("Results:");
        


        for(int k=0; k<sList.size(); k++ ){ // k: 0,1,2
                Student s=sList.get(k);
                System.out.println(s.name + "  "+ s.getAge() +" " + s.getSID());


        }



    }
}
