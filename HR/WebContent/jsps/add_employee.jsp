<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sv" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>

	<h1>Insert Employee Database</h1><hr>
	
	<sv:form action="${pageContext.request.contextPath}/Insert-Employee" method="post" commandName="employee">
		Name : <sv:input type="text" name="name" path="name"/><sv:errors path="name" /><br><br>
		Contact : <sv:input type="text" name="contact" path="contact"/><sv:errors path="contact" /><br><br>
		City : <sv:input type="text" name="city" path="address.city"/><sv:errors path="address.city" /><br><br>
		Street : <sv:input type="text" name="street" path="address.street"/><sv:errors path="address.street" /><br><br>
		<input type="submit" value="Add_Employee" />
	</sv:form>

</body>
</html>