<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="homePage">Pet Shop</a>
        </div>
    </div>
    </nav>
    <h1 align="center">Add Your Pet Details</h1>
<div align="center">
<form:form action="loadPetPage" modelAttribute="petData">
<table>
<tr>
<td><form:label path="petName">Pet Name:</form:label></td><td><form:input path="petName"/><form:errors path = "petName"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="petAge">Pet Age:</form:label></td><td><form:input path="petAge"/><form:errors path = "petAge"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="petPlace">Pet Place:</form:label></td><td><form:input path="petPlace"/><form:errors path = "petPlace"></form:errors><br><br></td>
</tr>
<tr>
<td><form:hidden path="petBuyOrSold" value = "Buy"/><br><br></td>
</tr>
<tr><td></td><td><input class="btn btn-success" type = "submit" value = "AddPet"/></td></tr>
</table>
</form:form>
</div>
</body>
</html>