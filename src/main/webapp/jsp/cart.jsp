<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Logic.User"%>
<%@page import="Data.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    Cart cart = (Cart) request.getSession().getAttribute("cart");
    User user = (User) request.getSession().getAttribute("user");
    if (user == null) {
        response.sendRedirect("/");
        return;
    }

    String username = user.getFirstName();
%>
<div class ="padding">
    <div>
        <h4> Your cart</h4>
        <p>< User: <%= username%></p>

        <br/>
        <table class ="table table - striped">
            <tr> 
                <th> Carport length</th>
                <th> Carport width</th>
                <th> Carport material</th>
                <th> Carport shed</th>
                <th> Carport roof slope</th>
                <th> Carport shed</th>
                <th> Carport details</th>
                <th> Carport shed width</th>
                <th> Carport shed length</th> 
            </tr>
            <%
                for (int i = 0; i < cart.getCarport().size(); i++) {%>
            <tr>
                <td>
                    <%=cart.getCarport().get(i).getLength()%>
                </td>

                <td>
                    <%= cart.getCarport().get(i).getWidth()%>
                </td>

                <td>
                    <%= cart.getCarport().get(i).getMaterial()%>
                </td>
                <td>
                    <%= cart.getCarport().get(i).isShed()%>
                </td>
                <td>
                    <%= cart.getCarport().get(i).getRoofSlope()%>
                </td>
                <td>
                    <%= cart.getCarport().get(i).getShedLength()%>
                </td>
                <td>
                    <%= cart.getCarport().get(i).getShedWidth()%>
                </td>
                <td>
                    <%= cart.getCarport().get(i).getDetails()%>
                </td>
            </tr>
        </table>
        </br>
        
    </div>


</div>