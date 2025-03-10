/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class LogOutServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            request.getRequestDispatcher("link.html").include(request, response);
            
            HttpSession session=request.getSession();
            session.invalidate();
            
            out.print("You are successfully logged out!");
        }  
    }

   
}
//import java.io.IOException;  
//import java.io.PrintWriter;  
//  
//import javax.servlet.ServletException;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//import javax.servlet.http.HttpSession;  
//public class LogoutServlet extends HttpServlet {  
//        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
//                                throws ServletException, IOException {  
//            response.setContentType("text/html");  
//            PrintWriter out=response.getWriter();  
//              
//            request.getRequestDispatcher("link.html").include(request, response);  
//              
//            HttpSession session=request.getSession();  
//            session.invalidate();  
//              
//            out.print("You are successfully logged out!");  
//              
//            out.close();  
//    }  
//}  