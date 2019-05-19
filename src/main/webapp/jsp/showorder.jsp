<%-- 
    Document   : usershoworder
    Created on : 15-05-2019, 00:15:20
    Author     : NoellZane
--%>

<%@page import="Logic.Invoice"%>
<%@page import="Data.OrderDetails"%>
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
            OrderDetails orderD =  LogicFacade.specificOrderDetails(idOrder);
            Invoice invoice = LogicFacade.specificInvoiceDetails(idOrder);
            
           int height = 220; 
           int width = order.getWidth();
           int shedWidth = order.getShedWidth();
           int shedLength =order.getShedLength();
            
           int frameHeight = height *4; 
           int post = orderD.getPost();
           int frameLength = order.getLength() + 50; 
           int length = order.getLength();
           double blue = ((order.getLength()/100)*33)-20;
           double green = blue*2;
           double red = blue*3;
           
           double black = ((order.getLength()/100)*33)-20;
           double yellow = blue*3;
           
           int roofSlope = order.getRoofSlope();
           if(roofSlope == 45){
           roofSlope = 15;
           }
           if(roofSlope == 40){
           roofSlope = 20;
           }
           if(roofSlope == 35){
           roofSlope = 25;
           }
           if(roofSlope == 30){
           roofSlope = 30;
           }
           if(roofSlope == 25){
           roofSlope = 35;
           } 
           if(roofSlope == 20){
           roofSlope = 40;
           } 
           if(roofSlope == 15){
           roofSlope = 45;
           }
           
     

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
                <th> Samlet Pris</th>
             
            </tr>
            <tr>
                <td><%=order.getLength()%></td>
                <td><%=order.getWidth()%></td>
                <td><%=order.getroofMat()%></td>
                <td><%=order.getRoofSlope()%></td>
                <td><%=order.isShed()%></td>
                <td><%=order.getShedLength()%></td>
                <td><%=order.getShedWidth()%></td>
                <td><%=invoice.getPrice()%></td>
            </tr>
              
        </table>
               <h1>Materialeliste</h1>
        <table class ="table table - striped">
            <tr> 
                <th> Træ pæl </th>
                <th> Træ beklædning </th>
                <th> Træ til tag </th>
                <th> Plastik tag </th>
                <th> Sten tag </th>
                <th> Skruer </th>
                <th> Skruer til tag </th> 
                <th> Dør </th>
                <th> Dørhåndtag </th>
                <th> Dørhengsler </th>
             
            </tr>
            <tr>
                <td><%=orderD.getPost()%></td>
                <td><%=orderD.getWoodSide()%></td>
                <td><%=orderD.getWoodRoof()%></td>
                <td><%=orderD.getRoofPlast()%></td>
                <td><%=orderD.getRoofStone()%></td>
                <td><%=orderD.getScrew()%></td>
                <td><%=orderD.getRoofScrew()%></td>
                <td><%=orderD.getDoor()%></td>
                <td><%=orderD.getDoorHandle()%></td>
                <td><%=orderD.getDoorHinge()%></td>
            </tr>
        </table>
                               <br>
                              <br>
                              <br>

                                  
  
