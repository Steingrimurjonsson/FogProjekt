<%-- 
    Document   : user
    Created on : Apr 24, 2019, 2:11:45 PM
    Author     : stein
--%>

<%@page import="Logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    User user = (User) request.getAttribute("user");

    String firstName = user.getFirstName();
    String lastName = user.getLastName();
    String userEmail = user.getEmail();
    String phone = user.getPhone();
    String street = user.getStreet();
    String city = user.getCity();
    String zip = user.getZip();
    String country = user.getCountry();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title>
    </head>
       <body>
        
        <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command">
                        Here you can change your customer information. 
                        Email: <%= userEmail%><br>
                        <br>
                        Password:<br>
                        <br>
                         First Name: <%= firstName%><br>
                        <br>
                         Last Name: <%= lastName%><br>
                        <br>
                         Phone Number <%= phone%><br>
                        <br>
                         Street: <%= street%><br>
                        <br>
                         City: <%= city%>
                         <br>
                        <br>
                         Zip Code: <%= zip%><br>
                        <br>
                         Country: <%= country%><br>
                        <br>
                    </form>
           
            
             <form method="post" action="FrontController">
                <input type="hidden" name="command" > 
            </form>
    </body>
</html>
