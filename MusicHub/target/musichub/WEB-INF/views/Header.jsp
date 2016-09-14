<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MUSICMANIA</title>
<link rel="stylesheet" type="text/css" href="style.css"/>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<h2 align="center">MUSICMANIA</h2>
<hr width='100' color='blue'/>
<!-- for navigation bar in bootstrap -->
<div class="container" id="main">
<div class="navbar navbar-fixed-top">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">MusicMania</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Home</a></li>
      <li><a href="About Us.jsp">About Us</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">All Products<span class="caret"></span></a>
      <ul class="dropdown-menu">
      <li><a href="#">Guitar</a></li>
      <li><a href="#">Classical</a></li>
      <li><a href="#">Rock</a></li>
      <li><a href="#">Pop</a></li>
      </ul>
      </li>
      <li><a href="Contact Us.jsp">Contact Us</a></li>
      <li><a href="Login.jsp">Login</a></li>
       <li><a href="Register.jsp">Register</a></li>
    </ul>
  </div>
</nav>
</div><!-- navbar fixed top -->
</div><!-- end container -->

</body>
</html>