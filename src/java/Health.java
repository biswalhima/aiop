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
public class Health extends HttpServlet {

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
"<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"    <title>E- government</title>\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"sf.css\">\n" +
"    <!-- Font Awesome CDN -->\n" +
"    <link\n" +
"      rel=\"stylesheet\"\n" +
"      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\n" +
"    />\n" +
"  \n" +
"    <link\n" +
"      href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap\"\n" +
"      rel=\"stylesheet\"\n" +
"    />\n" +
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
"body {\n" +
"    background: linear-gradient(to right, #ffd700,#ffe4c4);\n" +
"}\n" +
"* {\n" +
"  padding: 0;\n" +
"  margin: 0;\n" +
"  box-sizing: border-box;\n" +
"  font-family: \"Poppins\", sans-serif;\n" +
"}\n" +
".row {\n" +
"  display: flex;\n" +
"  flex-wrap: wrap;\n" +
"}\n" +
".row h1 {\n" +
"  width: 100%;\n" +
"  text-align: center;\n" +
"  font-size: 3.75em;\n" +
"  margin: 0.6em 0;\n" +
"  font-weight: 600;\n" +
"  color: #070024;\n" +
"}\n" +
".column {\n" +
"  padding: 1em;\n" +
"}\n" +
".card {\n" +
"  padding: 3.1em 1.25em;\n" +
"  text-align: center;\n" +
"  background: linear-gradient(0deg, #fffacd 10px, transparent 10px);\n" +
"  background-repeat: no-repeat;\n" +
"  background-position: 0 0.62em;\n" +
"  box-shadow: 0 0 2.5em rgba(0, 0, 0, 0.15);\n" +
"  border-radius: 0.5em;\n" +
"  transition: 0.5s;\n" +
"  cursor: pointer;\n" +
"}\n" +
".card .icon {\n" +
"  font-size: 2.5em;\n" +
"  height: 2em;\n" +
"  width: 2em;\n" +
"  margin: auto;\n" +
"  background-color:deeppink;\n" +
"  display: grid;\n" +
"  place-items: center;\n" +
"  border-radius: 50%;\n" +
"  color: white;\n" +
"}\n" +
".icon:before {\n" +
"  position: absolute;\n" +
"  content: \"\";\n" +
"  height: 1.5em;\n" +
"  width: 1.5em;\n" +
"  border: 0.12em solid springgreen;\n" +
"  border-radius: 50%;\n" +
"  transition: 0.5s;\n" +
"}\n" +
"\n" +
".card p {\n" +
"  line-height: 2em;\n" +
"  color: slateblue;\n" +
"}\n" +
".card:hover {\n" +
"  background-position: 0;\n" +
"}\n" +
".card:hover .icon:before {\n" +
"  height: 2.25em;\n" +
"  width: 2.25em;\n" +
"}\n" +
"@media screen and (min-width: 768px) {\n" +
"  section {\n" +
"    padding: 1em 7em;\n" +
"  }\n" +
"}\n" +
"@media screen and (min-width: 992px) {\n" +
"  section {\n" +
"    padding: 1em;\n" +
"  }\n" +
"  .card {\n" +
"    padding: 5em 2em;\n" +
"  }\n" +
"  .column {\n" +
"    flex: 0 0 33.33%;\n" +
"    max-width: 33.33%;\n" +
"    padding: 0 1em;\n" +
"  }\n" +
"}\n" +".floating{\n" +
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
"  </head>\n" +
"  <body>\n" +" <a href=\"Chatbot.jsp\" class=\"floating1\">Chat bot</a>\n" +
"<a href=\"Women.jsp\" class=\"floating\">Women Live chat</a>"+
"<h1 align=center style=\"color:indianred;\" class=\"animated infinite heartBeat\">ALL IN ONE PORTAL</H1>\n" +
"\n" +
"    <section>\n" +
"    <div class=\"row\">\n" +
"      <h1 style=\"color:blue;\"><i class=\"fa-sharp fa-regular fa-hospital\"></i>HEALTH CARE<i class=\"fa-sharp fa-solid fa-hospital\"></i></h1>\n" +
"      </div>\n" +
"\n" +
"<center><h3>YOU CAN REGISTER AND GET AN APPOINTMENT ONLINE FOR HOSPITALS</h3></center><br>\n" +
"\n" +
"<div class=\"row\">\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"      <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://ors.gov.in/copp/MobV?%3Ccsrf:tokenname/%3E=%3Ccsrf:tokenvalue/%3E\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">AIIMS </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"          <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://eswasthya.odisha.gov.in/HISCitizenServices/HISPreregistration_onlineAppointment/PreRegistrationNewServlet\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">CAPITAL HOSPITAL(UNIT-6) </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"        <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://eswasthya.odisha.gov.in/HISCitizenServices/HISPreregistration_onlineAppointment/PreRegistrationNewServlet\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">SCB hospital </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"        <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://www.apollohospitals.com/bhubaneswarapolloconsultleads/?utm_source=paid&utm_medium=cpc&utm_campaign=12266711939&utm_adgroup=116963404946&utm_match_type=p&network=g&ad=650208567505&utm_device=c&utm_keyword=apollo%20hospital&utm_gclid=CjwKCAjw_YShBhAiEiwAMomsEMcjpWtycfi2FFazbu1ZF396fLJ6TsfoJswopMFv7YROeqo2n2fRsxoCy1IQAvD_BwE&gclid=CjwKCAjw_YShBhAiEiwAMomsEMcjpWtycfi2FFazbu1ZF396fLJ6TsfoJswopMFv7YROeqo2n2fRsxoCy1IQAvD_BwE\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">APOLLO </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"        <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"http://136.232.105.154/doctorappt/\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">SUM ULTIMATE</button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"        <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://www.amrihospitals.in/book-appointment\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">AMRI hospital </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"<div class=\"column\">\n" +
"          <div class=\"card\">\n" +
"            <div class=\"icon\">\n" +
"              <i class=\"fa-sharp fa-regular fa-hospital\"></i>\n" +
"            </div>\n" +
"                            <br>\n" +
"        <p>\n" +
"  click here to book your appointment\n" +
"<center><p>&#8681;</p></center>\n" +
"            </p>\n" +
"                       <a href=\"https://appointment.carehospitals.com/\"><button  style=\"background-color:lightseagreen; color:white; width:50%;padding:10px; font-style:italic; border-radius:12px;\">CARE hospital </button></a>\n" +
"         \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"\n" +
"      </div>\n" +
"    </section>\n" +
"  </body>\n" +
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
