/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nbenayed
 */
public class DBConnection {
    
    
    public static Connection getConnection(){
        Connection conn=null;
        try{
            //set path to your database
             String dbURL = "jdbc:sqlite:programinfo.db";
            
            conn = DriverManager.getConnection(dbURL);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
