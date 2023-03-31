/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auk.edu.ng.badrs;
import java.sql.*;

/**
 *
 * @author Hp
 */
public class DBConnection {
    static final String DB_URL = "JDBC:mysql://localhost/badrs";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
            Connection conn = null;

        try{
            //register for JDBC Driver, not required for newer versions of jdk
            Class.forName("com.mysql.jdbc.Driver");
            
            //open connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
            
        }catch(Exception ex){
            System.out.println("There were error connecting to database.");
            return null;
        }
    }

    PreparedStatement prepareStatement(String insert_into_birthrecordcertNo_regCenter_t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
