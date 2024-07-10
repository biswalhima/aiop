/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/**
 *
 * @author Admin
 */
@ServerEndpoint("/chat")
public class WebSocket {
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
          
//        dout.writeUTF(message);    
        //userSession.getAsyncRemote().sendText("msgh");
        String str2="";   
        //str=br.readLine();  
        ClientSocket ob=new ClientSocket();
        Socket s=ob.Soc();
        DataInputStream din=new DataInputStream(s.getInputStream()); 
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        
        dout.writeUTF(message);  
        dout.flush();
        str2=din.readUTF();
        //for(int i=0;i<=3;i++)  
        userSession.getAsyncRemote().sendText(str2);
        
        //}
    }
}
