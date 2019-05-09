<%-- 
    Document   : user
    Created on : Apr 24, 2019, 2:11:45 PM
    Author     : stein
--%>

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    
   
	<% String Email = request.getParameter("email");   %>
        <% String password = request.getParameter("password"); %>
        <% String firstName = request.getParameter("fname"); %>
        <% String lastName = request.getParameter("lname"); %>
        <% String phone = request.getParameter("phone"); %>
        <% String street = request.getParameter("street"); %>
        <% String city = request.getParameter("city"); %>
        <% String zip = request.getParameter("zip"); %>
        <% String country = request.getParameter("country");%>    
        <title>Customer Page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        <form name="login" action="FrontController" method="POST">
            <input type="hidden" name="command" value="login">
         
            Email:
             <% out.println(Email);%>
            <input type="submit" value="change">
            <br>
            Password:
            <% out.println(password); %>
            <input type="submit" value="change">
            <br>
            First Name: 
            <% out.println(firstName); %>
            <input type="submit" value="change">
            <br>
            Last Name: 
             <%out.println(lastName);%>
            <input type="submit" value="change">
            <br>
            Phone Number:
            <%out.println(phone);%>
            <input type="submit" value="change">
            <br>
            Street:
            <%out.println(street); %>
            <input type="submit" value="change">
            <br>
            City:
           <% out.println(city); %>
            <input type="submit" value="change">
            <br>
            Zip Code:
            <%out.println(zip); %>
            <input type="submit" value="change">
            <br>
            Country:
            <% out.println(country); %>
            <input type="submit" value="change">
            <br>

        </form>



        <form method="post" action="FrontController">
            <input type="hidden" name="command" value="orders"> 
        </form>
    </body>
</html>
