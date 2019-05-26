<%-- 
    Document   : login
    Created on : Apr 24, 2019, 2:10:12 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page='header.jsp'></jsp:include> 
            <title>Log ind & Registrering</title>
            <script>

                var url = window.location;
                var query_string = url.search;
                var search_params = new URLSearchParams(query_string);
                var errorMsg = search_params.get('error');
                if (errorMsg === "true") {
                    var error = "Prøv igen Email og Kodeord passer ikke sammen";
                    document.write("<br><br><h1 style='color:red;'>" + error + "</h1>");
                }
                var RerrorMsg = search_params.get('Rerror');
                if (RerrorMsg === "true") {
                    var Rerror = "Prøv igen dine kodeord passer ikke med hindanden";
                    document.write("<br><br><h1 style='color:red;'>" + Rerror + "</h1>");
                }

            </script>
        </head>
        <body>
            <div id="loginStyle" align="center">
                <h1>Log ind eller lav en bruger</h1>
                <div id="loginStyle" style="margin-bottom: 20px; min-height: 230px">
                    <h3>Log ind</h3>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login"><br>
                        <input type="text" name="email" placeholder="E-mail" required><br>
                        <input type="password" name="password" placeholder="Kodeord" required><br>
                        <input type="submit" value="Submit">
                    </form>
                </div>
                <div id="registerStyle" style="min-height: 230px">
                    <h3>Registrering</h3>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        <input type="text" name="email" placeholder="E-mail" required><br>
                        <input type="password" name="password1" placeholder="Kodeord" required><br>
                        <input type="password" name="password2" placeholder="Gentag Kodeord" required><br>
                        <input type="text" name="fname" placeholder="Fornavnavn" required><br>
                        <input type="text" name="lname" placeholder="Efternavn" required><br>
                        <input type="text" name="phone" placeholder="Telefonnummer" required><br>
                        <input type="text" name="street" placeholder="Adresse" required><br>
                        <input type="text" name="city" placeholder="By" required><br>
                        <input type="text" name="zip" placeholder="Postnummer" required><br>
                        <input type="text" name="country"  placeholder="Land" required><br>
                        <input type="submit" value="Submit">
                    </form>
                </div>
            </div>
        <% String error = (String) request.getAttribute("error");
            if (error != null) {
                out.println("<H2>Error!!</h2>");
                out.println(error);
            }
        %>
    </body>
</html>
