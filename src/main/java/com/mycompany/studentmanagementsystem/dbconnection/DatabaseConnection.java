/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilina
 */
public class DatabaseConnection {
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    
    public DatabaseConnection(){
        try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
               stmt = con.createStatement();
           }
           catch(Exception e){
               System.out.println(e);
           }
    }
    
    public ResultSet selectValues(String sql){
        try {
            result = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;

    }
 
}
