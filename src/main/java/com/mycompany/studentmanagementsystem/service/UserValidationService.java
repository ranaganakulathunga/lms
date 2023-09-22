/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.service;

import com.mycompany.studentmanagementsystem.dbconnection.QueryManager;
import com.mycompany.studentmanagementsystem.view.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilina
 */
public class UserValidationService {
    private ResultSet rs;
    QueryManager qm = new QueryManager();
    
    public boolean validateUser(User user){
        boolean status = false;
        rs = qm.userValidate(user.getUserName(), user.getPassword());
        try {
            if(rs.next()){
                status = true;
            }else{
                status = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    
}
