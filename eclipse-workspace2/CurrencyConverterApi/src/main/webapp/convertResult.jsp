<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome to the Currency Converter</h1>
    
   
    <form action="/convertedAmount" method="post">
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required>
        
        <label for="fromCurrency">From Currency:</label>
        <select id="fromCurrency" name="fromCurrency" required>
            
            <option value="USD">USD</option>
            <option value="EUR">EUR</option>
            <option value="INR">INR</option>
          
        </select>
        
        <label for="toCurrency">To Currency:</label>
        <select id="toCurrency" name="toCurrency" required>
            
            <option value="USD">USD</option>
            <option value="EUR">EUR</option>
            <option value="INR">INR</option>
           
        </select>
        
        <button type="submit">Convert</button>
    </form>
    
   
    <a href="<%= request.getContextPath() %>/admin/login">Admin Login</a>
</body>
</html>
 