<%-- 
    Document   : header
    Created on : Apr 24, 2019, 2:10:12 PM
    Author     : stein
--%>



<%@page import="Logic.User"%>
<%
     User user = (User) request.getSession().getAttribute("user");
    String username = "NULL";
    String role = "NULL";
    if (user != null)
    {
        username = user.getFirstName().toUpperCase();
        role = user.getRole();
    }

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <base href="${pageContext.request.contextPath}/" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type = "text/javascript" src = "js/jsfile.js" ></script>
        <link rel="shortcut icon" href="img/faviconFog.ico"/>
        <title>Fog</title>
        
        
    </head>
  
    <body>
        
        <div id="HeaderStyle">
            <h1><a  href="." ></a></h1>
            <div id="NavBar">
                <nav id="logopic">
  <a href=".">
<img alt="fog" src="img/foglogok.png" width="100" height="100">
</nav>
    <div id="leftBar">
        <nav id="home">
            <a href=".">Home</a>
        </nav>
     <nav id="shop"><a class="cartbutton" href="jsp/cart.jsp">Cart</a> </nav>
           
             <nav id="Carport">
            <a href="jsp/carport.jsp"> Custom Carports </a>
            
               
        </nav>
      
    </div>
                
    <div id ="rightBar">
            <% if(user == null){%>
            <nav id="user">
                 <a href="jsp/login.jsp">Login/Register</a>
            <% }else {%>
           
            <nav id="user">
            <a href="jsp/customerpage.jsp"><%= username %>  </a>
              <nav id="logout">
            <form name="logout" action="FrontController" method="post">
                <button value="logout" name="command" class ="button" id="logoutbutton" type="submit"/>Log out</button>
            </form>
                      <%} 

        if (role.equals("admin")) {%>

            <form name="admin" action="FrontController" method="post">
                <button style=" border:none; background: #333;" value="admin" name="command" type="submit"/>Admin Page</button>
            </form>
            <% }else {%>
            
               <%}%>
        </nav>
           
    </div>
   
               
   
</div>
        </div>
