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
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="./">Pet Shop</a>
        </div>
    </div>
    </nav>
<h1 align="center"></h1>
<div align="center">
<table>
<tr><td><h1>${logout}</h1></td></tr>
</table>
<a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span>
                    Click Here To Login</a>
</div>
</body>
</html>