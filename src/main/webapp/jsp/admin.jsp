<%-- 
    Document   : admin
    Created on : Apr 24, 2019, 2:10:44 PM
    Author     : stein
--%>

<%@page import="Logic.LogicFacade"%>
<%@page import="Logic.User"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Order"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin</title>
        <jsp:include page='header.jsp'></jsp:include> 
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <style>

            </style>        
            <title>Employee home page</title>
        </head>
        <body>

            
            <h1 style="float: left ;padding-top: 25px">LIST OF USERS</h1>
            <h1 style=" float: left; padding-top: 25px;padding-left: 800px"> LIST OF ORDERS: </h1>
            <br><br><br><br><br>
            <table class="table table-striped" style=" padding-top: 25;float: right ;width: 48%;">
                      
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
                            for (Order element : orderList)
                            {%>

            <tbody>
                <tr>
                    <th> <%= element.getOrderID()%> </th>        
                    <th> <%= element.getUserID()%> </th>  
                    <th> <%= element.getLength()%> </th> 
                    <th> <%= element.getWidth()%> </th> 
                    <th> <%= element.getroofMat()%> </th>
                    <th> <%= element.isShed()%> </th> 
                    <th> <%= element.getRoofSlope()%> </th> 
                    <th> <%= element.getShedLength()%> </th> 
                    <th> <%= element.getShedWidth()%> </th> 
                    <th>   <form><input type="hidden" name="id" method="POST" value="<%= element.getOrderID()%>"/><button name="command" value="showOrder">Se Ordre</button></form> </th>    
                    <%}%>
                </tr>


            </tbody>
        </table>
  
                
        <%
            User user = (User) request.getSession().getAttribute("user");
            String role = user.getRole();
            if (!"admin".equals(role))
            {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        %>

        <table class="table table-striped" style="padding-top: 25; float: left ;width: 48%;">
            <thead>
                <tr>
                    <th>UserID</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone</th>
                    <th>Street</th>
                    <th>City</th>
                    <th>Zip</th>
                    <th>Country</th>                 
                    <th>Role</th>
                </tr>
            </thead>
            <%List<User> list = (List<User>) request.getAttribute("userList");
                for (User element : list)
                {%>

            <tbody>
                <tr>

                    <th> <%= element.getId()%> </th>        
                    <th> <%= element.getEmail()%> </th>  
                    <th> <%= element.getPassword()%> </th> 
                    <th> <%= element.getFirstName()%> </th> 
                    <th> <%= element.getLastName()%> </th> 
                    <th> <%= element.getPhone()%> </th> 
                    <th> <%= element.getStreet()%> </th> 
                    <th> <%= element.getCity()%> </th> 
                    <th> <%= element.getZip()%> </th> 
                    <th> <%= element.getCountry()%> </th> 
                    <th> <%= element.getRole()%> </th> 


                    <%}%>
                </tr>



            </tbody>
        </table>

    </body>
</html>


