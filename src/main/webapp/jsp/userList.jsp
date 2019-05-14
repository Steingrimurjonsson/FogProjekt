<%-- 
    Document   : userList
    Created on : 13-05-2019, 23:54:03
    Author     : NoellZane
--%>

<%@page import="java.util.List"%>
<%@page import="Logic.User"%>
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
        <jsp:include page='header.jsp'></jsp:include> 
            <title>JSP Page</title>
        </head>

        <body>
            <h1>LIST OF USERS</h1>
        <%
            User user = (User) request.getSession().getAttribute("user");
            //String role = "null";
            // String role = user.getRole();
            String role = user.getRole();
            //role.length()==0 || userType.length()==0 ){
            if (role.length() != 5)
            {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        %>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>UserID</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone</th>
                    <th>Street</th>
                    <th>City</th>
                    <th>Zip</th>
                    <th>Country</th>                 
                    <th>Role</th>
                </tr>
            </thead>
            <%List<User> userList = (List<User>) request.getAttribute("list");
      for (User element : userList)
      {%>

            <tbody>
                <tr>

                    <th> <%= element.getId()%> </th>        
                    <th> <%= element.getEmail()%> </th>  
                    <th> <%= element.getPassword()%> </th> 
                    <th> <%= element.getFirstName()%> </th> 
                    <th> <%= element.getLastName()%> /th> 
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
    </body>
</html>
