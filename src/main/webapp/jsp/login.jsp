<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page='header.jsp'></jsp:include>
        <title>Login & Registration Page</title>
    </head>
    <body>
        <h1>Please login or create an account</h1>
        
        <table>
            <tr><td>Login</td>
                <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="sesam">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
                <td>Or Register</td>
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="sesam">
                        <br>
                         First Name: <br>
                        <input type="text" name="fname" value="Someone">
                        <br>
                         Last Name: <br>
                        <input type="text" name="lname" value="Someone">
                        <br>
                         Phone Number<br>
                        <input type="text" name="phone" value="12345678">
                        <br>
                         Street<br>
                        <input type="text" name="street" value="Somewhere">
                        <br>
                         City<br>
                        <input type="text" name="city" value="SomeCity">
                        <br>
                         Zip Code<br>
                        <input type="text" name="zip" value="3000">
                        <br>
                         Country<br>
                        <input type="text" name="country" value="SomeCountry">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
        </table>
        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { 
               out.println("<H2>Error!!</h2>");
               out.println(error);
           }
        %>
    </body>
</html>
