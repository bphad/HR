<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shoe Employee</title>
</head>
<body>

	<h1>Employee From Employee Class</h1><hr>
	
	Employee Id :<c:out value="${employee.getId()}"/><br>
	Employee Name :<c:out value="${employee.getName()}"/><br>
	Employee Contact :<c:out value="${employee.getContact()}"/><br>
	Employee Address :<c:out value="${employee.getAddress()}"/><br>	

</body>
</html>