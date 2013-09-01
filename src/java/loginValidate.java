
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class loginValidate {

    static boolean validate(String username, String password) {
            boolean status;
            status = false;
            
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con;
                con =  DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = con.prepareStatement("select * from APP.MANAGER where name=? and password=?");
                ps.setString(1,username);
                ps.setString(2,password);
                
                ResultSet rs = ps.executeQuery();
                status = rs.next();
                
               }
            catch(Exception e){
                System.out.println(e);
            }
        return status;
    }
    
}
