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
String senderUsername = (String) session.getAttribute("username");
String receiverUsername = request.getParameter("receiver");
int transferAmount = Integer.parseInt(request.getParameter("amount"));

int senderBalance = UserDataBase.getUserBalance(senderUsername);
int receiverBalance = UserDataBase.getUserBalance(receiverUsername);

if (senderBalance >= transferAmount) {
    int newSenderBalance = senderBalance - transferAmount;
    int newReceiverBalance = receiverBalance + transferAmount;

    UserDataBase.updateUserBalance(senderUsername, newSenderBalance);
    UserDataBase.updateUserBalance(receiverUsername, newReceiverBalance);

    
    out.println("<h2>Money transfer successful!</h2>");
} else {
    
    out.println("<h2>Insufficient balance for the transfer.</h2>");
}
%>


</body>
</html>