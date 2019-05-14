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
        <div id="loginStyle" align="center">
    <div id="loginStyle" style="margin-bottom: 20px; min-height: 230px">
            <h3>Login</h3>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login"><br>
                        <input type="text" name="email" placeholder="Email" required><br>
                        <input type="password" name="password" placeholder="Password" required><br><br>
                         <input type="submit" value="Submit">
                    </form>
    </div>
    <div id="registerStyle" style="min-height: 230px">
                <h3>Register</h3>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                       
                        <input type="text" name="email" placeholder="Email" required>
                        <br>
                       
                        <input type="password" name="password1" placeholder="Password" required>
                        <br>
                     
                        <input type="password" name="password2" placeholder="Re-enter Password" required>
                        <br>
                   
                        <input type="text" name="fname" placeholder="First Name" required>
                        <br>
                    
                        <input type="text" name="lname" placeholder="Last Name" required>
                        <br>
                      
                        <input type="text" name="phone" placeholder="Phone Number" required>
                        <br>
                     
                        <input type="text" name="street" placeholder="Street" required>
                        <br>
                      
                        <input type="text" name="city" placeholder="City" required>
                        <br>
                     
                        <input type="text" name="zip" placeholder="Zip Code" required>
                        <br>
                   
                        <input type="text" name="country"  placeholder="Country" required>
                        <br>
                        <input type="submit" value="Submit">
                    </form>
        </div>
       </div>
        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { 
               out.println("<H2>Error!!</h2>");
               out.println(error);
           }
        %>
        

    </body>
</html>
