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
public class Job extends HttpServlet {

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
"<head>\n" +
"\n" +
"\n" +
"<title>icons</title>\n" +
"\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n" +
"\n" +
"<link\n" +
"    rel=\"stylesheet\"\n" +
"    href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"\n" +
"  />\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/\n" +
"libs/animate.css/3.7.2/animate.min.css\">\n" +
"<style>\n" +
"header{\n" +
" width:100%;height:100vh;\n" +
"    background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('Job.jpg');\n" +
"    background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:sans-serif;\n" +
"}\n" +
"h4{\n" +
"color:white;\n" +
"background-color:black;\n" +
"width:40%;\n" +
"}\n" +
".grid-container {\n" +
"  display: grid;\n" +
"  grid-template-columns: auto auto auto;\n" +
"  background-color: #2196F3;\n" +
"  padding: 10px;\n" +
"}\n" +
".grid-item {\n" +
"  background-color: rgba(255, 255, 255, 0.8);\n" +
"  border: 1px solid rgba(0, 0, 0, 0.8);\n" +
"  padding: 20px;\n" +
"  font-size: 30px;\n" +
"  text-align: center;\n" +
"}\n" + ".floating{\n" +
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
"</head>\n" +
"<body\n" + 
"\n" +
"background=\"Job.jpg\"\n" +
"style=\" background-repeat:no-repeat;\n" +
"    background-size:cover;\n" +
"\n" +
"    background-position:center;\">\n" +" <a href=\"Chatbot.jsp\" class=\"floating1\">Chat bot</a>\n" +
"<a href=\"Women.jsp\" class=\"floating\">Women Live chat</a>"+
"<div><h1 align=center style=\"color:royalblue;\" class=\"animated infinite heartBeat\">ALL IN ONE PORTAL</H1>\n" +
"\n" +
"\n" +
"</p>\n" +
"</div>\n" +
"<h3 style=\"color:deeppink;background-color:black; text-align:center;\" class=\"animate_animated animate_bounce\">NEW UPDATES</h3>\n" +
"<div class=\"grid-container\">\n" +
"  <div class=\"grid-item\" style=\"background-color:coral;\"><a href=\"https://cdn.digialm.com/EForms/configuredHtml/1258/81498/Registration.html\">OAVS TGT apply online</a></div>\n" +
"  <div class=\"grid-item\" style=\"background-color:tomato;\"><a href=\"https://ssc.nic.in/\">SSC apply online</a></div>\n" +
"  <div class=\"grid-item\" style=\"background-color:coral;\"><a href=\"https://www.calicut.nielit.in/nic23/NICApplication.aspx\">NIC apply online</a></div>  \n" +
"  <div class=\"grid-item\" style=\"background-color:tomato;\"><a href=\"https://examinationservices.nic.in/ExamSys23/Registration/Instruction.aspx\">UGC NET Apply Online</a></div>\n" +
"  <div class=\"grid-item\" style=\"background-color:coral;\"><a href=\"https://www.osssc.gov.in/Public/Pages/Instruction_For_Candidate.aspx?u=n\">OSSSC Exicutive Apply Online</a></div>\n" +
"  <div class=\"grid-item\" style=\"background-color:tomato;\"><a href=\"https://agnipathvayu.cdac.in/avreg/candidate/login\">Air Force Apply Online</a></div>  \n" +
"  \n" +
"</div>\n" +
"\n" +
"<h3 style=\"color:deeppink;background-color:black; text-align:center;\" class=\"animate_animated animate_bounce\">JOB NOTIFICATIONS FOR ONLINE APPLY</h3>\n" +
"<hr>\n" +
"<center><h4>&rarr; SSC Selection Posts XI Apply Online: </h4></center>\n" +
"<center><a href=\"https://ssc.nic.in/\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\"> SSC apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr; NIC Officer Apply Online: </h4></center>\n" +
"<center><a href=\"https://www.calicut.nielit.in/nic23/NICApplication.aspx\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">NIC officer apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr; UGC NET Apply Online: </h4></center>\n" +
"<center><a href=\"https://examinationservices.nic.in/ExamSys23/Registration/Instruction.aspx\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">UGC NET apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr; Air Force Agniveer Apply Online: </h4></center>\n" +
"<center><a href=\"https://agnipathvayu.cdac.in/avreg/candidate/login\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">Air Force apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr; BSF Constable Apply Online: </h4></center>\n" +
"<center><a href=\"https://rectt.bsf.gov.in/registration/basic-details?guid=40916004-a5e2-11ed-909d-0264d54d41fa\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">BSF Constable apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr;OSSSC Exicutive Apply Online: </h4></center>\n" +
"<center><a href=\"https://www.osssc.gov.in/Public/Pages/Instruction_For_Candidate.aspx?u=n\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">OSSSC apply </button></a>\n" +
"</center><br>\n" +
"\n" +
"<center><h4>&rarr;OAVS TGT Apply Online: </h4></center>\n" +
"<center><a href=\"https://cdn.digialm.com/EForms/configuredHtml/1258/81498/Registration.html\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">OAVS apply </button></a>\n" +
"</center><br>\n" +
"<br>\n" +
"\n" +
"<center><h4>&rarr;NEET UG: </h4></center>\n" +
"<center><a href=\"https://examinationservices.nic.in/neet2023/root/home.aspx?enc=Ei4cajBkK1gZSfgr53ImFcFR+natXIEjJ1rCf6DMgOrFA4SfAMU1biZWfro5QnPt\"><button  style=\"background-color:mediumseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">NEET UG apply </button></a>\n" +
"</center><br>\n" +
"<br>\n" +
"<hr>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"</body>\n" +
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
