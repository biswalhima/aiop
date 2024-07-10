import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
@ServerEndpoint("/Chat1")
public class ChatBot {

    String str="";
@OnOpen
    public void onOpen(Session curSession)
    {
        //userSessions.add(curSession);
    }
    
    @OnClose
    public void onClose(Session curSession)
    {
        //userSessions.remove(curSession);
        //str="stop";
    }
    
    @OnMessage
    public void onMessage(String message, Session userSession) throws IOException, Exception
    {
        //for(Session ses : userSessions)
       // {
        Mydb db=new Mydb();
            Connection con=db.getCon();
            Statement stmt=con.createStatement();
            //stmt.execute("insert into User(first,middle,last,gender,phone,address,pass)values('Swaraj','','Pattanaik','male','9090178286','Bhubaneswar','12345')");
             
            
        //userSession.getAsyncRemote().sendText("msgh");  
        char ch=message.charAt(0);
        switch(ch)
        {
            case '1':
                userSession.getAsyncRemote().sendText("Now clarify more about this...<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Forget password\" data-choice=\"A\">Password</a>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Forget Username\" data-choice=\"B\">Username</a>");
                break;
            case '2':
                userSession.getAsyncRemote().sendText("Now clarify more about this...<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Blank page\" data-choice=\"C\">Blank page</a>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"wrong credentials\" data-choice=\"D\">wrong credentials</a>");
                break;
            case '3':
                userSession.getAsyncRemote().sendText("Now clarify more about this...<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Content not found\" data-choice=\"E\">Not found</a>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Need agent ssistance\" data-choice=\"F\">Assistance</a>");
                break;
            case 'A':
                userSession.getAsyncRemote().sendText("We will send your password to your phone number...<br>Write your mobile no. in complaint...<br>choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="Forget password";
                break;
            case 'B':
                userSession.getAsyncRemote().sendText("We will send your Username to your phone number...<br>Write your mobile no. in complaint...<br>choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="Forget Username";
                break;
            case 'C':
                userSession.getAsyncRemote().sendText("Username already exists...<br>Coose a different one...<br>If not satisfisfied choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="User name exists";
                break;
            case 'D':
                userSession.getAsyncRemote().sendText("We will delete the existing data...<br>write old username or phone no. in complaint and Register again with right informations...<br>choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="Delete false data";
                break;
            case 'E':
                userSession.getAsyncRemote().sendText("We are adding new features soon...<br>Write your needed content by complaint...<br>choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="Content add request";
                break;
            case 'F':
                userSession.getAsyncRemote().sendText("Our agent will call you soon...<br>Write your mobile no. in complaint...<br>choose:<br>"
                        + "<a onclick=\"Choose(this)\" class=\"choice\" data-some-name=\"Chose complaint\" data-choice=\"S\">Complaint</a>");
                str="Agent assistance";
                break;
            case 'S':
                userSession.getAsyncRemote().sendText("Write your complain...<br>");
                break;
            case 'Z':
                userSession.getAsyncRemote().sendText("Thank you...<br>");
                stmt.execute("insert into cmp(Complaint)values('"+str+"---"+message+"')");
        }
        
        
        
      
        
      
        
        //}
    }
}