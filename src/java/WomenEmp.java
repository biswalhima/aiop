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
public class WomenEmp extends HttpServlet {

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
            
            HttpSession session=request.getSession(false);
            if(session!=null){
             out.print("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n" +
"\n" +
"<link\n" +
"    rel=\"stylesheet\"\n" +
"    href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"\n" +
"  />\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/\n" +
"libs/animate.css/3.7.2/animate.min.css\">\n" +
"\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>JSP Page</title>\n" +
"      <style>\n" +
"body{\n" +
" width:100%;height:100vh;\n" +
"    background-image:linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)),url('WomenEmp.jpg');\n" +
"    background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:sans-serif;\n" +
"} \n" +
"\n" +
"button {\n" +
"   background-color: #030804;\n" +
"    color: #ffffff;  padding: 10px 15px;\n" +
"    border-radius: 5px;    margin: 7px 0;\n" +
"   width: 50%;\n" +
"   font-size: 18px;\n" +
"}\n" +
"\n" +
"button:hover {\n" +
"    opacity: 0.6;\n" +
"    cursor: pointer;\n" +
"}\n" +
"\n" +
"\n" +
"\n" +".floating{\n" +
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
"</style> \n" +
"    \n" +
"    <body>\n" +" <a href=\"Chatbot.jsp\" class=\"floating1\">Chat bot</a>\n" +
"<a href=\"Women.jsp\" class=\"floating\">Women Live chat</a>"+
"<h1 align=center style=\"color:blueviolet;\" class=\"animated infinite heartBeat\">ALL IN ONE PORTAL</H1>\n" +
"<center><h1 style=\"color:black;\"><i class=\"fas fa-hand-fist\"></i>WOMEN EMEPOWERMENT</h1></center>\n" +
"<center><ul style=\"list-style-type:disc\">\n" +
"<li><h4>Women are the backbone of our society.they are the real man makers as they play a very important role in ones life right from the birth till once death.</h4></li>\n" +
"<li><h4>as mother she make her child to see this beautiful world,as a teacher or mentor she gives proper way towards life.</h4></li> \n" +
"<li><h4>The formation of SHGs has helped the members save a part of their income. It has increased its assets, income, and generated employment opportunities. There has been a significant shift in the use of loans for personal use to them being used for income generation.</h4></li>\n" +
"<li><h4>An SHG comprises a small group of women who come together to make regular monetary contributions. Emerging as important micro-finance systems, SHGs work as platforms that promote solidarity among women, bringing them together on issues of health, nutrition, gender parity and gender justice.</h4></li>\n" +
"<li><h4>They help to build social capital among the poor, especially women. Their most important function is to encourage the members to save their earning, persuade them to make a collective plan for generating additional income, and to act as a conduit for formal banking services to reach them.</h4></li></ul>\n" +
"\n" +
"<h3>&rarr;Online Registration of SHG:</h3>\n" +
"<br><center><a href=\"http://portal.pdsodisha.gov.in/Society/OnlineSHGRegistration.aspx\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">SHG registration </button></a>\n" +
"</center><br>\n" +
"<br>\n" +
"<h3>&rarr;SHG group and member details:</h3>\n" +
"<br><center><a href=\"https://nrlm.gov.in/BlockWiseSHGMemebrsAction.do?methodName=showShgMembers&encd=0\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">Check</button></a>\n" +
"</center><br>\n" +
"</center>\n" +
"\n" +
"    </body>\n" +
"</html>");   
            }
             else{  
            out.print("Please login first");  
            RequestDispatcher rd=request.getRequestDispatcher("/Login.jsp");  
            rd.include(request, response);   
          
            }       
        }    
    }
}
