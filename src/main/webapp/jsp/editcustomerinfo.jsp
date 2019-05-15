<%-- 
    Document   : editcustomerinfo
    Created on : May 9, 2019, 8:59:13 PM
    Author     : stein
--%>
<%@page import="Logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
     User user = (User) session.getAttribute("user");
    request.getAttribute(user.getFirstName());
    request.getAttribute(user.getLastName());
    request.getAttribute(user.getCity());
    request.getAttribute(user.getCountry());
    request.getAttribute(user.getPhone());
    request.getAttribute(user.getStreet());
    request.getAttribute(user.getZip());
    request.getAttribute(user.getPassword());
    request.getAttribute(user.getEmail());
    
    String firstName = user.getFirstName();
    String lastName = user.getLastName();
    String password = user.getPassword();
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
      <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redigér Kundeinformation</title>
    </head>
    <body> 
        
        <div class="customerInfo" style='padding: 50px'>              
        <h1>Velkommen <%= firstName%> <%= lastName%> her kan du redigere din brugerinformation</h1> <br>
            
                        <form name="editUser" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="editUser">
                        E-mail: 
                        <br>
                        <input type="text" name="email" value="<%=userEmail%>">
                        <br>
                        Kodeord: <br>
                        <input type="password" name="password1" value="<%= password%>">
                        <br>
                        Gentag Kodeord: <br>
                        <input type="password" name="password2" value="<%= password%>">
                        <br>
                        Fornavn: <br>
                        <input type="text" name="fname" value="<%= firstName%>">
                        <br>
                        Efternavn: <br>
                        <input type="text" name="lname" value="<%= lastName%>">
                        <br>
                        Telefonnummer: <br>
                        <input type="text" name="phone" value="<%= phone%>">
                        <br>
                        Adresse:<br>
                        <input type="text" name="street" value="<%= street%>">
                        <br>
                        By:<br>
                        <input type="text" name="city" value="<%= city%>">
                        <br>
                        Postnummer: <br>
                        <input type="text" name="zip" value="<%= zip%>">
                        <br>
                        Land: <br>
                        <input type="text" name="country" value="<%= country%>">
                        <br>
                        <input type="submit" value="Redigér">
                    </form>
                        
                        
    </body>
</html>
