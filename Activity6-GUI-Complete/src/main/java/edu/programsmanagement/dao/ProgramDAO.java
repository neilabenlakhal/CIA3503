/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.programsmanagement.model.Program;

/**
 *
 * @author nbenayed
 */
public class ProgramDAO {
    public Connection conn;
    public Statement stmt;
    public PreparedStatement pstmt;
    public String sql;
    public ResultSet rs;
    public int status;
    
    
    
    //create a method to check whether a certain program exists in the DB
    
    public Program findProgramByCode(String code) throws SQLException{
        //step1: connect to the database
        conn=DBConnection.getConnection();
        
        //step2: create the statement
        stmt=conn.createStatement();
        
        //step3: execute the statement
        sql="Select * from program where code='"+code+"';";
        
        rs=stmt.executeQuery(sql);
        Program prog=null;
        if(rs.next()){
            String title=rs.getString("title");
            String accred=rs.getString("accreditation");
            prog=new Program(code,title,accred);
        }
        
        //step4: close the connection
        rs.close();
        stmt.close();
        conn.close();
        
        //return the program;
        return prog;
    }
    
    public Program findProgramByTitle(String title) throws SQLException{
        //step1: connect to the database
        conn=DBConnection.getConnection();
        
        //step2: create the statement
        stmt=conn.createStatement();
        
        //step3: execute the statement
        sql="Select * from program where title like '%"+title+"%';";
        
        rs=stmt.executeQuery(sql);
        Program prog=null;
        if(rs.next()){
            String code=rs.getString("code");
            String accred=rs.getString("accreditation");
            prog=new Program(code,rs.getString("title"),accred);
        }
        
        //setp4: close the connection
        rs.close();
        stmt.close();
        conn.close();
        
        //return the program;
        return prog;
    }
    
    
    //create a method to find an program by Accrediation. Use a prepared statement.
        public List<Program>  findProgramByAccreditation(String accreditation) throws SQLException{
        //step1: connect to the database
        conn=DBConnection.getConnection();
        
        //step2: create a prepared statement
        sql="SELECT * FROM program WHERE accreditation=?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,accreditation);
        
        //step3: execute the preapared statement
        rs=pstmt.executeQuery();
        Program prog;
        ArrayList<Program> progList=new ArrayList<Program>();
        while(rs.next()){
            String code=rs.getString("code");
            String title=rs.getString("title");
        
            //create an object emp with the data retrieved from the resultset
            prog=new Program(code,title, accreditation);
            //add emp to empList
            progList.add(prog);
            
        }
        
        
        
        //setp4: close the connection
        rs.close();
        pstmt.close();
        conn.close();
        
        //return ....
        return progList;
    }

    
    //create a method to add a program into the  DB
    public int addNewProgram(String code, String title, String accreditation) throws SQLException{
                 
        //step1: connect to the database
        conn=DBConnection.getConnection();
        
        //step2: create the statement
        stmt=conn.createStatement();
        
        //step3: execute the statement
        sql="INSERT INTO PROGRAM VALUES('"+code+"','"+title+"','"+accreditation+"');";
        status=stmt.executeUpdate(sql);
        
        //setp4: close the connection
        stmt.close();
        conn.close();
        return status;
    }
    
//create a method to update the details of a program
    
    public int updateProgram(String code, String title, String accreditation) throws SQLException{
    //step1: connect to the database
     conn=DBConnection.getConnection();
    
        //step2: create the statement
        stmt= conn.createStatement();
        //step3: execute the statment
        sql="UPDATE PROGRAM SET title='"+title+"',accreditation='"+accreditation+"' WHERE code='"+code+"';";
        status= stmt.executeUpdate(sql);
        
        //setp4: close the connection
        stmt.close();
        conn.close();
        return status;
    
    }
    
    //create a method to delete a program by code from the  DB
    public int deleteProgram(String code) throws SQLException{ 
        //step1: connect to the database
        conn=DBConnection.getConnection();
    
        //step2: create the statement
        stmt=conn.createStatement();
        
        //step3: execute the statement
        sql="DELETE FROM PROGRAM WHERE code='"+code+"';";
        status=stmt.executeUpdate(sql);
        
        //setp4: close the connection
        stmt.close();
        conn.close();
        
        return status;
    
    }
    //create a method to delete a program by code from the  DB using a prepared statement
    
    public int deleteProgrampst(String code) throws SQLException{ 
        //step1: connect to the database
        conn=DBConnection.getConnection();
        //step2: create a prepared statement
        sql="DELETE FROM PROGRAM WHERE CODE=?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,code);
        //step3: execute the statment
        status= pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
    return status;
    }
    //create a method to update the details of a program
    
    public int updateProgrampst(String code, String title, String accreditation) throws SQLException{
    
     //step1: connect to the database
    conn=DBConnection.getConnection();
    
        //step2: create the preparedstatement
       sql="UPDATE PROGRAM SET title=?,accreditation=? WHERE code=?;";

       pstmt=conn.prepareStatement(sql);
       
       pstmt.setString(1, title);
       pstmt.setString(2, accreditation);
       pstmt.setString(3, code);
       
        //step3: execute the statment
                
        status= pstmt.executeUpdate();
        //setp4: close the connection
        pstmt.close();
        conn.close();
        return status;
    
    }
    
    //create a method to get all programs
    
    public List<Program> getAllPrograms() throws SQLException{
        //step1: connect to the database
        conn=DBConnection.getConnection();
    
    
        //step2: create the statement
        stmt=conn.createStatement();
        
        //step3: execute the statement
        sql="SELECT * FROM Program;";
        rs=stmt.executeQuery(sql);
        
        Program prog;
        ArrayList<Program> progList=new ArrayList<Program>();
        while(rs.next()){
            String code=rs.getString("code");
            String title=rs.getString("title");
            String accreditation=rs.getString("accreditation");
        
            //create an object prog with the data retrieved from the resultset
            prog=new Program(code,title,accreditation);
            //add prog to progList
            progList.add(prog);
            
        }
        
        //setp4: close the connection
        rs.close();
        stmt.close();
        conn.close();
        return progList;
    }
}
   

