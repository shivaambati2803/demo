<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Insert title here</title>
</head>
<body>

<div align="center">
                       <h1>Pet Home Page</h1>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="addPetPage">+Add Pet</a></li>
      <li><a href="myPetPage">Go to My Pet</a></li>
    </ul>
  </div>
</nav>    
<table border = "1" >
        <tr>
            <td>Pet Id</td>
            <td>Pet Name</td>
            <td>Pet Age</td>
            <td>Pet Place</td>
            <td>Buy/Sold</td>
        </tr>
        <c:forEach items="${listOfPet}" var="pet">
            <tr>
                <td>${pet.petId}</td>
                <td>${pet.petName}</td>
                <td>${pet.petAge}</td>
                <td>${pet.petPlace}</td>
                <td><a class="btn btn-success" href = "buyOrSold/${pet.petId}">${pet.petBuyOrSold}</a></td>
            </tr>
        </c:forEach>
    </table>
    </div>                                       
</body>
</html>