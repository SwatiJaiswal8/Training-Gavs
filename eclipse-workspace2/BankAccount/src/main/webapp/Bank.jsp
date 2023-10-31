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

String username = request.getParameter("username");
String password = request.getParameter("password");


if (UserDataBase.isValidUser(username, password)) {
	session.setAttribute("username", username);
    out.println("<h2>Welcome, " + username + "!</h2>");
    %>
    <h2 style=""color:green;">Welcome to SBA Bank Account</h2>
	<a href ='Withdraw.jsp'>Click to withdraw the money</a></br>
	<a href ='Deposit2.jsp'>click to Deposit the money</a></br>
	<a href ='checkBalance.jsp'>click to check the balance</a></br>
	<a href ='Transfer.jsp'>click to transfer the money</a></br>
	
<%     
} else {
    
    out.println("<h2>Invalid username or password. Please try again.</h2>");
}
%>
 
</body>
</html>