<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	<h1>Employee Details</h1><hr>
	Id : <c:out value="${e.getId()}"/><br>
	Name : <c:out value="${e.getName()}"/><br>
	Contact : <c:out value="${e.getContact()}"/><br>
	Address : <c:out value="${e.getAddress()}"/><br>

</body>
</html>