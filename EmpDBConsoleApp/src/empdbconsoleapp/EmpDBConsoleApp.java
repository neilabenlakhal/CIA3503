/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empdbconsoleapp;

import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

/**
 * This is the app main class
 * It uses the EmployeeDAO class to get the data from the database
 * @author tkamal
 */
public class EmpDBConsoleApp {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeDAO empDAO = new EmployeeDAO();
    
    //Application main
    public static void main(String[] args) throws SQLException {
        String choice = "";
        while(!choice.equals("6")) {
            System.out.println("""
                               Employee Database System
                               ========================
                               1. Add a new employee
                               2. Delete employee
                               3. Update employee
                               4. Find employee by ID
                               5. Show All Employee
                               6. Exit
                               Enter your choice:
                               """);
            choice = scanner.nextLine();
            switch(choice) {
                case "1" -> doAddNewEmployee();
                case "2" -> doDeleteEmployee();
                case "3" -> doUpdateEmployee();
                case "4" -> doFindEmployeeByID();
                case "5" -> doShowAllEmployees();
                case "6" -> System.exit(0);
                default -> 
                    System.out.println("Enter a choice between 1 to 6!");
            }
        }
    }

    public static void doFindEmployeeByID() throws SQLException {
        System.out.println("Enter employee to find (ID):");
        String empId = scanner.nextLine();
        Employee employee = empDAO.findEmployeeById(empId);
        if (employee != null) {
            System.out.println(employee);
        }
        else {
            System.out.println("No employee with ID:" +empId);
        }
    }
    
    public static void doAddNewEmployee() throws SQLException {
        System.out.println("Enter new employee ID:");
        String empId = scanner.nextLine();
        
        System.out.println("Enter new employee name:");
        String empName = scanner.nextLine();
        
        System.out.println("Enter new employee department:");
        String empDept = scanner.nextLine();
        
        System.out.println("Enter new employee basic salary:");
        double basicSalary = scanner.nextDouble();
       
        int addStatus = empDAO.addNewEmployee(empId, empName, empDept, basicSalary);
        if (addStatus == 1) {
            System.out.println(empId + " " +empName+ " Added successfully");
        }
        else {
            System.out.println("Error adding new employee " + empId + " "+empName);
        }
    }
    
    public static void doUpdateEmployee() throws SQLException {
        System.out.println("Enter employee ID to update:");
        String empId = scanner.nextLine();
        
        if (empDAO.findEmployeeById(empId) == null) {
            System.out.println("No employee with id:" +empId);
            return;
        }
        
        System.out.println("Enter new employee name:");
        String empName = scanner.nextLine();
        
        System.out.println("Enter new department:");
        String empDept = scanner.nextLine();
        
        System.out.println("Enter new employee basic salary:");
        double basicSalary = scanner.nextDouble();
       
        int updateStatus = empDAO.updateEmployee(empId, empName, empDept, basicSalary);
        if (updateStatus == 1) {
            System.out.println(empId + " " +empName+ " updated successfully");
        }
        else {
            System.out.println("Error updating " + empId + " "+empName);
        }
    }

    public static void doDeleteEmployee() throws SQLException {
        System.out.println("Enter employee ID to delete:");
        String empId = scanner.nextLine();
        
        if (empDAO.findEmployeeById(empId) == null) {
            System.out.println("No employee with id:" +empId);
            return;
        }
       
        int delStatus = empDAO.deleteEmployee(empId);
        if (delStatus == 1) {
            System.out.println(empId + " deleted successfully");
        }
        else {
            System.out.println("Error deleting employee " + empId);
        }
    }
    
    public static void doShowAllEmployees() throws SQLException {
        //get all employees using the DAO
        List<Employee> empList = empDAO.getAllEmployees();
        
        //iterate over the empList and print 
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }
    
}
