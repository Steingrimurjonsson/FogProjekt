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
        <style>
            * {
  box-sizing: border-box;
  
}

/* Create two equal columns that floats next to each other */
.column {
  float: left;
  width: 50%;
  padding: 10px;
  
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
            
        </style>
    </head>
    <body>
        <h1>Choose carport type</h1>
        
    

      

<div class="row">
  <div class="column" style="background-color:#aaa;">
       <p style="padding-left: 30px; font-size: 20px">
Click here for a carport with flat roof <a href="jsp/carportFlat.jsp"><br>
<img alt="flat" src="./img/flat.gif" width="200" height="200">
</a>
</p>
  </div>
  <div class="column" style="background-color:#bbb;">
       <p style="padding-left: 20px; font-size: 20px">
Click here for a carport with sloped roof <a href="jsp/carportSlope.jsp"><br>
<img alt="slope" src="./img/slope.gif" width="200" height="200">
</a>
</p>
  </div>
</div>

            <jsp:include page='footer.jsp'></jsp:include>
    </body>
</html>
