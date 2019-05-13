<%-- 
    Document   : user
    Created on : Apr 24, 2019, 2:11:45 PM
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
        <title>Customer Info</title>
    </head>
    <body> 
        
        <div class="customerInfo" style='padding: 50px'>              
        <h1>Welcome <%= firstName%> <%= lastName%> here is your information and orders</h1> <br>
                        Email: <%= userEmail%><br>
                        <br>
                         First Name: <%= firstName%><br>
                        <br>
                         Last Name: <%= lastName%><br>
                        <br>
                         Phone Number: <%= phone%><br>
                        <br>
                         Street: <%= street%><br>
                        <br>
                         City: <%= city%><br>
                        <br>
                         Zip Code: <%= zip%><br>
                        <br>
                         Country: <%= country%><br>
                        <br>
                        <a href="jsp/editcustomerinfo.jsp">EDIT YOUR INFO HERE</a>
                        </div>
                        <div class="customerOrders" style="float:right; padding-right: 50px ;">
                            <table class="data">
  <tr>
    <th>Entry Header 1</th>
    <th>Entry Header 2</th>
    <th>Entry Header 3</th>
    <th>Entry Header 4</th>
  </tr>
  <tr>
    <td>Entry First Line 1</td>
    <td>Entry First Line 2</td>
    <td>Entry First Line 3</td>
    <td>Entry First Line 4</td>
  </tr>
  <tr>
    <td>Entry Line 1</td>
    <td>Entry Line 2</td>
    <td>Entry Line 3</td>
    <td>Entry Line 4</td>
  </tr>
  <tr>
    <td>Entry Last Line 1</td>
    <td>Entry Last Line 2</td>
    <td>Entry Last Line 3</td>
    <td>Entry Last Line 4</td>
  </tr>
</table>
                        </div>
    </body>
</html>
