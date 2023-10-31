<%@page import="com.example.demo.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Details</h2>
<%List<Product> list =(List<Product>)request.getAttribute("displayList") ;%> 
<table>
<tr><td>product id</td><td>product name</td><td>product price</td>
<c:forEach items="${displayList}" var="item">
<tr>
<td><c:out value = "${item.prdId}"></c:out></td>
 <td><c:out value = "${item.prdName}"></c:out></td>
<td><c:out value = "${item.prdPrice}"></c:out></td>
<tr>
</c:forEach>
</table>
</body>
</html>