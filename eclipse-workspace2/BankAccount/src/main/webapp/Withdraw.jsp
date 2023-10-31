<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
   // HttpSession s = request.getSession(true);
    if (session != null && session.getAttribute("username") != null) {
        
%>
       <form action ='WithDrawAmt.jsp' method="post">
		<h3>Enter the amount</h3>
		Amount<input type="number" name="amt"/></br>
		<input type ="submit" value ="WithDraw"/>
		</form>
<%}else{ response.sendRedirect("Login.jsp");
	
}
%>


</body>
</html>