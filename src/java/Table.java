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
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Table extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {
        Mydb db=new Mydb();
            Connection con=db.getCon();
            Statement stmt;
            String str=request.getParameter("name");
       try {
           stmt = con.createStatement();
           stmt.execute("delete from user where user='"+str+"'");
       } catch (SQLException ex) {
           Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
       }          
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             RequestDispatcher rd=request.getRequestDispatcher("Administration");  
             rd.include(request, response);
        }    }

    

}

//public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
//      {  
//         PrintWriter out = res.getWriter();  
//         res.setContentType("text/html");  
//         out.println("<html><body>");  
//         try 
//         {  
//             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
//             Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "system", "pintu");  
//             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
//             Statement stmt = con.createStatement();  
//             ResultSet rs = stmt.executeQuery("select * from employee");  
//             out.println("<table border=1 width=50% height=50%>");  
//             out.println("<tr><th>EmpId</th><th>EmpName</th><th>Salary</th><tr>");  
//             while (rs.next()) 
//             {  
//                 String n = rs.getString("empid");  
//                 String nm = rs.getString("empname");  
//                 int s = rs.getInt("sal");   
//                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
//             }  
//             out.println("</table>");  
//             out.println("</html></body>");  
//             con.close();  
//            }  
//             catch (Exception e) 
//            {  
//             out.println("error");  
//         }  
//     }  