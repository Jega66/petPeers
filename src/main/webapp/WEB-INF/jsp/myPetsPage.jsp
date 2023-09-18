<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
 background-color: #001400;
}

.topnav i{
float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
td {
 padding: 15px;
  border: 1px solid;
   border-bottom: 1px solid #ddd;
  
}
table {
  width: 90%;
  border-collapse: collapse;
}
th {
border: 1px solid;
background-color:#003300;
color:white;
 border-bottom: 1px solid #ddd;
 height:50px;
}
tr:nth-child(even) {background-color: #f2f2f2;}

.topnav-right {
  float: right;
}
</style>
</head>
<body>
    

<div class="topnav">
	<i>Pet Shop</i>
  <a  href="<c:url value = "/Home"/>">Home</a>
  <a class="active" href="<c:url value = "/myPets"/>">Mypet</a>
  <a href="<c:url value = "/toAddPet"/>">AddPet</a>
  <div class="topnav-right">
   
   <a href="<c:url value = "/logout"/>">Logout</a>
  </div>
</div>
<br><br><br><br><br><br><br>

<div style="padding-left:100px">
  <table>
            <thead>
                <tr>
                    <th>PetId</th>
                    <th>PetName</th>
                    <th>PetAge</th>
                     <th>PetPlace</th>
                      
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${pets}" var="pet">
                <tr>
                    <td>${pet.petId}</td>
                    <td>${pet.petName}</td>
                    <td>${pet.petAge}</td>
                    <td>${pet.petPlace}</td>
                    
                </tr>
                </c:forEach>   
            </tbody>
            
        </table>
      
</div>
 
</body>
</html>
