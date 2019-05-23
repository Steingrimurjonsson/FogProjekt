<%-- 
    Document   : admin
    Created on : Apr 24, 2019, 2:10:44 PM
    Author     : stein
--%>

<%@page import="Data.Stock"%>
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
                
            <%
            User user = (User) request.getSession().getAttribute("user");
            String role = user.getRole();
            if (!"admin".equals(role) )
            {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        %>
            <script>
                
                if(1=1){
                    alert("Hello something works");
                }
                
            </script>
            
            <title>Admin side</title>
        </head>
        <body>

          
   
            <table class="table table-striped" style=" padding-top: 25;float: right ;width: 48%;">
                    <thead>  
                <thead><th style="font-size:30px">Ordrer:</th></thead>

                    <tr>
                        <th>Ordre ID</th>
                        <th>Bruger ID</th>
                        <th>Længde</th>
                        <th>Bredde</th>
                        <th>Tagmateriale</th>
                        <th>Skur</th>
                        <th>Taghældning</th>
                        <th>Redskabsrum længde</th>
                        <th>Redskabsrum bredde</th>



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
  
                
  

        <table class="table table-striped" style="padding-top: 25; float: left ;width: 48%;">
            <thead>
            <th style="font-size:30px">Brugere:</th>
         
                
                <tr>
                    <th>Bruger ID</th>
                    <th>Email</th>
                    <th>Kodeord</th>
                    <th>Fornavn</th>
                    <th>Efternavn</th>
                    <th>Telefonnummer</th>
                    <th>Adresse</th>
                    <th>By</th>
                    <th>Postnummer</th>
                    <th>Land</th>                 
                    <th>Rolle</th>
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

                
                <table class="table table-striped" style="padding-top: 25; float: left ;width: 48%;">
                    <thead>
                          <tr>
                     <th style="font-size:30px">Lager:</th>
                     </tr>
                <tr>
                    <th>Materiale ID</th>
                    <th>Materiale</th>
                    <th>Antal på lager</th>
                    <th>Tilføj til lager</th>
                   
                </tr>
            </thead>
            <%
                List<Stock> stockList = (List<Stock>) request.getAttribute("stockList");
                for (Stock element : stockList)
                {%>

            <tbody>
                <tr>

                    <th> <%= element.getIdMaterial()%> </th>        
                    <th> <%= element.getMaterialDesc()%> </th>  
                    <th> <%= element.getStock() %> <%if(element.getStock() < 5000){ %> <p style="color:red;">Bestil til lager! Mindst <%= 5000 - element.getStock() %></p><script>alert("Bestil til lager");</script> <%}%></th> 
                        
                    <th>
                    <form name="admin" action="FrontController" method="POST">
                        <input type="hidden" name="matID"  value="<%= element.getIdMaterial()%>">
                        <input type="number" name="stock" placeholder="" required>
                       <button  name="command" value="admin">Tilføj</button>
                    </form>
                    </th>
                    <%}%>
        
                </tr>



            </tbody>
        </table>
                
    </body>
</html>


