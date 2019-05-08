<%-- 
    Document   : carport
    Created on : May 1, 2019, 1:03:41 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carport</title>
    </head>
    <body>
        <h1>Choose carport type</h1>
        
        <p>
Carport with flat <a href="jsp/carportFlat.jsp"><br>
<img alt="flat" src="./img/flat.gif" width="100" height="100">
</a>
</p>
<br><br>
<br><br>
        <p>
Carport with slope <a href="jsp/carportSlope.jsp"><br>
<img alt="slope" src="./img/slope.gif" width="100" height="100">
</a>
</p>
            <jsp:include page='footer.jsp'></jsp:include>
    </body>
</html>
