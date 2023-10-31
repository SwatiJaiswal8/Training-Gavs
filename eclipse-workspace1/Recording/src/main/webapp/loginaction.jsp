<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
import="java.util.HashMap" %>

<%@ page import="com.model.Register" %>

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
if(session.getAttribute("users") != null) {
    HashMap<String, Register> users = (HashMap<String, Register>) session.getAttribute("users");
    Register obj = users.get(username);

    if(obj != null && obj.getPassword().equals(password)) {
        session.setAttribute("user", username);
        response.sendRedirect("Productlist.jsp");
    } else {
%>

<h3>Invalid credentials</h3>
<a href="login.jsp">Retry</a><br/>

<%
    }
} else {
%>

<h3>Not registered</h3>
<a href="register.jsp">Sign Up</a><br/>

<%
}
%>
</body>
</html>
