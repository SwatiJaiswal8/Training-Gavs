<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page ="header.jsp"/>
<h3 align ="center"> Register</h3>
<form action="RegisterServlet" method="post">
UserName: <input type="text" name ="username"/>
Password <input type="password" name ="password"/>
Email Id <input type="email" name ="email"/>
<input type ="submit" value="Register"/>
 
</body>
</html>