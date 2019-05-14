<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="java.util.List"%>
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
    //Cart cart = (Cart) session.getAttribute("cart");
    //User user = (User) session.getAttribute("user");
    //Carport carport = (Carport) session.getAttribute("carport");
   // List<Carport> carports = (List<Carport>) request.getSession("carports");
    //Carport carports = (Carport) request.getSession().getAttribute("carports");
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
    
    String username = "";
    if (user != null)
    {
        username = user.getFirstName().toUpperCase();
    }
  */
%>
</head>
<body>
<div class ="padding">
    <div>
        <h4> Your cart ${user.firstName}</h4>
  
      <br>
   
        <br/>
        <table class ="table table - striped">
            <tr> 
                <th> Carport Length </th>
                <th> Carport Width</th>
                <th> Carport Roof material</th>
                <th> Carport Roof slope</th>
                <th> Carport Shed</th>
                <th> Carport Shed width</th>
                <th> Carport Shed length</th> 
                <th> Carport Details</th>
            </tr>
            <tr>
                <td>${carport.length}</td>
                <td>${carport.width}</td>
                <td>${carport.material}</td>
                <td>${carport.roofSlope}</td>
                <td>${carport.shed}</td>          
                <td>${carport.shedLength}</td>
                <td>${carport.shedWidth}</td>
                <td>${carport.details}</td>
                

            </tr>
        </table>
        
   
                </br>
              
                <form>
                    <button name="command" value="emptyCart">Empty Cart</button>
                </form>
                
    </div>


</div>
</body>                
</html>