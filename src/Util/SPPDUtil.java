/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Debora Sitanggang
 */
public class SPPDUtil {

 private static Connection conn;

    public static Connection getConnection(){
        if(conn==null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection("jdbc:mysql://localhost/aplikasisppd", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(SPPDUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
        return conn;
    }
}
