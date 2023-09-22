/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.dbconnection;

import java.sql.ResultSet;

/**
 *
 * @author Thilina
 */
public class QueryManager {
    private ResultSet result;
    DatabaseConnection db = new DatabaseConnection();
    
    public ResultSet userValidate(String userName, String password){
        result = db.selectValues("SELECT * FROM USER WHERE user_name = '"+userName+"' AND password = '"+password+"'");
        return result;
    }
}
