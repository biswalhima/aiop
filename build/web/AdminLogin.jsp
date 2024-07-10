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

    </style>
</head>
<body>
    
    <br><!-- comment -->
    <br>
<h1 align=center style="color:black;" class="animated infinite heartBeat">ALL IN ONE PORTAL</h1>
    <form action="AdminLogin" method="post">
        <h1 style="color:pink;" class="animate_animated animate_flipInX">WELCOME ADMIN</H1>
            <p style="color:white"><center>Sign in with your username and password</center></p>
      
            <label for="username">Your username</label>
            <center> <input type="text" placeholder="Enter Username" name="name" required></center>


           <br>

            
            <label for="pswrd">Your password</label>
            <center><input type="password" placeholder="Enter Password" name="password" required>
        
            <center>  <button type="submit" style="background-color:green;">Login</button></center></form>
    
    </body>
</html>