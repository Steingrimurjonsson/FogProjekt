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
            <title>Kundeinformation</title>
        </head>
        <body> 

            <div class="customerInfo" style='padding: 50px; float: left; width: 50%'>              
                <h1>Velkommen <%= firstName%> <%= lastName%> her er din information og ordrehistorik</h1> <br>
            Email: <%= userEmail%><br>
            <br>
            Fornavn: <%= firstName%><br>
            <br>
            Efternavn: <%= lastName%><br>
            <br>
            Telefonnummer: <%= phone%><br>
            <br>
            Adresse: <%= street%><br>
            <br>
            By: <%= city%><br>
            <br>
            Postnummer: <%= zip%><br>
            <br>
            Land: <%= country%><br>
            <br>
            <a href="jsp/editcustomerinfo.jsp">Redigér din information her</a>
        </div>
        <h1  style="padding: 50px;"> LIST OF ORDERS: </h1>

        <table class="table table-striped" style="padding: 50px; float: right ;width: 50%;">
            <thead>
                <tr>
                    <th> Ordre ID</th>
                    <th> Bruger ID</th>
                    <th> Carport Længde </th>
                    <th> Carport Bredde</th>
                    <th> Carport Tagmateriale</th>
                    <th> Carport Taghældning</th>
                    <th> Carport Skur</th>
                    <th> Carport Skur Længde</th> 
                    <th> Carport Skur Bredde</th>
                    <th> Ordre Specifikationer </th>
                </tr>
            </thead>

            <%

                List<Order> orderByUserIDList = (List<Order>) request.getAttribute("orders");

                for (Order element : orderByUserIDList)
                {%>

            <tbody>
                <tr>
                    <th> <%= element.getOrderID()%></th>        
                    <th> <%= element.getUserID()%> </th>  
                    <th> <%= element.getLength()%> </th> 
                    <th> <%= element.getWidth()%> </th> 
                    <th> <%= element.getroofMat()%> </th>
                    <th> <%= element.getRoofSlope()%> </th> 
                    <th> <%= element.isShed()%> </th> 
                    <th> <%= element.getShedLength()%> </th> 
                    <th> <%= element.getShedWidth()%> </th> 
                    <th>   <form><input type="hidden" name="id" method="POST" value="<%= element.getOrderID()%>"/><button name="command" value="showOrder">Se Ordre</button></form> </th>    

                    <%}%>
                </tr>


            </tbody>
        </table>

    </body>
</html>
