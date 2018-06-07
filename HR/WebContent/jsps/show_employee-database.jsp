<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Database</title>
</head>
<body>

	<h1>Employee Record From Database</h1><hr>
	
		<c:forEach var="e" items="${list }">
		<a href="${pageContext.request.contextPath}/Show-Employee-Details?id=<c:out value="${e.getId()}"/>"><c:out value="${e.getName()}"/></a><br>
		</c:forEach>
	
	
</body>
</html>