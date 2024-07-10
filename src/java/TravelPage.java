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
public class TravelPage extends HttpServlet {

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
"\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\">\n" +
"<style>\n" +
"*\n" +
" {  \n" +
"    padding:0;margin=0;box sizing:border-box;\n" +
" }\n" +
"  body\n" +
"{\n" +
"   \n" +
"    width:100%;height:100vh;\n" +
"   background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('Travel.jpg');\n" +
"    background-repeat:repeat;\n" +
"    background-size:cover;\n" +
"    background-position:center;\n" +
"    font-family:sans-serif;\n" +
"}\n" +
"  .menu-bar\n" +
"{ \n" +
"  background: none;\n" +
"  text-align:center;\n" +
"}\n" +
" .menu-bar ul\n" +
"{\n" +
"  display:inline-flex;\n" +
"list-type:none;\n" +
"color:white;\n" +
"}\n" +
" .menu-bar ul li\n" +
"{  \n" +
"  width:100px;margin:60px;padding:5px;\n" +
"}\n" +
" .menu-bar ul li a\n" +
"{\n" +
"  text-decoration:bold;\n" +
"  color:black;\n" +
"}\n" +
".active, .menu-bar ul li:hover\n" +
"{\n" +
"  background:g;border-radius:2%;\n" +
" }\n" +
"  .menu-bar .fa\n" +
"{\n" +
"   margin-right:15px;\n" +
"}\n" +
".sub-menu-1\n" +
"{\n" +
"display:none;\n" +
" }\n" +
" .menu-bar ul li:hover .sub-menu-1\n" +
"{\n" +
"  display:block;\n" +
"  position:absolute;\n" +
"  background:thistle;\n" +
"  margin-top:15px;margin-left:-15px;\n" +
"}\n" +
".menu-bar ul li:hover .sub-menu-1 ul\n" +
"{\n" +
" display:block;\n" +
" margin:5px;\n" +
"}\n" +
".menu-bar ul li:hover .sub-menu-1 ul li\n" +
"{\n" +
" width:60px;padding:10px;border-bottom:1px dotted black;\n" +
"background:transparent;border-radius:5;text-align:left;\n" +
"}\n" +
".menu-bar ul li:hover .sub-menu-1 ul li:last-child\n" +
"{\n" +
"border-bottom:bullet;\n" +
"}\n" +
".menu-bar ul li:hover .sub-menu-1 ul li:hover\n" +
"{\n" +
" color:blue;\n" +
"}\n" +
".fa-angle-right\n" +
"{\n" +
" float:right;\n" +
"}\n" +
".sub-menu-2\n" +
"{\n" +
" display:none;\n" +
"}\n" +
".hover-me:hover .sub-menu-2\n" +
"{\n" +
" position:absolute;display:block;margin-top:-40px;margin-left:140px;\n" +
"background:rgb(0,100,0);}\n" +
"h3{\n" +
"background-color:black;\n" +
"color:aqua;\n" +
"\n" +
"\n" +
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
"</head>\n" +
"<body>\n" +" <a href=\"Chatbot.jsp\" class=\"floating1\">Chat bot</a>\n" +
"<a href=\"Women.jsp\" class=\"floating\">Women Live chat</a>"+
"<div><h1 align=center style=\"color:crimson;\" class=\"animated infinite heartBeat\">ALL IN ONE PORTAL</H1>\n" +
"\n" +
"</div>\n" +
"<center><h1 style=\"color:black;text-align:center;\" class=\"animate_animated animate_bounce\">TRAVELS</h1></center><hr>\n" +
"\n" +
"\n" +
"        <div class=\"menu-bar\"> \n" +
"<ul>\n" +
"\n" +
"<li><a href=\"#\"><i class=\"fa-sharp fa-solid fa-hotel\"></i><h3>HOTELS</h3>\n" +
"   <div class=\"sub-menu-1\">\n" +
"   <ul>\n" +
"      <li><a href=\"https://www.goibibo.com/hotels/\">Goibibo</li>\n" +
"      <li><a href=\"https://www.oyorooms.com/\">OYO</li>\n" +
"      <li><a href=\"https://www.makemytrip.com/hotels/hotel-listing/?checkin=date_15&checkout=date_18&city=CTLONDO&country=GBR&filterData=MERGE_PROPERTY_TYPE%7CHotel&locusId=CTLONDO&locusType=city&reference=hotel&roomStayQualifier=2e0e&searchText=London&type=city&cmp=SEM|D|IH|G|Destination|IH_City_CTLONDO_London_Exact|Hotels|RSA|Regular&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY2ISr7M0bS-JxZdHmBOzRd_lLrhRsjpPidCGLttOfnydKP6_upBqbsaAh49EALw_wcB\">Makemytrip</li>\n" +
"      <li><a href=\"https://www.yatra.com/hotels\">yatra</li>\n" +
" <li><a href=\"https://www.hrs.com/web\">Hrs</li>\n" +
" </ul>\n" +
"\n" +
"\n" +
"   </div>\n" +
"\n" +
"\n" +
"</li>\n" +
"\n" +
"<li><a href=\"#\"><i class=\"fa-sharp fa-solid fa-bus\"></i><h3>BUS</h3>\n" +
"\n" +
"   <div class=\"sub-menu-1\">\n" +
"   <ul>\n" +
"      <li><a href=\"https://www.redbus.in/online-booking/tsrtc?gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY17upg9iI2Y-Ep9JKZP7beL0ph_sANneXzQRZlc2ZlkhyiNq6OHMtoaAmltEALw_wcB\">Redbus</li>\n" +
"      <li><a href=\"https://www.makemytrip.com/bus-tickets/?gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY3DCqFD3rWmfYO1W1T5fujvg_-psFtzKOX0CXg_jVlZTrZdOceYWbwaAsPeEALw_wcB&cmp=SEM|D|Bus|G|Brand|Bus_Brand_Exact|Brand_Exact|ETA|Regular|508489083508&s_kwcid=AL!1631!3!508489083508!e!!g!!makemytrip%20bus&ef_id=Cj0KCQjw2v-gBhC1ARIsAOQdKY3DCqFD3rWmfYO1W1T5fujvg_-psFtzKOX0CXg_jVlZTrZdOceYWbwaAsPeEALw_wcB:G:s\">Makemytrip</li>\n" +
"      <li><a href=\"https://www.odbus.in/\">ODbus</li>\n" +
"     <li><a href=\"https://www.abhibus.com/operator/1320/OSRTC?utm_source=google&utm_medium=cpc&campaignname=OSRTC&adgroupname=&keyword=osrtc&term={term}&creative=624819100318&devicemodel=&target=&device=c&network=g&matchtype=b&placement=&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY2iC1Ho06K0ZUwx3UBIkztxTbj4xBY6u4gRsvMYVsMQaRbzIQtdsLkaAp3FEALw_wcB&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY2iC1Ho06K0ZUwx3UBIkztxTbj4xBY6u4gRsvMYVsMQaRbzIQtdsLkaAp3FEALw_wcB\">OSRTC</li>\n" +
" </ul>\n" +
"\n" +
"\n" +
"   </div>\n" +
"\n" +
"\n" +
"</li>\n" +
"      \n" +
"<li><a href=\"#\"><i class=\"fa-sharp fa-solid fa-train\"></i><h3>TRAIN</h3>\n" +
"<div class=\"sub-menu-1\">\n" +
"   <ul>\n" +
"      <li><a href=\"https://www.irctc.co.in/nget/train-search\">IRCTC</li>\n" +
"      <li><a href=\"https://www.ixigo.com/trains\">ixigo</li>\n" +
"      <li><a href=\"https://www.confirmtkt.com/\">Confirmtkt</li>\n" +
"      <li><a href=\"https://trains.wego.com/\">Wego</li>\n" +
" </ul>\n" +
"\n" +
"\n" +
"   </div>\n" +
"\n" +
"\n" +
"</li>\n" +
"<br>\n" +
"<li><a href=\"#\"><i class=\"fa-sharp fa-solid fa-plane-up\"></i></i><h3>FLIGHT</h3>\n" +
"<div class=\"sub-menu-1\">\n" +
"   <ul>\n" +
"      <li><a href=\"https://www.makemytrip.com/flights/?gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY0wNTbGp2OCW8D1-aCvvlfERWVj6vo7kRFBji8-1EPBLpjyP86usAoaAs3fEALw_wcB&cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Flight_Exact|RSA|544716708174&s_kwcid=AL!1631!3!544716708174!e!!g!!makemytrip%20flight&ef_id=Cj0KCQjw2v-gBhC1ARIsAOQdKY0wNTbGp2OCW8D1-aCvvlfERWVj6vo7kRFBji8-1EPBLpjyP86usAoaAs3fEALw_wcB:G:s\">Makemytrip</li>\n" +
"      <li><a href=\"https://www.airasia.co.in/home?&keyword_source=Bt_AirAsia_Search_Brand&utm_medium=bt_cpc&utm_campaign=Bt_AirAsia_Search_Brand&utm_term=Airasia&utm_content=127496314554&utm_device=c&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY1aotV3huQCDuex0Ebrev7sPaj9Js0DR3CFdso3JTS1TcFqLCy1hFwaAnITEALw_wcB&gclsrc=aw.ds\">AirAsia</li>\n" +
"      <li><a href=\"https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw2v-gBhC1ARIsAOQdKY1fSawEgOnvKv_pspHV6A4lAfsaIPYV7FbUv7X4CLRx57ALNeqf0UkaAjTeEALw_wcB&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY1fSawEgOnvKv_pspHV6A4lAfsaIPYV7FbUv7X4CLRx57ALNeqf0UkaAjTeEALw_wcB\">Cleartrip</li>\n" +
"      <li><a href=\"https://www.goindigo.in/?cid=PERFMAX|P|Codeshare&gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY3-3LtYWVlGv2KeUJDRP4sqjldEdTWpI2N1CinZ0BGCpPtW43hRo-4aAtuDEALw_wcB\">Goindigo</li>\n" +
"<li><a href=\"https://www.airvistara.com/in/en/flight-booking?gclid=Cj0KCQjw2v-gBhC1ARIsAOQdKY3HeMYgQYtRmN7AEscCLEOxxTtKvPlF5Hjh8OnvIeagAUxwP94ZgMUaAv9IEALw_wcB&utm_source=Google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=Cj0KCQjw2v-gBhC1ARIsAOQdKY3HeMYgQYtRmN7AEscCLEOxxTtKvPlF5Hjh8OnvIeagAUxwP94ZgMUaAv9IEALw_wcB:G:s&s_kwcid=AL!596!3!636601358040!p!!g!!vistara&s_kwcid=AL!596!3!636601358040!p!!g!!vistara\">Vistara</li>\n" +
" </ul>\n" +
"\n" +
"\n" +
"   </div>\n" +
"\n" +
"\n" +
"</li>\n" +
"\n" +
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
