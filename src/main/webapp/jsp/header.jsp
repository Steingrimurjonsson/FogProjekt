<%-- 
    Document   : header
    Created on : Apr 24, 2019, 2:10:12 PM
    Author     : stein
--%>


<%@page import="Data.Model_User"%>
<%
   /*Model_User user = (Model_User) session.getAttribute("user");
    String username = "NULL";
    if (user != null)
    {
        username = user.getUserName().toUpperCase();
    }
*/
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
        
        <title>Fog</title>
        
        
    </head>
    <body>
        <div id="HeaderStyle">

            <h1><a  href="." ></a></h1>
            <div id="NavBar">

    <div id="leftBar">
        <nav id="home">
            <a href=".">Home</a>
        </nav>
  
        <nav id ="shop">
                <a href="FrontController/cart">Shop</a>
        </nav>
<nav id="orders">
            <a href="FrontController/orders">Orders</a>
        </nav>
    </div>
    <div id ="rightBar">
        <nav id="user">
            <a href="jsp/login.jsp">Login/Register</a>
       <!-- <nav id="logout">
            <form id = "logoutform" action="FrontController/logout" method="post">
                <button class ="button" id="logoutbutton" type="submit"/>Log out</button>
            </form>
        </nav>
       -->
    </div>
</div>
        </div>
