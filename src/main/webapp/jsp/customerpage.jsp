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
        <h1>Hello <%=request.getParameter("email" )%> </h1>
        <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Here you can change your customerinformation. 
                        Email:<br>
                        <br>
                        Password:<br>
                        <br>
                         First Name: <br>
                        <br>
                         Last Name: <br>
                        <br>
                         Phone Number<br>
                        <br>
                         Street<br>
                        <br>
                         City
                         <br>
                        <br>
                         Zip Code<br>
                        <br>
                         Country<br>
                        <br>
                    </form>
           
            
             <form method="post" action="FrontController">
                <input type="hidden" name="command" value="orders"> 
            </form>
    </body>
</html>
