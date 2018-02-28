/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Util.SPPDUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Debora Sitanggang
 */
public class UserModel  implements java.io.Serializable {
    SPPDUtil con;

    Connection connection;

    public UserModel() {
        this.connection = new SPPDUtil().getConnection();
    }
    
     public boolean isLogin(String userName, String password) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * from login WHERE username=? AND `password`=?");
            statement.setString(1, userName);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {

                return true;
            }
        } catch (Exception e) {
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

}
