<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Data.Carport"%>
<%@page import="Logic.User"%>
<%@page import="Data.Cart"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='header.jsp'></jsp:include> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    Cart cart = (Cart) request.getSession().getAttribute("cart");
    User user = (User) request.getSession().getAttribute("user");
    //Carport carport = (Carport) request.getSession().getAttribute("carport");
    Carport carports = (Carport) request.getSession().getAttribute("carports");
   // request.getAttribute(carport.getLength());
    //request.getAttribute(carport.getWidth());
    //request.getAttribute(carport.getMaterial());
   // request.getAttribute(carport.isShed());
   // request.getAttribute(carport.getRoofSlope());
   // request.getAttribute(carport.getShedWidth());
    //request.getAttribute(carport.getShedLength());
    //request.getAttribute(carport.getDetails());
 
   /*
    int length = carport.getLength();
    int width = carport.getWidth();
    String mat = carport.getMaterial();
    boolean shed = carport.isShed();
    int rSlope = carport.getRoofSlope();
    int shedW = carport.getShedWidth();
    int shedL = carport.getShedLength();
    String details = carport.getDetails();
     */
    String username = "";
    if (user != null)
    {
        username = user.getFirstName().toUpperCase();
    }
 
%>
</head>
<body>
<div class ="padding">
    <div>
        <h4> Your cart <%= username%></h4>
  
      <br>
   
        <br/>
        <table class ="table table - striped">
            <tr> 
                <th> Carport length </th>
                <th> Carport width</th>
                <th> Carport material</th>
                <th> Carport shed</th>
                <th> Carport roof slope</th>
                <th> Carport shed</th>
                <th> Carport details</th>
                <th> Carport shed width</th>
                <th> Carport shed length</th> 
            </tr>
        
        </table>
        <%= carports %>
      
                </br>
                <INPUT TYPE=submit name="slet" value="remove">
    </div>


</div>
</body>                
</html>