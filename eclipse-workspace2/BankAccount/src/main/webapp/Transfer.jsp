<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome <%= session.getAttribute("username") %>!</h2>
<p><a href="checkBalance.jsp">Check Balance</a></p>
<h3>Transfer Money</h3>
    <form action="TransferMoney.jsp" method="post">
        Receiver's Username: <input type="text" name="receiver"><br>
        Amount: <input type="number" name="amount"><br>
        <input type="submit" value="Transfer">
    </form>

</body>
</html>