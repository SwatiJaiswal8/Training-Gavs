<%@page import ="com.example.demo.model.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Details</h1>
<%Product prd = (Product)request.getAttribute("product"); %>
<h3><li><%=prd.getPrdId() %></li>
<li><%=prd.getPrdName() %></li>
<li><%=prd.getPrdPrice() %></li></h3>
<h3>${product}</h3>
</body>
</html>