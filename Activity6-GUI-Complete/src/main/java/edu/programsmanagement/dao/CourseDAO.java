package edu.programsmanagement.dao;

/**
 *
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.programsmanagement.model.Course;
import edu.programsmanagement.model.Program;

public class CourseDAO {

    public Connection conn;
    public Statement stmt;
    public PreparedStatement pstmt;
    public String sql;
    public ResultSet rs;
    public int status;
    public Course course = null;
    public Program program = null;
    public ProgramDAO programDAO = new ProgramDAO();
    public ArrayList<Course> courseList = new ArrayList<>();

    // This method will check if the course exists 
    public boolean existCourse(String code) throws SQLException {
        conn = DBConnection.getConnection();
        boolean found = false;

        String query = "SELECT code FROM course WHERE code=?;";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, code);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            String cc = rs.getString("code");
            if (cc != null) {
                found = true;
            }
        }
        pstmt.close();
        rs.close();
        conn.close();
        return found;
    }

    public List<Course> getCoursesByProgram(String programTitle) throws SQLException {

        conn = DBConnection.getConnection();
        sql = "select * from Course c, Program p where c.program_code = p.code and p.title=? ;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, programTitle);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            String cc = rs.getString("code");
            int credits = rs.getInt("credits");
            String code = rs.getString("program_code");
            String title = rs.getString("title");
            String acc = rs.getString("accreditation");

            program = new Program(code, programTitle, acc);
            course = new Course(code, title, credits, program);

            courseList.add(course);
        }
        rs.close();
        pstmt.close();
        conn.close();
        return courseList;
    }

//findCourseByCode(String code): Course method takes a program code as 
//input and returns the course object if course code exists in the DB.    
    public Course findCourseByCode(String code) throws SQLException {
        conn = DBConnection.getConnection();
        sql = "SELECT * FROM course WHERE code=?;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);

        rs = pstmt.executeQuery();

        if (rs.next()) {
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            String progCode = rs.getString("Program_Code");
            program = programDAO.findProgramByCode(progCode);
            course = new Course(code, title, credits, program);

        }

        rs.close();
        pstmt.close();
        conn.close();
        return course;
    }

    public List<Course> getAllCourses() throws SQLException {
        conn = DBConnection.getConnection();
        sql = "SELECT * FROM course;";
        pstmt = conn.prepareStatement(sql);

        rs = pstmt.executeQuery();
        while (rs.next()) {
            String code = rs.getString("code");
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            String progCode = rs.getString("program_code");

            //create an object prog with the data retrieved from the resultset
            program = programDAO.findProgramByCode(progCode);
            course = new Course(code, title, credits, program);
            //add prog to progList
            courseList.add(course);
        }
        //setp4: close the connection
        rs.close();
        pstmt.close();
        conn.close();
        return courseList;
    }

    //getAllCourses(String progCode): List<Courses> method takes a program code as input and returns the list of all courses of the given program.
    public List<Course> getAllCourses(String progCode) throws SQLException {
        conn = DBConnection.getConnection();

        //step2: create a prepared statement
        sql = "SELECT * FROM course where program_code=?;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, progCode);

        //step3: execute the preapared statement
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String code = rs.getString("code");
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            program = programDAO.findProgramByCode(progCode);
            course = new Course(code, title, credits, program);
            courseList.add(course);
        }
        rs.close();
        pstmt.close();
        conn.close();
        return courseList;
    }

    //d.	addNewCourse(String code, String title, int credits, String progCode):int method takes the code, title, credits, and progCode as input, adds the course into the database, and returns the number of rows affected.
    public int addNewCourse(String code, String title, int credits, String progCode) throws SQLException {

        //step1: connect to the database
        conn = DBConnection.getConnection();

        //step2: create a prepared statement
        sql = "INSERT INTO COURSE VALUES(?,?,?,?);";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);
        pstmt.setString(2, title);
        pstmt.setInt(3, credits);
        pstmt.setString(4, progCode);
        //step3: execute the query 
        status = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return status;

    }

//e.	updateCourse(String code, String title, int credits, String progCode):int method takes the code, title, credits, and progCode as input, updates the title, credits, and program code of a given course code, and returns the number of rows affected.
    public int updateCourse(String code, String title, int credits, String progCode) throws SQLException {

        //step1: connect to the database
        conn = DBConnection.getConnection();

        //step2: create the preparedstatement
        sql = "UPDATE COURSE SET title=?,credits=?, program_code=? WHERE code=?;";

        pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, title);
        pstmt.setInt(2, credits);
        pstmt.setString(3, progCode);
        pstmt.setString(4, code);

        //step3: execute the statment
        int updatestatus = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return status;

    }

//f.	deleteCourse(String code):int method takes code as input, delete the course for the given code from the database, and returns the number of rows affected.
    public int deleteCourse(String code) throws SQLException {
        //step1: connect to the database
        conn = DBConnection.getConnection();
        //step2: create a prepared statement
        sql = "DELETE FROM COURSE WHERE CODE=?;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);
        //step3: execute the statement
        status = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return status;
    }

}