<div class="svgSide" style="float: left;padding: 20px   ">
  <svg contentScriptType="text/ecmascript" width="<%=frameLength%>" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
             zoomAndPan="magnify" contentStyleType="text/css" height="<%=frameHeight%>" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
             version="1.0">
   <defs>
    <pattern id="lines" height="10" width="10" patternUnits="userSpaceOnUse">
      <line x1="0" y1="0" x2="5" y2="3" stroke-width="1" stroke="red"/>
    </pattern>
  
  </defs>
  <defs>
 <pattern id="dotted" height="10" width="10" patternUnits="userSpaceOnUse">
      <line x1="0" y1="0" x2="2" y2="2" stroke-width="1" stroke="blue"/>
    </pattern>
  </defs>
   <% if(order.getRoofSlope() > 1){ %>   
   
     <rect fill="url(#dotted)" x="0" width="<%=length%>" height="<%=roofSlope%>" y="<%=90-roofSlope%>" stroke="#000000"/>
   
          
            <%}else{%>
           <rect fill="url(#dotted)" x="0" width="<%=length%>" height="10" y="90" stroke="#000000"/>
            <%}%>
           
               <%
                 int halfPost = post/2;
                 double oneHDP = 100/halfPost;
                 double lengthPP = length/100;
                for (int i = 0; i < halfPost; i++) {
                double partingLpP = lengthPP *oneHDP;
                double partingLP = partingLpP * i;
                %>
                 <rect fill="black" x="<%=partingLP%>" width="10.0" height="<%=height%>" y="90" stroke="#000000"/>
                 <% } %>

             <line y2="310" fill="none" x1="<%=length%>" x2="<%=length%>" stroke="#ff0000" y1="90"/>
             <text x="<%=length+5%>"  y="288.0"><tspan xml:space="preserve">220 cm </tspan></text>
             
             <line y2="345.0" fill="none" x1="<%=length%>" x2="0" stroke="#ff0000" y1="345.0"/>
             <text x="<%=length/2%>" y="365"><tspan xml:space="preserve"><%=length%> cm</tspan></text>
           
                 <% if(order.isShed() == true){ %>
             <rect fill="url(#lines)" x="0" width="<%=shedLength%>" height="<%=height%>" y="90" stroke="#003333"/>
             <rect fill="url(#lines)" x="0" width="<%=shedLength%>" height="<%=height%>" y="90" stroke="#003333"/>
            <line y2="320" fill="none" x1="0" x2="<%=shedLength%>" stroke="red" y1="320.0"/>
            <text x="<%=shedLength/2%>" y="338.0"><tspan xml:space="preserve"><%=shedLength%> cm </tspan></text>
                <% }%>
</svg>
</div>

<div class="svgTop" style="float: left; padding-left: 50px  ">
        
        <svg contentScriptType="text/ecmascript" width="<%=frameLength + 200%>" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
    zoomAndPan="magnify" contentStyleType="text/css" height="<%=frameHeight%>" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
    version="1.0">
   
 
   
        <!-- the box -->
    <rect fill="none" x="0" width="<%=length%>" y="0" height="<%=width%>" stroke="#000000"/>
   <!-- the beams -->
   
   <%
         //width is 100% if woodRoof is 6 then place roof beam every 16.6% until 100% on width
         int woodRoof = orderD.getWoodRoof();
         double oneHDWR = 100/orderD.getWoodRoof();
            double lengthP = (length-30)/100;
              for (int i = 0; i < woodRoof; i++) {
                double partingLp = lengthP *oneHDWR;
                double partingL = partingLp * i;
                %>
                
                   <rect fill="none" x="<%=partingL %>" width="1" height="<%=width%>" y="0" stroke="#000000"/>
                  
                    
                   <% }
  double partingLp = lengthP *oneHDWR;
                   %>

                    <%
               
                for (int i = 0; i < halfPost; i++) {
                double partingLpP = lengthPP *oneHDP;
                double partingLP = partingLpP * i;
                %>
                                 
<!-- post -->
                   <rect x="<%=partingLP %>" y="15"  width="10.0" height="10.0" stroke="red" fill="black"/>
                   <rect x="<%=partingLP %>" y="<%=width-25%>"    width="10.0" height="10.0" stroke="#000000" fill="black" />

                
                 <% } %>
  
    <!-- beams horz -->
    <rect fill="none" x="0" width="<%=length%>" height="10" y="15" stroke="#000000"/>
    <rect fill="none" x="0" width="<%=length%>" height="10" y="<%=width-25%>" stroke="#000000"/>
   
     <% if(order.getRoofSlope() > 1){ %>   
    <rect fill="none" x="0" width="<%=length%>" height="10" y="<%=width/2%>" stroke="#000000"/>
    <% }  %>

   
    
     <!-- shed  -->
        <% if(order.isShed() == true){ %> 
    <rect fill="url(#lines)" x="0" width="<%=shedLength%>" height="<%=shedWidth%>" y="15" stroke="#000000"/>
    <!-- indicator lines and text for shed-->
        <line y2="<%=shedWidth + 15%>" fill="none" x1="<%=length +20%>" x2="<%=length+ 20%>" stroke="#ff3333" y1="15"/>
        <text x="<%=length +30%>" y="<%=length/2%>"><tspan xml:space="preserve"><%=shedWidth%> cm </tspan></text>
        <% }  %>

    <!-- indicator lines and text -->

    <line y2="<%=width%>" fill="none" x1="<%=length +80%>" x2="<%=length +80%>" stroke="#ff3333" y1="0"/>
    <text x="<%=length + 90%>" y="<%=(length/2)+30%>"><tspan xml:space="preserve"><%=width%> cm </tspan></text>
   
    <line y2="<%=width+35%>" fill="none" x1="<%=length%>" x2="1.0" stroke="#ff0033" y1="<%=width+35%>"/>
    <text x="<%=(length/2)-10%>" y="<%=width+55%>"><tspan xml:space="preserve"><%=length%> cm </tspan></text>
    
    <line y2="<%=width + 10 %>" fill="none" x1="0" x2="<%=partingLp%>" stroke="#ff0000" y1="<%=width + 10 %>"/>
    <text x="10" y="<%=width + 25 %>"><tspan xml:space="preserve"><%=partingLp %> cm </tspan></text>
