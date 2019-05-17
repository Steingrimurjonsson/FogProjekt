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
<div class="svgSide" style="float: left; border:1px #111 solid ; ">
         <svg contentScriptType="text/ecmascript" width="600.0px" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
             zoomAndPan="magnify" contentStyleType="text/css" height="600.0px" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
             version="1.0">
             <rect fill="none" x="0" width="420" height="10" y="167" stroke="#000000"/>
             <rect fill="none" x="100.0" width="25.0" height="220" y="178.0" stroke="#000000"/>
             <rect fill="none" x="300" width="25.0" y="178.0" height="220" stroke="#000000"/>
             <line y2="400" fill="none" x1="441.0" x2="442.0" stroke="#ff0000" y1="180"/>
             <text x="455.0" y="288.0"><tspan xml:space="preserve">220 cm </tspan></text>
         </svg>
</div>
<div class="svgShed" style="float: left; border:1px #111 solid ; ">
<svg contentScriptType="text/ecmascript" width="600.0px" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
    zoomAndPan="magnify" contentStyleType="text/css" height="600.0px" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
    version="1.0">
    <rect fill="none" x="0" width="420" y="167" height="10" stroke="#000000"/>
    <rect fill="none" x="100.0" width="25.0" y="178.0" height="220" stroke="#000000"/>
    <rect fill="none" x="300" width="25.0" height="220" y="178.0" stroke="#000000"/>
    <line y2="400" fill="none" x1="441.0" x2="442.0" y1="180" stroke="#ff0000"/>
    <text x="455.0" y="288.0"><tspan xml:space="preserve">220 cm </tspan></text>
    <rect fill="#330033" x="0" width="150" height="220" y="178.0" stroke="#003333"/>
    <line y2="420.0" fill="none" x1="3.0" x2="148.0" stroke="#000000" y1="420.0"/>
    <text x="42.0" y="441.0"><tspan xml:space="preserve"><%=order.getShedLength()%> cm </tspan></text>
</svg>
</div>
            
<div class="svgTop" style="float: left; border:1px #111 solid ; ">
        
        <svg contentScriptType="text/ecmascript" width="600.0px" xmlns:xlink="http://www.w3.org/1999/xlink" baseProfile="full"
    zoomAndPan="magnify" contentStyleType="text/css" height="600.0px" preserveAspectRatio="xMidYMid meet" xmlns="http://www.w3.org/2000/svg"
    version="1.0">
    <rect fill="none" x="-1.000021" width="420" y="83.0" height="310.0" stroke="#000000"/>
    <line y2="392" fill="none" x1="62" x2="62" y1="83.0" stroke="#000000"/>
    <line y2="392.0" fill="none" x1="124.0" x2="124.0" stroke="#000000" y1="85.0"/>
    <line y2="392.0" fill="none" x1="186.0" x2="186.0" y1="85.0" stroke="#000000"/>
    <line y2="392.0" fill="none" x1="248" x2="248" stroke="#000000" y1="85"/>
    <line y2="392" fill="none" x1="57" x2="57" stroke="#000000" y1="83"/>
    <line y2="392" fill="none" x1="119" x2="119" stroke="#000000" y1="85"/>
    <line y2="392" fill="none" x1="181" x2="181" stroke="#000000" y1="85.0"/>
    <line y2="392" fill="none" x1="243" x2="243" stroke="#000000" y1="85"/>
    <line y2="392" fill="none" x1="310" x2="310" stroke="#000000" y1="85.0"/>
    <line y2="392" fill="none" x1="305" x2="305" stroke="#000000" y1="85"/>
    <line y2="392" fill="none" x1="372" x2="372" stroke="#000000" y1="85"/>
    <line y2="392" fill="none" x1="367" x2="367" stroke="#000000" y1="85"/>
    <line y2="120" fill="none" x1="0" x2="420" stroke="#000000" y1="120"/>
    <line y2="355" fill="none" x1="0" x2="420" y1="355" stroke="#000000"/>
    <line y2="115" fill="none" x1="0" x2="420" y1="115" stroke="#000000"/>
    <line y2="360" fill="none" x1="0" x2="420" y1="360" stroke="#000000"/>
    <rect fill="none" x="100" width="25.0" height="23.0" y="115.0" stroke="#000000"/>
    <rect fill="none" x="100" width="25.0" y="338" height="23.0" stroke="#000000"/>
    <rect fill="none" x="300" width="25.0" y="338" height="23.0" stroke="#000000"/>
    <rect fill="none" x="300" width="25.0" y="115" height="23.0" stroke="#000000"/>
    <line y2="360.0" fill="none" x1="430.0" x2="430.0" stroke="#ff3333" y1="116.0"/>
    <text x="432.0" y="229.0"><tspan xml:space="preserve">240 cm </tspan></text>
    <line y2="393.0" fill="none" x1="502.0" x2="503.0" stroke="#ff3333" y1="83.0"/>
    <text x="509.0" y="220.0"><tspan xml:space="preserve"><%=order.getWidth()%> cm </tspan></text>
    <line y2="457.0" fill="none" x1="416.0" x2="1.0" stroke="#ff0033" y1="457.0"/>
    <text x="159.0" y="486.0"><tspan xml:space="preserve"><%=order.getLength()%> cm </tspan></text>
    <line y2="410.0" fill="none" x1="420.0" x2="371.0" stroke="#ff0000" y1="410.0"/>
    <text x="373.0" y="422.0"><tspan xml:space="preserve">62 cm </tspan></text>
</svg>
</div>

    </body>
</html>
