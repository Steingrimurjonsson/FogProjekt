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
                   
                            %>
            <script>
                
                if(1=1){
                    alert("Hello something works");
                }
                
            </script>
            
            <title>Admin side</title>
        </head>
        <body>

            
            <h1 style="float: left ;padding-top: 25px">Liste over brugere:</h1>
            <h1 style=" float: left; padding-top: 25px;padding-left: 800px"> Liste over ordrer: </h1>
            <br><br><br><br><br>
            <table class="table table-striped" style=" padding-top: 25;float: right ;width: 48%;">
                      
                <thead>
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
           <h1 >Stock:</h1>
                    <thead>
                <tr>
                    <th>Material ID</th>
                    <th>Material</th>
                    <th>Stock</th>
                    <th>Add to stock</th>
                   
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
                    <th> <%= element.getStock() %> <%if(element.getStock() < 99900){ %> <p style="color:red;">Bestil til lager!</p> <%}%></th> 
                        
                    <th>
                    <form name="admin" action="FrontController" method="POST">
                        <input type="text" name="matID" value="<%=element.getIdMaterial()%>">><br>
                        <input type="text" name="stock" placeholder="How much"><br>
                    </form></th>
                    <%}%>
        
                </tr>



            </tbody>
        </table>
                
    </body>
</html>


