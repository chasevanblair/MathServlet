<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator Home</title>
</head>
<body>

	<form action="addUpServlet"method="post">Enter the numbers you want to add together (fields default to 0 if blank): <br/>
	<input type="text"name="num1"><br/>
	<input type="text"name="num2"><br/>
	<input type="text"name="num3"><br/>
	<input type="submit"value="Calculate"/>
	</form>
		<a href="power.jsp">Click here to put some numbers to an exponent instead</a>
	
</body>
</html>