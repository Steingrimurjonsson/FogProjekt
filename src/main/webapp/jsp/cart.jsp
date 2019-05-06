<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Logic.User"%>
<%@page import="Data.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    Cart cart = (Cart) request.getSession().getAttribute("cart");
    User user = (User) request.getSession().getAttribute("user");
    if (user == null)
    {
        response.sendRedirect("/");
        return;
    }
    
    String username = user.getFirstName();
%>
 <div class ="padding">
     <div>
         <h4> Your cart</h4>
         <p>< User: <%= username%></p>
         <br/>
         <table class ="table table - striped">
             <tr> 
                 <th> Carport length</th>
                 <th> Carport width</th>
                 <th> Carport material</th>
                 <th> Carport shed</th>
                 <th> Carport roofSlope</th>
                 <th> Carport Shed</th>
   </div>
     
     
 </div>