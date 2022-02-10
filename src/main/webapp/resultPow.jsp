<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Power Results</title>
</head>
<body>
	<h1>Result for ${userData.getBase()} to the power of ${userData.getPower()} is:</h1>
	<p>${userData.getExpTotal()}</p>
	<a href="power.jsp">Return to power home</a>
	<a href="index.jsp">Add up some numbers instead</a>
</body>
</html>