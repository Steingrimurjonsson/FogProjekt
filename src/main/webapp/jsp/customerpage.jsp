<%-- 
    Document   : user
    Created on : Apr 24, 2019, 2:11:45 PM
    Author     : stein
--%>

<%@page import="java.util.List"%>
<%@page import="Logic.Order"%>
<%@page import="Logic.User"%>
<%@page import="Logic.LogicFacade"%>
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
                                   <h1> LIST OF ORDERS: </h1>

                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th> OrderID</th>
                                <th> UserID</th>
                                <th> Length</th>
                                <th> Width</th>
                                <th> Roof Material </th>
                                <th> Shed </th>
                                <th> Roofslope </th>
                                <th> Shed Length </th>
                                <th> Shed Width </th>
                                
                                
                               
                            </tr>
                        </thead>

                        <% List<Order> orderList = (List<Order>) request.getAttribute("orders");
                            for (Order element : orderList) {%>

                        <tbody>
                            <tr>
                                <th> <%= element.getOrderID()  %> </th>        
                                <th> <%= element.getUserID() %> </th>  
                                <th> <%= element.getLength()  %> </th> 
                                <th> <%= element.getWidth()  %> </th> 
                                <th> <%= element.getroofMat() %> </th>
                                <th> <%= element.isShed() %> </th> 
                                <th> <%= element.getRoofSlope()  %> </th> 
                                <th> <%= element.getShedLength()  %> </th> 
                                <th> <%= element.getShedWidth()  %> </th> 
                                   
                                   
                                </th>
                                <%}%>
                            </tr>

                           
                        </tbody>
                    </table>
    </body>
</html>
