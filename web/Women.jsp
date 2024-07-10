<%-- 
    Document   : helpJsp
    Created on : Mar 13, 2023, 8:43:36 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style media="screen" type="text/css">
            .chat{
                top: 20%;
                position: relative;
                text-align:left;
                margin:auto;
                padding:10px;
                background-color:rgba(255, 255, 255, 0.596);
                font-family:candara; 
                width: 50%;
                font-size: 25px;
                height: 400px;
                border: 2px solid crimson;
                overflow-y: scroll;
            .chat1{ 
/*                top: 40px;
                position: absolute;*/
                text-align:left;
                margin:auto;
                padding:10px;
                background-color:transparent;
                font-family:candara; 
                width: 80%;
                height: 400px;
                border: 2px solid crimson;
                overflow-y: scroll;
                z-index: 99; 
                }

            }
            body{  
                font-family:sans-serif; 
                width:100%;height:100vh;
                background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('Women1.jpg');
                background-repeat:no-repeat;
                background-size:cover;
                background-position:center;

            }  
            input[type=text]
            {
                border:2px solid springgreen;
                width:40%;
                padding:15px;

            }
            button{
                padding:15px;
                border:2px solid crimson;
                background-color:springgreen;
            }
        </style>
        </head>
        <script type="text/javascript">
    var wsUrl;
    var msg;
    if(window.location.protocol === 'http:')
    {
        wsUrl='ws://';
    }
    else
    {
        wsUrl='wss://';
    }
    var ws=new WebSocket(wsUrl+window.location.host+"/All_In_One_Portal/chat");
    var a=1;
    ws.onmessage = function(event)
    {
        var mySpan=document.getElementById("chat");
        mySpan.innerHTML+=event.data+"<br/>";
//        mySpan.style.textAlign = "right";
        a=1;
        document.getElementById("msg").value="";
    };

    ws.onerror = function(event)
    {
        console.log("Error",event);
    };
    function sendMsg()
    {
        if(a===1)
        {
        msg = document.getElementById("msg").value;
        if(msg)
        {
            ws.send(msg);
            var mySpan2=document.getElementById("chat");
            mySpan2.innerHTML+="<p align='right'>"+msg+"</p><br/>";
//            mySpan2.style.textAlign = "left";
            a=0;
        }
        document.getElementById("msg").value="";
    }
    else
        document.getElementById("msg").value="Wait for server message";
    }
</script>
    
    <body>
    <CENTER><h1 align=center style="color:black;">ALL IN ONE PORTAL</h1></CENTER>
       <div>
        <div id="chat" class="chat">Hii, How can we help you?</div></div><br>
        <div>
       <center> <input type="text" name="msg" id="msg" placeholder="Type your message" required>
        <button onclick="return sendMsg();">Send</button>
        </center>
        </div>
    </body>
</html>

