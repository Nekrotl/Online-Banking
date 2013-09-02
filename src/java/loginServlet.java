/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Akash
 */
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
           
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            String username = request.getParameter("username");     // username and userpass are fields from login Page
            String password = request.getParameter("userpass");
            
            if(loginValidate.validate(username,password))
            {
                RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");     // redirect to welcome.jsp Page
                rd.forward(request, response);                                          // doesn't include any message after redirecting to the welcome page
                
            }
            else
            {
                out.println("Login Failed");
                RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");      // redirect to login.jsp Page
                rd1.include(request, response);                                         // include message Login failed after redirecting
                
            }
            
            out.close();
     
    }
}
