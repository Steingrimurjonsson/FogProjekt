<%-- 
    Document   : cart
    Created on : Apr 24, 2019, 2:11:05 PM
    Author     : stein
--%>

<%@page import="Data.Model_User"%>
<%@page import="Data.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    Cart cart = (Cart) request.getSession().getAttribute("cart");
    Model_User user = (Model_User) request.getSession().getAttribute("user");
    if (user == null) {
        response.sendRedirect("/");
        return;
    }
    double cash = user.getBalance();
    String username = user.getUserName();
    double finalPrice = 0;
    boolean enoughCash = false;
    String finalPriceTag = "";
%>