</svg>
</div>   
  

<div class="svgFront" style="float: left;padding: 20px   ">
  <svg contentScriptType="text/ecmascript" width="<%=frameLength%>" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
             zoomAndPan="magnify" contentStyleType="text/css" height="<%=frameHeight%>" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
             version="1.0">
   <defs>
    <pattern id="lines" height="10" width="10" patternUnits="userSpaceOnUse">
      <line x1="0" y1="0" x2="5" y2="3" stroke-width="1" stroke="red"/>
    </pattern>
  </defs>

   <% if(order.getRoofSlope() > 1){ %>   
   
           <line y2="90" fill="none" x1="<%=length%>" x2="0" stroke="blue" y1="90"/>
           <line y2="90" fill="none" x1="<%=length/2%>" x2="<%=length%>" stroke="blue" y1="<%=roofSlope%>"/>
           <line y2="<%=roofSlope%>" fill="none" x1="0" x2="<%=length/2%>" stroke="blue" y1="90"/>
           
       
           <text x="0" y="30"><tspan xml:space="preserve"><%=roofSlope%> graders hændning ¤</tspan></text>
            <%}else{%>
           <rect fill="none" x="0" width="<%=length%>" height="10" y="90" stroke="#000000"/>
            <%}%>
           
             
                 <rect fill="black" x="0" width="10.0" height="<%=height%>" y="90" stroke="#000000"/>
                 <rect fill="black" x="<%=length-10%>" width="10.0" height="<%=height%>" y="90" stroke="#000000"/>
              

             <line y2="310" fill="none" x1="<%=length+10%>" x2="<%=length+10%>" stroke="#ff0000" y1="90"/>
             <text x="<%=length+15%>"  y="<%=height%>"><tspan xml:space="preserve">220 cm </tspan></text>
             
             <line y2="345.0" fill="none" x1="<%=length%>" x2="0" stroke="#ff0000" y1="345.0"/>
             <text x="<%=length/2%>" y="365"><tspan xml:space="preserve"><%=length%> cm</tspan></text>
           
                 <% if(order.isShed() == true){ %>
             <rect fill="url(#lines)" x="0" width="<%=length%>" height="<%=height%>" y="90" stroke="#003333"/>
             <rect fill="url(#lines)" x="0" width="<%=length%>" height="<%=height%>" y="90" stroke="#003333"/>
             
                <% }%>
</svg>
</div>




    </body>
</html>
