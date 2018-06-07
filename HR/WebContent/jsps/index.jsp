<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	
	<h1>Home Page</h1><hr>
	
	<h3>Fetching Employee From Employee Class</h3>
	<a href="${pageContext.request.contextPath}/Show-Employee">Show Employee</a>
	
	<h3>Fetching Employee And Inserting Employee From DataBase </h3>
	<a href="${pageContext.request.contextPath}/Show-Employee-Database">Show Employee-Database</a> |
	<a href="${pageContext.request.contextPath}/Add-Employee">Add-Employee</a>
	
</body>
</html>