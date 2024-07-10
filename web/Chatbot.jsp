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
            .choice{
                background-color: rgb(145, 219, 241);
                border: solid 1px rgb(0, 102, 255);
                border-radius: 15px;
                margin: 4px;
                padding: 2px 6px;
                display: inline-block;
                cursor: pointer;

            }
            .chat{
                top: 20%;
                position: relative;
                float:left;
                text-align:left;
                margin:auto;
                padding:10px;
                background-color:rgba(255, 255, 255, 0.596);
                font-family:candara; 
                width: 50%;
                left: 4%;
                font-size: 25px;
                height: 400px;
                border: 2px solid crimson;
                overflow-y: scroll;
                

            }
            body{  
                font-family:sans-serif; 
                width:100%;height:100vh;
                background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)),url('Chatbot.jpg');
                background-repeat:no-repeat;
                background-size:cover;
                background-position:center;

            }  
            input[type=text]
            {
                border:2px solid springgreen;
                width:44%;
                padding:15px;
                left:5%;
                top:85%;
                position: absolute;

            }
            button{
                padding:15px;
                border:2px solid crimson;
                background-color:springgreen;
                top:85%;
                position: absolute;
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
    var ws=new WebSocket(wsUrl+window.location.host+"/All_In_One_Portal/Chat1");
    var a=0;
    ws.onmessage = function(event)
    {
        var mySpan=document.getElementById("chat");
        mySpan.innerHTML+=event.data+"<br/>";
//        mySpan.style.textAlign = "right";
        var ch=event.data;
        if(ch.charAt(1)==='r')
        a=1;
        document.getElementById("msg").value="";
        mySpan.scrollTop = mySpan.scrollHeight;
    };

    ws.onerror = function(event)
    {
        console.log("Error",event);
    };
    function sendMsg()
    {
        var mySpan2=document.getElementById("chat");
        if(a===1)
        {
        msg = document.getElementById("msg").value;
        if(msg)
        {
            ws.send("Zcmp-"+msg);
            
            mySpan2.innerHTML+="<p align='right'>"+msg+"</p><br/>";
//            mySpan2.style.textAlign = "left";
            a=0;
        }
        document.getElementById("msg").value="";
    }
    else
        document.getElementById("msg").value="Choose from the choices";
    mySpan2.scrollTop = mySpan2.scrollHeight;
    }
    function Choose(el)
    {
        
        var choice=el.dataset.someName;
        var deliver=el.dataset.choice;
        ws.send(deliver);
            var mySpan2=document.getElementById("chat");
            mySpan2.innerHTML+="<p align='right'>"+choice+"</p><br/>";
            mySpan2.scrollTop = mySpan2.scrollHeight;
    }
</script>
    
    <body align='left'>
   <h1 align=center style="color:black;">ALL IN ONE PORTAL</h1>
        <div>
            <div id="chat" class="chat">
                Hii, how may i help you?<br><br>
                In which matter you need my assistance?<br>
                Choose:<br>
                <a onclick="Choose(this)" class="choice" data-some-name="Login Problem" data-choice="1">Login</a>
                <a onclick="Choose(this)" class="choice" data-some-name="Registration Problem" data-choice="2">Registration</a>
                <a onclick="Choose(this)" class="choice" data-some-name="Browse Problem" data-choice="3">Browse</a>
            </div></div><br>
        <div>
           
       <input type="text" name="msg" id="msg" placeholder="Type your message" required>
        <button onclick="return sendMsg();">Send</button>
        
        </div>
        
    </body>
</html>