<%@ page import="comdemo.UserDataBase" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String username = (String) session.getAttribute("username");
int balance = UserDataBase.getUserBalance(username);
int amt = Integer.parseInt(request.getParameter("amt"));

int totalAmt = balance + amt;
session.setAttribute("totalAmt", totalAmt);
UserDataBase.updateUserBalance(username, totalAmt); 
%>
    <h2>Deposit successful! New balance: <%= totalAmt %></h2>
</body>
</html>

</body>
</html>