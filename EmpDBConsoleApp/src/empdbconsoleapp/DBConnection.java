package empdbconsoleapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * sqlite-jdbc-3.40.1.0.jar  
 * https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.40.1.0/
 * @author nlakhal
 */
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        //Change the path the database (.db) file on your machine...
        //Just by changing the URL you point to another database
        String dbURL = "jdbc:sqlite:empinfo.db";
        //String dbURL = "jdbc:sqlite:C:/users/nlakhal/sql/empinfo.db";

        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
}
