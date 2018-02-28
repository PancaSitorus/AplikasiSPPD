/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Util.SPPDUtil;
import javax.swing.JOptionPane;
import Model.UserModel;
import View.*;
import View.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PancaSitorus
 */
public class UserController {
    Login frameLogin;
    UserModel model;
    Connection connection;
    
    public void setModel(UserModel model) {
        this.model = model;
    }

    public UserController() {
        this.connection = new SPPDUtil().getConnection();
    }

    public UserModel getModel() {
        return model;
    }
    
    public boolean login() {
        if (frameLogin.getTextUserName().getText().equals("")) {
            JOptionPane.showMessageDialog(frameLogin, "Masukan userName Anda");
            frameLogin.getTextUserName().requestFocus();
        } else if (frameLogin.getTextPassword().getText().equals("")) {
            JOptionPane.showMessageDialog(frameLogin, "Masukan Password Anda");
            frameLogin.getTextPassword().requestFocus();
        } else {
            String userName = frameLogin.getTextUserName().getText();
            String password = frameLogin.getTextPassword().getText();

            if (model.isLogin(userName, password)) {
                PreparedStatement statement = null;
                try {
                        statement = connection.prepareStatement("SELECT * FROM login WHERE username='"+userName+"' AND password='"+password+"'" );
                        ResultSet rs = statement.executeQuery();
                        if (rs.next()) {
                            if("kepdis".equals(rs.getString("role"))){
                                HomeBuatKepala MV = new HomeBuatKepala();
                                MV.setVisible(true);
                            }
                            else if("pegawa".equals(rs.getString("role"))){
                                new Home().setVisible(true);
                            }
                            else if("sekdis".equals(rs.getString("role"))){
                                new HomeBuatSekretaris().setVisible(true);
                            }
                            
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                return true;
            } else {
                JOptionPane.showMessageDialog(frameLogin, "Username atau Password anda salah, \n "
                        + "pastikan anda ketik username dan password dengan benar ");
            }
        }
        return false;
    }

    public void setFrameLogin(Login frameLogin) {
        this.frameLogin = frameLogin;
    }
    
    
}
