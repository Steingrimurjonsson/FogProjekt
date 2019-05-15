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
            Order orderText= (Order) request.getAttribute("orderID");
            order = Integer.parseInt(orderText);	
           LogicFacade.specificOrder(order);
         %>
    </head>
    <body>        
        <h1>Order History</h1>
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
     <table class ="table table - striped">
            <tr> 
                <th> Carport Length </th>
                <th> Carport Width</th>
                <th> Carport Roof material</th>
                <th> Carport Roof slope</th>
                <th> Carport Shed</th>
                <th> Carport Shed width</th>
                <th> Carport Shed length</th> 
             
            </tr>
            <tr>
                <td>${order.length}</td>
                <td>${order.width}</td>
                <td>${order.roofMat}</td>
                <td>${order.roofSlope}</td>
                <td>${order.shed}</td>          
                <td>${order.shedLength}</td>
                <td>${order.shedWidth}</td>
                
            </tr>
        </table>
                            </div>
    </body>
</html>
