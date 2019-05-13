<%-- 
    Document   : admin
    Created on : Apr 24, 2019, 2:13:01 PM
    Author     : stein
--%>

<%@page import="Logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
   
    User user = (User) request.getSession().getAttribute("user");
   String role = "null";
    role = user.getRole();
    if (role != "admin")
    {
         session.setAttribute("message", "You are not admin");
         response.sendRedirect(response.encodeRedirectURL("/index.jsp"));
    }
    
 
%>
          <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LIST OVER USERS</h1>
        
        
         <h1>LIST OVER ORDERS</h1>
    </body>
</html>
