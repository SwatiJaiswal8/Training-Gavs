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
   // HttpSession s = request.getSession(true);
    if (session != null && session.getAttribute("username") != null) {
       
%>
    <h2>Account Balance</h2>
    <%
        String username = (String) session.getAttribute("username");
        int balance = UserDataBase.getUserBalance(username);
        session.setAttribute("balance", balance);
    %>
    <h3>Hello <%= username %>,</h3>
    <p>Your current account balance is:<%= balance %></p>
    <p><a href="Bank.jsp">Go back to Home</a></p>
    <%}else{ response.sendRedirect("Login.jsp");
	
}
%>
</body>
</html>


</body>
</html>