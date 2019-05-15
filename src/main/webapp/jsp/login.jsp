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
        <title>Log ind & Registrering</title>
    </head>
    <body>
     
        <div id="loginStyle" align="center">
               <h1>Log ind eller lav en bruger</h1>
    <div id="loginStyle" style="margin-bottom: 20px; min-height: 230px">
            <h3>Log ind</h3>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login"><br>
                        <input type="text" name="email" placeholder="E-mail" required><br>
                        <input type="password" name="password" placeholder="Kodeord" required><br><br>
                         <input type="submit" value="Submit">
                    </form>
    </div>
    <div id="registerStyle" style="min-height: 230px">
                <h3>Registrering</h3>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                       
                        <input type="text" name="email" placeholder="E-mail" required>
                        <br>
                       
                        <input type="password" name="password1" placeholder="Kodeord" required>
                        <br>
                     
                        <input type="password" name="password2" placeholder="Gentag Kodeord" required>
                        <br>
                   
                        <input type="text" name="fname" placeholder="Fornavnavn" required>
                        <br>
                    
                        <input type="text" name="lname" placeholder="Efternavn" required>
                        <br>
                      
                        <input type="text" name="phone" placeholder="Telefonnummer" required>
                        <br>
                     
                        <input type="text" name="street" placeholder="Adresse" required>
                        <br>
                      
                        <input type="text" name="city" placeholder="By" required>
                        <br>
                     
                        <input type="text" name="zip" placeholder="Postnummer" required>
                        <br>
                   
                        <input type="text" name="country"  placeholder="Land" required>
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
