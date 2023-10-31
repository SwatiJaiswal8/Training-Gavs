<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include></jsp:include>
<form action="loginaction.jsp" method="post">
user Name:<input type="text" name="user"/></br>
Password:<input type="text" name="password"/></br>
<input type="submit" value="Login"/>



</form>
</body>
</html>