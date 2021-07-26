<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <ul class="nav navbar-nav navbar-right">
            <li><a href="logout"><span class="glyphicon glyphicon-off"></span>
                    Logout</a></li>
        </ul>
    </div>
    </nav>
    <div align="center">
                       <h1>My Pet Page</h1>
                       <table class="table table-bordered" border = "1" >
        <tr>
            <td>My Pet Id</td>
            <td>Pet Name</td>
            <td>Pet Age</td>
            <td>Pet Place</td>
<!--             <td>Pet Sold/Buy</td> -->
        </tr>
        <c:forEach items="${listOfSoldPet}" var="pet">
            <tr>
                <td>${pet.myPetId}</td>
                <td>${pet.spetName}</td>
                <td>${pet.sPetAge}</td>
                <td>${pet.sPetPlace}</td>
<%--                 <td>${pet.sPetSold}</td> --%>
            </tr>
        </c:forEach>
    </table>
    </div>          
</body>
</html>