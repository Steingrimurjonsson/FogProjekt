<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Logic.Models.Model_OrderDetails"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Models.Model_Carport"%>
<%@page import="Logic.Models.Model_User"%>
<%@page import="Logic.Models.Model_Cart"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Kurv</title>
        <jsp:include page='header.jsp'></jsp:include> 
        <%  Model_User user = (Model_User) session.getAttribute("user");
            Model_Carport carport = (Model_Carport) session.getAttribute("carport");
            double tPrice = 0;
            if (carport != null) {
                tPrice = (double) session.getAttribute("tPrice");
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            var url = window.location;
            var query_string = url.search;
            var search_params = new URLSearchParams(query_string);
            var orderMsg = search_params.get('command');
            if (orderMsg === "createOrder") {
                var thanks = "Mange tak for din order!";
                document.write("<br><br><h1>" + thanks + "</h1>");
            }
        </script>
    </head>
    <body>
        <div class ="padding">
            <div>
                <h4> Din kurv ${user.firstName}</h4>
                <br>
                <br/>
                <%if (carport != null) {%>
                <table class ="table table - striped">
                    <tr> 
                        <th> Carport Længde </th>
                        <th> Carport Bredde</th>
                        <th> Carport Tagmateriale</th>
                        <th> Carport Taghældning</th>
                        <th> Carport Skur</th>
                        <th> Carport Redskabsrum Længde</th> 
                        <th> Carport Redskabsrum Bredde</th>
                        <th> Samlet Pris</th> 
                    </tr>
                    <tr>
                        <td>${carport.length}</td>
                        <td>${carport.width}</td>
                        <td>${carport.roofMat}</td>
                        <td>${carport.roofSlope}</td>
                        <td>${carport.shed}</td>          
                        <td>${carport.shedLength}</td>
                        <td>${carport.shedWidth}</td>
                        <td><%= tPrice%></td>
                    </tr>
                </table>
                </br>
                <form id="empty" action="FrontController">
                    <button form="empty" onclick="return confirm('Er du sikker?')" style="float:left; color:white ; background: darkred;" name="command" value="emptyCart">Tøm Kurv</button>
                    <%if (user != null) { %>
                </form><form id="succ" action="FrontController">
                    <button form="succ" onclick="javascript:alert('Du kan se din ordre på din kundeside');" style="float:left; color:white ; background: darkgreen;" name="command" value="createOrder">Bekræft Køb</button>
                    <%  } else { %>
                </form> <form id="errorCart" action="FrontController">
                    <button form="errorCart" onclick="javascript:alert('Vær venlig at lave en bruger eller log ind for at lave en ordre');" style="float:left; color:white ; background: darkgreen;" name="command" value="createOrder">Bekræft Køb</button>
                    <% } %>
                </form>
                <%  } else { %>
                <h1>Din kurv er tom lav en carport her  <a href="jsp/carport.jsp">Carport på mål</a></h1>
                <% }%>
            </div>
            <br>
        </div>
    </body>                
</html>