/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
@WebServlet(urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String first=request.getParameter("firstname");
            String User=request.getParameter("user");
            String last=request.getParameter("lastname");
            String gender=request.getParameter("Gender");
            String phone=request.getParameter("phone");
            String address=request.getParameter("address");
            String pass=request.getParameter("psw");
            Mydb db=new Mydb();
            Connection con=db.getCon();
            Statement stmt=con.createStatement();
            //stmt.execute("insert into User(first,middle,last,gender,phone,address,pass)values('Swaraj','','Pattanaik','male','9090178286','Bhubaneswar','12345')");
            stmt.execute("insert into User(first,user,last,gender,phone,address,pass)values('"+first+"','"+User+"','"+last+"','"+gender+"','"+phone+"','"+address+"','"+pass+"')");
            out.println("<!DOCTYPE html>  \n" +
"<html>  \n" +
"<head>  \n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \n" +
"<style>  \n" +
"body{  \n" +
"\n" +
" width:100%;height:100vh;\n" +
"    background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('nk.png');\n" +
"    background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:cambria;\n" +
"}\n" +
"\n" +
"button {\n" +
"    background-color:orangered;\n" +
"    color: white;\n" +
"    padding: 4px 2px;\n" +
"    border-radius: 2px;\n" +
"    margin: 3px 0;\n" +
"    width: 100%;\n" +
"    font-size: 18px;\n" +
"    align-content: center;\n" +
"  }\n" +
"\n" +
"\n" +
"\n" +
"</style>  \n" +
"</head>  \n" +
"<body> \n" +
"<br>\n" +
"<br>\n" +
"<br> \n" +
"<center><h1>THANK YOU FOR REGISTERING</h1></center>\n" +
"<br>\n" +
"<br>\n" +
"<center><a href=\"Login.jsp\"><button type=\"submit\" style=\"width:100px;height:50px color:white\">DONE</button> </a></center><br>\n" +
"</body>  \n" +
"</html>");
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            PrintWriter out = response.getWriter();
            out.println("User name exists");
             request.getRequestDispatcher("Registration.jsp").include(request, response);
        }
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
