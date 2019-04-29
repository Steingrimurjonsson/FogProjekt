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
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
           
            Here you can check your orders.
             <form method="post" action="FrontController">
                <input type="hidden" name="command" value="orders"> 
                <input type="submit" value="Show Orders">   
            </form>
    </body>
</html>
