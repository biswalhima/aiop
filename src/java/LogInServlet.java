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
public class LogInServlet extends HttpServlet {

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
            request.getRequestDispatcher("link.html").include(request, response);
            
            String name=request.getParameter("name");
            String password=request.getParameter("password");
            String check="";
            Mydb db=new Mydb();
            Connection con=db.getCon();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select pass from User where user='"+name+"';");
            while(rs.next())
                check=rs.getString(1);
            if(password.equals(check)){
                out.print("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"\n" +
"\n" +
"<title>icons</title>\n" +
"\n" +
"<link\n" +
"    rel=\"stylesheet\"\n" +
"    href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"\n" +
"  />\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/\n" +
"libs/animate.css/3.7.2/animate.min.css\">\n" +
"\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n" +
"<style>\n" +
"body{\n" +
" width:100%;height:100vh;\n" +
"    background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('Home.png');\n" +
"    background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:sans-serif;\n" +
"}\n" +
"\n" +
                        ".floating{\n" +
"  background:rgb(240, 10, 163);\n" +
"  color:#ffffff;\n" +
"  position:fixed;\n" +
"  z-index: 999;\n" +
"  top: 90%;\n" +
"  right: 50px;\n" +
"  padding: 12px 30px;\n" +
"  border-radius: 4px;\n" +
"outline: none;\n" +
"text-transform: uppercase;\n" +
"font-size: 13px;\n" +
"font-weight: 500;\n" +
"text-decoration: none;\n" +
"letter-spacing: 1px; transition:all .5s ease;\n" +
"  }\n" +
"   .floating:hover{\n" +
"  background:blue;\n" +
"  color:rgb(255, 0, 149);\n" +
"  }\n" +
"  .floating1{\n" +
"  background:rgb(0, 169, 247);\n" +
"  color:#ffffff;\n" +
"  position:fixed;\n" +
"  z-index: 999;\n" +
"  top: 85%;\n" +
"  right: 50px;\n" +
"   padding: 12px 30px;\n" +
"  border-radius: 4px;\n" +
"outline: none;\n" +
"text-transform: uppercase;\n" +
"font-size: 13px;\n" +
"font-weight: 500;\n" +
"text-decoration: none;\n" +
"letter-spacing: 1px; transition:all .5s ease;\n" +
"  }\n" +
"  .floating1:hover{\n" +
"    background:rgb(250, 250, 250);\n" +
"    color:rgb(0, 153, 255);\n" +
"    }"+
"</style>\n" +
"\n" +
"\n" +
"</head>\n" +
"<body>\n" +
                        " <a href=\"Chatbot.jsp\" class=\"floating1\">Chat bot</a>\n" +
"<a href=\"Women.jsp\" class=\"floating\">Women Live chat</a>"+
"<div><h1 align=center style=\"color:royalblue;\" class=\"animated infinite heartBeat\">ALL IN ONE PORTAL</H1><hr>\n" +
"\n" +
"</p>\n" +
"</div>\n" +
"<br>\n" +
                        "<a href=\"Job\">"+
"<center><button  style=\"background-color:darkmagenta; color:white; width:70%;padding:30px; font-size:20px; font-style:italic;  border-radius:40px;\"><i class=\"fas fa-briefcase\"></i> Job Alerts  </button>\n" +
"</center></a><br>\n" +
                        "<a href=\"EGov\">"+
"<center><button style=\"background-color:Firebrick; color:white; width:70%;padding:30px; font-size:20px; font-style:italic;border-radius:40px;\" ><i class=\"fas fa-landmark-dome\"></i> e-Governance </button></center></a><br><br>\n" +
 "<a href=\"WomenEmp\">"+                       
"<center><button style=\"background-color:Hotpink; color:white; width:70%; padding:30px;font-size:20px; font-style:italic;border-radius:40px;\" ><i class=\"fas fa-hand-fist\"></i> Women Empowerment</button></center></a><br>\n" +
                        "<a href=\"Health\">"+
"<center><button style=\"background-color:steelblue; color:white; width:70%;padding:30px; font-size:20px; font-style:italic;border-radius:40px;\" ><i class=\"fas fa-stethoscope\"></i>Health & Care </button></center></a><br>\n" +
                        "<a href=\"TravelPage\">"+
"<center><button style=\"background-color:sandybrown; color:white; width:70%;padding:30px; font-size:20px; font-style:italic;border-radius:40px;\" ><i class=\"fas fa-bus\"></i> Travels </button></center></a><br><br>\n" +
"\n" +
"\n" +
                        
"</body>\n" +
"</html>");
                HttpSession session=request.getSession();
                session.setAttribute("name",name);
            }
            else{
                out.print("Sorry, username or password error!");
                request.getRequestDispatcher("l"
                        + "Login.jsp").include(request, response);
            }
            out.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
            PrintWriter out;
            out = response.getWriter();
            out.print("Sorry, username error!");
                request.getRequestDispatcher("/login.jsp").include(request, response);
        }  
    } 

 //   @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//	throws IOException, ServletException{
//		doPost(request, response);		
//	}    

}
//import java.io.IOException;  
//import java.io.PrintWriter;  
//  
//import javax.servlet.ServletException;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//import javax.servlet.http.HttpSession;  
//public class LoginServlet extends HttpServlet {  
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
//                    throws ServletException, IOException {  
//        response.setContentType("text/html");  
//        PrintWriter out=response.getWriter();  
//        request.getRequestDispatcher("link.html").include(request, response);  
//          
//        String name=request.getParameter("name");  
//        String password=request.getParameter("password");  
//          
//        if(password.equals("admin123")){  
//        out.print("Welcome, "+name);  
//        HttpSession session=request.getSession();  
//        session.setAttribute("name",name);  
//        }  
//        else{  
//            out.print("Sorry, username or password error!");  
//            request.getRequestDispatcher("login.html").include(request, response);  
//        }  
//        out.close();  
//    }  
//}  