
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
                Class.forName("org.apache.derby.jdbc.ClientDriver");        //      Load JDBC Driver
                Connection con;
                con =  DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");     // first parameter is database server address , second and third is username,password respectively
                PreparedStatement ps = con.prepareStatement("select * from APP.MANAGER where name=? and password=?");   // ? as parameter avoids sql injection attack
                ps.setString(1,username);
                ps.setString(2,password);       // Passing 1st and 2nd parameter to above ps object
                
                ResultSet rs = ps.executeQuery();
                status = rs.next();
                
               }
            catch(Exception e){
                System.out.println(e);
            }
        return status;
    }
    
}
