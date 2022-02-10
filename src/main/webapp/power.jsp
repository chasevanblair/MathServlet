<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="powerServlet"method="post">Enter the base number and power to put it to (fields default to 0 if blank): <br/>
	<input type="text"name="base"><br/>
	<input type="text"name="power"><br/>
	<input type="submit"value="Calculate"/>
	</form>
</body>
</html>