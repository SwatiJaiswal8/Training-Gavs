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
if (amt <= balance) {
    int withdraw = balance - amt;
    session.setAttribute("username", username);
    UserDataBase.updateUserBalance(username, withdraw); 
%>
    <h2>Withdrawal successful! New balance: <%= withdraw %></h2>
<%
} else {
%>
    <h2>Withdrawal failed. Insufficient balance.</h2>
<%
}
%>


</body>
</html>