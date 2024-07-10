/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Administration extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                      throws ServletException, IOException {  
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            request.getRequestDispatcher("Link1.html").include(request, response);
            Mydb db=new Mydb();
            Connection con=db.getCon();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user");
            
            HttpSession session=request.getSession(false);
            if(session!=null){
//                String name=(String)session.getAttribute("name");
//                
//                out.print("Hello, "+name+" Welcome to Profile");
                  out.println("<html><body>"); 
                  out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>First_name</th><th>Last_name</th><th>Gender</th><th>Phone_no</th><th>Address</th><th>Password</th><th>Username</th><tr>");  
             while (rs.next()) 
             {  
                 String a = rs.getString(1);  
                 String b = rs.getString(2);  
                 String c = rs.getString(3);
                 String d = rs.getString(4); 
                 String e = rs.getString(5); 
                 String f = rs.getString(6); 
                 String g = rs.getString(7); 
                 out.println("<tr><td>" + a + "</td><td>" + b + "</td><td>" + c + "</td><td>" + d + "</td><td>" + e + "</td><td>" + f + "</td><td>" + g + "</td></tr>");   
             }  
             out.println("</table>");
             out.println("<form action=\"Table\" method=\"post\">");
             out.println("<label for=\"username\">Enter username to delete</label>\n" +
"            <input type=\"text\" placeholder=\"Enter Username\" name=\"name\" required>");
             out.println("<button type=\"submit\" style=\"background-color:red;\">Delete</button>");
             out.println("</form>");
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>Id</th><th>Complaint</th><tr>");  
             rs.close();
             ResultSet rs1=stmt.executeQuery("select * from cmp");
             while (rs1.next()) 
             {  
                 String x = rs1.getString(1);  
                 String y = rs1.getString(2);  
                 
                 out.println("<tr><td>" + x + "</td><td>" + y + "</td></tr>");   
             }  
             out.println("</table>");
             out.println("<form action=\"Table1\" method=\"post\">");
             out.println("<label for=\"username\">Enter username to delete</label>\n" +
"            <input type=\"text\" placeholder=\"Enter Username\" name=\"name\" required>");
             out.println("<button type=\"submit\" style=\"background-color:red;\">Delete</button>");
             out.println("</form>");
             out.println("</html></body>");  
            }
             else{  
            out.print("Please login first");  
            RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
            rd.include(request, response);   
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }  
}