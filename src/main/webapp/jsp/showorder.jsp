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
        <title>Ordre Specifictioner</title>

         <% int idOrder =(int) request.getAttribute("id");
            Order order=  LogicFacade.specificOrder(idOrder);
        {
         %>
    </head>
    <body>        
        <h1>Ordre Specifikationer</h1>
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
                <th> Carport Længde </th>
                <th> Carport Bredde</th>
                <th> Carport Tagmateriale</th>
                <th> Carport Taghældning</th>
                <th> Carport Skur</th>
                <th> Carport Skur Længde</th> 
                <th> Carport Skur Bredde</th>
             
            </tr>
            <tr>
                <td><%=order.getLength()%></td>
                <td><%=order.getWidth()%></td>
                <td><%=order.getroofMat()%></td>
                <td><%=order.getRoofSlope()%></td>
                <td><%=order.isShed()%></td>
                <td><%=order.getShedLength()%></td>
                <td><%=order.getShedWidth()%></td>
              
                
               
                
                
                
            </tr>
                           
                                <%}%>
                          
        </table>
                            </div>

    </body>
</html>
