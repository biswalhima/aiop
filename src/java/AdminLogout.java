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
public class AdminLogout extends HttpServlet {

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
            request.getRequestDispatcher("Link1.html").include(request, response);
            
            HttpSession session=request.getSession();
            session.invalidate();
            
            out.print("<!DOCTYPE html>  \n" +
"<html>  \n" +
"<head>  \n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n" +
" <link\n" +
"    rel=\"stylesheet\"\n" +
"    href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"\n" +
"  /> \n" +
"<style>  \n" +
"body{  \n" +
"\n" +
" width:100%;height:100vh;\n" +
"    background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('logout.png');\n" +
"    background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:cambria;\n" +
"}\n" +
"\n" +
"button {\n" +
"    background-color:green;\n" +
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
"<br> <br> <br> <br> <br> <br> <br> <br> <br> <br> \n" +
"<br> <br> <br><br> <br> <br> <br> \n" +
"<center><h1 style=\"color:red\" class=\"animate_animated animate_tada\">YOU HAVE BEEN LOGGED OUT!!!</h1></center>\n" +
"<br>\n" +
"\n" +
"<center><a href=\"index.html\" target=\"index.html\"><button type=\"submit\" style=\"width:100px;height:50px color:white\">OK</button> </a></center><br>\n" +
"</body>  \n" +
"</html>");
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
   
}
