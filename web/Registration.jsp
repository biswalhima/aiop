<%-- 
    Document   : Registration
    Created on : Mar 25, 2023, 1:11:32 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />

<style>  
body{
 width:100%;height:100vh;
    background-image:linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)),url('31.png');
    background-repeat:no-repeat;
    background-size:cover;
    background-position:center;
    font-family:sans-serif;
} 

form{
    width:45rem;
    margin: auto;
    color:whitesmoke;
    backdrop-filter: blur(16px) saturate(180%);
    -webkit-backdrop-filter: blur(16px) saturate(180%);
    background-color: rgba(11, 15, 13, 0.582);
    border-radius: 12px;
    border: 1px solid rgba(255, 255, 255, 0.125);
    padding:80px 45px;
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
  position:fixed;
  z-index: 999;
  top: 85%;
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
<form action="Registration">  
  <div class="container">  
  <center>  <h1>  Registration Form</h1> </center>  
  <hr>  
  <label> Firstname: </label> <br>  
<center><input type="text" name="firstname" placeholder= "Firstname" name="name" required /> <button style="width:10%;" onclick="document.getElementById('player2').play()"> <i class="fas fa-music"></i></button> </center>
<audio id="player2" src="1st name.mp3"></audio> 


<label> Lastname: </label>   <br> 
<center><input type="text" name="lastname" placeholder="Lastname" size="15"required /> <button style="width:10%;" onclick="document.getElementById('player3').play()"> <i class="fas fa-music"></i></button> </center>
<audio id="player3" src="last name.mp3"></audio> 
 
 
 
  <br>
<lable>Gender:</lable><br>
   male: <input type="radio" name="Gender" id="male" value="male">
female:<input type="radio" name="Gender" id="female" value="female">
other:<input type="radio" name="Gender" id="other" value="other"></p>
<br>
<label>   
Phone no. :  
</label><br>     
<center><input type="text" name="phone" value="+91" placeholder="phone no." size="20" required> 
 <button style="width:10%;" onclick="document.getElementById('player').play()"> <i class="fas fa-music"></i></button> </center>
<audio id="player" src="phone no.mp3"></audio> 
 <br> 
Current Address :  <br><br>
<center><input type="text" name="address" value="" placeholder="address" size="20" required>  <button style="width:10%;" onclick="document.getElementById('player4').play()"> <i class="fas fa-music"></i></button> </center>
<audio id="player4" src="address.mp3"></audio>  <br>

    <label for="user"><b>Username:</b></label> <br> 
    <center><input type="text" placeholder="Enter username" name="user" required> <button style="width:10%;" onclick="document.getElementById('player5').play()"> <i class="fas fa-music"></i></button></center> 
    <audio id="player5" src="user name.mp3"></audio>
    <label for="psw"><b>Password:</b></label> <br> 
    <center><input type="password" placeholder="Enter Password" name="psw" required> <button style="width:10%;" onclick="document.getElementById('player6').play()"> <i class="fas fa-music"></i></button></center> 
  
  <br> <audio id="player6" src="password.mp3"></audio> 
  <label for="psw-repeat"><b>Re-type Password:</b></label> 
    <center><input type="password" placeholder="Retype Password" name="psw-repeat" required></center>  <br>
    
   <center> <button type="submit" class="registerbtn" style="background-color:green;">Register</button> <center>   
</form>  
    
</body>  
</html>
