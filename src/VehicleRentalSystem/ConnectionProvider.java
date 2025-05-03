/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maxwe
 */
public class ConnectionProvider {
    
    //Main project
    public static Connection getCon() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the "customers" database
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "MaxwellTaku12!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
            return null; // Return null if connection fails
    }
    //--------------------------------------------------------------------------------------------------
    public static Connection getCon2() {
    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the "customers" database
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicles", "root", "MaxwellTaku12!");
        
    } catch (ClassNotFoundException e) {
        System.out.println("MySQL Driver not found!");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("Database connection failed!");
        e.printStackTrace();
    }
        return null; // Return null if connection fails
    }
    

}
