<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gavs Shopping...</h1>
<%
if(session.getAttribute("user")==null){
%>
<div align="right"><a href="login.jsp">Login</a>/<a href ="register.jsp">SignUP</a></div>
<%}
else{
%>
<div align="right"><%=session.getAttribute("user").toString() %><a href ="Logout.jsp">Logout</a></div>
<%
}%>
 
</body>
</html>