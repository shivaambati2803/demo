<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Registration Page</title>
</head>
<body>

<h1 align="center">Registration Page</h1>
<div>
<form:form action="currentPage" modelAttribute="registration">
<table>
<tr><td><form:label path="">${register}</form:label></td></tr>
<tr>
<td><form:label path="userName">UserName:</form:label></td><td><form:input path="userName"/><form:errors path = "userName"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="password">PassWord:</form:label></td><td><form:password path="password"/><form:errors path = "password"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="userName">Confirm PassWord:</form:label></td><td><form:password path="cpassword"/><form:errors path = "cpassword"></form:errors><br><br></td>

<tr><td></td><td><input type = "submit" value = "Register"/></td></tr>
</table>
</form:form>
</div>
</body>
</html>