<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<body>

<h1 align="center">Account Login</h1>
<div align="center">
<form:form action = "loginPage" modelAttribute = "login">
<table>
<tr><td><form:label path="">${invalidLogin}</form:label></td></tr>
<tr>
<td><form:label path="userName">User Name:</form:label></td><td><form:input path="userName"/><form:errors path = "userName"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="password">Password:</form:label></td><td><form:password path="password"/><form:errors path = "password"></form:errors><br><br></td>
</tr>
<tr><td></td><td><input type = "submit" value = "Login"></td></tr>
<tr>
<td></td><td>You want new acc?</td><td><a href = "registrationPage">Signup</a>
</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>