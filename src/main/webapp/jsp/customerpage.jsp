<%-- 
    Document   : user
    Created on : Apr 24, 2019, 2:11:45 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        <form name="register" action="FrontController" method="POST">
            <input type="hidden" name="command" value="register">
            Email:<br>
            <input type="text" name="email" value="">
            <input type="submit" value="change">
            <br>
            Password:<br>
            <input type="password" name="password1" value="">
            <input type="submit" value="change">
            <br>
            First Name: <br>
            <input type="text" name="fname" value="">
            <input type="submit" value="change">
            <br>
            Last Name: <br>
            <input type="text" name="lname" value="">
            <input type="submit" value="change">
            <br>
            Phone Number<br>
            <input type="text" name="phone" value="">
            <input type="submit" value="change">
            <br>
            Street<br>
            <input type="text" name="street" value="">
            <input type="submit" value="change">
            <br>
            City<br>
            <input type="text" name="city" value="">
            <input type="submit" value="change">
            <br>
            Zip Code<br>
            <input type="text" name="zip" value="">
            <input type="submit" value="change">
            <br>
            Country<br>
            <input type="text" name="country" value="">
            <input type="submit" value="change">
            <br>

        </form>



        <form method="post" action="FrontController">
            <input type="hidden" name="command" value="orders"> 
        </form>
    </body>
</html>
