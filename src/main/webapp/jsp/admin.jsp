<%-- 
    Document   : admin
    Created on : Apr 24, 2019, 2:13:01 PM
    Author     : stein
--%>

<%@page import="java.util.List"%>
<%@page import="Logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  

    <form action="FrontController" method="POST">
        <input type="hidden" name="command" value="orders">
        <input type="submit" class="btn btn-primary" value="Show Orders!">
    </form>

</body>
</html>
