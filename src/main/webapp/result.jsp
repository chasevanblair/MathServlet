<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Answers</title>
</head>
<body>
<h1>Your result is:</h1>
<p>${userData.getTotal()}</p>
<a href="index.jsp">Return to home page</a>
<a href="power.jsp">Calculate a number to a power instead</a>

</body>
</html>