<%-- 
    Document   : AboutUs
    Created on : Mar 28, 2023, 10:28:58 PM
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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/
libs/animate.css/3.7.2/animate.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
 font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
 
 }

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: right;
  width: 20%;
  margin-bottom: 5px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 10px;
  text-align: center;
  background-color: #474e5d;
  color: white;
}

.container {
  padding: 0 6px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}



.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}


@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
</style>
</head>
<body>
<div><h1 align=center style="color:white;" class="animated infinite heartBeat">ABOUT US</H1>

   <p style="text-align:right;width:95%;">
   <a href="index.html"><i class="fas fa-home"></i><button>Welcome page</button></a>
<hr>
        
</p>
</div>

<div class="row">
  <div class="column">
    <div class="card">
      <img src="himu.jpg" alt="Jane" style="width:100% ">
      <div class="container">
        <h2>HIMANSHU BISWAL</h2>
        <p class="title">Bsc (c.s)<br>roll no:5503U20026</p>
       <p>
        <a href="mailto:himanshubiswal2003@gmail.com"><button class="button">contact</button></a></P>
     
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="amar.jpg" style="width:100%">
      <div class="container">
        <h2>AMARENDRA SAHOO</h2>
<p class="title">Bsc (c.s)<br>roll no:5503U20005</p>
         <p>
        <a href="mailto:himanshubiswal2003@gmail.com"><button class="button">contact</button></a></P>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="D:\New folder\log.png" alt="John" style="width:100%">
      <div class="container">
        <h2>DEBIPRASAD SAHOO</h2>
        <p class="title">Bsc (c.s)<br>roll no:5503U20017</p>
        <p>
        <a href="mailto:himanshubiswal2003@gmail.com"><button class="button">contact</button></a></P>
      </div>
    </div>
  </div>

<div class="column">
    <div class="card">
      <img src="dibya.jpg" alt="Mike" style="width:100%">
      <div class="container">
        <h2>DIBYAJYOTI SETHEE</h2>
<p class="title">Bsc (c.s)<br>roll no:5503U20020</p>
        <p>
        <a href="mailto:himanshubiswal2003@gmail.com"><button class="button">contact</button></a></P>
      </div>
    </div>
  </div>

<div class="column">
    <div class="card">
      <img src="dipti.jpg"  style="width:100%">
      <div class="container">
        <h2>DIPTIMAYEE JENA</h2>
      <p class="title">Bsc (c.s)<br>roll no:5503U20023</p>
        <p>
        <a href="mailto:himanshubiswal2003@gmail.com"><button class="button">contact</button></a></P>
      </div>
    </div>
  </div>

  

</div>

</body>
</html>
