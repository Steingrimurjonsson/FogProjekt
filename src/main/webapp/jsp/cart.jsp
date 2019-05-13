<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Data.Carport"%>
<%@page import="Logic.User"%>
<%@page import="Data.Cart"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='header.jsp'></jsp:include> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    Cart cart = (Cart) request.getSession().getAttribute("cart");
    User user = (User) request.getSession().getAttribute("user");
    Carport carport = (Carport) request.getSession().getAttribute("carport");
    
   // String username = user.getFirstName();
%>
</head>
<body>
<div class ="padding">
    <div>
        <h4> Your cart</h4>
      
        <br/>
        <table class ="table table - striped">
            <tr> 
                <th> Carport length  <%= carport%></th>
                <th> Carport width</th>
                <th> Carport material</th>
                <th> Carport shed</th>
                <th> Carport roof slope</th>
                <th> Carport shed</th>
                <th> Carport details</th>
                <th> Carport shed width</th>
                <th> Carport shed length</th> 
            </tr>

        </table>
                </br>
                <INPUT TYPE=submit name="slet" value="remove">
               
        
    </div>


</div>
</body>                
</html>