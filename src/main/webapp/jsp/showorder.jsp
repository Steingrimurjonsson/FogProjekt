<%-- 
    Document   : usershoworder
    Created on : 15-05-2019, 00:15:20
    Author     : NoellZane
--%>

<%@page import="Logic.LogicFacade"%>
<%@page import="Logic.User"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Details</title>
         <%  User user = (User) session.getAttribute("user");
            Order orderid =(Order) request.getAttribute("orderID");
           // int order = Integer.parseInt("orderID");	
          // LogicFacade.specificOrder(order);
         %>
    </head>
    <body>        
        <h1><%= orderid%></h1>
    </body>
</html>
