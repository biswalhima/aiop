<%-- 
    Document   : Log in
    Created on : Mar 24, 2023, 11:31:50 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />

<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/
libs/animate.css/3.7.2/animate.min.css">
    <style>
body{
 width:100%;height:100vh;
    background-image:linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)),url('31.png');
    background-repeat:no-repeat;
    background-size:cover;
    background-position:center;
    font-family:sans-serif;
}
h1{
    text-align: center;
}


form{
    width:35rem;
    margin: auto;
    color:whitesmoke;
    backdrop-filter: blur(16px) saturate(180%);
    -webkit-backdrop-filter: blur(16px) saturate(180%);
    background-color: rgba(11, 15, 13, 0.582);
    border-radius: 12px;
    border: 1px solid rgba(255, 255, 255, 0.125);
    padding: 20px 25px;
}

input[type=text], input[type=password]{
    width: 80%;
    margin: 10px 0;
    border-radius: 5px;
    padding: 15px 18px;
    box-sizing: border-box;
  }
button {
   background-color: #030804;
    color: #ffffff;  padding: 10px 15px;
    border-radius: 5px;    margin: 7px 0;
   width: 50%;
   font-size: 18px;
}

button:hover {
    opacity: 0.6;
    cursor: pointer;
}
.floating{
  background:rgb(240, 10, 163);
  color:#ffffff;
  position:fixed;
  z-index: 999;
  top: 90%;
  right: 50px;
  padding: 12px 30px;
  border-radius: 4px;
outline: none;
text-transform: uppercase;
font-size: 13px;
font-weight: 500;
text-decoration: none;
letter-spacing: 1px; transition:all .5s ease;
  }
   .floating:hover{
  background:blue;
  color:rgb(255, 0, 149);
  }
  .floating1{
  background:rgb(0, 169, 247);
  color:#ffffff;
  position:absolute;
  z-index: 999;
  top: 80%;
  right: 50px;
   padding: 12px 30px;
  border-radius: 4px;
outline: none;
text-transform: uppercase;
font-size: 13px;
font-weight: 500;
text-decoration: none;
letter-spacing: 1px; transition:all .5s ease;
  }
  .floating1:hover{
    background:rgb(250, 250, 250);
    color:rgb(0, 153, 255);
    }
    </style>
</head>
<body>
    
    <a href="Chatbot.jsp" class="floating1">Chat bot</a>
<a href="Women.jsp" class="floating">Women Live chat</a>
    <br><!-- comment -->
    <br>
<h1 align=center style="color:black;" class="animated infinite heartBeat">ALL IN ONE PORTAL</h1>
    <form action="LogInServlet" method="post">
        <h1 style="color:pink;" class="animate_animated animate_flipInX">WELCOME</H1>
            <p style="color:white"><center>Sign in with your username and password</center></p>
      
            <label for="username">Your username</label>
           <center> <input type="text" placeholder="Enter Username" name="name" required><button style="width:10%;" onclick="document.getElementById('player').play()"> <i class="fas fa-music"></i></button></center>
<audio id="player" src="user name.mp3"></audio>


           <br><br>

            
            <label for="pswrd">Your password</label><br>
            <center><input type="password" placeholder="Enter Password" name="password" required><button style="width:10%;" onclick="document.getElementById('player1').play()"> <i class="fas fa-music"></i></button> </center>
            <audio id="player1" src="password.mp3"></audio>
        
            <center>  <button type="submit" style="background-color:green;">Login</button></center></form>
    
<center><a href="Registration.jsp" target="newuser"><button type="submit" style="width:200px;height:50px">new user</button> </a></center>
<center> <a href="index.html" style="color:blue;" target="home"><h3>goback to the home page<h3></a></center>
    </body>
</html>