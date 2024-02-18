/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagement.dao;

/**
 *
 * @author nbenayed
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

//	findCourseByCode(String code): Course method takes a program code as input and returns the course object if course code exists in the DB.    
    public Course findCourseByCode(String code) throws SQLException {
        Connection conn = DBConnection.getConnection();

        String sql = "SELECT * FROM course WHERE code=?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);

        ResultSet rs = pstmt.executeQuery();
        Course course = null;
        if (rs.next()) {
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            String progCode = rs.getString("Program_Code");
            ProgramDAO programDAO = new ProgramDAO();

            Program program = programDAO.findProgramByCode(progCode);
            course = new Course(code, title, credits, program);

        }

        rs.close();
        pstmt.close();
        conn.close();
        return course;
    }

    public List<Course> getAllCourses() throws SQLException {
        Connection conn = DBConnection.getConnection();

        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM course;";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        Course course;
        ArrayList<Course> courseList = new ArrayList<Course>();
        

///The while-loop issue resultSet.next() repeatedly to move the cursor to the next row, and processes row-by-row.
//The resultSet.next() returns false at the last row of the ResultSet, which terminates the while-loop.
//You could use rset.getString(columnName) to retrieve all types (int, double, etc).
//For maximum portability, ResultSet columns within each row should be read in left-to-right order,
//and each column should be read only once via the getXxx() methods. 

        while (rs.next()) {
            String code = rs.getString("code");
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            String progCode = rs.getString("program_code");

            //create an object prog with the data retrieved from the resultset
            ProgramDAO programDAO = new ProgramDAO();

            Program program = programDAO.findProgramByCode(progCode);
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
        Connection conn = DBConnection.getConnection();

        //step2: create a prepared statement
        String sql = "SELECT * FROM course where program_code=?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, progCode);

        //step3: execute the preapared statement
        ResultSet rs = pstmt.executeQuery();
        Course course;
        ArrayList<Course> courseList = new ArrayList<Course>();
        while (rs.next()) {
            String code = rs.getString("code");
            String title = rs.getString("title");
            int credits = rs.getInt("credits");
            ProgramDAO programDAO = new ProgramDAO();

            Program program = programDAO.findProgramByCode(progCode);
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
        Connection conn = DBConnection.getConnection();

        //step2: create a prepared statement
        String sql = "INSERT INTO COURSE VALUES(?,?,?,?);";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);
        pstmt.setString(2, title);
        pstmt.setInt(3, credits);
        pstmt.setString(4, progCode);
        //step3: execute the query 
        int insertStatus = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return insertStatus;

    }

//e.	updateCourse(String code, String title, int credits, String progCode):int method takes the code, title, credits, and progCode as input, updates the title, credits, and program code of a given course code, and returns the number of rows affected.
    public int updateCourse(String code, String title, int credits, String progCode) throws SQLException {

        //step1: connect to the database
        Connection conn = DBConnection.getConnection();

        //step2: create the preparedstatement
        String sql = "UPDATE COURSE SET title=?,credits=?, program_code=? WHERE code=?;";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, title);
        pstmt.setInt(2, credits);
        pstmt.setString(3, progCode);
        pstmt.setString(4, code);

        //step3: execute the statment
        int updateStatus = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return updateStatus;

    }

//f.	deleteCourse(String code):int method takes code as input, delete the course for the given code from the database, and returns the number of rows affected.
    public int deleteCourse(String code) throws SQLException {
        //step1: connect to the database
        Connection conn = DBConnection.getConnection();
        //step2: create a prepared statement
        String sql = "DELETE FROM COURSE WHERE CODE=?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, code);
        //step3: execute the statement
        int deleteStatus = pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return deleteStatus;
    }

}
