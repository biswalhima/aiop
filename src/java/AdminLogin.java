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

/**
 *
 * @author Admin
 */
public class AdminLogin extends HttpServlet {

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
        
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
          //  request.getRequestDispatcher("link.html").include(request, response);
            
            String name=request.getParameter("name");
            String password=request.getParameter("password");
            String ps="Admin17";
            String usr="Admin";
            if((password.equals(ps))&&(name.equals(usr))){
                request.getRequestDispatcher("Link1.html").include(request, response);
                HttpSession session=request.getSession();
                session.setAttribute("name",name);
                RequestDispatcher rd=request.getRequestDispatcher("Administration");  
                rd.forward(request, response);  
            }
            else{
                out.print("Sorry UserName or Password Error!");  
                RequestDispatcher rd=request.getRequestDispatcher("/AdminLogin.jsp");  
                rd.include(request, response);  
            }
            out.close(); 
        } 
    } 
    
}
