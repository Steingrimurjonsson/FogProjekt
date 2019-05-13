<%-- 
    Document   : orders
    Created on : Apr 24, 2019, 2:10:44 PM
    Author     : stein
--%>

<%@page import="Logic.Invoice"%>
<%@page import="Logic.LogicFacade"%>
<%@page import="Logic.User"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Order"%>
<%@page import="Data.OrderMapper"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <style>
                table {
                    font-family: arial, sans-serif;
                    border-collapse: collapse;
                    width: 100%;
                }

                td, th {
                    border: 1px solid #dddddd;
                    text-align: left;
                    padding: 8px;
                }

                tr:nth-child(even) {
                    background-color: #dddddd;
                }
            </style>        
        <title>Employee home page</title>
    </head>
    <body>
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
              <% User u = (User) request.getSession().getAttribute("user"); %>
              


               
                    <h1> All Orders: </h1>

                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th> OrderID</th>
                                <th> UserID</th>
                                <th> Length</th>
                                <th> Width</th>
                                <th> Material </th>
                                <th> Shed </th>
                                <th> Roofslope </th>
                                <th> Shed Length </th>
                                <th> Shed Width </th>
                                <th> Details </th>
                                
                               
                            </tr>
                        </thead>

                        <% List<Order> orderList = (List<Order>) request.getAttribute("orders");
                            for (Order element : orderList) {%>

                        <tbody>
                            <tr>
                                <th> <% out.print(element.getOrderID());  %> </th>        
                                <th> <% out.print(element.getUserID());  %> </th>  
                                <th> <% out.print(element.getLength());  %> </th> 
                                <th> <% out.print(element.getWidth());  %> </th> 
                                <th> <% out.print(element.getMaterial());  %> </th> 
                                <th> <% out.print(element.isShed());  %> </th> 
                                <th> <% out.print(element.getRoofSlope());  %> </th> 
                                <th> <% out.print(element.getShedLength());  %> </th> 
                                <th> <% out.print(element.getShedWidth());  %> </th> 
                                   
                                   
                                </th>
                                <%}%>
                            </tr>

                           
                        </tbody>
                    </table>
                   
        
    </body>
</html>

  