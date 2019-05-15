<%-- 
    Document   : usershoworder
    Created on : 15-05-2019, 00:15:20
    Author     : NoellZane
--%>

<%@page import="Logic.User"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order History</title>
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

                        <%  
                              
                        List<Order> orderByUserIDList = (List<Order>) request.getAttribute("orders");
                        
                            for (Order element : orderByUserIDList) {%>

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
</table>

                            
                            
                            
                            </div>
    </body>
</html>
