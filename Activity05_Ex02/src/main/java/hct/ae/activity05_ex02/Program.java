package hct.ae.activity05_ex02;

/**
 *
 * @author nlakhal
 */
import java.util.ArrayList; //java built-in Generics 
// user-defined generics 

public class Program {

    private String title;
    private String accreditation;
    private ArrayList<Course> courses;

    public Program() {
    }

    ;

    public Program(String title, String accreditation, ArrayList<Course> courses) {
        this.title = title;
        this.accreditation = accreditation;
        this.courses = courses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public void addCourse(Course c) {
        courses.add(c); //ArrayList
    }

    public void deleteCourse(Course c) {
        courses.remove(c);//ArrayList
    }

    public void deleteCourse(String courseCode) {
        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);//access
            if (c.getCode().equals(courseCode)) {//true block
                courses.remove(i);
                break;
            }

            /* for (Course c : courses) { //method 2
           if (c.getCode().equals(courseCode)) 
           { courses.remove(c);
           break;
           }
             */
        }

    }

    /*
             for (Course c : courses) { //method 2
              if (c.getCode().equals(courseCode))
              { courses.remove(c);
              break;
              }

     */


public int count() {
    int size=courses.size();
        return size;
    }



    @Override
public String toString() {
        String str = title + " program, " + accreditation + " accreditation\n";
        for (int i = 0; i < courses.size(); i++) {
            str += courses.get(i).toString() + "\n";
        }
        return str;
    }
}
