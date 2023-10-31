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
if ("adminuser".equals(username) && "adminpassword".equals(password) ) {
	session.setAttribute("adminuser", username);
	
	%>
	<h2>Welcome to <%=username %></h2>
	<a href ="AdminUser.jsp">click to insert the data</a>
	<p align='right'><a href ="User.jsp">click to list the Product</a>
	<% }
else if("user".equals(username) && "password".equals(password)){
	session.setAttribute("user", username);
	

	%>
	<h2>Welcome to <%=username %></h2>
	<a href ="User.jsp">click to list the Product</a>
	<%}
else{%>
<h3 style="color:red">Invalid credentials </h3>
<a href="Login.html">Click re-login</a>
<%
}%>

	

</body>
</html>